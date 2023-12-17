package com.tazimKhan.listMaker.service;

import com.tazimKhan.listMaker.model.ListItem;
import com.tazimKhan.listMaker.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
        System.out.println("Deleting: " + listItem.getContent() + ", id=" + listItem.getId());

        try {
            listRepository.deleteById(listItem.getId());
            return true;
        } catch (EmptyResultDataAccessException e) {
            System.out.println(e);
            return false;
        }

    }
}
