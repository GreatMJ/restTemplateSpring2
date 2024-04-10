package com.example.restTemplateSpring2.controller;

import com.example.restTemplateSpring2.dto.NewsResponse;
import com.example.restTemplateSpring2.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;
    @GetMapping("/get")
    public NewsResponse getNews(@RequestParam String countryCode, @RequestParam String apiKey){
        return newsService.getNews(countryCode,apiKey);
    }


}
