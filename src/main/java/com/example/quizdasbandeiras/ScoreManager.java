package com.example.quizdasbandeiras;

public class ScoreManager {
    private static ScoreManager instance;
    private int score;

    private ScoreManager() {
        score = 0;
    }

    // Get the single instance of ScoreManager
    public static synchronized ScoreManager getInstance() {
        if (instance == null) {
            instance = new ScoreManager();
        }
        return instance;
    }

    public void addPoints(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public void resetScore() {
        score = 0;
    }
}
