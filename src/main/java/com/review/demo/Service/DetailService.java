package com.review.demo.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.review.demo.Model.DetailModel;
import com.review.demo.Repositary.DetailRepo;

@Service
public class DetailService {
    public DetailRepo detailRepo;

    public DetailService(DetailRepo detailRepo) {
        this.detailRepo = detailRepo;
    }
    
    public DetailModel AddDetail(DetailModel detailModel)
    {
        return detailRepo.save(detailModel);
    }

    public List<DetailModel> getall()
    {
        return detailRepo.findAll();
    }

    public DetailModel findById(int x)
    {
        return detailRepo.findById(x).orElse(null);
    }
    
}
