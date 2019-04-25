package Lab_4.service;

import java.util.List;

import Lab_4.entity.AbstractEntity;

public interface Service<T extends AbstractEntity> {

    T read(Long id);

    List<T> read();

    void save(T entity);

    void delete(Long id);

}
