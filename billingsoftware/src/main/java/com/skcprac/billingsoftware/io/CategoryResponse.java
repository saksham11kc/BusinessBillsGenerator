package com.skcprac.billingsoftware.io;

import java.sql.Timestamp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponse {
    private String categoryId;
    private String name ;
    private String description;
    private String bgColor;
    private Timestamp updatedAt;
    private Timestamp createdAt;
    private String imgUrl;
}
