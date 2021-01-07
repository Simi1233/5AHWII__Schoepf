import java.util.*;

public class PizzaDiavolo implements IPizza {
	
	private List<String> ingredients = new ArrayList<>();
	
	public PizzaDiavolo()	
	{
		ingredients.add("Pfefferoni");
		ingredients.add("Salami");
		ingredients.add("Teig");
	}
	
	public void printIngredients()	
	{
		for (String string : ingredients) 
		{
			System.out.println(string);
		}
	}
}
