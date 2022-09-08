package javaKadai;

class Calender {
    /*総合７
     * コマンドライン引数で月（１～１２）を指定し、その月の日数をカレンダー形式で表示するプログラムを作成してください。
     * なお、２月の日数は２８日とし、何月であっても１日は日曜日とします。
     * 
     * プログラム名：Calender.java
     * 
     * ■コマンドライン引数　仕様
     * 表示する数値の上限値
     */

    public static void main(String args[]) {
        int month = Integer.parseInt(args[0]);

        if (month >= 1 && month <= 12) {
            System.out.println(month + "月カレンダー");
            System.out.println("日 月 火 水 木 金 土");

            int day;

            if (month == 2) {
                for (day = 1; day <= 28; day++) {
                     if (day < 10) {
                        if (day % 7 == 0) {
                            System.out.print(" " + day + "\n");
                        } else {
                            System.out.print(" " + day + " ");
                        }
                    }else {
                         if (day % 7 == 0) {
                            System.out.print(day + "\n");
                        } else {
                            System.out.print(day + " ");
                        }
                    }
                }
            } else if (month <= 7 && month % 2 == 1) {
                for (day = 1; day <= 31; day++) {
                     if (day < 10) {
                        if (day % 7 == 0) {
                            System.out.print(" " + day + "\n");
                        } else {
                            System.out.print(" " + day + " ");
                        }
                    }else {
                         if (day % 7 == 0) {
                            System.out.print(day + "\n");
                        } else {
                            System.out.print(day + " ");
                        }
                    }
                }
            } else {
                for (day = 1; day <= 30; day++) {
                    if (day < 10) {
                        if (day % 7 == 0) {
                            System.out.print(" " + day + "\n");
                        } else {
                            System.out.print(" " + day + " ");
                        }
                    } else {
                        if (day % 7 == 0) {
                            System.out.print(day + "\n");
                        } else {
                            System.out.print(day + " ");
                        }
                    }
            }
        }

    }
     
}
        
}
