// API Key---> ee58efb4fcce4a9786304a529ac12cc1
// URL ---> https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=API_KEY
package com.example.restTemplateSpring2.service;

import com.example.restTemplateSpring2.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    @Autowired
    RestTemplate restTemplate;

    private String baseURL="https://newsapi.org/v2/top-headlines?country=";

    public NewsResponse getNews(String countryCode, String apiKey){
        String url=prepareURL(countryCode,apiKey);
        NewsResponse newsResponse =restTemplate.getForObject(url, NewsResponse.class);
        return newsResponse;
    }

    private String prepareURL(String countryCode,String apiKey){
        return baseURL+countryCode+'&'+"apiKey="+apiKey;
    }
}
