package com.zk.msscbeerinventoryservice.services;

import com.zk.brewery.model.events.AllocateOrderRequest;
import com.zk.msscbeerinventoryservice.config.JmsConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class DeallocationListener {
    private final AllocationService allocationService;

    @JmsListener(destination = JmsConfig.DEALLOCATE_ORDER_QUEUE)
    public void listen(AllocateOrderRequest request){
        allocationService.deallocateOrder(request.getBeerOrderDto());
    }

}