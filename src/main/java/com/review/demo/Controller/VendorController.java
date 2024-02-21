package com.review.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.review.demo.Model.VendorModel;
import com.review.demo.Service.VendorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class VendorController {
    public VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }
    
    @PostMapping("/vendor")
    public VendorModel save(VendorModel vendorModel)
    {
        return vendorService.saving(vendorModel);
    }
}
