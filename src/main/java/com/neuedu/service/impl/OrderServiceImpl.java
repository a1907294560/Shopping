package com.neuedu.service.impl;

import com.neuedu.mapper.OrderMapper;
import com.neuedu.pojo.Order;
import com.neuedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public List<Order> getOrderList() {
        return orderMapper.getOrderList();
    }
}
