//impor scanner ke dalam proram
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JavaKasirTest {
    public static void main(String[] args) {
        String nama;
        int tagihan,totalBayar,totalTagihan,tunai,kembalian,idTransaksi,kodePembayaran;
        int cusFee = 2500;

        DateFormat formatTanggal = new SimpleDateFormat("dd/MM/yyy HH:mm");
        Date tanggal = new Date();

        Random id = new Random();
        idTransaksi = 1+id.nextInt(1000000000);

        Random transaksiId = new Random();
        kodePembayaran = transaksiId.nextInt(1000000000);

        Scanner name = new Scanner(System.in);
        nama = name.nextLine();

        Scanner bayar = new Scanner(System.in);
        tagihan = bayar.nextInt();

        Scanner dibayar = new Scanner(System.in);
        tunai = dibayar.nextInt();

        totalBayar = tagihan + cusFee;
        totalTagihan = totalBayar;
        kembalian = tunai - totalTagihan;


        System.out.println("TEGALLALANG / 123456789");
        System.out.println("PT.SUMBER ALFARIA TRIJAYA, TBK");

        System.out.println("ALFA TOWER LT.12, ALAM SUTERA, TANGGERANG");
        System.out.println("NPWP : 01.336.238.9-054.000");
        System.out.println("JL I WAYAN LUNGA TEGALLALANG");

        System.out.println("PEMBAYARAN TOKOEDIA");

        System.out.println("TGL TRANSAKSI: "+ formatTanggal.format(tanggal));
        System.out.print("ID TRANSAKSI: TKP"+ idTransaksi);
        System.out.println();
        System.out.println("KODE PEMBAYARAN: AA"+ kodePembayaran);
        System.out.println("NAMA KONSUMEN: "+ nama);
        System.out.println("TAGIHAN: "+ tagihan);
        System.out.println("CUSTOMER FEE: "+ cusFee);
        System.out.println("TOTAL PEMBAYARAN: "+ totalBayar);

        System.out.println("- DETAIL BAYAR -");

        System.out.println("TOTAL TAGIHAN: "+ totalTagihan);
        System.out.println("TUNAI: "+ tunai);
        if(tunai < totalTagihan){
            System.out.println("UANG ANDA TIDAK CUKUP");
            System.out.println("KEMBALIAN: 0,-");
            System.out.println("- TERIMA KASIH -");
        }else{
                System.out.println("KEMBALIAN: "+ kembalian);
                System.out.println("- TERIMA KASIH -");
        }

    }
}
