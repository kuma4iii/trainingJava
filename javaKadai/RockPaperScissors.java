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
                
        
            String myStr;
            if (hand == 0) {
                myStr = "グー";
            } else if (hand == 1) {
                myStr = "パー";
            } else {
                myStr = "チョキ";
            }

            Random rand = new Random();
            int num = rand.nextInt(3);
                
            String otherStr;
            if (num == 0) {
                otherStr= "グー";
            } else if (num == 1) {
                otherStr = "パー";
            } else {
                otherStr = "チョキ";
            }
            
                
            if (hand == num) {
                //あいこ
                System.out.println("（あなた：" + myStr + "）");
                System.out.println("（相手：" + otherStr + "）");
            } else if (hand == 0 && num == 1) {
                //自分グー、相手パー
                System.out.println("（あなた：" + myStr + "）");
                System.out.println("（相手：" + otherStr + "）");
                System.out.println("あなたの負け");
                break;
            } else if (hand == 1 && num == 2) {
                //自分パー、相手チョキ
                System.out.println("（あなた：" + myStr + "）");
                System.out.println("（相手：" + otherStr + "）");
                System.out.println("あなたの負け");
                break;
            } else if (hand == 2 && num == 0) {
                //自分チョキ、相手グー
                System.out.println("（あなた：" + myStr + "）");
                System.out.println("（相手：" + otherStr + "）");
                System.out.println("あなたの負け");
                break;
            } else if (hand == 1 && num == 0) {
                //自分パー、相手グー
                System.out.println("（あなた：" + myStr + "）");
                System.out.println("（相手：" + otherStr + "）");
                System.out.println("あなたの勝ち");
                break;
            } else if (hand == 2 && num == 1) {
                //自分チョキ、相手パー
                System.out.println("（あなた：" + myStr + "）");
                System.out.println("（相手：" + otherStr + "）");
                System.out.println("あなたの勝ち");
                break;
            } else {
                //自分グー、相手チョキ
                System.out.println("（あなた：" + myStr + "）");
                System.out.println("（相手：" + otherStr + "）");
                System.out.println("あなたの勝ち");
                break;
            }

                System.out.println("「あいこで…」");
        }
    }
    
}
