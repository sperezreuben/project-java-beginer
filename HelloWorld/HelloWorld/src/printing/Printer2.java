package printing;

public class Printer2 
{
	 public boolean isOn;
	 private String modelNumber;

	 // Constructor for the class Printer2
	 public Printer2(boolean isOn, String modelNumber) {
		 this.isOn = isOn;
		 this.modelNumber = modelNumber;
	 }
	 
	 //	 void will not return any specfic value
	 public void print(int copies) {

		 String onStatus = "";
		 if(isOn)
			 onStatus = " is On!";
		 else
			 onStatus = " is Off";
		 
		 String textToPrint = modelNumber + onStatus; 
		 
		 // for (initializer; condition; increment; )
		 for (int i = 0; i < copies; i++)
		 {
			 System.out.println(textToPrint);			
		 }
		 
		 /*
		 switch(copies)
		 {
			 case 0:
				 break;  // If you don't put the break statment it will continue excecuting case 1
			 case 1:
				 if(isOn)
				 {
				   System.out.println(modelNumber + " is on! ");
				 }
				 else
				 {
			        System.out.println(modelNumber + " is off! ");
				 };
				 break;
			 case 2:
				 if(isOn)
				 {
				   System.out.println(modelNumber + " is on! ");
				   System.out.println(modelNumber + " is on! ");				   
				 }
				 else
				 {
			        System.out.println(modelNumber + " is off! ");
			        System.out.println(modelNumber + " is off! ");
				 };
				 break;
			  default:
				  System.out.println("Number of copies is not supported");
		 };
		 */

			
    }
	 
	 
   public void printColors()
   {
	   String[] colors = new String[] {"Red","Blue","Green","Yellow"};
	   for(String currentColor : colors)
	   {
		System.out.println(currentColor);   
	   }
   }
	
	 //Overloading the method print()
	public void print(String text) {
	  System.out.println(text);
	}
	 
	public String getModelNumber() {
		return modelNumber;
	}
	
}
