package OOPS.ClassAndObject;

public class driver {


        public static void main(String[] args) {
            car myCar = new car();
            myCar.addFuel(6);
            myCar.driver();
            myCar.driver();
            myCar.driver();
            myCar.addFuel(3);
            myCar.driver();
            System.out.println(myCar.getCurrentFuelLevel());
        }

}
