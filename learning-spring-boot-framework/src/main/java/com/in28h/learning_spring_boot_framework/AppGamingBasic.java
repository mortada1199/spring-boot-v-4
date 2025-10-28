package com.in28h.learning_spring_boot_framework;

import com.in28h.learning_spring_boot_framework.game.GameRunner;
import com.in28h.learning_spring_boot_framework.game.MarioGame;
import com.in28h.learning_spring_boot_framework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
       // var mariogame =new MarioGame();
        var superContraGame = new SuperContraGame();
        var gamerunner = new GameRunner(superContraGame);
        gamerunner.run();
    }
}
