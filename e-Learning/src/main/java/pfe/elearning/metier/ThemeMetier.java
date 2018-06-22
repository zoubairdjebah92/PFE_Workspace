package pfe.elearning.metier;

import java.util.List;

import pfe.elearning.entities.Theme;

public interface ThemeMetier {

	//*ADD THEME
	public Theme addTheme(Theme t);
	
	//*LIST THEME
	public List<Theme> listThemes();
	
}
