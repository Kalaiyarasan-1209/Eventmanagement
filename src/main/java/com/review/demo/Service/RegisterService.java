package com.review.demo.Service;

import org.springframework.stereotype.Service;

import com.review.demo.Model.RegisterModel;
import com.review.demo.Repositary.RegisterRepo;

@Service
public class RegisterService
{
    private RegisterRepo registerRepo;

    public RegisterService(RegisterRepo registerRepo) {
        this.registerRepo = registerRepo;
    }

    public RegisterModel saveDet(RegisterModel registerModel)
    {
        return registerRepo.save(registerModel);
    }
    
}
