package pe.edu.vallegrande.project.rest;

import pe.edu.vallegrande.project.model.Proveedor;
import pe.edu.vallegrande.project.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/proveedor")
public class ProveedorRest {

    private final ProveedorService proveedorService;

    @Autowired
    public ProveedorRest(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public List<Proveedor> findAll() {
        return proveedorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable Integer id) {
        return proveedorService.findById(id);
    }

    @PostMapping("/save")
    public Proveedor save(@RequestBody Proveedor proveedor) {
        return proveedorService.save(proveedor);
    }

    @PutMapping("/update")
    public Proveedor update(@RequestBody Proveedor proveedor) {
        return proveedorService.update(proveedor);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        proveedorService.deleteById(id);
    }
}
