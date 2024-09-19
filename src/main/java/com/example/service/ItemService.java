package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Item;
import com.example.repo.ItemRepository;

@Service
public class ItemService {
   
	@Autowired
	private ItemRepository repo;
	
	public void saveItem(Item item) {
		repo.save(item);
	}
	
	public List<Item> getItems(){
		return repo.findAll();
	}
}
