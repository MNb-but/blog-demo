package com.bdqn.dao;

import com.bdqn.pojo.Articles;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
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

    @Select("select count(*) sum, sum(article_views) articleViews, sum(article_like_count) articleLikeCount,sum(article_comment_count) articleCommentCount from articles\n" +
            "join user u on articles.user_id = u.user_id\n" +
            "where user_name = #{userName}")
    Articles getCard(String userName);

    @Select("select articles.* from articles\n" +
            "join user u on articles.user_id = u.user_id\n" +
            "where user_name = #{userName}")
    List<Articles> getUserBlog(String userName);

    @Insert("insert into articles (user_id,sort_id,label_id,article_title,article_content,article_date) values (#{userId},#{sortId},#{labelId},#{articleTitle},#{articleContent},now())")
    int insertBlog(Articles articles);

    @Update("update articles set sort_id = #{sortId}, label_id = #{labelId}, article_title = #{articleTitle},article_content = #{articleContent} where article_id = #{articleId}")
    int upBlog(Articles articles);

    @Delete("delete from articles where article_id = #{id}")
    int delBlog(Integer id);
}
