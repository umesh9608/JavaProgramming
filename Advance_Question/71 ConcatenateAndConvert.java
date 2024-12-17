//Concatenate and convert: take two string , concatenate them, and convert the result to uppercase
package Advance_Question;
 class ConcatenateAndConvert {
     public static void main(String[] args) {
         String firstName= "umesh";
         String lastName= "verma";
         String fullName= firstName.concat(" ").concat(lastName);
         System.out.println(fullName.toUpperCase());
     }
}
