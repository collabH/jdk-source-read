/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.eventListener.application;

import dev.research.eventListener.domain.event.CreateOrder;
import dev.research.eventListener.domain.event.SaveEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @fileName: OrderService.java
 * @description: OrderService.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 14:57
 */
@Service
public class OrderService {
    @Autowired
    private SaveEvent saveEvent;

    public void save(CreateOrder event) {
        saveEvent.publish(event);
    }
}
