package javaKadai;

import java.util.ArrayList;

class Arithmetic2 {
     /*総合３
     * 以下の仕様のメソッドを定義し、mainメソッドから任意の実引数を渡して、定義したメソッドを利用するプログラムを作成してください。
     * 
     * プログラム名：Arithmetic2.java
     * 
     * ■メソッド仕様
     * メソッド名：getProgression
     * 処理の概要：引数で指定された初項、公差、項数の等差数列を返す
     * 引数：いずれも整数型の初項、公差、項数
     * 戻り値：整数型の等差数列を示す配列
     */

     public static void main(String[] args) {
        int fterm = 1;
        int tolerance = 4;
        int terms = 5;
        getProgression(fterm, tolerance, terms);
         System.out.println("初項 = " + fterm + "，公差 = " + tolerance + "，項数 = " + terms);
         System.out.println("等差数列：" +  );
     }
    
     public static int getProgression(int fterm, int tolerance, int terms) {
         int term;
            for (int i = 0; i <= terms-1; i++) {
             term = fterm + (terms - 1) * tolerance;
            
         }
         return term;
         }

     }

