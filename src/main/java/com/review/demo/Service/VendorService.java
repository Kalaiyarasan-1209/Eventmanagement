package com.review.demo.Service;

import org.springframework.stereotype.Service;

import com.review.demo.Model.VendorModel;
import com.review.demo.Repositary.VendorRepo;

@Service
public class VendorService {
    public VendorRepo vendorRepo;

    public VendorService(VendorRepo vendorRepo) {
        this.vendorRepo = vendorRepo;
    }
    public VendorModel saving(VendorModel vendorModel)
    {
        return vendorRepo.save(vendorModel);
    }
    
}
