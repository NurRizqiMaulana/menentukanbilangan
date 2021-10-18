import java.util.Scanner;

public class bilanganganjildangenap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Masukkan Bilangan = ");
        int bil= input.nextInt();

        if(bil%2==1){
            System.out.println("Bilangan " +bil+ "adalah Bilangan Ganjiil ");
        }else{
            System.out.println("Bilangan " +bil+ "adalah Bukan Bilangan Ganjil");
        }
    }
}
