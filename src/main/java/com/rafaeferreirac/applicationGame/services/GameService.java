package com.rafaeferreirac.applicationGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaeferreirac.applicationGame.dto.GameMinDTO;
import com.rafaeferreirac.applicationGame.entities.Game;
import com.rafaeferreirac.applicationGame.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; 
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}