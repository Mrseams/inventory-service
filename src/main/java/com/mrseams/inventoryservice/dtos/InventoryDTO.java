package com.mrseams.inventoryservice.dtos;

public record InventoryDTO(Long id, String skuCode, Integer quantity, String created_at, String updated_at) {
}
