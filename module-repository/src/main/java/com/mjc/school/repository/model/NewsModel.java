package com.mjc.school.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
public class NewsModel {
    Long id;
    String title;
    String content;
    LocalDateTime createDate;
    LocalDateTime lastUpdateDate;
    Author author;

    public NewsModel(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        NewsModel newsModel = (NewsModel) o;
        return id.equals(newsModel.id);
    }

    public NewsModel(Long id, String title, String content, LocalDateTime createDate, LocalDateTime lastUpdateDate, Author author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.author = author;
    }

    public Long id() {
        return id;
    }


    public NewsModel setId(Long id) {
        this.id = id;
        return this;
    }

    public NewsModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public NewsModel setContent(String content) {
        this.content = content;
        return this;
    }

    public NewsModel setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
        return this;
    }

    public NewsModel setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    public NewsModel setAuthor(Author author) {
        this.author = author;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
