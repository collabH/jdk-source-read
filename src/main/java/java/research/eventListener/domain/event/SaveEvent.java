/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package java.research.eventListener.domain.event;

import org.springframework.stereotype.Component;

/**
 * @fileName: SaveEvent.java
 * @description: SaveEvent.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 14:54
 */
@Component
public class SaveEvent extends BaseEvent<CreateOrder> {
    @Override
    public void publish(CreateOrder event) {
        super.publish(event);
    }
}
