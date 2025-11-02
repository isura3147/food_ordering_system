package edu.icet.service;

import edu.icet.model.entity.ItemEntity;
import edu.icet.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<ItemEntity> getItems() {
        return itemRepository.findAll();
    }
}
