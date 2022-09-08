package javaKadai;

class FizzBuzz {
    /*総合７
     * コマンドライン引数で整数値を指定し、１からその値まで数値を順に表示します。
     * この時、数値が３で割り切れる際には「Fizz」、５で割り切れる際には「Buzz」、
     * 両方で割り切れる際には「FizzBuzz」と表示してください。
     * 
     * プログラム名：FizzBuzz.java
     * 
     * ■コマンドライン引数　仕様
     * 表示する数値の上限値
     */

    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
     }
}
