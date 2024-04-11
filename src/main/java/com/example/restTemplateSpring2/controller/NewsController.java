package com.example.restTemplateSpring2.controller;

import com.example.restTemplateSpring2.dto.NewsResponse;
import com.example.restTemplateSpring2.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class NewsController {

    @Autowired
    NewsService newsService;
    @GetMapping("/api/v1/news")
    @ResponseBody
    public Object getNews(){
        return newsService.getNews();
    }


}
