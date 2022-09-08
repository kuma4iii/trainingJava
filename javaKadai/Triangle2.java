package javaKadai;

class Triangle2 {
    /*総合６
     * 以下の仕様のメソッドを定義し、mainメソッドから任意の実引数を渡して、定義したメソッドを利用するプログラムを作成してください。
     * 
     * プログラム名：Triangle2.java
     * 
     * ■メソッド仕様
     * メソッド名：drawTriangle
     * 処理の概要：引数で指定された高さの三角形を「＊」で表示する
     * 引数：三角形の高さ（整数値）
     * 戻り値：なし
     */

     public static void main(String args[]) {
         drawTriangle(7);
    }


    public static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for(int space=0; space<height-(i+1); space++){
        System.out.print("　");
      }
      for(int asterisk=0; asterisk<(i+1)*2-1; asterisk++){
        System.out.print("＊");
      }
      System.out.print("\n");
        }
    }
       
    }

