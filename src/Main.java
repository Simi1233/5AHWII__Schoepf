import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Lehrer l = new Lehrer("Patterer");
		Sekretariat s = new Sekretariat();
		
		Direktion x = new Direktion();
		
		Observable i = new Observable();
		
		i.addObserver(x);
		i.addObserver(s);
		i.addObserver(l);
		
		
		
		Scanner s1 = new Scanner(System.in);
		while(true)	{
			String input = s1.next();
			try {
				int value = Integer.parseInt(input);
				i.changeValue(value);
			} catch (NumberFormatException e) {
				if(input.equals("Falsch"))	{
					break;
				} else	{
					System.out.println("Falsche Eingabe");
				}
			}
			
			
			System.out.println();
			System.out.println();
		}
		
		s1.close();
	}

}
