import java.util.Scanner;

public class bai2 {
    public int num;
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        this.num = scanner.nextInt();
    }

    public int fibonacci(){
        System.out.println("Tong " +num+ " so dau tien trong day fibonacci la:");
        int num = this.num;
        int fn;
        int sum = 1, f0 = 0, f1 = 1;
       for (int i =2 ; i < num; i++){
           fn = f0 + f1;
           f0 = f1;
           f1 = fn;
           sum += fn;
       }
       return sum;
    }


}