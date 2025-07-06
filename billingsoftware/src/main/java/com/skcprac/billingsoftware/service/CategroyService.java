package com.skcprac.billingsoftware.service;

import com.skcprac.billingsoftware.io.CategoryRequest;
import com.skcprac.billingsoftware.io.CategoryResponse;

public interface CategroyService {

    CategoryResponse add(CategoryRequest request);
}
