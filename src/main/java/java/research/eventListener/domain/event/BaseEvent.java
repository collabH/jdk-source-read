/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.eventListener.domain.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @fileName: BaseEvent.java
 * @description: BaseEvent.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 17:37
 */
public abstract class BaseEvent<T> implements DomainEvent<T> {
    @Autowired
    private ApplicationEventPublisher publisher;

    @Override
    public void publish(T event) {
        publisher.publishEvent(event);
    }
}
