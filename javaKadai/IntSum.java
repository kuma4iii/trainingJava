package javaKadai;

class IntSum {
    /*総合１
     * 以下の仕様のメソッドを定義し、mainメソッドから任意の実引数を渡して、定義したメソッドを利用するプログラムを作成してください。
     * 
     * プログラム名：IntSum.java
     * 
     * ■メソッド仕様
     * メソッド名：sumLoop
     * 処理の概要：最小値から最大値までの整数を加算した結果を戻り値として返す
     * 引数：最小値を示す整数型の引数１つ、最大値を示す整数型の引数１つ
     * 戻り値：最小値から最大値までの整数を加算した値（整数）
     */

    public static void main(String args[]) {
        int min = 1;
        int max = 10;
        int sum = sumLoop(min,max);
        System.out.println("最小値：" + min);
        System.out.println("最大値：" + max);
        System.out.println("加算結果：" + sum);
    }
     
    static int sumLoop(int min, int max) {
        int sum;
        for (sum = 0; min <= max; min++) {
            sum = sum + min;
        }
        return sum;
    }
    
}
