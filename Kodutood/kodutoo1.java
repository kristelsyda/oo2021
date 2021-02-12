import java.util.Scanner;

public class kodutoo1{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        try {
            System.out.println("Sisesta esimene number: ");
            double a = number.nextDouble();
            System.out.println("Sisesta teine number: ");
            double b = number.nextDouble();
            System.out.println("Sisesta kolmas number: ");
            double c = number.nextDouble();
            
            if(a >= b){
                if(a >= c)
                    System.out.println(a+" on suurim number");
                else
                    System.out.println(c+" on suurim number");
            }
            else{
                if(b >= c)
                    System.out.println(b+" on suurim  number");
                else
                    System.out.println(c+" on suurim number"); 
            }
        } finally {
            number.close();
        }
    }
    
        
}

