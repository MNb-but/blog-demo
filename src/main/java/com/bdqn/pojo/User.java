package com.bdqn.pojo;

import java.util.Date;

public class User {
    private int userId; // 用户ID
    private String userName; // 用户名
    private String userPassword; // 用户密码
    private String userEmail; // 用户邮箱
    private String userProfilePhoto; // 用户头像
    private Date userRegistrationTime; // 注册时间
    private Date userBirthday; // 用户生日
    private int userAge; // 用户年龄
    private String userPhoneNumber; // 用户手机号

    public User(){

    }

    public User(int userId, String userName, String userPassword, String userEmail, String userProfilePhoto, Date userRegistrationTime, Date userBirthday, int userAge, String userPhoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userProfilePhoto = userProfilePhoto;
        this.userRegistrationTime = userRegistrationTime;
        this.userBirthday = userBirthday;
        this.userAge = userAge;
        this.userPhoneNumber = userPhoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserProfilePhoto() {
        return userProfilePhoto;
    }

    public void setUserProfilePhoto(String userProfilePhoto) {
        this.userProfilePhoto = userProfilePhoto;
    }

    public Date getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(Date userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userProfilePhoto='" + userProfilePhoto + '\'' +
                ", userRegistrationTime=" + userRegistrationTime +
                ", userBirthday=" + userBirthday +
                ", userAge=" + userAge +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                '}';
    }
}
