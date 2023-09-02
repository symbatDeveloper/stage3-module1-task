package com.mjc.school;

public enum Command {
    GET_ALL(1, "Show all news"),
    GET_BY_ID(2, "Get news record by id"),
    CREATE(3, "Add new news"),
    UPDATE(4, "Update news by id"),
    REMOVE_BY_ID(5, "Delete news by id"),
    EXIT(6, "Quit program");

    public final int code;

    public final String description;

    Command(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
