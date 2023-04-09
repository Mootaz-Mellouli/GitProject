package com.esprit.examen.controllers;

public class ProjectController {
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
}
