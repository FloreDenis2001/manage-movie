package ro.mycode.managemovie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.managemovie.service.MovieService;

@SpringBootApplication
public class ManageMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageMovieApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(MovieService movieService){
		return  args->{



			movieService.getAllMovies().forEach(System.out::println);

		};

	}
}
