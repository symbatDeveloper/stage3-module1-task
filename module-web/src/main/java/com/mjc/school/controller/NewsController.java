package com.mjc.school.controller;

import com.mjc.school.repository.exceptions.AuthorNotFoundException;
import com.mjc.school.repository.exceptions.NewsNotFoundException;
import com.mjc.school.service.dto.NewsCreateDtoRequest;
import com.mjc.school.service.dto.UpdDtoRequest;
import com.mjc.school.service.exceptions.ContValidException;
import com.mjc.school.service.exceptions.TvalidException;

import java.util.List;

public interface NewsController<T> {

    List<T> readAllNews();

    T readById(Long id) throws NewsNotFoundException;

    T createNews(NewsCreateDtoRequest news) throws TvalidException, ContValidException, AuthorNotFoundException;

    T updateNews(UpdDtoRequest news) throws AuthorNotFoundException, NewsNotFoundException, TvalidException, ContValidException;

    Boolean deleteNews(Long id) throws NewsNotFoundException;

}
