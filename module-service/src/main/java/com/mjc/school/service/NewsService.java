package com.mjc.school.service;

import com.mjc.school.repository.exceptions.AuthorNotFoundException;
import com.mjc.school.repository.exceptions.NewsNotFoundException;
import com.mjc.school.service.dto.NewsCreateDtoRequest;
import com.mjc.school.service.dto.UpdDtoRequest;
import com.mjc.school.service.exceptions.ContValidException;
import com.mjc.school.service.exceptions.TvalidException;

import java.util.List;

public interface NewsService<T> {
    List<T> readAll();

    T readById(Long id) throws NewsNotFoundException;

    T create(NewsCreateDtoRequest news) throws TvalidException, ContValidException, AuthorNotFoundException;

    T update(UpdDtoRequest news) throws NewsNotFoundException, AuthorNotFoundException, TvalidException, ContValidException;

    Boolean delete(Long id) throws NewsNotFoundException;
}
