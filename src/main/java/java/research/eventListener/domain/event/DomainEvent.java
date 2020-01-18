/*
 * Copyright: 2020 dingxiang-inc.com Inc. All rights reserved.
 */

package java.research.eventListener.domain.event;

/**
 * @fileName: DomainEvent.java
 * @description: DomainEvent.java类说明
 * @author: by echo huang
 * @date: 2020-01-06 14:52
 */
public interface DomainEvent<T> {
    /**
     * @param event 事件数据
     */
    void publish(T event);
}
