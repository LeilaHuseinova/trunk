package com.exceptions;

import com.utils.ErrorMessage;

/**
 * @author leyla
 * @since 17.05.17
 */
public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException() {
        super(ErrorMessage.USER_ALREADY_EXISTS.getName());
    }
}
