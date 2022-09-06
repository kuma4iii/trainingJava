package javaKadai;

class PointDay {
    /*演習４－９
     * 日付を格納する整数型変数に、1～31のいずれかの任意の値を代入し、日付の1の位の値に応じて対応するメッセージを表示するプログラムを作成してください。
     * ▼３：ポイント3倍デー
     * ▼５：ポイント5倍デー
     * ▼その他の数値：通常ポイントデー
     * 
     * プログラム名：PointDay.java
     */
    public static void main(String args[]) {
        int day = 5;

        if (day % 3 == 0) {
            System.out.println("本日の日付：" + day + "日");
            System.out.println("ポイント3倍デー");
        } else if (day % 5 == 0) {
            System.out.println("本日の日付：" + day + "日");
            System.out.println("ポイント5倍デー");
        } else {
            System.out.println("本日の日付：" + day + "日");
            System.out.println("通常ポイントデー");
        }
    }
}
