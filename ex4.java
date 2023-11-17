//Java Program to demonstrate the use of Wrapper class  
//in switch statement  
public class WrapperInSwitchCaseExample {       
       public static void main(String args[])  
       {         
            Integer age = 20;        
            switch (age)  
            {  
                case (30):            
                    System.out.println("You are under 25.");  
                    break;  
                case (25):                
                    System.out.println("You are eligible for vote.");  
                    break;  
                case (50):                
                    System.out.println("You are senior citizen.");  
                    break;  
                default:  
                    System.out.println("Please give the valid age.");  
                    break;  
            }             
        }  
}  