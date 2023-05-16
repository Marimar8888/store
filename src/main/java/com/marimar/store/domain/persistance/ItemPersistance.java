package com.marimar.store.domain.persistance;

import com.marimar.store.domain.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemPersistance {
    List<Item> getAllItems();
    List<Item> getAllItemsByCategory(Long categoryId);
    Optional<Item> getItemById(Long itemId);
    Item saveItem(Item item);
    void deleteItem(Long itemId);
}
