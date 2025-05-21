package com.rafaeferreirac.applicationGame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeferreirac.applicationGame.dto.GameMinDTO;
import com.rafaeferreirac.applicationGame.entities.Game;
import com.rafaeferreirac.applicationGame.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController { 				// Porta de entrada do Backend
	
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}

}