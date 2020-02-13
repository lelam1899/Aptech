public class Main {

    public static void main(String[] args) {
       // System.out.println("Nhap mot so:");
       // SoNguyen objSN = new SoNguyen();
       // objSN.nhap();
      //  int gt = objSN.tinh_gt();
       // System.out.println( "! " +gt);






        /* Fibonacci */
        System.out.println("Nhap mot so n: ");
        bai2 objASM = new bai2();
        objASM.nhap();
        int sum = objASM.fibonacci();
        System.out.println("" +sum);


        /* So Nguyen To nho hon n*/
        System.out.println("Nhap mot so n: ");
        bai1 objASMN = new bai1();
        objASMN.SNT();

    }

}


