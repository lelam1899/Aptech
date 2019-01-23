import java.util.Scanner;

public class bai1 {
    public void SNT(){
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        System.out.println("Cac so nguyen to nho hon " +n+ " la:");
        for (int i = 1; i<n; i++ ){
            int temp=0;
            for (int j = 1; j<=i; j++){
                if (i%j==0){
                  temp++;
                }
            }
            if (temp==2){
                 System.out.print(" " +i);

            }

        }
    }
}
