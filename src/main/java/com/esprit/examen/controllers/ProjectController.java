package com.esprit.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;

public class ProjectController {

	@Autowired
    private final IStockService stockService;

	@GetMapping("/retrieve-all-stocks")
	public List<Stock> getStocks() {
		return stockService.retrieveAllStocks();
	}

	@GetMapping("/{stock-id}")
	public Stock retrieveStock(@PathVariable("stock-id") Long stockId) {
		return stockService.retrieveStock(stockId);
	}
	

}
