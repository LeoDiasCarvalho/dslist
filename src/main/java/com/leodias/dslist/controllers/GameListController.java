package com.leodias.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leodias.dslist.DTO.GameListDTO;
import com.leodias.dslist.DTO.GameMinDTO;
import com.leodias.dslist.services.GameListService;
import com.leodias.dslist.services.GameService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
	
	@Autowired
	private GameListService listService;
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return listService.findAll();
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		return gameService.findByList(listId);
	}

}
