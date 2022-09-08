package javaKadai;

class GCMTest {
    /*総合５
     * 以下の仕様のメソッドを定義し、mainメソッドから任意の実引数を渡して、定義したメソッドを利用するプログラムを作成してください。
     * 
     * プログラム名：GCMTest.java
     * 
     * ■メソッド仕様
     * メソッド名：getGcm
     * 処理の概要：引数で指定された２つの整数値の最大公約数を返す
     * 引数：整数２つ
     * 戻り値：最大公約数
     */

    public static void main(String args[]) {
        int large = 3108;
        int small = 1665;
        int gcm = getGCM(3108, 1665);
        System.out.println(large + "と" + small + "の最大公約数：" + gcm);

    }


    public static int getGCM(int large, int small) {
        int gcm = 0;
        for (int i = 1; i <= small; i++) {
            if (small%i==0 && large%i==0) {
                gcm = i; 
            }
        }
        return gcm;
    }
}
