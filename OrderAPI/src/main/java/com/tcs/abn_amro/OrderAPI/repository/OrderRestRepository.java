package com.tcs.abn_amro.OrderAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tcs.abn_amro.OrderAPI.entity.Order;

@RepositoryRestResource
public interface OrderRestRepository extends CrudRepository<Order, Integer> {
}
