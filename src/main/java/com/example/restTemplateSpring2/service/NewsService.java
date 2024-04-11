// API Key---> ee58efb4fcce4a9786304a529ac12cc1
// URL ---> https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=ee58efb4fcce4a9786304a529ac12cc1
package com.example.restTemplateSpring2.service;

import com.example.restTemplateSpring2.dto.ArticleResponse;
import com.example.restTemplateSpring2.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class NewsService {
    @Autowired
    RestTemplate restTemplate;

   // private String baseURL="https://newsapi.org/v2/top-headlines?country=";

    public NewsResponse getNews(){
        //String url=prepareURL(countryCode,apiKey);
        String url= "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=ee58efb4fcce4a9786304a529ac12cc1";
        NewsResponse newsResponse=restTemplate.getForObject(url, NewsResponse.class);

        return newsResponse;
    }

//    private String prepareURL(String countryCode,String apiKey){
//        String url=baseURL+countryCode+"&category=business&apiKey="+apiKey;
//        return url;
//    }
}
