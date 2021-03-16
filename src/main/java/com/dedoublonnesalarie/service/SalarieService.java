package com.dedoublonnesalarie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedoublonnesalaire.entities.Salarie;
import com.dedoublonnesalarie.dao.SalarieRepository;

@Service
public class SalarieService {
	
	@Autowired
	private final SalarieRepository salarieRepo;
	
	public SalarieService(SalarieRepository salarieRepo) {
		
		this.salarieRepo = salarieRepo;
	}
	public  void addSalarie(Salarie salarie) {
		salarieRepo.insert(salarie);
		
	}
	public void updateSalarie(Salarie salarie) {
		Salarie salarieSave=salarieRepo.findById(salarie.getId())
				.orElseThrow(()-> new RuntimeException(String.format("cannot find"
						+"salarie by id %s", salarie.getId())));
		salarieSave.setPrenom(salarie.getPrenom());
		salarieSave.setFonction(salarie.getFonction());
		salarieSave.setAdresse(salarie.getAdresse());
		salarieSave.setDate_de_naissance(salarie.getDate_de_naissance());
		salarieSave.setAnnees_XP(salarie.getAnnees_XP());
		salarieSave.setSalaire(salarie.getSalaire());
		
		salarieRepo.save(salarie);
		
		
	}
	
	public List<Salarie> getAllSalarie() {
		return salarieRepo.findAll();
	}
	public void getSalarieByName() {}
	public void deleteSalarie(Long id) {
		salarieRepo.deleteById(id);
	}

}
