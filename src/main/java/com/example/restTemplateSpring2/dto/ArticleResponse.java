package com.example.restTemplateSpring2.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleResponse {
    String author;
    String title;
    String description;
}
