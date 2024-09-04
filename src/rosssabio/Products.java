package rosssabio;

import java.util.Scanner;


    public  class Products {
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

        public void vGrades() {                           
            System.out.printf("|   %-8d | %-5s | %-5.2f |   %-4d | %-9s | %-4d|\n", ptid, n, pr, stc, sts, fn);
            
        }
    }


