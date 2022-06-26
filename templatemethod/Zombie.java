package templatemethod;

public class Zombie extends Enemy{
	
	public Zombie() {}
	
	@Override
	public void repositioning() {
		System.out.println("Zombie walks to the player.");
	}
	
	@Override
	public void attacking() {
		System.out.println("Zombie bites the player.");
	}

}
