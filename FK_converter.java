import java.util.Scanner;

public class FK_converter {

    public  static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        double K;
        double F = in.nextDouble();
        K = (F + 459.67) * 5/9;
        System.out.println(K);
        in.close();

    }
}
