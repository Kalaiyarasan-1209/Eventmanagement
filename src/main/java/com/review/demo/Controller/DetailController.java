package com.review.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.review.demo.Model.DetailModel;
import com.review.demo.Service.DetailService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.hibernate.mapping.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class DetailController {
    public DetailService detailService;


    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @PostMapping("/detail")
    public DetailModel jj(@RequestBody DetailModel detailModel)
    {
        return detailService.AddDetail(detailModel);
    }
    
    @GetMapping("/detailsofdet")
    public ResponseEntity<DetailModel> getting(@PathVariable int id)
    {
        DetailModel obj=detailService.findById(id);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }

}
