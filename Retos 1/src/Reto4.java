
import java.util.Scanner;

public class Reto4 {
    
    public static void main(String[] args) {
        String nombre;
        int eleccion;
        int random;
        int monto=2000;
        int montoPersona=0;

        
        Scanner lectura=new Scanner(System.in);
        
     
 System.out.println("Digite su nombre");
        nombre=lectura.nextLine();

        System.out.println("");

   System.out.println("DIGITE CANTIDAD DE DINERO QUE QUIERE APOSTAR");
   montoPersona=lectura.nextInt();

   System.out.println("ELIJA UNA OPCION PIEDRA=1, PAPEL=2, o TIJERA=3");
        eleccion=lectura.nextInt();
        
        

        random=(int) (Math.random()*3)+1;


        if(random==1 && eleccion==1){
           
            System.out.println("respuesta de la maquina es piedra");
            monto=montoPersona;
            System.out.println(nombre+" EMPATE"+" su dinero es"+monto    );
        }
        else if(random==1 && eleccion==2){
          
            System.out.println("respuesta de la maquina es piedra");
            monto=monto+montoPersona;
            System.out.println(nombre+" GANOOO"+" su dinero es"+monto  );
       
        }
        else if(random==3 && eleccion==1){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=monto+montoPersona;
            System.out.println(nombre+" GANOOO"+" su dinero es"+monto  );
        }
        else if(random==2 && eleccion==2){
            
            System.out.println("respuesta de la maquina es papel");
            monto=montoPersona;
            System.out.println(nombre+" EMPATE"+" su dinero es"+monto  );
        }
        else if(random==3 && eleccion==3){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=montoPersona;
            System.out.println(nombre+" EMPATE"+" su dinero es"+monto  );
        
        }
        else if(random==3 && eleccion==2){
            
            System.out.println("respuesta de la maquina es tijera");
            monto=monto-montoPersona;
            System.out.println(nombre+" nombre+PERDIOOO"+" su dinero es"+monto  );
        }
        else if(random==2 && eleccion==1){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto-montoPersona;
            System.out.println(nombre+" QUE MAL PERDIO"+" su dinero es"+monto  );
        
        }
        else if(random==2 && eleccion==3){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto+montoPersona;
            System.out.println(nombre+" GANOOO"+" su dinero es"+monto  );
        }
        else if(random==1 && eleccion==3){
       
            System.out.println("respuesta de la maquina es piedra");
            monto=monto-montoPersona;
            System.out.println(nombre+" PERDIOOO"+" su dinero es"+monto  );
        }
       

       lectura.close();
    }

   

    }
        
  