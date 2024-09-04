/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosssabio;

import java.util.Scanner;

/**
 *
 * @author DISK
 */
public class Product {
    
    public void inputGrade(){
    
    public class Products {
    public static void Products (String[] args) { 
        Scanner input = new Scanner(System.in);
    Scanner inputk = new Scanner(System.in);
            String k,  pchange;
        

        Grades student1 = new Grades();
        Grades student2 = new Grades();


        String choice;

        while (true) {
System.out.println("1. View Products");
System.out.println("2. Edit Products");
System.out.println("3. Exit");
System.out.print("Choose an option: ");
choice = input.nextLine();

if (choice.equals("1")) {
System.out.println("| Product ID | Name  | Price | Stocks |  Status   | TEP |");
student1.vGrades();
student2.vGrades();
                
 } else if (choice.equals("2")) {
student1.vGrades();
student2.vGrades();
System.out.printf("\n\n\n Enter ID:");
pchange = input.next();

if(pchange.equals("10011")){
          
System.out.print("Enter the new name: ");
student1.n = input.next();                
                
System.out.print("Enter the new price: ");
student1.pr = input.nextDouble();

System.out.print("Enter the new stock quantity: ");
student1.stc = input.nextInt();

System.out.print("Enter the new status: ");
student1.sts = input.next();

System.out.print("Enter the new TEP: ");
student1.fn = input.nextInt();
input.nextLine();

} else if (pchange.equals("10012")) {
 System.out.print("Enter the new name: ");
student2.n = input.next();               
                
System.out.print("Enter the new price: ");
student2.pr = input.nextDouble();

System.out.print("Enter the new stock quantity: ");
student2.stc = input.nextInt();

System.out.print("Enter the new status: ");
student2.sts = input.next();

System.out.print("Enter the new TEP: ");
student2.fn = input.nextInt();
input.nextLine();
}

} else if (choice.equals("3")) {
System.out.println("Exiting...");
return;
} else {
System.out.println("Invalid choice. Please try again.");
}
System.out.print("\nEnter any key: ");
k = inputk.nextLine();
        }
    
    }    
}
