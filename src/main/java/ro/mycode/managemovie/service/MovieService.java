package ro.mycode.managemovie.service;

import org.springframework.stereotype.Service;
import ro.mycode.managemovie.model.Movie;
import ro.mycode.managemovie.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository){
        this.movieRepository=movieRepository;
    }

    public List<Movie> getAllCars(){
        return movieRepository.findAll();
    }
}