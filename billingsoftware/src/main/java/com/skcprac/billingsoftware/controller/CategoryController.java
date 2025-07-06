package com.skcprac.billingsoftware.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcprac.billingsoftware.io.CategoryResponse;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @PostMapping
    public CategoryResponse addCategory(@RequestBody CategoryRequest request){}
}
