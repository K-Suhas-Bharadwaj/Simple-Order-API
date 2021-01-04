package com.tcs.abn_amro.OrderAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.abn_amro.OrderAPI.repository.ItemRestRepository;

public class ItemController {

	@Autowired
	private ItemRestRepository itemRestRepository;
	
	public List<Integer> getItemIds() {
		
		List<Integer> itemIds = new ArrayList<Integer>();
		itemRestRepository.findAll().forEach(item -> itemIds.add(item.getItemId()));
		return itemIds;
		
	}
	es
	public double getPrice(int itemId) {
		return itemRestRepository.findById(itemId).get().getCost();
	}
	
}
