package assignment3_1;        //This java file is inside package named package1 inside src folder.

/*
 * This Assignment helped me to master the difference between instance variable and class variable.
 */

public class Assignment3_1     //Declaring the class         
{
	public static void main(String[] args)     // main function declaration. and because it is static, program execution starts from main function.
	{
		ShowScope obFirst=new ShowScope();     //Declaring first object.
		
		obFirst.display();      //Displaying the values before incrementing First object values.
		obFirst.increaseValues();    //Incrementing values first object values.
		obFirst.display();      //Displaying the values after incrementing first object values.
		
		ShowScope obSecond=new ShowScope();    //Declaring second object.
		
		obSecond.display();        //Displaying the values before incrementing second object values.
		obSecond.increaseValues();    //Incrementing values of second object.
		obSecond.display();       //Displaying the values after incrementing values.
		
		//So, we can identify the scope of the static and instance variables from above observation.
		
		/*
		   Static variables have the longest scope; they are created when the class is 
           loaded, and they survive as long as the class stays loaded in the Java Virtual 
           Machine (JVM).
		 */
		
		/*
		   instance variables are the next most long-lived; they are created when a new 
           instance is created, and they live until the instance is removed. 
		 */
	}  //End of main method.
}  //End of class.