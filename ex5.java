//Java Switch Example where we are omitting the  
//break statement  
public class SwitchExample2 {  
public static void main(String[] args) {  
    int number=40;  
    //switch expression with int value  
    switch(number){  
    //switch cases without break statements  
    case 50: System.out.println("50");  
    case 100: System.out.println("100");  
    case 200: System.out.println("200");  
    default:System.out.println("Not in 50, 100 or 200");  
    }  
}  
}  