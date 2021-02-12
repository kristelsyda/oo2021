import java.util.Scanner;

public class kodutoo1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sisesta esimene number: ");
        double a = in.nextDouble();
        System.out.println("Sisesta teine number: ");
        double b = in.nextDouble();
        System.out.println("Sisesta kolmas number: ");
        double c = in.nextDouble();

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
        
    }
}