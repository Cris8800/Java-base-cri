public class paridispari {
         public static void main(String[] args) {
            int n= 6;
        pariDispari(n);
        
        }
    
        public static boolean pariDispari(int n) {
            if ((n % 2) == 0) {
                System.out.println(" pari: " + n);
                return true;
            } else {
                System.out.println(" dispari: " + n);
                return false;
            }
        }
    }

