 class Employee{
	
	public  String getName(){
		
		return "Employee";
	}

}	

 class Dept extends Employee{
	
	 @Override
	 public String getName(){
		 super.getName();
		 return "Department";
	 }

}