import java.util.Scanner;

public class PayrollDemo {
	public static void main(String[] args) throws InvalidNameException, InvalidIDException, InvalidHoursException, InvalidHourlyRateException
	   {
	      // Variables for input
	      String name;         // An employee's name
	      int id;              // An employee's ID number
	      double payRate;      // An employee's pay rate
	      double hoursWorked;  // The number of hours worked
	      Scanner kbd = new Scanner(System.in);
	      
	      // Create a Scanner object for keyboard input.
	     
	      
	      System.out.print("Enter the employee's name: ");
	      name = kbd.nextLine();
	      
	     
	      
	      // Get the employee's ID number.
	      System.out.print("Enter the employee's ID number: ");
	      id = kbd.nextInt();
	      
	      
	      // Get the employee's pay rate.
	      System.out.print("Enter the employee's hourly pay rate: ");
	      payRate = kbd.nextDouble();
	      
	      // Get the number of hours worked by the employee.
	      System.out.print("Enter the number of hours worked " +
	                       " by the employee: ");
	      hoursWorked = kbd.nextDouble();
	      
	      
	      kbd.nextLine();
	      
	      try {
	    	  
	    	  Payroll employee = new Payroll(name, id);
	    	  employee.setPayRate(payRate);
	    	  employee.setHoursWorked(hoursWorked);
	    	  
	          
	      }catch(InvalidHourlyRateException | InvalidIDException | InvalidNameException | InvalidHoursException e) {
	    	  		
			  	while(name == "") {	
				  System.out.println("Enter a valid name: ");
				  name = kbd.nextLine();
			  	}  	
			  	
			  	while(id <= 0) {
			    	  System.out.print("Invalid ID number. Enter a number greater than zero: ");
			          id = kbd.nextInt();
		    	}
			  	
			  	while(payRate < 0 || payRate > 25) {
			    	  System.out.print("Invalid hourly pay rate. Enter a non-negative number less than 25: ");
			          payRate = kbd.nextDouble();
		    	  }
			  	
			  	while(hoursWorked < 0 || hoursWorked > 84) {
			    	  System.out.print("Invalid number of hours worked. Enter a non-negative number less than 84 : ");
			    	  hoursWorked = kbd.nextDouble();
		    	  }
			  	
	      }
	    	
	      
	      
	      
	   }
}
