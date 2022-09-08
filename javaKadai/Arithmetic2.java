package javaKadai;

import java.util.ArrayList;
import java.util.List;

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
       
        List<Integer> arith =  getProgression(1, 4, 5);

        System.out.println("初項 = " + fterm + "，公差 = " + tolerance + "，項数 = " + terms);
        System.out.print("等差数列：" + arith);
         
     }
    
     public static List<Integer> getProgression(int fterm, int tolerance, int terms) {
         List<Integer> arith = new ArrayList<>();

         for (int i = 0; i < terms; i++) {
             int term = fterm + tolerance * i;
             arith.add(term);
         }

         return arith;
     }
     }

