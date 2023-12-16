package com.tazimKhan.listMaker.service;

import com.tazimKhan.listMaker.model.ListItem;
import com.tazimKhan.listMaker.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceImpl implements ListService{

    @Autowired
    private ListRepository listRepository;

    @Override
    public ListItem saveListItem(ListItem listItem) {
        return listRepository.save(listItem);
    }

    @Override
    public List<ListItem> getAllItems() {
        return listRepository.findAll();
    }

    @Override
    public boolean deleteListItem(ListItem listItem) {
        List<ListItem> a = getAllItems();
        ListItem itemToDelete = null;
        for (ListItem item : a) {
            System.out.println(item.getContent());
            if (item.getContent().equals(listItem.getContent())) {
                itemToDelete = item;
            }
        }

        if (itemToDelete == null) {
            return false;
        }
        listRepository.delete(itemToDelete);
        return true;
    }
}
