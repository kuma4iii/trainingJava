class VacationPlan {
    public static String main(int num) {
        String vacation;
      if(num == 1){
        vacation = "春期休暇";
      }else if(num == 2){
        vacation = "夏期休暇";
      }else if(num == 3){
        vacation = "冬期休暇";
      }else{
        vacation = "休暇予定はありません";
      }

      System.out.println("次回の休暇予定：" + vacation);
    }
  }