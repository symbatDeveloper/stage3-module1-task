package com.mjc.school.repository.model;


import lombok.Getter;

import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Author {
    private Long id;
    private String name;

    public Author(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Author author = (Author) o;
        return id.equals(author.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long id() {
        return id;
    }

    public Author setId(Long id) {
        this.id = id;
        return this;
    }


    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
