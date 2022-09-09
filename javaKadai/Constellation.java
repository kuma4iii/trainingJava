package javaKadai;

import java.util.Scanner;

class Constellation {
    /*総合１４
     * 誕生月と誕生日をキーボードから入力し、それらを元に星座を判定して表示するプログラムを
     * 作成してください。
     * 
     * プログラム名：Constellation.java
     */

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("誕生月を入力してください：");
        int month = sc.nextInt();
        

        Scanner sc2 = new Scanner(System.in);
        System.out.print("誕生日を入力してください：");
        int day = sc2.nextInt();

        String stella;

        if (month == 1) {
            if (day >= 1 && day <= 19) {
                stella = "山羊座";
            } else if (day >= 20 && day <= 31) {
                stella = "水瓶座";
            } else {
                stella = null;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 18) {
                stella = "水瓶座";
            } else if (day >= 19 && day <= 29) {
                stella = "魚座";
            } else {
                stella = null;
            }
        }else if (month == 3) {
            if (day >= 1 && day <= 20) {
                stella = "魚座";
            } else if (day >= 21 && day <= 31) {
                stella = "牡羊座";
            } else {
                stella = null;
            }
        }else if (month == 4) {
            if (day >= 1 && day <= 19) {
                stella = "牡羊座";
            } else if (day >= 20 && day <= 30) {
                stella = "牡牛座";
            } else {
                stella = null;
            }
        }else if (month == 5) {
            if (day >= 1 && day <= 20) {
                stella = "牡牛座";
            } else if (day >= 21 && day <= 31) {
                stella = "双子座";
            } else {
                stella = null;
            }
        }else if (month == 6) {
            if (day >= 1 && day <= 21) {
                stella = "双子座";
            } else if (day >= 22 && day <= 30) {
                stella = "蟹座";
            } else {
                stella = null;
            }
        }else if (month == 7) {
            if (day >= 1 && day <= 22) {
                stella = "蟹座";
            } else if (day >= 23 && day <= 31) {
                stella = "獅子座";
            } else {
                stella = null;
            }
        }else if (month == 8) {
            if (day >= 1 && day <= 22) {
                stella = "獅子座";
            } else if (day >= 23 && day <= 31) {
                stella = "乙女座";
            } else {
                stella = null;
            }
        }else if (month == 9) {
            if (day >= 1 && day <= 22) {
                stella = "乙女座";
            } else if (day >= 23 && day <= 30) {
                stella = "天秤座";
            } else {
                stella = null;
            }
        }else if (month == 10) {
            if (day >= 1 && day <= 23) {
                stella = "天秤座";
            } else if (day >= 24 && day <= 31) {
                stella = "蠍座";
            } else {
                stella = null;
            }
        }else if (month == 11) {
            if (day >= 1 && day <= 22) {
                stella = "蠍座";
            } else if (day >= 23 && day <= 30) {
                stella = "射手座";
            } else {
                stella = null;
            }
        }else if (month == 12) {
            if (day >= 1 && day <= 21) {
                stella = "射手座";
            } else if (day >= 22 && day <= 31) {
                stella = "山羊座";
            } else {
                stella = null;
            }
        } else {
            stella = null;
        }
        
        System.out.println("あなたの星座は" + stella + "です。");
    }
}
