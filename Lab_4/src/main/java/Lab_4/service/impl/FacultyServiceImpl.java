package Lab_4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Lab_4.entity.Faculty;
import Lab_4.repository.FacultyRepository;
import Lab_4.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository repository;

    @Override
    public Faculty read(Long id) {
        return repository.getOne(id);

    }

    @Override
    public List<Faculty> read() {
        return repository.findAll();

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Faculty readByphone(String name) {
        return repository.findByphone(name);

    }

    @Override
    public Faculty readByName(String name) {
        return repository.findByName(name);

    }

    @Override
    public void save(Faculty entity) {
        repository.save(entity);

    }

}