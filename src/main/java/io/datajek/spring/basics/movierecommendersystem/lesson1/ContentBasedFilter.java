package io.datajek.spring.basics.movierecommendersystem.lesson1;


import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter{
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}