package br.com.souowendy.movies.service;

import br.com.souowendy.movies.domain.Movie;
import br.com.souowendy.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> AllMovies() {
        return movieRepository.findAll();
    }
}
