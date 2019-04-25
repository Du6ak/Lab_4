package Lab_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Lab_4.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Faculty findByphone(String name);

    Faculty findByName(String name);

}
