package com.model.dto;

import com.utils.ErrorMessage;

/**
 * @author leyla
 * @since 17.05.17
 */
public class ErrorDTO {

    private String code;
    private String description;

    public ErrorDTO(ErrorMessage message) {
        this.code = message.toString();
        this.description = message.getName();
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
