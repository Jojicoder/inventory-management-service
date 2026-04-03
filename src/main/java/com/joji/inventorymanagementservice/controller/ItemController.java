package com.joji.inventorymanagementservice.controller;

import com.joji.inventorymanagementservice.entity.Item;
import com.joji.inventorymanagementservice.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/items")

public class ItemController {
    private final ItemService itemService;
    
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
    
}
