package org.chdtu;

public class UserSettings {
    private String avatarUrl;

    public UserSettings() {
        System.out.println("UserSettings bean is created");
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
