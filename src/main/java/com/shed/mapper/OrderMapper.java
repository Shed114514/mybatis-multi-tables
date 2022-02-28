package com.shed.mapper;

import com.shed.domain.Order;

import java.util.List;

public interface OrderMapper {

    int insert(Order order);

    List<Order> selectOrderAndMember();
}
