package com.samajik.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookRepo bookRepo;
@GetMapping("/books")
    public List<BookEntity> getAllBooks()
{

    return bookRepo.findAll();
}

@GetMapping("/books/{id}")
    public BookEntity getBookById(@PathVariable Integer id)
{
    Optional<BookEntity> bookEntity =bookRepo.findById(id);
    return  bookEntity.get();

}



@DeleteMapping("/books/{id}")
    public void deleteBookById(@PathVariable Integer id)
{
    bookRepo.deleteById(id);

}


@PostMapping("/books")
    public void insertNewBooks(@RequestBody BookEntity bookEntity)
{
    bookRepo.save(bookEntity);

}
@PutMapping("/books/{id}")
    public void updateBook(@RequestBody BookEntity bookEntity,@PathVariable Integer id)
{
bookEntity.setBookCode(id);
bookRepo.save(bookEntity);

}

}
