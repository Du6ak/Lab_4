package Lab_4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Lab_4.entity.Group;
import Lab_4.repository.GroupRepository;
import Lab_4.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository repository;

    @Override
    public Group read(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<Group> read() {
        return repository.findAll();
    }

    @Override
    public Group readByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public void save(Group entity) {
        repository.save(entity);

    }

}