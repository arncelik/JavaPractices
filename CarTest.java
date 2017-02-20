public class CarTest{
    public static void main (String [] args){
        Car c1 = new Car ("Ford", "Taurus", 2007);
            System.out.println(c1);
            c1.setModel ("Explorer");
            System.out.println(c1);
        
        Car c2 = new Car ("Volvo", "S60", 2014);
            System.out.println(c2);
            c2.setModel ("Explorer");
            System.out.println(c2);

        Car c3 = new Car ("Cadillac", "XTS", 2017);
            System.out.println(c3);
            c3.setModel ("Explorer");
            System.out.println ("Explorer");

        Car c4 = new Car ("Lamborghini", "Veneno", 2014);
            System.out.println("c4");
            c4.setModel ("Explorer");
            System.out.println ("Explorer");

    //Changings
        c2.setYear(2030);
        c2.setModel("S40");
            System.out.println(c2);
        c3.setModel("ATS");
            System.out.println(c3);
        c4.setYear(2050);
            System.out.println(c4);
    }

}
