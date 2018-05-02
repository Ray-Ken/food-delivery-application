package com.Bo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Document
public class MenuItem {
    private String name;
    private int price;
    private int quantity;
}
