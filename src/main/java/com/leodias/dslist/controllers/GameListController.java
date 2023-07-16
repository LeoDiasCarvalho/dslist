package com.leodias.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leodias.dslist.DTO.GameListDTO;
import com.leodias.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
	
	@Autowired
	private GameListService listService;
	
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return listService.findAll();
	}

}
