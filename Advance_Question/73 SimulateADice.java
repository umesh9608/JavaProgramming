//Simulated a dice roll using Math.random() and display the outcome (1 to 6)
package Advance_Question;
 class SimulateADice {
     int roll(){
         double random = Math.random() * 6;
       return(int) Math.ceil(random); //find pick value 1 to 6
     }

     public static void main(String[] args) {
         SimulateADice dice = new SimulateADice();
         for (int i = 0; i < 10; i++) {
             System.out.println(dice.roll());

         }
     }
}
