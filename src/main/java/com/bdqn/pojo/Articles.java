package com.bdqn.pojo;

import org.w3c.dom.Text;

import java.util.Date;

public class Articles {
    private Integer articleId; //博文ID
    private Integer userId; //用户ID
    private Integer sortId; //分类ID
    private Integer labelId; //标签ID
    private String articleTitle; //博文标题
    private String articleContent; //博文内容
    private Integer articleViews; //浏览量
    private Integer articleCommentCount; //评论总数
    private Date articleDate; //发表时间
    private Integer articleLikeCount; //点赞数

    private int pass; //审核

    private String userName; //作者
    private String labelName; //标签

    private Integer sum;


    public Articles() {
    }

    public Articles(Integer articleId, Integer userId, Integer sortId, Integer labelId, String articleTitle, String articleContent, Integer articleViews, Integer articleCommentCount, Date articleDate, Integer articleLikeCount, int pass, String userName, String labelName, Integer sum) {
        this.articleId = articleId;
        this.userId = userId;
        this.sortId = sortId;
        this.labelId = labelId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleViews = articleViews;
        this.articleCommentCount = articleCommentCount;
        this.articleDate = articleDate;
        this.articleLikeCount = articleLikeCount;
        this.pass = pass;
        this.userName = userName;
        this.labelName = labelName;
        this.sum = sum;
    }

    /**
     * 获取
     * @return articleId
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 设置
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return sortId
     */
    public Integer getSortId() {
        return sortId;
    }

    /**
     * 设置
     * @param sortId
     */
    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    /**
     * 获取
     * @return labelId
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * 设置
     * @param labelId
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * 获取
     * @return articleTitle
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 设置
     * @param articleTitle
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    /**
     * 获取
     * @return articleContent
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * 设置
     * @param articleContent
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    /**
     * 获取
     * @return articleViews
     */
    public Integer getArticleViews() {
        return articleViews;
    }

    /**
     * 设置
     * @param articleViews
     */
    public void setArticleViews(Integer articleViews) {
        this.articleViews = articleViews;
    }

    /**
     * 获取
     * @return articleCommentCount
     */
    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    /**
     * 设置
     * @param articleCommentCount
     */
    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    /**
     * 获取
     * @return articleDate
     */
    public Date getArticleDate() {
        return articleDate;
    }

    /**
     * 设置
     * @param articleDate
     */
    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    /**
     * 获取
     * @return articleLikeCount
     */
    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    /**
     * 设置
     * @param articleLikeCount
     */
    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    /**
     * 获取
     * @return pass
     */
    public int getPass() {
        return pass;
    }

    /**
     * 设置
     * @param pass
     */
    public void setPass(int pass) {
        this.pass = pass;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * 设置
     * @param labelName
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    /**
     * 获取
     * @return sum
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * 设置
     * @param sum
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public String toString() {
        return "Articles{articleId = " + articleId + ", userId = " + userId + ", sortId = " + sortId + ", labelId = " + labelId + ", articleTitle = " + articleTitle + ", articleContent = " + articleContent + ", articleViews = " + articleViews + ", articleCommentCount = " + articleCommentCount + ", articleDate = " + articleDate + ", articleLikeCount = " + articleLikeCount + ", pass = " + pass + ", userName = " + userName + ", labelName = " + labelName + ", sum = " + sum + "}";
    }
}
