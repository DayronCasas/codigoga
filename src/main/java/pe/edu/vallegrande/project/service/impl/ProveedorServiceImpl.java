package pe.edu.vallegrande.project.service.impl;

import pe.edu.vallegrande.project.model.Proveedor;
import pe.edu.vallegrande.project.repository.ProveedorRepository;
import pe.edu.vallegrande.project.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedor> findAll() {
        log.info("Listando todos los proveedores");
        return proveedorRepository.findAll();
    }

    @Override
    public Optional<Proveedor> findById(Integer id) {
        log.info("Buscando proveedor con ID: {}", id);
        return proveedorRepository.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        log.info("Guardando proveedor: {}", proveedor);
        proveedor.setState("A");
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor update(Proveedor proveedor) {
        log.info("Actualizando proveedor: {}", proveedor);
        proveedor.setState("A");
        return proveedorRepository.save(proveedor);
    }

    @Override
    public void deleteById(Integer id) {
        log.info("Marcando proveedor como inactivo con ID: {}", id);
        Optional<Proveedor> optionalProveedor = proveedorRepository.findById(id);
        if (optionalProveedor.isPresent()) {
            Proveedor proveedor = optionalProveedor.get();
            proveedor.setState("I");
            proveedorRepository.save(proveedor);
        } else {
            log.warn("No se encontró el proveedor con ID: {}", id);
        }
    }
}
