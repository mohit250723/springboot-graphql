package com.mohit.graphqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohit.graphqldemo.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
}
