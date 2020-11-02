
public class Direktion implements Observer {

	@Override
	public void notify(int value) {
		if(value >= 30)	{
			System.out.println("Direktion: Heizungswert beträgt " + value + "°");
		}
	}

}
