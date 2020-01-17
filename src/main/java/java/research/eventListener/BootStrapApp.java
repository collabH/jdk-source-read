/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.eventListener;

import dev.research.eventListener.application.OrderService;
import dev.research.eventListener.domain.event.CreateOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @fileName: BootStrapApp.java
 * @description: BootStrapApp.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 14:50
 */
@SpringBootApplication
@RestController
public class BootStrapApp {
    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public void save() {
        CreateOrder order = new CreateOrder();
        order.setName("测试");
        order.setPrice(new BigDecimal(10));
        orderService.save(order);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(BootStrapApp.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
