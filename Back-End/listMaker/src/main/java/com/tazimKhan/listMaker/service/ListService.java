package com.tazimKhan.listMaker.service;

import com.tazimKhan.listMaker.model.ListItem;

import java.util.List;

public interface ListService {
    public ListItem saveListItem(ListItem listItem);
    public boolean deleteListItem(ListItem listItem);
    public List<ListItem> getAllItems();
}
