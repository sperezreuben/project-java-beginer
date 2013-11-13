package greetings;

import printing.Printer;
import printing.Printer2;

public class HelloWorldClass {

	private static int age = 50;
	
	public static void main(String[] args)
	{ 
	  // Crlt + Shift + o this will bring the import printing.Printer; statement automatically
	  //or
	  // Type P and then press and hold Ctrl + space bar
	  Printer myPrinter = new Printer();
	  myPrinter.ison = false;
	  myPrinter.modelNumber = "ABCD";
	  
	  Printer yourPrinter = new Printer();
	  yourPrinter.ison = true;
	  yourPrinter.modelNumber = "FGH";

      myPrinter.print();   
      myPrinter.print("Hello Printer");
      
      String theModelNumber = myPrinter.getModelNumber();
      System.out.println(theModelNumber);
      
      //------------------------------------------------------
      Printer2 myPrinter2 = new Printer2(true, "My Printer");
      myPrinter2.print(3);
      
      Printer2 yourPrinter2 = new Printer2(false,"Your Printer");
      yourPrinter2.print(3);
      
      // Public -> Any body can access the atribute
      // Private -> No budy outside the class can access this atribute
      // Protected -> Hirentance
      
      /*
	  System.out.println("Hello World");
	  int number = 3;
	  int number2 = 4;
	  String name = "Jose";
	  name = "Jimy";
	  System.out.println(number);
	  System.out.println(name);
	  {
		 int age = 29;
	  }
	  System.out.println(age);
	  
	  number = 7 / 3 ;
	  System.out.println("Print division: " + number);
	  
	  number = 7 % 4 ;
	  System.out.println("Print module: " + number);

	  System.out.println("Before number++ : " + number);
	  number++;
	  number++;
	  System.out.println("After number++ twice: " + number);
	  
	  System.out.println("Before += : " + number);
	  number += 2;
	  System.out.println("After += : " + number);
	  
	  System.out.println("Before -= : " + number);
	  number -= 1;
	  System.out.println("After -= : " + number);

	  System.out.println("Before *= : " + number);
	  number *= 3;
	  System.out.println("After *= : " + number);
	  
	  System.out.println("There are others like /= or %= " );
	  
	  System.out.println("Relational operators >= <= == is iqual  or != diferent than" );
	  System.out.println("Logical operators && (AND) , || (OR) , ! (NOT)");
	  
	  
	  String fullname = "Sergio Perez";
	  System.out.println("String full name: " + fullname);
	  System.out.println("String full name length: " + fullname.length());
	  	  
	  int[] numbers = new int[10];
	  numbers[0] = 5;
	  numbers[1] = 8;
	  System.out.println("Arrays: " + numbers[1]);
	  */
	  
      //Control Statments
      
      
      
	}
}
