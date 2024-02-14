package com.bdqn.service.impl;

import com.bdqn.dao.ArticlesDao;
import com.bdqn.pojo.Articles;
import com.bdqn.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService {

    @Autowired
    private ArticlesDao articlesDao;

    @Override
    public List<Articles> getAll() {
        return articlesDao.getAll();
    }

    @Override
    public boolean passOne(Articles articles) {
        return articlesDao.passOne(articles) > 0;
    }

    @Override
    public boolean passTow(Articles articles) {
        return articlesDao.passTow(articles) > 0;
    }
}
