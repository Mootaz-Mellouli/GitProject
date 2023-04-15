package com.esprit.examen.controllers;
@RestController
@RequestMapping("/projet")
@RequiredArgsConstructor
public class ProjectController {

    private final IFactureService factureService;

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

	}

	@GetMapping("/{stock-id}")
	public Stock retrieveStock(@PathVariable("stock-id") Long stockId) {
		return stockService.retrieveStock(stockId);
	}

	public List<SecteurActivite> getSecteurActivite() {
	return secteurActiviteService.retrieveAllSecteurActivite();
	}


	@PostMapping
	public SecteurActivite addSecteurActivite(@RequestBody SecteurActivite sa) {
		SecteurActivite secteurActivite = secteurActiviteService.addSecteurActivite(sa);
		return secteurActivite;
	}

	@GetMapping("/{secteurActivite-id}")
	public SecteurActivite retrieveSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		return secteurActiviteService.retrieveSecteurActivite(secteurActiviteId);
	}

	@PostMapping
	public SecteurActivite addSecteurActivite(@RequestBody SecteurActivite sa) {
		SecteurActivite secteurActivite = secteurActiviteService.addSecteurActivite(sa);
		return secteurActivite;
	}

	@DeleteMapping("/{secteurActivite-id}")
	public void removeSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		secteurActiviteService.deleteSecteurActivite(secteurActiviteId);
	}


	
	@DeleteMapping("/{fournisseur-id}")
	public void removeFournisseur(@PathVariable("fournisseur-id") Long fournisseurId) {
		fournisseurService.deleteFournisseur(fournisseurId);
	}

	@PutMapping
	public Fournisseur modifyFournisseur(@RequestBody Fournisseur fournisseur) {
		return fournisseurService.updateFournisseur(fournisseur);
	}
}

