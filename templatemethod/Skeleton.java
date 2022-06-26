package templatemethod;

public class Skeleton extends Enemy{
	
	public Skeleton() {}
	
	@Override
	public void repositioning() {
		System.out.println("Skeleton repositions itself.");
	}
	
	@Override
	public void attacking() {
		System.out.println("Skeleton shoots an arrow in the player.");
	}

}
