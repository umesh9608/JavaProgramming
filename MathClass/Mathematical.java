package MathClass;

public class Mathematical {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println(Math.abs(-99)); //convert - to +
        System.out.println(Math.ceil(5.09));
        System.out.println(Math.floor(5.09));
        System.out.println(Math.round(5.56));
        System.out.println(Math.random());
        System.out.println(Math.PI);

        System.out.println("Print random value");
        for (int i = 0; i < 10; i++) {
            int  random =(int)Math.round(Math.random()* 100);
            System.out.print(" "+random);
        }
    }
}
