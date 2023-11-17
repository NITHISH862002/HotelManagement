package com.company.admin;

public class Admin {
    private String adminName;
    private String AdminPassword;

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        AdminPassword = adminPassword;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }
}
