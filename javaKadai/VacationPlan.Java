class VacationPlan {
    /*演習４－８
     * 休暇区分を格納する整数型変数に任意の数値を代入し、その値に応じて対応するメッセージを表示するプログラムを作成してください。
     * ▼１：春期休暇
     * ▼２：夏期休暇
     * ▼３：冬期休暇
     * ▼その他の数値：休暇の予定はありません
     * 
     * プログラム名：VacationPlan.java
     */
    public static void main(String args[]) {
        int num = 1;
        String[] vacation = {"春期休暇", "夏期休暇", "冬期休暇", "休暇予定はありません"};
      if(num == 1){
        System.out.println("次回の休暇予定：" + vacation[0]);
      }else if(num == 2){
        System.out.println("次回の休暇予定：" + vacation[1]);
      }else if(num == 3){
        System.out.println("次回の休暇予定：" + vacation[2]);
      }else{
        System.out.println("次回の休暇予定：" + vacation[3]);
      }
    }
  }