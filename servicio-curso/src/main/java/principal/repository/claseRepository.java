package principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.entity.Clase;

public interface claseRepository extends JpaRepository<Clase, Long> {
}
