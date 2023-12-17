package com.tazimKhan.listMaker.controller;

import com.tazimKhan.listMaker.model.ListItem;
import com.tazimKhan.listMaker.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
@CrossOrigin // to fix "blocked by CORS policy" error
public class ListController {
    @Autowired
    private ListService listService;

    @PostMapping("/add")
    public String add(@RequestBody ListItem listItem) {
        listService.saveListItem(listItem);
        return "Saved list item: " + listItem.getContent();
    }

    @PostMapping("/delete")
    public String delete(@RequestBody ListItem listItem) {
        if (listService.deleteListItem(listItem)) {
            return "Deleted list item: " + listItem.getContent();
        }
        return "Failed deletion";
    }

    @GetMapping("/getAll")
    public List<ListItem> getAll() {
        return listService.getAllItems();
    }


}
