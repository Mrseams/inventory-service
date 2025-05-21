package com.mrseams.inventoryservice.controllers;

import com.mrseams.inventoryservice.dtos.InventoryDTO;
import com.mrseams.inventoryservice.services.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {

    private final InventoryService IS;

    @GetMapping
    public List<InventoryDTO> index(){
        return IS.getAllInventory();
    }

    @GetMapping(value = "{id}")
    public InventoryDTO show(@PathVariable Long id){
        return IS.getInventoryEntry(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InventoryDTO store(@RequestBody InventoryDTO dto){
        return IS.createInventoryEntry(dto);
    }


    @GetMapping(value = "{skuCode}/quantity/{quantity}")
    public boolean exist(@PathVariable String skuCode, @PathVariable Integer quantity){
        return IS.isInStock(skuCode, quantity);
    }


}
