 package rosssabio;

import java.util.Scanner;

public class Rosssabio {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);    
        
        String name;
        int M,S,E,C;
        float total, avg;
        
        System.out.print("Enter your full name: ");
        name = input.nextLine();
        
         System.out.print("Enter your marks in: ");
         
        System.out.printf("%n");
                
        System.out.print("Math: ");
        M = input.nextInt();
        
        System.out.print("Science: ");
        S = input.nextInt();
        
        System.out.print("English: ");
        E = input.nextInt();
        
        System.out.print("Computer: ");
        C = input.nextInt();
        
        total = M + S + E + C;
        avg = total/4;
        
        System.out.println("-------------------------");
        System.out.println("Grade Detail");
        System.out.println("-------------------------");

        
        System.out.println("Name: "+name);
        System.out.println("Total Marks: "+total);
        System.out.println("Total Average: "+avg);
    }

    }

    
