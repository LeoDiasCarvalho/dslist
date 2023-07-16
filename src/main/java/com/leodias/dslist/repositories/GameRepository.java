package com.leodias.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leodias.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
