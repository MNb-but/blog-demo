package com.bdqn.pojo;

public class Admin {
    private int adminId; // 用户ID
    private String adminName; // 账号
    private String adminPassword; // 密码


    public Admin() {
    }

    public Admin(int adminId, String adminName, String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    /**
     * 获取
     * @return adminId
     */
    public int getAdminId() {
        return adminId;
    }

    /**
     * 设置
     * @param adminId
     */
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取
     * @return adminName
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * 获取
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置
     * @param adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String toString() {
        return "Admin{adminId = " + adminId + ", adminName = " + adminName + ", adminPassword = " + adminPassword + "}";
    }
}
