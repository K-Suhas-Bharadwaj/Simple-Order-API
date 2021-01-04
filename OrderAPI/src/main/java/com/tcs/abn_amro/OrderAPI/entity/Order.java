package com.tcs.abn_amro.OrderAPI.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Order {
	
	@Id
	@GeneratedValue
	private Integer orderId;
	private int customerId;
	private Date dateOfDelivery;
	private String addressOfDelivery;
	
	@OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "itemId_foreignKey", referencedColumnName = "orderId")
	private List<Integer> itemIds;

}
