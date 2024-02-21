package com.review.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.demo.Model.DetailModel;

@Repository
public interface DetailRepo extends JpaRepository<DetailModel,Integer>
{
    
}
