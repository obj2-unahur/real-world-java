package ar.edu.unahur.obj2.unittests.store.service;

import ar.edu.unahur.obj2.unittests.store.model.Item;
import ar.edu.unahur.obj2.unittests.store.repository.ItemRepository;
import ar.edu.unahur.obj2.unittests.store.service.tools.StaticService;
import org.springframework.beans.factory.annotation.Autowired;

public class RateService {

    @Autowired
    private ItemRepository itemRepository;


    public int calculateRate(String itemId, int muliplicator) {

        Item item = itemRepository.findById(itemId);
        int rate = item.getPriceInCents() * StaticService.getMultiplicator();
        return rate;
    }

}
