package com.review.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.demo.Model.RegisterModel;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterModel,String>
{
    
}
