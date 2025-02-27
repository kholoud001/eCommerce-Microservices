package org.example.orderservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    private List<Long> productIds;
    private long price;

}
