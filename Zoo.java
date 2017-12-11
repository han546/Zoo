import java.util.*;

class Animal{

	String noise;
	String food;

	public Animal(){
		noise = "";
		food = "";
	}

	public String says(){
		return noise;
	}
	public String eats(){
		return food;
	}
}

class Horse extends Animal{

	public Horse(){
		noise = "neigh";
		food = "oats";
	}
}

class Bear extends Animal{
	public Bear(){
		noise = "rawr";
		food = "meat";
	}
}

class Zoo{

	List<Animal> animalList = new ArrayList<Animal>();
	HashMap<Animal, Integer> animalCount = new HashMap<>();
	HashMap<String, Integer> foodCount = new HashMap<>();

	public void add(Animal ani){
		animalList.add(ani); //adds animal to list
		if (!animalCount.containsKey(ani)) //increment animal count;
			animalCount.put(ani, 1);
		else
			animalCount.put(ani, animalCount.get(ani) + 1);

		if (!foodCount.containsKey(ani.eats())) //increment food type
			foodCount.put(ani.eats(), 1);
		else
			foodCount.put(ani.eats(), foodCount.get(ani.eats()) + 1);

		return;
	}

	public void printFood(){
		for (String key : foodCount.keySet()){
			System.out.println(key + ": " + foodCount.get(key));
		}
		return;
	}

	public static void main(String[] args){

		Zoo newZoo = new Zoo();
		newZoo.add(new Horse());
		newZoo.add(new Bear());
		newZoo.add(new Bear());
		newZoo.printFood();

		return;
	}
}











