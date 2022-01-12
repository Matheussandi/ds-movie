package com.matheus.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.dsmovie.entities.Score;
import com.matheus.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
