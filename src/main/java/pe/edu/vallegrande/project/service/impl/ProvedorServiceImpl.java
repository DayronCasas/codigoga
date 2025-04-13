package pe.edu.vallegrande.project.service.impl;

import pe.edu.vallegrande.project.model.Provedor;
import pe.edu.vallegrande.project.repository.ProvedorRepository;
import pe.edu.vallegrande.project.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProvedorServiceImpl implements ProvedorService {

    private final ProvedorRepository provedorRepository;

    @Autowired
    public ProvedorServiceImpl(ProvedorRepository provedorRepository) {
        this.provedorRepository = provedorRepository;
    }

    @Override
    public List<Provedor> findAll() {
        log.info("Listando todos los provedores");
        return provedorRepository.findAll();
    }

    @Override
    public Optional<Provedor> findById(Integer id) {
        log.info("Buscando provedor con ID: {}", id);
        return provedorRepository.findById(id);
    }

    @Override
    public Provedor save(Provedor provedor) {
        log.info("Guardando provedor: {}", provedor);
        provedor.setState("A");
        return provedorRepository.save(provedor);
    }

    @Override
    public Provedor update(Provedor provedor) {
        log.info("Actualizando provedor: {}", provedor);
        provedor.setState("A");
        return provedorRepository.save(provedor);
    }

    @Override
    public void delete(Provedor provedor) {
        log.info("Marcando provedor como inactivo: {}", provedor);
        provedor.setState("I");
        provedorRepository.save(provedor);
    }
}
