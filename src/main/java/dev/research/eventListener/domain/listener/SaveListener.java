/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.eventListener.domain.listener;

import dev.research.eventListener.domain.event.CreateOrder;
import dev.research.eventListener.domain.event.OrderId;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @fileName: SaveListener.java
 * @description: SaveListener.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 14:55
 */
@Component
public class SaveListener {


    @EventListener
    public void listener(CreateOrder event) {
        event.createOrder(new OrderId().generate());
    }
}
