package com.esprit.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;

public class ProjectController {
	@Autowired
    private final IStockService stockService;
    
    	@PostMapping
	public Produit addProduit(@RequestBody Produit p) {
		return produitService.addProduit(p);
	}

    	@DeleteMapping("/{produit-id}")
	public void removeProduit(@PathVariable("produit-id") Long produitId) {
		produitService.deleteProduit(produitId);
	}

	@PutMapping
	public Produit modifyProduit(@RequestBody Produit p) {
		return produitService.updateProduit(p);
	}

    	@PutMapping(value = "/assignProduitToStock/{idProduit}/{idStock}")
	public void assignProduitToStock(@PathVariable("idProduit") Long idProduit, @PathVariable("idStock") Long idStock) {
		produitService.assignProduitToStock(idProduit, idStock);
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
