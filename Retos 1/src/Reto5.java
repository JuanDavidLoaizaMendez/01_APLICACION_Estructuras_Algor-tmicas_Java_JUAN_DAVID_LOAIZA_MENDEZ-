import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        int producto1=3000;
        int producto2=4000;
        int producto3=8000;
        int producto4=1000;
        int producto5=2000;
        int producto6=7000;
        int producto7=3000;
        int producto8=4000;
        int producto9=11000;
        int producto10=5000;
        int productos;
        
        int numeroProductos,i,suma=0;


        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite cuantos productos desea");
        numeroProductos=lectura.nextInt();
      
        
       
        for(i=0;i< numeroProductos;i++){

            System.out.println("numero productos Precio \n1       arroz     3000\n2       azucar    4000\n3       arveja    8000\n4       salsa     1000\n5       panela    2000\n6       cafe      7000\n7       sardina   3000\n8       atun      4000\n9       aceite   11000\n10      pasta     5000");
            productos=lectura.nextInt();
   

        if(productos==1){
        
           System.out.println("ese producto vale "+producto1);
               suma=suma+producto1;

        }
        else if(productos==2){
            
            System.out.println("ese producto vale "+producto2);
            suma=suma+producto2;
         }
         else if(productos==3){
            
            System.out.println("ese producto vale "+producto3);
            suma=suma+producto3;
         }
         else if(productos==4){
            
            System.out.println("ese producto vale "+producto4);
            suma=suma+producto4;
         }
         else if(productos==5){
           
            System.out.println("ese producto vale "+producto5);
            suma=suma+producto5;
         }
         else if(productos==6){
            
            System.out.println("ese producto vale "+producto6);
            suma=suma+producto6;
         }
         else if(productos==7){
           
            System.out.println("ese producto vale "+producto7);
            suma=suma+producto7;
         }
         else if(productos==8){
         
            System.out.println("ese producto vale "+producto8);
            suma=suma+producto8;
         }
         else if(productos==9){
           
            System.out.println("ese producto vale "+producto9);
            suma=suma+producto9;
         }
         else if(productos==10){
          
            System.out.println("ese producto vale "+producto10);
            suma=suma+producto10;
         }
         

        }
        
        System.out.println("El total de su compra es:"+suma);
          
        lectura.close();
    }
    
}
