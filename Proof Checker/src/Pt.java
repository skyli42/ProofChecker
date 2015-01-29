import java.util.*;
public class Pt {
	String id;
	Set<Pt>collinear; //points this is collinear with (Set to deal with dupes)
	public Pt(String id){
		this.id=id.toUpperCase();
		collinear=new HashSet<Pt>();
	}
	public void addCollinear(Pt other){
		other.collinear.add(this);
		this.collinear.add(other);
		//Yay! It lines up!
	}
	public boolean isCollinear(Pt other){
		return this.collinear.contains(other);
	}
}
