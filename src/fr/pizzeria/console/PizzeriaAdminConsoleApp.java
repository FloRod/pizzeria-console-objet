package fr.pizzeria.console;
import java.util.ArrayList;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int choix = 0;
		
		ArrayList<Pizza> tabPizza = new ArrayList<Pizza>();
		
		tabPizza.add(new Pizza ("PEP", "Pépéroni", 12.5));
		tabPizza.add(new Pizza ("MAR", "Margherita", 14));
		tabPizza.add(new Pizza ("REI", "Reine", 11.5));
		tabPizza.add(new Pizza ("FRO", "4 fromages", 12));
		tabPizza.add(new Pizza ("CAN", "Cannibale", 12.5));
		tabPizza.add(new Pizza ("SAV", "Savoyarde", 13));
		tabPizza.add(new Pizza ("ORI", "Orientale", 13.5));
		tabPizza.add(new Pizza ("IND", "indienne", 14));

		while (choix!=99){
			//affiche le Menu et récupère la valeur saisie
			OptionMenu.affichageMenu();
			choix = sc.nextInt();

			//Entrée dans le menu
			switch (choix) {
			case 1 : {
				ListerPizzasOptionMenu menu = new ListerPizzasOptionMenu();
				menu.execute(tabPizza);
				}
			break;
			case 2 :{
				AjouterPizzaOptionMenu nouvellePizza = new AjouterPizzaOptionMenu();
				nouvellePizza.execute(tabPizza,sc);
			}
			break;
			case 3 :{
				ModifierPizzaOptionMenu pizzaModifie = new ModifierPizzaOptionMenu();
				pizzaModifie.execute(tabPizza, sc);
			}
			break;
			case 4 :{
				SupprimerPizzaOptionMenu pizzaSuppr = new SupprimerPizzaOptionMenu();
				pizzaSuppr.execute(tabPizza, sc);
			}
			break;
			default : {
				System.out.println("Au revoir !");
			}
			}

		}
		sc.close();
	}
}
