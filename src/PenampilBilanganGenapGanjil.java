import java.util.Scanner;

public class PenampilBilanganGenapGanjil {
    public static void main(String[] args) {
        int bil;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka: ");
        bil = input.nextInt();

        if (bil % 2 == 0){
            System.out.println(bil + " Merupakan Bilangan Genap");
        }else{
            System.out.println(bil + " Merupakan Bilangan Ganjil");
        }

    }
}
