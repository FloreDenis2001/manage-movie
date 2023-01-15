package ro.mycode.managemovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mycode.managemovie.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
}
