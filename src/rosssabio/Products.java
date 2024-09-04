package rosssabio;

import java.util.Scanner;

public class Products {
    public static void Products (String[] args) { Scanner input = new Scanner(System.in);
    Scanner inputk = new Scanner(System.in);
            String k,  pchange;
        

        Grades student1 = new Grades();
        Grades student2 = new Grades();


        student1.wGrades(10011, "soap", 85.0, 90, "Available", 200);


        student2.wGrades(10012, "cards", 78.0, 85, "N/A", 0);

        String choice;

        while (true) {
            clearScreen();
System.out.println("1. View Products");
System.out.println("2. Edit Products");
System.out.println("3. Exit");
System.out.print("Choose an option: ");
choice = input.nextLine();

if (choice.equals("1")) {
clearScreen();
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

    public static void clearScreen() {
        for (int x = 0; x <= 100; x++) {
            System.out.printf("%n");
        }
    }

    public static class Grades {
        public int ptid;
        public String n;
        public double pr;
        public int stc;
        public String sts;
        public int fn;        

        public void wGrades(int sid, String name, double p, int m, String s, int f) {
            ptid = sid;
            n = name;
            pr = p;
            stc = m;
            sts = s;
            fn = f;
            
        }

        public void vGrades() {                           System.out.printf("|   %-8d | %-5s | %-5.2f |   %-4d | %-9s | %-4d|\n", ptid, n, pr, stc, sts, fn);
            
        }
    }
}
}
