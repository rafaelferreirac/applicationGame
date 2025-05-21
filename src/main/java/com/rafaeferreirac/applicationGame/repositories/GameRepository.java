package com.rafaeferreirac.applicationGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaeferreirac.applicationGame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
