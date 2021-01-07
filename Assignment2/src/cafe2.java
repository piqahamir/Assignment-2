import java.util.*;
public class cafe2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double totalPrice1, totalPrice2, totalPrice3;
        System.out.print("What is your name ?: ");
        String name = in.nextLine();
        System.out.print("How old is you ?: ");
        int age = in.nextInt();
        System.out.print("Are you a 'student' or 'worker' : ");
        String personal;
        personal = in.next();
        
         //for loop
        System.out.print("How many people are you?" );
        int people = in.nextInt();
        for (int i=0; i<=people; i++); {
        	System.out.print("Enter your name: ");
        	String name2 = in.next();
        }
        
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println(">>>>Drink only RM2 and Eat only for RM4<<<<");
        System.out.println("---------------------------------------------");
        System.out.println();
        
      
        	System.out.print("Do you want to order? (Y/N): ");
        	char order = in.next().charAt(0);
        		//while loop
        		do { 
        			System.out.print("What do you want from our service 'drink only(D)' or 'eat only (E)' or both(B) ?: ");
        			char service = in.next().charAt(0);
        			if (service == 'd' || service == 'D'){
        			System.out.print("What is the quantity of your drink : ");
        			double quantityDrink = in.nextDouble();
        			totalPrice1 = quantityDrink*2;
        			System.out.println("Your total price is RM " +totalPrice1);
        		} else if (service == 'e' || service == 'E')  {
        			System.out.print("Please enter your quantity of meal : ");
        			int quantityMeal = (int) in.nextDouble();
        			totalPrice2 = quantityMeal*4;
        			System.out.println("Your total price is RM " +totalPrice2);
        		} else if (service == 'b' || service == 'B'){
        			System.out.print("What is the quantity of your drink : ");
        			int quantityDrink = in.nextInt();
        			System.out.print("What is the quantity of your meal : ");
        			int quantityMeal = in.nextInt();
        			double totalDrink = quantityDrink*2;
        			double totalMeal = quantityMeal*4;
        			totalPrice3 = totalDrink+totalMeal;
        			System.out.println();
        			System.out.println("Your total price is RM " +totalPrice3);
        		}
        			System.out.print("Do you still want to order? (Y/N): ");
        			order = in.next().charAt(0);
        	} while (order == 'Y'|| order == 'y');
        		
        	
       
             System.out.print("THANK YOU, PLEASE COME AGAIN");

	}

}
