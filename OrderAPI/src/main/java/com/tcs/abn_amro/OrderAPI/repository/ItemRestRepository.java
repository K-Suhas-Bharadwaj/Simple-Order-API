package com.tcs.abn_amro.OrderAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tcs.abn_amro.OrderAPI.entity.Item;

@RepositoryRestResource
public interface ItemRestRepository extends CrudRepository<Item, Integer> {
}