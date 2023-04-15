package com.esprit.examen.controllers;

@RestController
@RequestMapping("/projet")
@RequiredArgsConstructor
public class ProjectController {
    private final IFactureService factureService;

    @GetMapping
    public List<Facture> getFactures() {
        return factureService.retrieveAllFactures();
    }

		public List<SecteurActivite> getSecteurActivite() {
		return secteurActiviteService.retrieveAllSecteurActivite();
	}

	@DeleteMapping("/{secteurActivite-id}")
	public void removeSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		secteurActiviteService.deleteSecteurActivite(secteurActiviteId);
	}

	@PutMapping
	public SecteurActivite modifySecteurActivite(@RequestBody SecteurActivite secteurActivite) {
		return secteurActiviteService.updateSecteurActivite(secteurActivite);
	}
		public List<SecteurActivite> getSecteurActivite() {
		return secteurActiviteService.retrieveAllSecteurActivite();
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

	@PutMapping
	public SecteurActivite modifySecteurActivite(@RequestBody SecteurActivite secteurActivite) {
		return secteurActiviteService.updateSecteurActivite(secteurActivite);
	}
}
