
public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	public String welcome (String name, boolean isWoman, boolean isKnighted){
		if (isWoman = false) {
			if (isKnighted = true) {
				return "Sir " + name;
			}
			else {
				return  "Mr. " + name;
			}
		}
		else if (isWoman = true) {
			if (isKnighted = true) {
				return  "Lady " + name;
			}
			else {
				return "Ms. " + name;
			}
		}
    }

}
