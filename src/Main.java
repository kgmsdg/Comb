import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        n = inp.nextInt();
        System.out.print("Seçim sayısını giriniz : ");
        r = inp.nextInt();
        int nF = 1, rF = 1, nRF = 1, cmb;

        for (int i = 1 ; i <= n ; i++){
            nF *=i;
        }
        for (int j = 1 ; j <= r ; j++){
            rF *=j;
        }
        for (int k = 1 ; k <= n-r ; k++){
            nRF *=k;
        }
        cmb = nF / (rF * nRF);
        System.out.println("C(" + n + "," + r + "):" + cmb);
    }
}
