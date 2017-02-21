public class Emplyoee{
	private int ssn=22211333;
	private String empName;
	private int empAge;

	//Getter and Setter Methods
	public int getEmpSSN(){
			return ssn;
	}
    
    public String getEmpName(){
    	return empName;
    } 

    public int getEmpAge(){
    	return empAge;
                         
    }

    public void setEmpAge(int newValue){
    	empAge=newValue;

    }

    public void setEmpName(String newValue){
    	empName=newValue;
    }

    public void setEmpSSN(int newValue){
    	ssn=newValue;
    }

}

public class EmplyoeeRun{
	public static void main (String args[]){
		Employee obj=new Emplyoee();

		obj.setEmpName("Mario");
		obj.setempAge(32);

		System.out.println("Emplyoee Name: "+obj.getEmpName());
		System.out.println("Emplyoee SSN: "+ obj.getEmpSSN());
		System.out.println("Emplyoee Age: "+ obj.getEmpAge());
	}
}