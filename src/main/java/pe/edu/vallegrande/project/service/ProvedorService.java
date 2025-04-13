package pe.edu.vallegrande.project.service;

import pe.edu.vallegrande.project.model.Provedor;
import java.util.List;
import java.util.Optional;

public interface ProvedorService {
    List<Provedor> findAll();
    Optional<Provedor> findById(Integer id);
    Provedor save(Provedor provedor);
    Provedor update(Provedor provedor);
    void deleteById(Integer id);
}
