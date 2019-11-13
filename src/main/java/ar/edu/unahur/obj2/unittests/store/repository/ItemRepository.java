package ar.edu.unahur.obj2.unittests.store.repository;

import ar.edu.unahur.obj2.unittests.store.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {


    private static final Map<String, Item> itemMap;
    static
    {
        itemMap = new HashMap<String, Item>();
        itemMap.put("it1", new Item("it1", "Item 1", "This is item 1", 2000, true));
        itemMap.put("it2", new Item("it2", "Item 2", "This is item 2", 3000, true));
        itemMap.put("it3", new Item("it3", "Item 3", "This is item 3", 4000, true));
    }

    public List<Item> readAllItems() {
        ArrayList<Item> itemList = new ArrayList<Item>(itemMap.values());
        return itemList;
    }

    public Item findById(String id) {
        return itemMap.get(id);
    }

    public Item create(Item item) {
        String id = String.valueOf(itemMap.size());
        item.setId(id);
        itemMap.put(id, item);
        return item;
    }
}
