package com.tazimKhan.listMaker.repository;

import com.tazimKhan.listMaker.model.ListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<ListItem, Integer> { // primary key is int id (Integer)
}
