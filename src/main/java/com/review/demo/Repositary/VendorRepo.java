package com.review.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.demo.Model.VendorModel;

@Repository
public interface VendorRepo extends JpaRepository<VendorModel,Integer>
{
    
}
