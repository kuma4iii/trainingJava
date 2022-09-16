package javaKadai;

import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
     /*総合１６
     *じゃんけんプログラムを作成してください。
     * 自分の手（　0（グー）、1（パー）、2（チョキ）のいずれかの値）をキーボードから
     * 入力し、相手の手をランダムで生成し勝負します。
     * あいこの場合には勝負がつくまで繰り返します。
     * 
     * プログラム名：RockPaperScissors.java
     */

     private static void loseMessage() {
         System.out.println("あなたの負け");
     }
     
     private static void winMessage() {
         System.out.println("あなたの勝ち");
     }
     
     private static String handsAction(int hand) {
        String str;
             if (hand == 0) {
                 str = "グー";
             } else if (hand == 1) {
                 str = "パー";
             } else {
                 str = "チョキ";
             }
             return str;
     }
     public static void main(String args[]) {
         System.out.println("「じゃんけん…」");
        
         for (int i = 1; i > 0; i++) {

             Scanner sc = new Scanner(System.in);
             System.out.print("(0（グー）、1（パー）、2（チョキ）のいずれかを入力してください：");
             int hand = sc.nextInt();

             if (i >= 2) {
                 System.out.println("「しょっ！」");
             } else {
                 System.out.println("「ぽんっ！」");
             }

             Random rand = new Random();
             int num = rand.nextInt(3);

             String myStr = handsAction(hand);
             String otherStr = handsAction(num);
             System.out.println("（あなた：" + myStr + "）");
             System.out.println("（相手：" + otherStr + "）");

             if (hand == num) {
                 //あいこ
                 System.out.println("「あいこで…」");
             } else if ((hand == 0 && num == 1) || (hand == 1 && num == 2) || (hand == 2 && num == 0)) {
                 //自分グー、相手パーor自分パー、相手チョキor自分チョキ、相手グー
                 loseMessage();
                 break;
             } else if ((hand == 1 && num == 0) || (hand == 2 && num == 1) || (hand == 0 && num == 2)) {
                 //自分パー、相手グーor自分チョキ、相手パーor自分グー、相手チョキ
                 winMessage();
                 break;
             }

         }
         
         
    }
    
}
