package com.example.librarybackendspringboot.dao;

import com.example.librarybackendspringboot.model.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository<Library,Integer> {

    @Query(value = "SELECT `id`, `author`, `description`, `distributor`, `image`, `language`, `price`, `releasedyear`, `title` FROM `library` WHERE `title`=:title",nativeQuery = true)
    List<Library> Searchbook(@Param("title")String title);
}
