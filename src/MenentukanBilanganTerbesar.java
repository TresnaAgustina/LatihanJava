public class MenentukanBilanganTerbesar {
    public static void main(String[] args) {
        int a = 100, b = 23, c = 55;

        if (a > b && a > c){
            System.out.println(a + " Merupakan Bilangan Terbesar");
        }else if (b > a && b > c){
            System.out.println(b + " Merupakan Bilangan Terbesar");
        }else{
            System.out.println(c + " Merupakan Bilangan Terbesar");
        }
    }
}
