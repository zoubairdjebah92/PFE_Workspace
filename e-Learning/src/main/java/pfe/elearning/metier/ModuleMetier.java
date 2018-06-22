package pfe.elearning.metier;

import java.util.List;

import pfe.elearning.entities.Module;

public interface ModuleMetier {

	//*ADD Module
	public Module addModule(Module t);
	
	//*LIST Module
	public List<Module> listModules();
	
}
