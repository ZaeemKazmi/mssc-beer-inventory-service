package com.zk.msscbeerinventoryservice.services;

import com.zk.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
