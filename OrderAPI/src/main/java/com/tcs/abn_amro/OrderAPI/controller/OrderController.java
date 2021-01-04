package com.tcs.abn_amro.OrderAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.abn_amro.OrderAPI.entity.Order;
import com.tcs.abn_amro.OrderAPI.repository.OrderRestRepository;

public class OrderController {
	
	@Autowired
	private OrderRestRepository orderRestRepository;
	
	public double placeOrderAndGetTotalCost(Order order) {
		
		//Place Order ==> Here order is hard coded. Used for testing purposes.
		orderRestRepository.save(order);
		 
		//Get total cost of the order
		return orderRestRepository.findById(order.getOrderId())
												   .get()
												   .getItemIds()
												   .stream()
												   .mapToDouble(itemId -> new ItemController().getPrice(itemId))
												   .sum();
		
	}
	
	/*
	 * Saving in real development be like:
	 * 
	 * @PostMapping("/placeOrder")
	 * public double placeOrder(@RequestBody Order order) {
	 * 		orderRestRepository.save(order.getOrder());
	 * }
	 * 
	 */
	
	/*
	 * Getting total price in real development be like:
	 * 
	 * @GetMapping("/getTotalPrice")
	 * public double placeOrder(@RequestBody Order order) {
	 * 		return orderRestRepository.findById(order.getOrder().getOrderId())
												   .get()
												   .getItemIds()
												   .stream()
												   .mapToDouble(itemId -> new ItemService().getPrice(itemId))
												   .sum();
	 * }
	 * 
	 */

}
