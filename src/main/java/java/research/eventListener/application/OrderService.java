/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package java.research.eventListener.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.research.eventListener.domain.event.CreateOrder;
import java.research.eventListener.domain.event.SaveEvent;

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
