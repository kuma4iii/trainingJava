package javaKadai;
import java.util.ArrayList;
import java.util.List;

class MinTest {
    /*総合９
     * コマンドライン引数で指定された整数値を用いて整数型配列を生成し、
     * その配列の中から最小値を求め、表示するプログラムを作成してください。
     * 
     * プログラム名：MinTest.java
     * 
     * ■コマンドライン引数　仕様
     * 整数値（個数は任意に指定できるものとする）
     */

     public static void main(String args[]) {
         List<Integer> nums = new ArrayList<>();
         for (int i = 0; i < args.length; i++) {
             int num = Integer.parseInt(args[i]);
             nums.add(num);
         }
       
         System.out.println("入力された数値：" + nums);
         
         int numA = nums.get(0);
         int min = numA;
         for (int i = 1; i < nums.size(); i++) {
             if (min >= nums.get(i)) {
                 min = nums.get(i);
             }
         }
    
         System.out.println("配列中の最小値：" + min);
     }
}
