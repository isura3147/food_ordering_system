package edu.icet.service;

import edu.icet.model.dto.Item;
import edu.icet.model.entity.ItemEntity;
import edu.icet.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getItems() {

        List<Item> itemList = new ArrayList<>();
        List<ItemEntity> itemEntityList = itemRepository.findAll();
        for (ItemEntity itemEntity : itemEntityList) {
            itemList.add(new Item(itemEntity.getCode(),
                    itemEntity.getDescription(),
                    itemEntity.getPackSize(),
                    itemEntity.getUnitPrice(),
                    itemEntity.getQtyOnHand()));
        }
        return itemList;
    }
}
