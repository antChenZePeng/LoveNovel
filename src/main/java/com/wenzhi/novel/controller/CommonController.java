package com.wenzhi.novel.controller;

import com.wenzhi.novel.entity.pojo.MediaPojo;
import com.wenzhi.novel.entity.response.MediaUploadResponse;
import com.wenzhi.novel.hardcode.EImage;
import com.wenzhi.novel.mysql.model.PG_MediaStorage;
import com.wenzhi.novel.util.MD5Util;
import com.wenzhi.novel.util.MediaUtil;
import com.wenzhi.novel.util.ResponseTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@RestController
@RequestMapping(value = "/common")
@Api(description = "普通通用接口")
public class CommonController {

    @Autowired
    private MediaUtil mediaUtil;

    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    @RequestMapping(value = "/uploadImage.do", method = RequestMethod.POST)
    @ApiOperation(value = "图片上传", notes = "图片上传", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "图片文件", name = "pictureFile", paramType = "form", dataType = "file"),
            @ApiImplicitParam(value = "图片类型(联系后台技术开发获取)", name = "type", paramType = "form", dataType = "int")
    })
    public ResponseTool uploadImage(@RequestParam("pictureFile") MultipartFile pictureFile, @RequestParam("type") Integer type){
        try{
            Date now = new Date();
            String logoType = EImage.EImageType.getDesc(type);
            String originalName = pictureFile.getOriginalFilename();
            String fileName = now.getTime() + "_" + MD5Util.digest16(FilenameUtils.getBaseName(originalName)).toLowerCase() +
                    "." +FilenameUtils.getExtension(originalName);
            MediaPojo mediaPojo = new MediaPojo();
            mediaPojo.setDomainPath("");//待补充
            mediaPojo.setDirPath(logoType);
            mediaPojo.setFileName(fileName);
            mediaPojo.setMediaType(1);
            mediaPojo.setPictureFile(pictureFile);
            PG_MediaStorage mediaStorage = mediaUtil.uploadFile(mediaPojo);
            //MediaUploadResponse response = new MediaUploadResponse();
            return ResponseTool.success(1);
        }catch (Exception e){
            logger.error("图片上传接口异常",e);
            return ResponseTool.fail("图片上传异常，请联系系统管理员");
        }
    }

}

