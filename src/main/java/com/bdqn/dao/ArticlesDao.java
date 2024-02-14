package com.bdqn.dao;

import com.bdqn.pojo.Articles;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ArticlesDao {
    @Select("select *, u.user_name, label_name from articles\n" +
            "inner join user u on articles.user_id = u.user_id\n" +
            "inner join labels a on articles.label_id = a.label_id where pass = 0")
    List<Articles> getAll();

    @Update("update articles set pass = 1 where article_id = #{articleId}")
    int passOne(Articles articles);

    @Update("update articles set pass = 2 where article_id = #{articleId}")
    int passTow(Articles articles);
}
