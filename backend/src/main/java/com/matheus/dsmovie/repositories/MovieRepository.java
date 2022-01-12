package com.matheus.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
