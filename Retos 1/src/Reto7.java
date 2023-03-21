import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        String nombre;
        int eleccion;
        int random;
        int monto=15000;
        int montoPersona;
        int vida=3;
        int numeroDeIntentos=50,i;
        
        

        
        Scanner lectura=new Scanner(System.in);
        
     
        System.out.println("Digite su nombre");
        nombre=lectura.nextLine();

        System.out.println("Tiene 3 vidas y su monto es de 15000k ");


    for (i = 0;i<=numeroDeIntentos;i++){

     System.out.println("TIENE "+ monto +" DIGITE CANTIDAD DE DINERO QUE QUIERE APOSTAR");
     montoPersona=lectura.nextInt();

     System.out.println("ELIJA UNA OPCION PIEDRA=1, PAPEL=2, o TIJERA=3");
     eleccion=lectura.nextInt(); 

        
       

       
        random=(int) (Math.random()*3)+1;
        if(random==1 && eleccion==1){
           
            System.out.println("respuesta de la maquina es piedra");
            
            System.out.println(nombre+" EMPATE");
        } else if(random==2 && eleccion==2){
            
            System.out.println("respuesta de la maquina es papel");
            
            System.out.println(nombre+" EMPATE" );
        } else if(random==3 && eleccion==3){
           
            System.out.println("respuesta de la maquina es tijera");
           
            System.out.println(nombre+" EMPATE" );
        
        }
        else if(random==1 && eleccion==2){
          
            System.out.println("respuesta de la maquina es piedra");
            monto=monto+montoPersona;
            System.out.println(nombre+" GANOOO" );
       
        }
        else if(random==3 && eleccion==1){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=monto+montoPersona;
            System.out.println(nombre+" GANOOO" );
        }else if(random==2 && eleccion==3){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto+montoPersona;
            System.out.println(nombre+" GANOOO" );
        }
       
       
        else if(random==3 && eleccion==2){
            
            System.out.println("respuesta de la maquina es tijera");
            monto=monto-montoPersona;
            vida= vida-1;
            System.out.println(nombre+"PERDIOOO" );
        }else if(random==2 && eleccion==1){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto-montoPersona;
            vida= vida-1;
            System.out.println(nombre+" QUE MAL PERDIO");
        
        }else if(random==1 && eleccion==3){
       
            System.out.println("respuesta de la maquina es piedra");
            monto=monto-montoPersona;
            vida= vida-1;
            System.out.println(nombre+" PERDIOOO" );
        }


        System.out.println(vida+" De 3 vidas que usted tenia");
        
        if (vida==0) {

            numeroDeIntentos= vida;
            
        }
         if (monto ==0){

            monto=montoPersona;

            System.out.println("  Ya perdio todo su dinero ");
            
         }

    
    }  
          System.out.println(nombre+" usted jugo "+i+"veces"+" y su cantidad de dinero que quedo al final del juego es de"+monto); 

        lectura.close();  


    }
}
