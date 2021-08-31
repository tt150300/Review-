
package bac1;
import java.util.Scanner;

public class MangPT {
    private Bac1 a[];
    public void nhap(){
        int n;
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập số PT: ");
        n = kb.nextInt();
        a = new Bac1[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập PT " + (i+1) + "(1:Bậc 1, 2:Bậc 2)  ");
            int chon;
            chon = kb.nextInt();
            if(chon==1){
                System.out.print("Nhập a, b: ");
                float   h1, h2;
                h1 = kb.nextFloat();
                h2 = kb.nextFloat();
                a[i] = new Bac1(h1,h2);
            }
            else{
                System.out.print("Nhập a, b, c: ");
                float h1, h2, h3;
                h1 = kb.nextFloat();
                h2 = kb.nextFloat();
                h3 = kb.nextFloat();
                a[i] = new Bac2(h1,h2,h3);
            }
        }
    }
    
    public void xuat(){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " + a[i].giai());
        }
    }
    
    public void demPT(){
        int demBac1 = 0, demBac2 = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof Bac2 ) demBac2++; // kiểm tra đối tượng thuộc lớp nào.
            else demBac1++;
        }
        System.out.println("Có " + demBac1 + " bậc 1 " + "  ,  " + demBac2 + " Bậc 2");
    }
}
