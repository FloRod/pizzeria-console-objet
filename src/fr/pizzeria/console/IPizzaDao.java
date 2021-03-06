package fr.pizzeria.console;
import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	
	ArrayList<Pizza> findAllPizzas();
	boolean saveNewPizza(Pizza pizza);
	boolean updatePizza(String codePizza, Pizza pizza);
	boolean deletePizza(String codePizza, int index);
	int existPizza(String codePizza);
}
