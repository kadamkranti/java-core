package com.learning.core.day2session2;
class NotEligibleException extends Exception {
 
    public NotEligibleException(String message) {
 
        super(message);
 
    }
 
}
 
 
public class D02P062 {
 
    private String playerName;
 
    private float critic1;
 
    private float critic2;
 
    private float critic3;
 
    private float avgRating;
 
    private String coins;
 
 
    public D02P062(String playerName, float critic1) throws NotEligibleException {
 
        this.playerName = playerName;
 
        this.critic1 = critic1;
 
        this.critic2 = critic2;
 
        calculateAverageRating(critic1, critic2);
 
        this.coins = calculateCoins();
 
    }
 
 
    public D02P062(String playerName, float critic1, float critic2, float critic3) throws NotEligibleException {
 
        this.playerName = playerName;
 
        this.critic1 = critic1;
 
        this.critic2 = critic2;
 
        this.critic3 = critic3;
 
        calculateAverageRating(critic1, critic2, critic3);
 
        this.coins = calculateCoins();
 
    }
 
 
    private void calculateAverageRating(float critic1, float critic2) {
 
        this.avgRating = (critic1 + critic2) / 2.0f;
 
    }
 
 
    private void calculateAverageRating(float critic1, float critic2, float critic3) {
 
        this.avgRating = (critic1 + critic2 + critic3) / 3.0f;
 
    }
 
 
    private String calculateCoins() throws NotEligibleException {
 
        if (avgRating >= 7.0f) {
 
            return "Gold";
 
        } else if (avgRating >= 5.0f) {
 
            return "Silver";
 
        } else if (avgRating >= 2.0f) {
 
            return "Copper";
 
        } else {
 
            throw new NotEligibleException("not eligible");
 
        }
 
    }
 
 
    public void display() {
 
        System.out.println("Player Name: " + playerName);
 
        System.out.println("Critics Rating:");
 
        System.out.println("  Critic 1: " + critic1);
 
        System.out.println("  Critic 2: " + critic2);
 
        if (critic3 != 0.0f) {
 
            System.out.println("  Critic 3: " + critic3);
 
        }
 
        System.out.println("Average Rating: " + avgRating);
 
        System.out.println("Coins: " + coins);
 
    }
 
 
    public static void main(String[] args) {
 
        try {
 
            // Example usage
 
            D02P062 player1 = new D02P062("John", 9.3f, 9.67f, 8.7f);
 
            player1.display();
 
 
            D02P062 player2 = new D02P062 ("Henry", 1.5f);
 
            player2.display();
 
        } catch (NotEligibleException e) {
 
            System.out.println(e.getMessage());
 
        }
 
    }
 
}
 
 
