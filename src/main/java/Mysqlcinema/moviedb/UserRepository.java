package Mysqlcinema.moviedb;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Movie, Integer> {

}
