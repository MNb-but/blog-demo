package com.bdqn.pojo;

public class Labels {
    private int labelId          ; // 标签ID
    private String labelName        ; // 标签名称
    private String labelAlias       ; // 标签别名
    private String labelDescription ; // 标签描述


    public Labels() {
    }

    public Labels(int labelId, String labelName, String labelAlias, String labelDescription) {
        this.labelId = labelId;
        this.labelName = labelName;
        this.labelAlias = labelAlias;
        this.labelDescription = labelDescription;
    }

    /**
     * 获取
     * @return labelId
     */
    public int getLabelId() {
        return labelId;
    }

    /**
     * 设置
     * @param labelId
     */
    public void setLabelId(int labelId) {
        this.labelId = labelId;
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
     * @return labelAlias
     */
    public String getLabelAlias() {
        return labelAlias;
    }

    /**
     * 设置
     * @param labelAlias
     */
    public void setLabelAlias(String labelAlias) {
        this.labelAlias = labelAlias;
    }

    /**
     * 获取
     * @return labelDescription
     */
    public String getLabelDescription() {
        return labelDescription;
    }

    /**
     * 设置
     * @param labelDescription
     */
    public void setLabelDescription(String labelDescription) {
        this.labelDescription = labelDescription;
    }

    public String toString() {
        return "Labels{labelId = " + labelId + ", labelName = " + labelName + ", labelAlias = " + labelAlias + ", labelDescription = " + labelDescription + "}";
    }
}
