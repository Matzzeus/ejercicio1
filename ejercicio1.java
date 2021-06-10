import java.util.*;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, par = 0 ,  inpar = 0;
        System.out.print("ingrese un numero: ");
        n1 = scanner.nextInt();
        for ( int i = 0 ;  i < n1 ; i ++ ){
            int rand = (int)(Math. random() *100 +1 );
            System.out.print(" " + rand);
            System.out.println();
            while ( rand > 1 ){
                rand = rand - 2;
        }
        if (rand == 0) {  
            System.out.print("es par y el numeroro es: " );
            System.out.println();
            par = par ++ ;
        }
        else {
            System.out.print("es inpar y es: " );
            System.out.println();
            inpar = inpar ++ ;
        }
        
        }
        System.out.println();
        System.out.print("Son " + par + " números pares e " + inpar + " número impares");
    } 
}