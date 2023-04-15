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
}
