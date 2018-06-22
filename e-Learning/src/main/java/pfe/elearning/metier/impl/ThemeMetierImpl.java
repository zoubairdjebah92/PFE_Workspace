package pfe.elearning.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.elearning.dao.ThemeRepository;
import pfe.elearning.entities.Theme;
import pfe.elearning.metier.ThemeMetier;

@Service
public class ThemeMetierImpl implements ThemeMetier {
	
	@Autowired
	private ThemeRepository themeRepository;

	@Override
	public Theme addTheme(Theme t) {
		return themeRepository.save(t);
	}

	@Override
	public List<Theme> listThemes() {
		return themeRepository.findAll();
	}

	

}
