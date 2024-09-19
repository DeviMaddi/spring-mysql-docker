package com.example.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Items")
public class Item {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "iem_id")
	 private Long id;
	 
	 @Column(name = "item_name")
	 private String itemName;
	 
	 @Column(name = "item_desc")
	 private String itemDesc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	 
	 
	 
}
