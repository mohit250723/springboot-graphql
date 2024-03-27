package com.mohit.graphqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.graphqldemo.entity.Player;
import com.mohit.graphqldemo.entity.Team;
import com.mohit.graphqldemo.repo.PlayerRepository;

@Service
public class PlayerService {

  @Autowired
  private PlayerRepository repository;
  
  public Player createPlayer(String name,Team team) {
	  Player player=new Player();
	  player.setName(name);
	  player.setTeam(team);
	 return repository.save(player);
  }
  
 
  public Player findPlayer(Integer id) {
	  return repository.findById(id).get();
  }
  
  public List<Player> findAllPlayers(){
	  return repository.findAll();
  }
  	
}
