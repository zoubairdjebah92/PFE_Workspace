package pfe.elearning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pfe.elearning.entities.Theme;
import pfe.elearning.metier.ThemeMetier;

@RestController
public class ThemeRestService {
	
	@Autowired
	private ThemeMetier themeMetier;

	@RequestMapping(value="/themes",method=RequestMethod.POST)
	public Theme addTheme(@RequestBody Theme t) {
		return themeMetier.addTheme(t);
	}

	@RequestMapping(value="/themes",method=RequestMethod.GET)
	public List<Theme> listThemes() {
		return themeMetier.listThemes();
	}

	
}
