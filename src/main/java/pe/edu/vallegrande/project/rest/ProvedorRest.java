package pe.edu.vallegrande.project.rest;

import pe.edu.vallegrande.project.model.Provedor;
import pe.edu.vallegrande.project.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/provedor")
public class ProvedorRest {

    private final ProvedorService provedorService;

    @Autowired
    public ProvedorRest(ProvedorService provedorService) {
        this.provedorService = provedorService;
    }

    @GetMapping
    public List<Provedor> findAll() {
        return provedorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Provedor> findById(@PathVariable Integer id) {
        return provedorService.findById(id);
    }

    @PostMapping("/save")
    public Provedor save(@RequestBody Provedor provedor) {
        return provedorService.save(provedor);
    }

    @PutMapping("/update")
    public Provedor update(@RequestBody Provedor provedor) {
        return provedorService.update(provedor);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        provedorService.deleteById(id);
    }
}
