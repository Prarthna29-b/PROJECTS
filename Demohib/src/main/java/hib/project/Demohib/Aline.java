package hib.project.Demohib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Aline {
	@Id
private int aid;
//private String aname;
	private AlienName aname;
private String color;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}

public AlienName getAname() {
	return aname;
}
public void setAname(AlienName aname) {
	this.aname = aname;
}
//public String getAname() {
//	return aname;
//}
//public void setAname(String aname) {
//	this.aname = aname;
//}
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Aline [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
}

}
