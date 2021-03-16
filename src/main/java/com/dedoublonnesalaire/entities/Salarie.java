package com.dedoublonnesalaire.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="salarie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Salarie")
public class Salarie implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Field(name="Id")
	private Long id;
	
	//@Indexed(unique=true)
	@Field(name="prenom")
	private String prenom;
	
	@Field(name="fonction")
	private String fonction;
	
	@Field(name="annees_XP")
	private int annees_XP;
	
	@Field(name="adresse")
	private String adresse;
	
	@Field(name="salaire")
	private int salaire;
	
	@Field(name="date_de_naissance")
	private LocalDate date_de_naissance;
	

}
