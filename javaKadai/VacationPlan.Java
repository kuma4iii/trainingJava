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
        int num = 3;
        String vacation;
      if(num == 1){
        vacation = "春期休暇";
        System.out.println("次回の休暇予定：" + vacation);
      }else if(num == 2){
        vacation = "夏期休暇";
        System.out.println("次回の休暇予定：" + vacation);
      }else if(num == 3){
        vacation = "冬期休暇";
        System.out.println("次回の休暇予定：" + vacation);
      }else{
        vacation = "休暇予定はありません";
        System.out.println("次回の休暇予定：" + vacation);
      }
    }
  }