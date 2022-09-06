class VacationPlan {
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