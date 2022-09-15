package javaKadai;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Bingo {
    /*総合１７
     *ビンゴゲームを作成してください。
     *カードは５×５をランダムで作成し、真ん中は最初から開けておきます。
     *（Bの列は1～15、Iの列は16～30、Nの列は31～45、Gの列は46～60、Oの列は61～75を
     *それぞれランダムで入れてください。）
     *Enterキーを押すたぼに、1～75までの数字をランダムで出し、当たれば「Hit」、
     *外れれば「Deviate」を表示させ、現在のカードを表示させてください。
     *縦横斜めのいずれかが一列開いた場合、BINGOとなりゲーム終了とします。
     *あと1つでBINGOとなる場合をリーチとし、リーチの数も表示させてください。
     * 
     * 
     * プログラム名：Bingo.java
     */

    private static void outputBingoSheet(ArrayList<Integer> bLine, ArrayList<Integer> iLine, ArrayList<Integer> nLine,
            ArrayList<Integer> gLine, ArrayList<Integer> oLine) {
        //ビンゴシート生成
        String line = "----------------";
        String bingo = "|Ｂ|Ｉ|Ｎ|Ｇ|Ｏ|";
        System.out.println(line);
        System.out.println(bingo);
        System.out.println(line);

        for (int i = 0; i < 5; i++) {
            System.out.println("|" + getSquare(bLine.get(i)) + "|" + getSquare(iLine.get(i)) + "|" + getSquare(nLine.get(i)) + "|" + getSquare(gLine.get(i)) + "|"
                    + getSquare(oLine.get(i)) + "|");
            System.out.println(line);
        }
    } 

    private static ArrayList<Integer> getLine(int min, int max) {
        ArrayList<Integer> randomNewList = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            randomNewList.add(i);
        }
        Collections.shuffle(randomNewList);

        ArrayList<Integer> line = new ArrayList<Integer>();
        line.add(randomNewList.get(0));
        line.add(randomNewList.get(1));
        line.add(randomNewList.get(2));
        line.add(randomNewList.get(3));
        line.add(randomNewList.get(4));

        return line;
    }

    private static String getSquare(int num) {
        if (num == 99) {
            return " ■";
        } else {
            String space = String.valueOf(num);
            if (space.length() == 1) {
                space = space + " ";
            }
            return space;
        }
    }
    
    private static boolean bingoJudge(ArrayList<Integer> line) {
        ArrayList<Integer> judge = new ArrayList<Integer>();
        judge.add(99);
        judge.add(99);
        judge.add(99);
        judge.add(99);
        judge.add(99);

        boolean bingoFlg = judge.equals(line);
        return bingoFlg;
    }


    public static void main(String args[]) {
        //Ｂ
        ArrayList<Integer> bLine = getLine(1, 15);

        //I
        ArrayList<Integer> iLine = getLine(16, 30);

        //Ｎ
        ArrayList<Integer> nLine = getLine(31, 45);
        nLine.set(2, 99);

        //Ｇ
        ArrayList<Integer> gLine = getLine(46, 60);

        //Ｏ
        ArrayList<Integer> oLine = getLine(61, 75);

        //初期BINGOシート生成
        outputBingoSheet(bLine, iLine, nLine,
                gLine, oLine);

        //乱数生成
        ArrayList<Integer> gacha = new ArrayList<Integer>();
        for (int i = 1; i <= 75; i++) {
            gacha.add(i);
        }
        Collections.shuffle(gacha);

        //ビンゴ開始
        for (int num : gacha) {
            Scanner sc = new Scanner(System.in);

            String bingo = sc.nextLine();

            System.out.println("出た数字：" + num);

            //数字があるか判定
            boolean numFlg = false;
            for (int i = 0; i < bLine.size(); i++) {
                if (num == bLine.get(i)) {
                    bLine.set(i, 99);
                    System.out.println("Hit");
                    numFlg = true;
                } 
            }

            for (int i = 0; i < iLine.size(); i++) {
                if (num == iLine.get(i)) {
                    iLine.set(i, 99);
                    System.out.println("Hit");
                    numFlg = true;
                } 
            }

            for (int i = 0; i < nLine.size(); i++) {
                if (num == nLine.get(i)) {
                    nLine.set(i, 99);
                    System.out.println("Hit");
                    numFlg = true;
                } 
            }

            for (int i = 0; i < gLine.size(); i++) {
                if (num == gLine.get(i)) {
                    gLine.set(i, 99);
                    System.out.println("Hit");
                    numFlg = true;
                } 
            }

            for (int i = 0; i < oLine.size(); i++) {
                if (num == oLine.get(i)) {
                    oLine.set(i, 99);
                    System.out.println("Hit");
                    numFlg = true;

                } 
            }

            if (numFlg == false) {
                System.out.println("Deviate");
            }

            //シート再表示
            outputBingoSheet(bLine, iLine, nLine, gLine, oLine);

            //横列リスト
            ArrayList<Integer> row1 = new ArrayList<Integer>();
            row1.add(bLine.get(0));
            row1.add(iLine.get(0));
            row1.add(nLine.get(0));
            row1.add(gLine.get(0));
            row1.add(oLine.get(0));

            ArrayList<Integer> row2 = new ArrayList<Integer>();
            row2.add(bLine.get(1));
            row2.add(iLine.get(1));
            row2.add(nLine.get(1));
            row2.add(gLine.get(1));
            row2.add(oLine.get(1));

            ArrayList<Integer> row3 = new ArrayList<Integer>();
            row3.add(bLine.get(2));
            row3.add(iLine.get(2));
            row3.add(nLine.get(2));
            row3.add(gLine.get(2));
            row3.add(oLine.get(2));

            ArrayList<Integer> row4 = new ArrayList<Integer>();
            row4.add(bLine.get(3));
            row4.add(iLine.get(3));
            row4.add(nLine.get(3));
            row4.add(gLine.get(3));
            row4.add(oLine.get(3));

            ArrayList<Integer> row5 = new ArrayList<Integer>();
            row5.add(bLine.get(4));
            row5.add(iLine.get(4));
            row5.add(nLine.get(4));
            row5.add(gLine.get(4));
            row5.add(oLine.get(4));
            
            //斜め列リスト
            ArrayList<Integer> clossL = new ArrayList<Integer>();
            clossL.add(bLine.get(0));
            clossL.add(iLine.get(1));
            clossL.add(nLine.get(2));
            clossL.add(gLine.get(3));
            clossL.add(oLine.get(4));

            ArrayList<Integer> clossR = new ArrayList<Integer>();
            clossR.add(bLine.get(4));
            clossR.add(iLine.get(3));
            clossR.add(nLine.get(2));
            clossR.add(gLine.get(1));
            clossR.add(oLine.get(0));

            //ビンゴ判定
            if (bingoJudge(bLine) == true) {
                System.out.println("congratulations!!");
                break;
            } else if (bingoJudge(iLine) == true) {
                System.out.println("congratulations!!");
                break;
            } else if (bingoJudge(nLine) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(gLine) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(oLine) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(row1) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(row2) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(row3) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(row4) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(row5) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(clossL) == true) {
                System.out.println("congratulations!!");
                break;
            }else if (bingoJudge(clossR) == true) {
                System.out.println("congratulations!!");
                break;
            } else {
                continue;
            }

        }

    }
    
    
    
}
