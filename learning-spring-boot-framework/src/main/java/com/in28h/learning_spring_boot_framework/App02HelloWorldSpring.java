package com.in28h.learning_spring_boot_framework;

import com.in28h.learning_spring_boot_framework.game.GameRunner;
import com.in28h.learning_spring_boot_framework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {



var context = new AnnotationConfigApplicationContext(HelloWorldConfigration.class);
        System.out.println(context.getBean("name"));

    }
}
