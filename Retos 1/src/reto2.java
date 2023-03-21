import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        int pesoBebe=0;
        int mesesBebe=0;
        int dosisVacuna=0;
        int idDoctor=0;
        String nombreAcudiente;
        String nombreDoctor;
      

        Scanner lectura = new Scanner(System.in);

        System.out.print("Por favor digite su nombre doctor: ");
        nombreDoctor=lectura.next();

        System.out.print("Por favor digite su documento");
        idDoctor=lectura.nextInt();

        System.out.print("Por favor digite el nombre del acudiente");
        nombreAcudiente=lectura.next();

        System.out.print("Por favor digite el peso del bebe");
        pesoBebe=lectura.nextInt();

        System.out.print("Por favor digite los meses de nacido del bebe");
        mesesBebe=lectura.nextInt();

    dosisVacuna=( (pesoBebe+10)  / (mesesBebe*10) *8 );

    System.out.println("La dosis de la vacuna que le debe aplicar al bebe es de: " + dosisVacuna +" el nombre del doctor es: "+ nombreDoctor + " su cedula es: " +idDoctor+" y el nombre del acudiente es: "+nombreAcudiente);

    lectura.close();

    

    


    }
}
