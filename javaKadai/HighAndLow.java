package javaKadai;
import java.util.Scanner;

class HighAndLow {
    /*総合１５
     * 整数型の乱数（範囲：０～９９）を当てるゲームです。
     * キーボードから数字を入力し、生成された乱数よりも大きければ「HIGH」、
     * 小さければ「LOW」を表示してください。
     * なお１０回入力して正解しない場合、ゲームの終了とします。
     * 
     * プログラム名：HighAndLow.java
     */

    public static void main(String args[]) {
        
        int random = (int) (Math.random() * 100);

        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("数字を入力してください：");
            int num = sc.nextInt();

            if (num == random && i <= 10) {
                System.out.println("congratulation!!");
                break;
            } else if (num > random && i <= 10) {
                System.out.println("HIGH");
            } else if (num < random && i <= 10) {
                System.out.println("LOW");
            } else {
                break;
            }
          
            sc.close();
        }
        
    }
}
