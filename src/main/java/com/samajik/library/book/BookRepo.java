package com.samajik.library.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookEntity,Integer> {

BookEntity findByAuthorName(String author);
}
