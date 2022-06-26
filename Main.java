import templatemethod.Enemy;
import templatemethod.Skeleton;
import templatemethod.Zombie;

public class Main {

	public static void main(String[] args) {
		
		Enemy myZombie = new Zombie();
		Enemy mySkeleton = new Skeleton();
		
		System.out.println("------------------------------");
		myZombie.attack();
		System.out.println("------------------------------");
		mySkeleton.attack();
		

	}

}
