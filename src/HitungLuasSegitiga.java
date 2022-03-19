import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HitungLuasSegitiga {
    public static void main(String[] args) throws IOException {
        int a,t;
        double luas;

//        make new InputStreamReader
        InputStreamReader reader = new InputStreamReader(System.in);
//        make new BufferReader
        BufferedReader input = new BufferedReader(reader);

        try{
            System.out.print("Masukan Alas: ");
            a = Integer.parseInt(input.readLine());

            System.out.print("Masukan Tinggi: ");
            t = Integer.parseInt(input.readLine());

//            rumus luas segitiga = 1/2 * alas * tinggi;
            luas = 0.5*a*t;

            System.out.print("Luas Dari Segitiga Adalah: " + luas);

//            test output
//            System.out.println(a);
//            System.out.println(t);

        }catch (Exception ex){
            System.out.println("Something Error");
        }

    }
}
