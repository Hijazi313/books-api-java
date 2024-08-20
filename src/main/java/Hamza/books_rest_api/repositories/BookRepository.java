package Hamza.books_rest_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Hamza.books_rest_api.domain.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {

}
