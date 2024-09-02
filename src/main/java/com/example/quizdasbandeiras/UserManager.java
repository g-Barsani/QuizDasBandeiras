package com.example.quizdasbandeiras;

public class UserManager {
    private static UserManager instance;
    private String userName;

    // Private constructor to prevent instantiation
    private UserManager() {
        userName = "";
    }

    // Get the single instance of UserManager
    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    // Method to set the user's name
    public void setUserName(String name) {
        userName = name;
    }

    // Method to get the user's name
    public String getUserName() {
        return userName;
    }

    // Method to reset the user's name (optional)
    public void resetUserName() {
        userName = "";
    }
}
