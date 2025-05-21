package com.mrseams.inventoryservice.services;


import com.mrseams.inventoryservice.dtos.InventoryDTO;
import com.mrseams.inventoryservice.models.Inventory;
import com.mrseams.inventoryservice.repositories.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InventoryService {

    private final InventoryRepository IR;

    public List<InventoryDTO> getAllInventory(){
        return IR.findAll()
            .stream()
            .map(i -> new InventoryDTO
                    (
                            i.getId(),
                            i.getSkuCode(),
                            i.getQuantity(),
                            i.getCreated_at(),
                            i.getUpdated_at()
                    )
            ).toList();
    }

    public InventoryDTO getInventoryEntry(Long id){
        Inventory inventory = IR.findById(id).orElse(null);

        if(inventory != null){
            return new InventoryDTO(
                inventory.getId(),
                inventory.getSkuCode(),
                inventory.getQuantity(),
                inventory.getCreated_at(),
                inventory.getUpdated_at()
            );
        }
        return null;
    }

    public InventoryDTO createInventoryEntry(InventoryDTO inventoryDto){
        Inventory inventory = new Inventory();
        inventory.setSkuCode(inventoryDto.skuCode());
        inventory.setQuantity(inventoryDto.quantity());

        IR.save(inventory);

        return inventoryDto;
    }

    public boolean isInStock(String skuCode, Integer quantity){
        return IR.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }

}
