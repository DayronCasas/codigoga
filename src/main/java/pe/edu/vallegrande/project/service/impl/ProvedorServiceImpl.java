package pe.edu.vallegrande.project.service.impl;

import pe.edu.vallegrande.project.model.Provedor;
import pe.edu.vallegrande.project.repository.ProvedorRepository;
import pe.edu.vallegrande.project.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProvedorServiceImpl implements ProvedorService {

    private final ProvedorRepository provedorRepository;

    @Autowired
    public ProvedorServiceImpl(ProvedorRepository provedorRepository) {
        this.provedorRepository = provedorRepository;
    }

    @Override
    public List<Provedor> findAll() {
        return provedorRepository.findAll();
    }

    @Override
    public Optional<Provedor> findById(Integer id) {
        return provedorRepository.findById(id);
    }

    @Override
    public Provedor save(Provedor provedor) {
        return provedorRepository.save(provedor);
    }

    @Override
    public Provedor update(Provedor provedor) {
        return provedorRepository.save(provedor);
    }

    @Override
    public void deleteById(Integer id) {
        provedorRepository.deleteById(id);
    }
}
