package com.esprit.examen.controllers;

public class ProjectController {
    
	@PostMapping
	public Projet  addProjet(@RequestBody Fournisseur f) {
		Projet fournisseur = fournisseurService.addFournisseur(f);
		return fournisseur;
	}
}
