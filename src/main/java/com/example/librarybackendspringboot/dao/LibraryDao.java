package com.example.librarybackendspringboot.dao;

import com.example.librarybackendspringboot.model.Library;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository<Library,Integer> {

    @Query(value = "SELECT `id`, `author`, `description`, `distributor`, `image`, `language`, `price`, `releasedyear`, `title` FROM `library` WHERE `title` LIKE %:title%",nativeQuery = true)
    List<Library> Searchbook(@Param("title")String title);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `library` WHERE `id`=:id",nativeQuery = true)
    void deleteBook(@Param("id") Integer id);
}
