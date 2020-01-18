/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package java.research.eventListener.domain.event;

import dev.research.ddd.ValueObject;

import java.math.BigDecimal;

/**
 * @fileName: CreateOrder.java
 * @description: CreateOrder.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 17:26
 */
@ValueObject
public class CreateOrder {
    private String name;
    private BigDecimal price;

    /**
     * 创建订单
     *
     * @param orderId
     */
    public void createOrder(OrderId orderId) {
        System.out.println("create order" + orderId.getOrderId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
