
package rosssabio;

import java.util.Scanner;



 
public class Product {

    Product() {
        throw new UnsupportedOperationException("Not supported yet."); 
        
        Products() {
        
    }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Products(); {
        throw new UnsupportedOperationException("Not supported yet."); 
        

    Products() {
        throw new UnsupportedOperationException("Not supported yet.");

    Products() {
        throw new UnsupportedOperationException("Not supported yet.");}
    
    public void inputGrade(){

    private void Products() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    public class products {
    public static void product.products (String[] args) { 
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

            switch (choice) {
                case "1":
                    System.out.println("| Product ID | Name  | Price | Stocks |  Status   | TEP |");
                    student1.vGrades();
                    student2.vGrades();
                    break;
                case "2":
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
                    }                   break;
                case "3":
                    System.out.println("Exiting...");
                    return;         default:
                        System.out.println("Invalid choice. Please try again.");
                    break;
            }
System.out.print("\nEnter any key: ");
k = inputk.nextLine();
        }
    
    }    

    }