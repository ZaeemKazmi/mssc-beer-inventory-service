package com.zk.msscbeerinventoryservice.web.mappers;

import com.zk.brewery.model.BeerInventoryDto;
import com.zk.msscbeerinventoryservice.domain.BeerInventory;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
