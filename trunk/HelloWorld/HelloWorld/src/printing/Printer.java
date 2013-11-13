package printing;

public class Printer 
{
	 public boolean ison;
	 public String modelNumber;

	 //	 void will not return any specfic value
	 public void print() {
	   System.out.println(modelNumber);
     }
	
	 //Overloading the method print()
	public void print(String text) {
	  System.out.println(text);
	}
	 
	public String getModelNumber() {
		return modelNumber;
	}
	
}
