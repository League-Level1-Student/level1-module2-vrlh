
public class SeaCreatureRunner {
	public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	spongebob.getName();
	spongebob.eat();
	spongebob.laugh();
	
	SeaCreature patrick = new SeaCreature("Patrick");
	SeaCreature squidward = new SeaCreature("Squidward");
	patrick.getName();
	squidward.getName();
	patrick.eat();
	squidward.eat();
	for (int i = 0; i < 1;) {
	patrick.laugh();
	squidward.laugh();
	spongebob.laugh();
	}
	squidward.laugh();
	}
}
