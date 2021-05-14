package FirstEclipseSpring.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import FirstEclipseSpring.Entity.ToDo;

public interface ToDoRepo extends CrudRepository<ToDo, Integer>{
	List<ToDo>findAll();

}
