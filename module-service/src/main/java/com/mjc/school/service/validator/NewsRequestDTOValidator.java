package com.mjc.school.service.validator;

import com.mjc.school.service.dto.NewsCreateDtoRequest;
import com.mjc.school.service.dto.UpdDtoRequest;
import com.mjc.school.service.exceptions.ContValidException;
import com.mjc.school.service.exceptions.TvalidException;

public class NewsRequestDTOValidator {
    public void validateNewsCreateDTORequest(NewsCreateDtoRequest dto) throws
            TvalidException, ContValidException {
        checkNewsTitle(dto.getTitle());
        checkNewsContent(dto.getContent());

    }

    public void validateNewsUpdateDTORequest(UpdDtoRequest dto) throws
            ContValidException, TvalidException {
        checkNewsTitle(dto.getTitle());
        checkNewsContent(dto.getContent());
    }

    private void checkNewsTitle(String title) throws TvalidException {
        if (title == null || title.length() < 5 || title.length() > 30) {
            throw new TvalidException("News title can not be less than 5 and more than 30 symbols. " +
                    "News title is " +
                    title);
        }
    }

    private void checkNewsContent(String content) throws ContValidException {
        if (content == null || content.length() < 5 || content.length() > 255) {
            throw new ContValidException("News content can not be less than 5 and more than 255 symbols. " +
                    "News content is " +
                    content);
        }
    }
}
