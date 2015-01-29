import java.util.*;
public class Line { //really a line segment class
	String id;
	Integer length; //Can be null for infinity
	Pt[]endpts=new Pt[2]; //Points defining line
	Set<Pt>pointsOnLine;
	Set<Line>pareelel;
	public Line(Pt one, Pt two, Integer length){
		id=one.id+two.id;
		endpts[0]=one;
		endpts[1]=two;
		this.length=length;
		pareelel=new HashSet<Line>();
		pointsOnLine=new HashSet<Pt>();
		one.addCollinear(two);
	}
	public void addPareelel(Line o){
		o.pareelel.add(this);
		this.pareelel.add(o);
	}
	public boolean isParallelto(Line o){
		return this.pareelel.contains(o);
	}
	public boolean isEqualTo(Line o){
		return this.length==null||o.length==null?false:this.length==o.length;
	}
}
