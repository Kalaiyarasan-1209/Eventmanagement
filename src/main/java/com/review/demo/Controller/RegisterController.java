package com.review.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.review.demo.Model.RegisterModel;
import com.review.demo.Service.RegisterService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class RegisterController {
    private RegisterService registerService;
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }
    @PostMapping("/login")
    public RegisterModel log(@RequestBody RegisterModel registerModel)
    {
        return registerService.saveDet(registerModel);
    } 
}
