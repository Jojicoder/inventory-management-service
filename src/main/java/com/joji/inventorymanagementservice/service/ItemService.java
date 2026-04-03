package com.joji.inventorymanagementservice.service;

import com.joji.inventorymanagementservice.entity.Item;
import com.joji.inventorymanagementservice.repository.ItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
}
