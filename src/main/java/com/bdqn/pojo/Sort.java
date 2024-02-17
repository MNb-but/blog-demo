package com.bdqn.pojo;

public class Sort {
    private int sortId          ; // 分类ID
    private String sortName        ; // 分类名称
    private String sortAlias       ; // 分类别名
    private String sortDescription ; // 分类描述


    public Sort() {
    }

    public Sort(int sortId, String sortName, String sortAlias, String sortDescription) {
        this.sortId = sortId;
        this.sortName = sortName;
        this.sortAlias = sortAlias;
        this.sortDescription = sortDescription;
    }

    /**
     * 获取
     * @return sortId
     */
    public int getSortId() {
        return sortId;
    }

    /**
     * 设置
     * @param sortId
     */
    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    /**
     * 获取
     * @return sortName
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * 设置
     * @param sortName
     */
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    /**
     * 获取
     * @return sortAlias
     */
    public String getSortAlias() {
        return sortAlias;
    }

    /**
     * 设置
     * @param sortAlias
     */
    public void setSortAlias(String sortAlias) {
        this.sortAlias = sortAlias;
    }

    /**
     * 获取
     * @return sortDescription
     */
    public String getSortDescription() {
        return sortDescription;
    }

    /**
     * 设置
     * @param sortDescription
     */
    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    public String toString() {
        return "Sort{sortId = " + sortId + ", sortName = " + sortName + ", sortAlias = " + sortAlias + ", sortDescription = " + sortDescription + "}";
    }
}
