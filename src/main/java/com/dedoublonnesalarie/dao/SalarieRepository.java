package com.dedoublonnesalarie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dedoublonnesalaire.entities.Salarie;

@Repository
public interface SalarieRepository extends JpaRepository<Salarie, Long>,
MongoRepository<Salarie, Long>{
	

}
