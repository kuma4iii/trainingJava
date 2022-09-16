package javaKadai;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Bingo {
    /*総合１７
     *ビンゴゲームを作成してください。
     *カードは５×５をランダムで作成し、真ん中は最初から開けておきます。
     *（Bの列は1～15、Iの列は16～30、Nの列は31～45、Gの列は46～60、Oの列は61～75を
     *それぞれランダムで入れてください。）
     *Enterキーを押すたびに、1～75までの数字をランダムで出し、当たれば「Hit」、
     *外れれば「Deviate」を表示させ、現在のカードを表示させてください。
     *縦横斜めのいずれかが一列開いた場合、BINGOとなりゲーム終了とします。
     *あと1つでBINGOとなる場合をリーチとし、リーチの数も表示させてください。
     * 
     * 
     * プログラム名：Bingo.java
     */

    private static void outputBingoSheet(List<Integer> bLine, List<Integer> iLine, List<Integer> nLine,
            List<Integer> gLine, List<Integer> oLine) {
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

    private static List<Integer> getLine(int min, int max) {
        List<Integer> randomNewList = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            randomNewList.add(i);
        }
        Collections.shuffle(randomNewList);

        List<Integer> line = randomNewList.subList(0, 5); 

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
    
    private static boolean bingoJudge(List<Integer> line) {
        boolean bingoFlg = false;
        for (int lineNum : line) {
            if (lineNum == 99) {
                bingoFlg = true;
            } else {
                bingoFlg = false;
                break;
            }
        }
        return bingoFlg;
    }


    public static void main(String args[]) {
        //Ｂ
        List<Integer> bLine = getLine(1, 15);

        //I
        List<Integer> iLine = getLine(16, 30);

        //Ｎ
        List<Integer> nLine = getLine(31, 45);
        nLine.set(2, 99);

        //Ｇ
        List<Integer> gLine = getLine(46, 60);

        //Ｏ
        List<Integer> oLine = getLine(61, 75);

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

            System.out.println("出た数字：" + num + bingo);

            //数字があるか判定
            boolean numFlg = false;
            for (int i = 0; i < bLine.size(); i++) {
                if (num == bLine.get(i)) {
                    bLine.set(i, 99);
                    numFlg = true;
                }
            }

            for (int i = 0; i < iLine.size(); i++) {
                if (num == iLine.get(i)) {
                    iLine.set(i, 99);
                    numFlg = true;
                }
            }

            for (int i = 0; i < nLine.size(); i++) {
                if (num == nLine.get(i)) {
                    nLine.set(i, 99);
                    numFlg = true;
                }
            }

            for (int i = 0; i < gLine.size(); i++) {
                if (num == gLine.get(i)) {
                    gLine.set(i, 99);
                    numFlg = true;
                }
            }

            for (int i = 0; i < oLine.size(); i++) {
                if (num == oLine.get(i)) {
                    oLine.set(i, 99);
                    numFlg = true;

                }
            }

            if (numFlg == true) {
                System.out.println("Hit");
            } else {
                System.out.println("Deviate");
            }

            //シート再表示
            outputBingoSheet(bLine, iLine, nLine, gLine, oLine);

            //横列リスト
            List<Integer> row1 = new ArrayList<Integer>();
            row1.add(bLine.get(0));
            row1.add(iLine.get(0));
            row1.add(nLine.get(0));
            row1.add(gLine.get(0));
            row1.add(oLine.get(0));

            List<Integer> row2 = new ArrayList<Integer>();
            row2.add(bLine.get(1));
            row2.add(iLine.get(1));
            row2.add(nLine.get(1));
            row2.add(gLine.get(1));
            row2.add(oLine.get(1));

            List<Integer> row3 = new ArrayList<Integer>();
            row3.add(bLine.get(2));
            row3.add(iLine.get(2));
            row3.add(nLine.get(2));
            row3.add(gLine.get(2));
            row3.add(oLine.get(2));

            List<Integer> row4 = new ArrayList<Integer>();
            row4.add(bLine.get(3));
            row4.add(iLine.get(3));
            row4.add(nLine.get(3));
            row4.add(gLine.get(3));
            row4.add(oLine.get(3));

            List<Integer> row5 = new ArrayList<Integer>();
            row5.add(bLine.get(4));
            row5.add(iLine.get(4));
            row5.add(nLine.get(4));
            row5.add(gLine.get(4));
            row5.add(oLine.get(4));

            //斜め列リスト
            List<Integer> clossL = new ArrayList<Integer>();
            clossL.add(bLine.get(0));
            clossL.add(iLine.get(1));
            clossL.add(nLine.get(2));
            clossL.add(gLine.get(3));
            clossL.add(oLine.get(4));

            List<Integer> clossR = new ArrayList<Integer>();
            clossR.add(bLine.get(4));
            clossR.add(iLine.get(3));
            clossR.add(nLine.get(2));
            clossR.add(gLine.get(1));
            clossR.add(oLine.get(0));

            //ビンゴ判定
            boolean clearFlg = false;
            if (bingoJudge(bLine) == true) {
                clearFlg = true;
            } else if (bingoJudge(iLine) == true) {
                clearFlg = true;
            } else if (bingoJudge(nLine) == true) {
                clearFlg = true;
            } else if (bingoJudge(gLine) == true) {
                clearFlg = true;
            } else if (bingoJudge(oLine) == true) {
                clearFlg = true;
            } else if (bingoJudge(row1) == true) {
                clearFlg = true;
            } else if (bingoJudge(row2) == true) {
                clearFlg = true;
            } else if (bingoJudge(row3) == true) {
                clearFlg = true;
            } else if (bingoJudge(row4) == true) {
                clearFlg = true;
            } else if (bingoJudge(row5) == true) {
                clearFlg = true;
            } else if (bingoJudge(clossL) == true) {
                clearFlg = true;
            } else if (bingoJudge(clossR) == true) {
                clearFlg = true;
            } else {
                continue;
            }

            if (clearFlg == true) {
                System.out.println("congratulations!!");
                break;
            }

            sc.close();
        }

        
    }
    
    
    
}
