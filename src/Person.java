
public class Person {
private String name;
private String superpower;

Person(String name, String superpower){
	this.name = name;
	this.superpower = superpower;
}
String getName() {
	return this.name;
} String getSuperpower() {
	return this.superpower;
}void setName(String name){
	this.name = name;
} void setSuperpower(String superpower) {
	this.superpower = superpower;
} public String toString(){
	return name + " has mad " + superpower + " skills";
}
	
}
