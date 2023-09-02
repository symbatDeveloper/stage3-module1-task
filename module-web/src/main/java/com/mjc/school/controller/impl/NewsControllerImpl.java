package com.mjc.school.controller.impl;

import com.mjc.school.controller.NewsController;
import com.mjc.school.repository.exceptions.AuthorNotFoundException;
import com.mjc.school.repository.exceptions.NewsNotFoundException;
import com.mjc.school.service.NewsService;
import com.mjc.school.service.dto.NewsCreateDtoRequest;
import com.mjc.school.service.dto.NewsDto;
import com.mjc.school.service.dto.UpdDtoRequest;
import com.mjc.school.service.exceptions.ContValidException;
import com.mjc.school.service.exceptions.TvalidException;
import com.mjc.school.service.impl.NewsServiceImpl;

import java.util.List;

public class NewsControllerImpl implements NewsController<NewsDto> {

    private final NewsService<NewsDto> newsService = new NewsServiceImpl();

    @Override
    public List<NewsDto> readAllNews() {
        return newsService.readAll();
    }

    @Override
    public NewsDto readById(Long id) throws NewsNotFoundException {
        return newsService.readById(id);
    }

    @Override
    public NewsDto createNews(NewsCreateDtoRequest news) throws
            TvalidException, ContValidException, AuthorNotFoundException {
        return newsService.create(news);
    }

    @Override
    public NewsDto updateNews(UpdDtoRequest news) throws
            AuthorNotFoundException,
            NewsNotFoundException,
            TvalidException,
            ContValidException {
        return newsService.update(news);
    }

    @Override
    public Boolean deleteNews(Long id) throws NewsNotFoundException {
        return newsService.delete(id);
    }
}