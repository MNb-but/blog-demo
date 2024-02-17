package com.bdqn.service;

import com.bdqn.pojo.Articles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ArticlesService {
    List<Articles> getAll();

    boolean passOne(Articles articles);

    boolean passTow(Articles articles);

    Articles getCard(String userName);

    List<Articles> getUserBlog(String userName);

    boolean insertBlog(Articles articles);

    boolean upBlog(Articles articles);

    boolean delBlog(Integer id);
}
