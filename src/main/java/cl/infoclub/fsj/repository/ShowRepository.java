package cl.infoclub.fsj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.infoclub.fsj.modelo.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
	List<Show> findAll();
}