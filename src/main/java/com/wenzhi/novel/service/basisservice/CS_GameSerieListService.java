package com.wenzhi.novel.service.basisservice;

import com.wenzhi.novel.mysql.dao.CS_GameSerieListMapper;
import com.wenzhi.novel.mysql.model.CS_GameSerieList;
import com.wenzhi.novel.mysql.model.CS_GameSerieListExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CS_GameSerieListService {

    @Autowired
    private CS_GameSerieListMapper gameSerieListDao;

    /**
     * 根据游戏获取系列
     * @param platFormId(必传)
     * @param gameId(必传)
     * @return
     */
    public List<CS_GameSerieList> getSerieByGame(String platFormId, String gameId){
        if(StringUtils.isBlank(platFormId)){
            return null;
        }
        if(StringUtils.isBlank(gameId)){
            return null;
        }
        CS_GameSerieListExample example = new CS_GameSerieListExample();
        CS_GameSerieListExample.Criteria criteria = example.createCriteria();
        criteria.andPlatformidEqualTo(platFormId);
        criteria.andGameidEqualTo(gameId);
        return gameSerieListDao.selectByExample(example);
    }

}