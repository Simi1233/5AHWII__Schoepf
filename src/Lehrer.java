
public class Lehrer implements Observer {
	private String nachname;

	public Lehrer(String nachname) {
		super();
		this.nachname = nachname;
	}

	
	
	public void notify(int value) {
		if(value >= 25)	{
			System.out.println(nachname + ": Heizungswert beträgt " + value + "°");
		}
	}
	
}
