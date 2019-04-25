package Lab_4.repository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByGroupId(Long id);

    List<Student> findBySurname(String name);

}
