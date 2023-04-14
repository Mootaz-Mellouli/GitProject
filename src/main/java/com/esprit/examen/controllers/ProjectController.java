package com.esprit.examen.controllers;

<<<<<<< HEAD
@RestController
@Api(tags = "Gestion des fournisseurss")
@RequestMapping("/fournisseur")
@RequiredArgsConstructor
public class FournisseurRestController {

	private final IFournisseurService fournisseurService;

	@GetMapping
	public List<Fournisseur> getFournisseurs() {
		return fournisseurService.retrieveAllFournisseurs();
	}

	@GetMapping("/{fournisseur-id}")
	public Fournisseur retrieveFournisseur(@PathVariable("fournisseur-id") Long fournisseurId) {
		return fournisseurService.retrieveFournisseur(fournisseurId);
	}

	@PostMapping
	public Fournisseur addFournisseur(@RequestBody Fournisseur f) {
		Fournisseur fournisseur = fournisseurService.addFournisseur(f);
		return fournisseur;
	}

	@DeleteMapping("/{fournisseur-id}")
	public void removeFournisseur(@PathVariable("fournisseur-id") Long fournisseurId) {
		fournisseurService.deleteFournisseur(fournisseurId);
	}

	@PutMapping
	public Fournisseur modifyFournisseur(@RequestBody Fournisseur fournisseur) {
		return fournisseurService.updateFournisseur(fournisseur);
	}

		@PutMapping(value = "/assignSecteurActiviteToFournisseur/{idSecteurActivite}/{idFournisseur}")
		public void assignProduitToStock(@PathVariable("idSecteurActivite") Long idSecteurActivite, @PathVariable("idFournisseur") Long idFournisseur) {
			fournisseurService.assignSecteurActiviteToFournisseur(idSecteurActivite, idFournisseur);
		}
=======
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
	

>>>>>>> 87f39f679a19ab02a5fa52d022330baa9016f5b6
}

