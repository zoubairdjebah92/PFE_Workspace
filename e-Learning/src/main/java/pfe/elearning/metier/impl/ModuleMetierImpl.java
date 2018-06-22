package pfe.elearning.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.elearning.dao.ModuleRepository;
import pfe.elearning.entities.Module;
import pfe.elearning.metier.ModuleMetier;

@Service
public class ModuleMetierImpl implements ModuleMetier {
	
	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public Module addModule(Module t) {
		return moduleRepository.save(t);
	}

	@Override
	public List<Module> listModules() {
		return moduleRepository.findAll();
	}

	

}
