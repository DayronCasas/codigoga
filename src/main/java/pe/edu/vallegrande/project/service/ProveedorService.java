package pe.edu.vallegrande.project.service;

import pe.edu.vallegrande.project.model.Proveedor;
import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    List<Proveedor> findAll();
    Optional<Proveedor> findById(Integer id);
    Proveedor save(Proveedor proveedor);
    Proveedor update(Proveedor proveedor);
    void deleteById(Integer id);
}

