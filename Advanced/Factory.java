/*
Factory Pattern
 */

import java.util.*;
interface Food {
	 public String getType();
	}

	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {
	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	
	class FoodFactory {
		public Food getFood(String order) {
            if(order.equals("pizza")) return new Pizza();
            else if(order.equals("cake")) return new Cake();
            else return null;    
		}
	}

	public class Factory {
		
	 private static Scanner sc;

	public static void main(String args[]){
		try{

			sc = new Scanner(System.in);
			FoodFactory foodFactory = new FoodFactory();
			Food food = foodFactory.getFood(sc.nextLine());			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
			throw e;
		}
	 }

	}
	
		




