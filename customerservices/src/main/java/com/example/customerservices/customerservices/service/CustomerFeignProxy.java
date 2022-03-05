package com.example.customerservices.customerservices.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="order-service", url="http://localhost:8081/")
public interface CustomerFeignProxy {

}
