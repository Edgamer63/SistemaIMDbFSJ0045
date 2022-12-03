package cl.infoclub.fsj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.infoclub.fsj.modelo.Show;
import cl.infoclub.fsj.repository.ShowRepository;

@Service
public class ShowService {
	@Autowired
	private ShowRepository showRepository;

// FIND ONE
	public Show findById(Long id) {
		Optional<Show> optionalShow = showRepository.findById(id);
		if (optionalShow.isPresent()) {
			return optionalShow.get();
		} else {
			return null;
		}
	}

// FIND ALL
	public List<Show> findAllShows() {
		return showRepository.findAll();
	}

// CREATE - SAVE
	public void saveShow(Show show) {
		showRepository.save(show);
	}

// CREATE - UPDATE
	public void updateShow(Show show) {
		showRepository.save(show);
	}

// DELETE - DESTROY
	public void deleteShow(Long id) {
		showRepository.deleteById(id);
	}
}