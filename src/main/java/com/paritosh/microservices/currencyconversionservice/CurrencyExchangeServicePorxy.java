package com.paritosh.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="currency-exchange-service" , url="localhost:8000")
public interface CurrencyExchangeServicePorxy {
	
	@GetMapping("currency-exchange/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeCalue(@PathVariable String from , @PathVariable String to) ;
}
