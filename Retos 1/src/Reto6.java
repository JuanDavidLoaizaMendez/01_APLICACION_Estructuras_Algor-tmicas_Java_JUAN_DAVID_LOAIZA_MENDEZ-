import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {

        String nombreJugador;
        int idDeJugador;
        int montoApuesta,monto = 30000,moneda;
        int vida=3,i;
        int intentosNumero=50;

            Scanner lectura=new Scanner(System.in);


            System.out.println("ESTE ES EL JUEGO CARA Y SELLO ESTA LISTO");
            

            System.out.println("como es su nombre digitelo por favor"); 
            nombreJugador=lectura.nextLine();

            System.out.println("Usted cuenta con 3 vidas");

            

            for(i=0;i<=intentosNumero;i++){

                System.out.println("Usted posee un dinero de "+monto+" Digite de cuanto es su apuesta");
                montoApuesta=lectura.nextInt();

                System.out.println(" sus opciones son:  cara = 1  y sello = 2");
                idDeJugador=lectura.nextInt();
 
                

                moneda=(int) (Math.random()*2)+1;

            
                if (moneda==1 && idDeJugador==1  ) {
                    monto = monto+ montoApuesta;
                    System.out.println(nombreJugador+"saco CARA es usted el ganador");

                }else if (moneda==2 && idDeJugador==2  ) {
                    monto = monto + montoApuesta;
                    System.out.println(nombreJugador+"saco SELLO es usted el ganador");

                }else if (moneda==1 && idDeJugador==2  ) {
                    monto = monto - montoApuesta;
                    vida=vida-1;
                    System.out.println(nombreJugador+" Ha perdido lo sentimos");

                }else if (moneda==2 && idDeJugador==1  ) { 
                    monto = monto - montoApuesta;
                    vida=vida-1;
                    System.out.println(nombreJugador+" Ha perdido lo sentimos");
                }

                System.out.println(vida+" De 3 vidas que usted tenia");
                if (vida ==0) {
                    intentosNumero=vida;
                   
                    
                } else{

                }


                if (monto ==0) {
                    monto=montoApuesta;
                   
                    
                } else{

                }

}

System.out.println(nombreJugador+" usted jugo "+i+"veces"+" y su cantidad de dinero que quedo al final del juego es de"+monto); 

System.out.println("GRACIAS");

        lectura.close();
   } 
}
