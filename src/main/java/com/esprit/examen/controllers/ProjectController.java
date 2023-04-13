package com.esprit.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/projet")
@RequiredArgsConstructor
public class ProjectController {
    private final IFactureService factureService;
    private final IStockService stockService;

    @GetMapping
    public List<Facture> getFactures() {
        return factureService.retrieveAllFactures();
    }
	@GetMapping("/retrieve-all-stocks")
	public List<Stock> getStocks() {
		return stockService.retrieveAllStocks();
	}

	@GetMapping("/{stock-id}")
	public Stock retrieveStock(@PathVariable("stock-id") Long stockId) {
		return stockService.retrieveStock(stockId);
	}
}
