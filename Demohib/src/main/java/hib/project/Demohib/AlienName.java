package hib.project.Demohib;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {
private String firstName;
private String middleName;
private String lastName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "AlienName [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
}

}
