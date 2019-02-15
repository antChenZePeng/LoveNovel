package com.wenzhi.novel.service.basisservice;

import com.wenzhi.novel.mysql.dao.PG_NovelListMapper;
import com.wenzhi.novel.mysql.model.PG_NovelList;
import com.wenzhi.novel.mysql.model.PG_NovelListExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PG_NovelListService {

    @Autowired
    private PG_NovelListMapper novelListDao;

    public List<PG_NovelList> getList(){
        PG_NovelListExample novelListExample = new PG_NovelListExample();
        //PG_NovelListExample.Criteria novelListCriteria = novelListExample.createCriteria();
        return novelListDao.selectByExample(novelListExample);
    }

}
