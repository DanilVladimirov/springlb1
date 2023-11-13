package org.chdtu;

public class User {
    private String username;
    private UserSettings settings;

    public User() {
        System.out.println("User bean is created");
    }

    public void setUsername(String username) {
        System.out.println("Class Person: set Pet");
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public UserSettings getSettings() {
        return settings;
    }

    public void setSettings(UserSettings settings) {
        this.settings = settings;
    }
}
