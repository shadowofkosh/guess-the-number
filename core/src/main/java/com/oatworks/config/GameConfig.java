package com.oatworks.config;

import com.oatworks.GuessCount;
import com.oatworks.MaxNumber;
import com.oatworks.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.oatworks")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.minNumber:1}")
    private int minNumber;


    @Value("${game.guessCount:4}")
    private int guessCount;



    // == bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }







}
