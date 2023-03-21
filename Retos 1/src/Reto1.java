import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        int fahrenheit=0;
        int centigrados=0;
        int kelvin=0;
        

        Scanner lectura=new Scanner(System.in);

        System.out.print("Digite los grados Fahrenheit:");
        fahrenheit=lectura.nextInt();

        centigrados=(int) ((fahrenheit-32)/1.8);

        kelvin=(int) (centigrados+273.15);

        System.out.println(" usted digito " + fahrenheit+ "°F" + " En centrigados es: " + centigrados+"°c"+" En kelvin es: " + kelvin+"°k" );

        lectura.close();

        
        
        
    }

    
    }