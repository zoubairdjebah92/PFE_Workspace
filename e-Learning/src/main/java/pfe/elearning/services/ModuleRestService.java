package pfe.elearning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pfe.elearning.entities.Module;
import pfe.elearning.metier.ModuleMetier;

@RestController
public class ModuleRestService {
	
	@Autowired
	private ModuleMetier ModuleMetier;

	@RequestMapping(value="/modules",method=RequestMethod.POST)
	public Module addModule(@RequestBody Module t) {
		return ModuleMetier.addModule(t);
	}

	@RequestMapping(value="/modules",method=RequestMethod.GET)
	public List<Module> listModules() {
		return ModuleMetier.listModules();
	}

	
}
