package com.example.restTemplateSpring2.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class NewsResponse {
    List<ArticleResponse> articles;
}
