public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 9;
        int hasil;

        for (int counter =1; counter <= 10; counter++){
            hasil = num * counter;
            System.out.println(num +"x"+ counter +"="+ hasil);
        }
    }
}
