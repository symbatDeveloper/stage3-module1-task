package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.service.dto.NewsDto;
import com.mjc.school.service.dto.UpdDtoRequest;
import org.modelmapper.ModelMapper;

public class NewsModelDTOMapper {
    private final ModelMapper mapper = new ModelMapper();

    public NewsDto mapModelToDto(NewsModel newsModel) {
        return mapper.map(newsModel, NewsDto.class);
    }

    public NewsModel mapDtoToModel(NewsDto news) {
        return mapper.map(news, NewsModel.class);
    }

    public NewsModel mapRequestDtoToModel(UpdDtoRequest news) {
        return mapper.map(news, NewsModel.class);
    }

}
