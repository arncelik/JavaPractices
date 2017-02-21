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