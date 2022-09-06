package javaKadai;
class PointDay {
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
