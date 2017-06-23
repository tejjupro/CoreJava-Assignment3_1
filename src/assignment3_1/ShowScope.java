package assignment3_1;         //This java file is inside package named package1 inside src folder.

public class ShowScope     //Declaration of class to define the variables required for the assignment.
{
	
	int instanceVariable=1;   //Declaring int variable to store the instance variable.
	static int classVariable=1;     //Declaring static int variable to store the class variable.
	
	public void increaseValues()       //Method to increase the values of variables.
	{
		instanceVariable++;           //increment in instance variable.
		classVariable++;              //increment in class variable.
	}
	
	public void display()            //To display the variables.
	{
		System.out.println("The value of instance variable of this object is "+instanceVariable); //printing instace variable.
		System.out.println("The value of class variable of class is "+classVariable);  //printing class variable.
	}
}    //End of class