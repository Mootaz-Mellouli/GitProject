package com.esprit.examen.controllers;

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
}

