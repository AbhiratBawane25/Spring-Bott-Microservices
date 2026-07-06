package com.example.abhirat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.abhirat.binding.Order;
import com.example.abhirat.constants.AppConstants;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String,Order> kafkaTemplate;
	
	public String createOrder(Order order) {
		
		kafkaTemplate.send(AppConstants.ORDER_TOPIC, order);
		
		return "Order created in kafka topic";
	}
	
}
