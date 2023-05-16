package com.marimar.store.application.service;

import com.marimar.store.application.dto.ItemDTO;
import com.marimar.store.domain.entity.Item;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<ItemDTO> getAllItems();
    List<ItemDTO> getAllItemsByCategory(Long categoryId);
    Optional<ItemDTO> getItemById(Long itemId);
    ItemDTO saveItem(ItemDTO item);
    void deleteItem(Long itemId);
    List<ItemDTO> getItemByCriteriaStringPaged(Pageable pageable, String filter);
}
