/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package java.research.eventListener.domain.event;

import java.util.UUID;

/**
 * @fileName: OrderId.java
 * @description: OrderId.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 17:26
 */
public class OrderId {
    private String orderId;

    /**
     * 生成订单id
     */
    public OrderId generate() {
        this.setOrderId(UUID.randomUUID().toString());
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
