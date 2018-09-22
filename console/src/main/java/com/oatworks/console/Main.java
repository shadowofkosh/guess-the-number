package com.oatworks.console;

import com.oatworks.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {


    public static void main(String[] args) {
        log.info("Guess The Number Game");

        //create context first
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // == irrelevant ==
//        // get number generator bean from context (container)
//        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
//
//        //call method next() to get a random number
//        int number = numberGenerator.next();
//
//        //log generated number
//        log.info("number = {}", number);
//
//        //get message generator bean
//        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
//
//        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
//        log.info("getResultMessage = {}", messageGenerator.getResultMessage());

        //close context (container)
        context.close();

    }
}



