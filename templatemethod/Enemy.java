package templatemethod;

public abstract class Enemy {
	
	public final void attack() {
		repositioning();
		attacking();
	}
	
	public void repositioning() {}
	
	public void attacking() {}

}
