package com.wenzhi.novel.service.basisservice;

import com.wenzhi.novel.mysql.dao.CS_GameSeriesMapper;
import com.wenzhi.novel.mysql.model.CS_GameSeries;
import org.springframework.beans.factory.annotation.Autowired;

public class CS_GameSeriesService {

    @Autowired
    private CS_GameSeriesMapper gameSeriesDao;

    public CS_GameSeries getById(Integer seriesId){
        return gameSeriesDao.selectByPrimaryKey(seriesId);
    }

}
