package com.in28h.learning_spring_boot_framework.game;

public class GameRunner {


//MarioGame marioGame;
private  GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole  ) {
        this.gamingConsole=gamingConsole;
    }

    public void run() {
        System.out.println("run game ");
        gamingConsole.up();
        gamingConsole.right();
        gamingConsole.down();
        gamingConsole.left();
    }
}
