package com.wenzhi.novel.util;

import com.wenzhi.novel.entity.pojo.MediaPojo;
import com.wenzhi.novel.mysql.dao.PG_MediaStorageMapper;
import com.wenzhi.novel.mysql.model.PG_MediaStorage;
import com.wenzhi.novel.mysql.model.PG_MediaStorageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Component
public class MediaUtil {

    @Autowired
    private PG_MediaStorageMapper mediaStorageDao;

    @Transactional(rollbackFor = Exception.class)
    public PG_MediaStorage uploadFile(MediaPojo mediaPojo) throws Exception{
        if(mediaPojo == null || mediaPojo.getPictureFile().getBytes() == null){
            throw new Exception("请上传有效文件");
        }
        boolean flag = UploadUtils.upload(mediaPojo.getDirPath(), mediaPojo.getFileName(), mediaPojo.getPictureFile().getBytes());
        if(!flag){
            throw new Exception("上传资源失败");
        }
        PG_MediaStorage mediaStorage = getByUrl(mediaPojo);
        int count = 0;
        if(mediaStorage == null){
            mediaStorage = new PG_MediaStorage();
            mediaStorage.setMedianame(mediaPojo.getFileName());
            mediaStorage.setMediatype(mediaPojo.getMediaType());
            mediaStorage.setDomainpath(mediaPojo.getDomainPath());
            mediaStorage.setDirpath(mediaPojo.getDirPath());
            mediaStorage.setOriginalname(mediaPojo.getPictureFile().getOriginalFilename());
            mediaStorage.setUserid("");
            mediaStorage.setCreatetime(new Date());
            mediaStorage.setUpdatetime(new Date());
            mediaStorage.setIsdeleted((byte)0);
            count = mediaStorageDao.insertSelective(mediaStorage);
        }else {
            mediaStorage.setMedianame(mediaPojo.getFileName());
            mediaStorage.setMediatype(mediaPojo.getMediaType());
            mediaStorage.setDirpath(mediaPojo.getDirPath());
            mediaStorage.setOriginalname(mediaPojo.getPictureFile().getOriginalFilename());
            mediaStorage.setUserid("");
            mediaStorage.setUpdatetime(new Date());
            count = mediaStorageDao.updateByPrimaryKeySelective(mediaStorage);
        }
        if(count == 1){
            return mediaStorage;
        }
        throw new Exception("更新数据失败");
    }

    private PG_MediaStorage getByUrl(MediaPojo mediaPojo){
        PG_MediaStorageExample mediaStorageExample = new PG_MediaStorageExample();
        PG_MediaStorageExample.Criteria mediaStorageCriteria = mediaStorageExample.createCriteria();
        mediaStorageCriteria.andDomainpathEqualTo(mediaPojo.getDomainPath());
        mediaStorageCriteria.andDirpathEqualTo(mediaPojo.getDirPath());
        mediaStorageCriteria.andMedianameEqualTo(mediaPojo.getFileName());
        List<PG_MediaStorage> mediaStorages = mediaStorageDao.selectByExample(mediaStorageExample);
        if(!CollectionUtils.isEmpty(mediaStorages)){
            return mediaStorages.get(0);
        }
        return null;
    }

    public Map<Integer, String> getUrlByIds(List<Integer> idList){
        Map<Integer, String> dataMap = new HashMap<>();
        if(!CollectionUtils.isEmpty(idList)){
            return dataMap;
        }
        PG_MediaStorageExample mediaStorageExample = new PG_MediaStorageExample();
        PG_MediaStorageExample.Criteria mediaStorageCriteria = mediaStorageExample.createCriteria();
        if(!CollectionUtils.isEmpty(idList)){
            mediaStorageCriteria.andIdIn(idList);
        }
        List<PG_MediaStorage> dataList = mediaStorageDao.selectByExample(mediaStorageExample);
        if(!CollectionUtils.isEmpty(dataList)){
            for(PG_MediaStorage mediaStorage : dataList){
                dataMap.put(mediaStorage.getId(), mediaStorage.getDomainpath()+ "/" + mediaStorage.getDirpath() + "/" + mediaStorage.getMedianame());
            }
        }
        return dataMap;
    }

    public List<PG_MediaStorage> getByIds(List<Integer> idList){
        if(CollectionUtils.isEmpty(idList)){
           return new ArrayList<>();
        }
        PG_MediaStorageExample mediaStorageExample = new PG_MediaStorageExample();
        PG_MediaStorageExample.Criteria mediaStorageCriteria = mediaStorageExample.createCriteria();
        mediaStorageCriteria.andIdIn(idList);
        return mediaStorageDao.selectByExample(mediaStorageExample);
    }
}
