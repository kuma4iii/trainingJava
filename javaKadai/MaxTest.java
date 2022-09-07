package javaKadai;

class MaxTest {
    /*総合４
     * 以下の仕様のメソッドを定義し、mainメソッドから任意の実引数を渡して、定義したメソッドを利用するプログラムを作成してください。
     * 
     * プログラム名：MaxTest.java
     * 
     * ■メソッド仕様
     * メソッド名：max
     * 処理の概要：引数で指定された配列中の最大値を求めて返す
     * 引数：整数型の配列
     * 戻り値：配列中の最大値
     */
    public static void main(String[] args) {
        int[] array = { 17, 68, 14, 55, 70, 12, 21, 63, 88, 50 };
        max(array);

        System.out.println("配列：" + array[0] + " "+ array[1] + " "+ array[2] + " "+ array[3] + " "+ array[4] + " "+ array[5] + " "+ array[6] + " "+ array[7] + " "+ array[8] + " "+ array[9]);
        System.out.println("配列の最大値：" + max(array));
    }

    public static int max(int array[]) {
    
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (num < array[i]) {
                num = array[i];
            }
        }
        return num;
    }
}
