package com.in28h.learning_spring_boot_framework.game;

public class GameRunner {


//MarioGame marioGame;
SuperContraGame superContraGame;
    public GameRunner(SuperContraGame superContraGame  ) {
        this.superContraGame=superContraGame;
    }

    public void run() {
        System.out.println("run game ");
        superContraGame.up();
        superContraGame.right();
        superContraGame.down();
        superContraGame.left();
    }
}
