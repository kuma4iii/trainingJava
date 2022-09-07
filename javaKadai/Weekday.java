package javaKadai;

class Weekday {
    /*総合２
     * 以下の仕様のメソッドを定義し、mainメソッドから任意の実引数を渡して、定義したメソッドを利用するプログラムを作成してください。
     * 
     * プログラム名：Weekday.java
     * 
     * ■メソッド仕様
     * メソッド名：getWeekdayName
     * 処理の概要：英字の曜日名が格納された配列を返す
     * 引数：なし
     * 戻り値：英字の曜日名を格納した配列
     */
    
    public static void main(String args[]) {
        String[] str = getWeekdayName();
        System.out.println("曜日一覧：" + str[0] + "，" + str[1] + "，" + str[2] + "，" + str[3] + "，" + str[4] + "，" + str[5] + "，" + str[6]);
    }
     
    static String[] getWeekdayName() {
        String[] getWeekdayName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return getWeekdayName;
    }
}
