package com.tcs.abn_amro.OrderAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tcs.abn_amro.OrderAPI.controller.ItemController;
import com.tcs.abn_amro.OrderAPI.controller.OrderController;
import com.tcs.abn_amro.OrderAPI.entity.Item;
import com.tcs.abn_amro.OrderAPI.entity.Order;

@SpringBootTest
class OrderBookApplicationTests {

	@Test
	void test() {
		
		Item book = new Item();
		book.setItemId(null);
		book.setName("Cracking the Coding Interview");
		book.setCost(1400);
		
		Item pen = new Item();
		pen.setItemId(null);
		pen.setName("Butter Flow");
		pen.setCost(10.5);
		
		Item rubber = new Item();
		rubber.setItemId(null);
		rubber.setName("Apsara");
		rubber.setCost(6.7);
		
		Order order = new Order();
		order.setOrderId(null);
		order.setCustomerId(101);
		order.setDateOfDelivery(new Date(Calendar.getInstance().getTime().getTime()));
		order.setAddressOfDelivery("Shimoga");
		order.setItemIds(new ItemController().getItemIds());
		
		assertEquals(1417.2, new OrderController().placeOrderAndGetTotalCost(order));

	}

}
