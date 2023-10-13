
public class Payroll {
	
		private String name;          // Employee name
	   private int idNumber;         // ID number
	   private double payRate;       // Hourly pay rate
	   private double hoursWorked;   // Number of hours worked

	   

	   
	   /**
	      The constructor initializes an object with the
	      employee's name and ID number.
	      @param n The employee's name.
	      @param i The employee's ID number.
	   */

	   public Payroll(String n, int i) throws InvalidNameException, InvalidIDException
	   {
		   
		   if(n == "")
			   throw new InvalidNameException();
		   
		   if(i <= 0)
			   throw new InvalidIDException();
		   
		   
		   name = n;
		   idNumber = i;
	   }

	   /**
	      The setName sets the employee's name.
	      @param n The employee's name.
	   */

	   public void setName(String n) throws InvalidNameException
	   {
		   
		   if( n == "" ) {
			   throw new InvalidNameException();
		   }
			   
			   name = n;
	   }

	   /**
	      The setIdNumber sets the employee's ID number.
	      @param i The employee's ID number.
	   */
	   
	   public void setIdNumber(int i)throws InvalidIDException
	   {
		   if(i <= 0) {
			   
			   throw new InvalidIDException();
		   }
	      idNumber = i;
	   }

	   /**
	      The setPayRate sets the employee's pay rate.
	      @param p The employee's pay rate.
	   */
	   
	   public void setPayRate(double p) throws InvalidHourlyRateException
	   {
		   if(p < 0 || p > 25) {
			   
			   throw new InvalidHourlyRateException();
		   }
		   
	      payRate = p;
	   }

	   /**
	      The setHoursWorked sets the number of hours worked.
	      @param h The number of hours worked.
	   */

	   public void setHoursWorked(double h) throws InvalidHoursException 
	   {
		   if(h < 0 || h > 84) {
			   
			   throw new InvalidHoursException();
		   }
		   
	      hoursWorked = h;
	   }

	   /**
	      The getName returns the employee's name.
	      @return The employee's name.
	   */

	   public String getName()
	   {
	      return name;
	   }

	   /**
	      The getIdNumber returns the employee's ID number.
	      @return The employee's ID number.
	   */
	   
	   public int getIdNumber()
	   {
	      return idNumber;
	   }

	   /**
	      The getPayRate returns the employee's pay rate.
	      @return The employee's pay rate.
	   */

	   public double getPayRate()
	   {
	      return payRate;
	   }

	   /**
	      The getHoursWorked returns the hours worked by the
	      employee.
	      @return The hours worked.
	   */


	   public double getHoursWorked()
	   {
	      return hoursWorked;
	   }

	   /**
	      The getGrossPay returns the employee's gross pay.
	      @return The employee's gross pay.
	   */

	   public double getGrossPay()
	   {
	      return hoursWorked * payRate;
	   }
	   
	   public void display() {
		   
		   System.out.println("\nEmployee Payroll Data");
		      System.out.println("Name: " + this.getName());
		      System.out.println("ID Number: " + this.getIdNumber());
		      System.out.println("Hourly pay rate: " + this.getPayRate());
		      System.out.println("Hours worked: " + this.getHoursWorked());
		      System.out.println("Gross pay: $" + this.getGrossPay());
		   
	   }
}
