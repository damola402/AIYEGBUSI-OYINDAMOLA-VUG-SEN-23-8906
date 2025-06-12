package com.example.mybookrepo.Repository;

import com.example.mybookrepo.Model.BookModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {
    Page<BookModel> findByTitleContainingIgnoreCase(String title, Pageable pageable);
    Page<BookModel> findByAuthorContainingIgnoreCase(String author, Pageable pageable);
    Page<BookModel> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author, Pageable pageable);
}