
public class TeaRunner {
	public static void main(String[] args) {
		TeaMaker teamaker = new TeaMaker();
		TeaBag teabag = new TeaBag("Green");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		
		kettle.getWater();
		kettle.boil();
		cup.makeTea(teabag, kettle.getWater());
	}

}
