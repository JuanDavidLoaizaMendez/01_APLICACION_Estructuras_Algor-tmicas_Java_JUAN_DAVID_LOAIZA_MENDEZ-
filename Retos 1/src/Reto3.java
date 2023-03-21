import java.util.Scanner;

public class Reto3 {
   
    public static void main(String[] args) {

        String nombreJugador;
        int idDeJugador;
        int montoApuesta,monto = 3000,moneda;

            Scanner lectura=new Scanner(System.in);

            System.out.println("ESTE ES EL JUEGO CARA Y SELLO ESTA LISTO");
        
            System.out.println("como es su nombre digitelo por favor"); 
            nombreJugador=lectura.nextLine();

            System.out.println("Usted cuenta con 3 vidas y con un monto de 3000k aprovechelos");

            System.out.println("Digite de cuanto es su apuesta");
            montoApuesta=lectura.nextInt();

             System.out.println(" sus opciones son:  cara = 1  y sello = 2");
            idDeJugador=lectura.nextInt();

            System.out.println("GIRANDOO LA MONEDA Y!!!!");

                moneda=(int) (Math.random()*2)+1;

                if (moneda==1 && idDeJugador==1  ) {
                    montoApuesta = monto + montoApuesta;
                    System.out.println(nombreJugador+"saco CARA es usted el ganador");

                }else if (moneda==2 && idDeJugador==2  ) {
                    montoApuesta = monto + montoApuesta;
                    System.out.println(nombreJugador+"saco SELLO es usted el ganador");

                }else if (moneda==1 && idDeJugador==2  ) {
                    montoApuesta = monto - montoApuesta;
                    System.out.println(nombreJugador+" Ha perdido lo sentimos");

                }else if (moneda==2 && idDeJugador==1  ) { 
                    montoApuesta = monto - montoApuesta;
                        System.out.println(nombreJugador+" Ha perdido lo sentimos"); 
                        
                 
                }

                System.out.println(nombreJugador+" y tiene un monto para apostar de"+montoApuesta);

            System.out.println(nombreJugador+ " Usted tenia 3000 y ahora tiene una cantidad de "+ montoApuesta);

            System.out.println("GRACIAS");

        lectura.close();
   } 
    }

