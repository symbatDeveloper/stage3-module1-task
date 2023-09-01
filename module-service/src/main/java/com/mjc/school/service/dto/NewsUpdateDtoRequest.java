package com.mjc.school.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NewsUpdateDtoRequest {
    Long id;
    String title;
    String content;
    Long authorId;
}
