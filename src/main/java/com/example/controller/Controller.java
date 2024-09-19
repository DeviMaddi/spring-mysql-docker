package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Item;
import com.example.service.ItemService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class Controller {
	@Autowired
	private ItemService service;

	@PostMapping(value = "/save")
	public void saveUser(@RequestBody Item item) {
		service.saveItem(item);
	}

	@GetMapping(value = "/all")
	public List<Item> getItems() {
		return service.getItems();
	}
}
