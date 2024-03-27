package com.mohit.graphqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.mohit.graphqldemo.entity.Player;
import com.mohit.graphqldemo.entity.Team;
import com.mohit.graphqldemo.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	@MutationMapping
	public Player createPlayer(@Argument String name,@Argument Team team) {
		return service.createPlayer(name, team);
	}
	
	@QueryMapping
	public List<Player> findAllPlayers(){
		return service.findAllPlayers();
	}
	
	@QueryMapping
	public Player findPlayer(@Argument Integer id){
		return service.findPlayer(id);
	}

}
