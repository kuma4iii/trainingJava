package javaKadai;

class RandomTest {
     /*総合１０
     * コマンドライン引数で指定された回数分だけ、乱数（ランダムな値）を繰り返し出力する
     * プログラムを作成してください。
     * 表示する乱数値は、０～９のいずれかとします。
     * 
     * プログラム名：RandomTest.java
     * 
     * 乱数の生成には以下の式を使ってください。
     * int random = (int) (Math. random() * 10)
     * 
     * ■コマンドライン引数　仕様
     * 乱数を表示する回数を表す整数値
     */

     public static void main(String args[]) {
         
         int num = Integer.parseInt(args[0]);

         for (int i = 1; i <= num; i++) {
            int random = (int) (Math.random() * 10);
            System.out.println(i + "回目：" + random);
         }

     }

}
