import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        int numeroAleatorio;
        int numeroPresona;
        int intentos=10,i;
        int cantidadDeVeces=10;
        int adivino=0;
        

        Scanner lectura=new Scanner(System.in);
        

        System.out.println("adivinar el numero");
        System.out.println("tiene 10 oportunidades para adivinar el numero");
        System.out.println("escriba el numero de veces que se van a intentar adivinar el numero");
        intentos=lectura.nextInt();

        if (intentos > 10) {

            cantidadDeVeces=0;
            System.out.println("no puede elegir mas de 10 intentos");
            
        }

        for(i=1;i<=cantidadDeVeces;i++){

            System.out.println("porfavor ingrese un numero");
            numeroPresona=lectura.nextInt();

            System.out.println("el programa a escogido un numero");
           
            numeroAleatorio=(int)(Math.random()+100)+1;
 


         if (numeroAleatorio == numeroPresona){

            System.out.println("MUUUUY BIEN adivinaste el numero");
            adivino= adivino + 1;

        }else{

            intentos= intentos -1;
            System.out.println("lastima ese numero no es");

            System.out.println("le quedan "+intentos+" intentos cuidado");
        }

        if (numeroAleatorio > numeroPresona ) {

            System.out.println("el numero es mayor que el numero que digitaste "+numeroPresona);
            
        } else if(numeroAleatorio < numeroPresona) {
            System.out.println("el numero es menor que el numero que digitaste "+numeroPresona);
            
        }

       

        if (intentos ==0){
            cantidadDeVeces= intentos;
        }
        

        System.out.println("ronda "+i+" y los intentos "+intentos);

        
      }  
        

System.out.println("acerto "+adivino+" de "+i+" intentos");
 lectura.close();


    }
}
