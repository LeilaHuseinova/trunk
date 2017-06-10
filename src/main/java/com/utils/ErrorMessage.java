package com.utils;

/**
 * @author leyla
 * @since 17.05.17
 */
public enum ErrorMessage {

    USER_ALREADY_EXISTS("A user with the given username already exists");

    private String name;

    ErrorMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
