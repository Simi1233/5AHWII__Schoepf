
public class Sekretariat implements Observer {

	@Override
	public void notify(int value) {
		System.out.println("Der Heizungswert beträgt: " + value + "°");
	}

}
