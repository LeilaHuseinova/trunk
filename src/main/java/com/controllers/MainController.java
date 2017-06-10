package com.controllers;

import com.exceptions.UserAlreadyExistsException;
import com.model.dto.ErrorDTO;
import com.utils.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.services.UserService;

/**
 * @author leyla
 * @since 17.05.17
 */
@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/createUser", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> createUser(@RequestParam String name,
                                        @RequestParam String email,
                                        @RequestParam String phoneNumber) {
        try {
            userService.create(name, email, phoneNumber);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(UserAlreadyExistsException ex) {
            return new ResponseEntity<>(new ErrorDTO(ErrorMessage.USER_ALREADY_EXISTS), HttpStatus.CONFLICT);
        }
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public void updateUser(@RequestParam Long id,
                             @RequestParam String email,
                             @RequestParam String phoneNumber) {
        userService.update(id, email, phoneNumber);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public void deleteUser(@RequestParam Long id) {
        userService.delete(id);
    }
}
