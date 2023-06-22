// *************** EXERCISE-6>>>> 
// Project name- Custom Calculator 
/* Statement >> 
You have to create a custom calculator with following operations:
1. + -> Addition
2. - -> Substraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:.. 
1. Invalid input Exception
2. Cannot divide by zero exception
3. Max input exception (if any of the input is greater than 100000)
4. Max multiplier reached exception -> don't allow any multiplication input is greater than 7000
*/

import java.util.Scanner;
class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "InvalidInputException Occured";
    }
    @Override
    public String getMessage(){
        return "Invalid Input";
    }
}
class ArithmeticException extends Exception{
    @Override
    public String toString(){
        return "ArithmeticException Occured";
    }
    @Override
    public String getMessage(){
        return "Cannot divide by 0";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Max input exception occured";
    }
    @Override
    public String getMessage(){
        return "Input cannot be greater than 100000";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "MaxMultiplierReachedException Occured";
    }
    @Override
    public String getMessage(){
        return "Multiplication Input cannot be greater than 7000";
    }
}
class CustomCalculator{
    public int a; 
    public int b;
    char operator;
    public void calcOperation() throws InvalidInputException, ArithmeticException, MaxInputException, MaxMultiplierReachedException{
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter first input");
            a = sc.nextInt();
            System.out.println("Enter second input");
            b = sc.nextInt();
        if(a <= 100000 && b<=100000){
        try{
            System.out.println("Enter operation you want to perform");
            operator = sc.next().charAt(0);
           if(operator == '+' || operator == '-' || operator== '*' || operator=='/'){
               if(operator=='+'){
                   System.out.println("Addition of a and b is: "+ (a+b));
                //    break;
               }
              else if(operator=='-'){
                   System.out.println("Substraction of a and b is: "+ (a-b));
                //    break;
               }
               else if(operator=='*'){
                   try{
                    if(a<= 7000 && b<=7000){
                        System.out.println("Multiplication of and b is: "+ a*b);
                    }
                    else{
                        throw new MaxMultiplierReachedException();
                    }
                   }
                   catch(MaxMultiplierReachedException e){
                       System.out.println(e.toString());
                       System.out.println(e.getMessage());
                   }
               }
               else{
                   try{
                       if(b!=0){
                           System.out.println("Division of a by b is: "+ a/b);
                       }
                       else{
                           throw new ArithmeticException();
                       }
                   }
                   catch(ArithmeticException e){
                       System.out.println(e.toString());
                       System.out.println(e.getMessage());
                   }
               }
           }
           else{
               throw new InvalidInputException();
           }
        }
        catch(InvalidInputException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        }
        else{
            throw new MaxInputException();
        }
        }
        catch(MaxInputException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
public class tut_87_ProjectExercise_6 {
    public static void main(String[] args) {
        CustomCalculator c1= new CustomCalculator();
        try{
        c1.calcOperation();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
