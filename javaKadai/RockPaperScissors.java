package javaKadai;

import java.util.Scanner;
import java.util.Random;

class RockPaperScissorsSample {
    /*
     * 総合１６
     * じゃんけんプログラムを作成してください。
     * 自分の手（ 0（グー）、1（パー）、2（チョキ）のいずれかの値）をキーボードから
     * 入力し、相手の手をランダムで生成し勝負します。
     * あいこの場合には勝負がつくまで繰り返します。
     * 
     * プログラム名：RockPaperScissors.java
     */
    public static void main(String args[]) {
        System.out.println("「じゃんけん…」");

        for (int i = 1; i > 0; i++) {

            System.out.print("(0（グー）、1（パー）、2（チョキ）のいずれかを入力してください：");
            Scanner sc = new Scanner(System.in);
            int hand = sc.nextInt();

            if (i >= 2) {
                System.out.println("「しょっ！」");
            } else {
                System.out.println("「ぽんっ！」");
            }

            // 相手の手
            Random rand = new Random();
            int num = rand.nextInt(3);
            String otherStr = getHandStr(num);

            // 自分の手
            String myStr = getHandStr(hand);

            // 判定処理
            System.out.println("（あなた：" + myStr + "）");
            System.out.println("（相手：" + otherStr + "）");
            if (hand == num) {
                // あいこ
                System.out.println("「あいこで…」");
            } else {
                if ((hand == 0 && num == 1) || (hand == 1 && num == 2) || (hand == 2 && num == 0)) {
                    // 負け
                    System.out.println("あなたの負け");
                } else if ((hand == 1 && num == 0) || (hand == 2 && num == 1) || (hand == 0 && num == 2)) {
                    // 勝ち
                    System.out.println("あなたの勝ち");
                }
                break;
            }
        }
    }

    private static String getHandStr(int handNum) {
        if (handNum == 0) {
            return "グー";
        } else if (handNum == 1) {
            return "パー";
        } else {
            return "チョキ";
        }
    }

}
