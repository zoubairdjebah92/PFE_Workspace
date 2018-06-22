package pfe.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.elearning.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}
