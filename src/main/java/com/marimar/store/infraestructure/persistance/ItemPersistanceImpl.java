package com.marimar.store.infraestructure.persistance;


import com.marimar.store.domain.entity.Item;
import com.marimar.store.domain.persistance.ItemPersistance;

import java.util.List;
import java.util.Optional;
public class ItemPersistanceImpl implements ItemPersistance {

    private final ItemRepository itemRepository;

    public ItemPersistanceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAllItemsByCategory(Long categoryId) {
        return this.itemRepository.findAllByCategoryId(categoryId);
    }

    @Override
    public Optional<Item> getItemById(Long itemId) {
        return this.itemRepository.findById(itemId);
    }

    @Override
    public Item saveItem(Item item) {
        return this.itemRepository.save(item);
    }

    @Override
    public void deleteItem(Long itemId) {
        this.itemRepository.deleteById(itemId);
    }
}