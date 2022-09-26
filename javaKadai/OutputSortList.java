package javaKadai;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;

public class OutputSortList {
        public static void main(String args[]) {

                List<UserList> userList = new ArrayList<UserList>();

                UserList user = new UserList();
                user.setId(1);
                user.setLastName("田中");
                user.setFirstName("太郎");
                user.setGender(1);
                user.setBirthDate("1999 - 01 - 01");
                user.setAddress("東京都");
                userList.add(user);

                user = new UserList(
                                2,
                                "佐藤",
                                "花子",
                                2,
                                "1995 - 01 - 01",
                                "埼玉県");
                userList.add(user);

                user = new UserList(
                                3,
                                "伊藤",
                                "二郎",
                                1,
                                "1997 - 01 - 01",
                                "北海道");
                userList.add(user);

                user = new UserList(
                                4,
                                "山田",
                                "優子",
                                3,
                                "1989 - 01 - 01",
                                "千葉県");
                userList.add(user);

                user = new UserList(
                                5,
                                "山田",
                                "一郎",
                                1,
                                "1999 - 01 - 01",
                                "東京都");
                userList.add(user);

                Comparator<UserList> comparator = new Comparator<UserList>() {

                        @Override
                        public int compare(UserList O1, UserList O2) {
                                Date now = new Date();

                                int o1 = calcAge(O1.birth_date, now);
                                int o2 = calcAge(O2.birth_date, now);
                                Integer judgement = Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
                                return judgement;

                        }
                };
                Collections.sort(userList, comparator);

                for (UserList member : userList) {
                        System.out.println(
                                        "id:" + member.getId());
                        System.out.println(
                                        "last_name:" + member.getLastName());
                        System.out.println(
                                        "first_name:" + member.getFirstName());
                        System.out.println(
                                        "gender:" + member.getGender());
                        System.out.println(
                                        "birth_date:" + member.getBirthDate());
                        System.out.println(
                                        "address:" + member.getAddress());
                        System.out.print("\n");
                }

        }

        public static int calcAge(String birth_date, Date now) {
                String strDate;
                Date birthD;
                int age = 0;
                // ここでtry-catchをしないとparseでエラーになる

                strDate = birth_date;
                try {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd");
                        birthD = sdf.parse(strDate);

                        // Calendar型のインスタンス生成
                        Calendar calendarBirth = Calendar.getInstance();
                        Calendar calendarNow = Calendar.getInstance();

                        // Date型をCalendar型に変換する
                        calendarBirth.setTime(birthD);
                        calendarNow.setTime(now);

                        // （現在年ー生まれ年）で年齢の計算
                        age = calendarNow.get(Calendar.YEAR) - calendarBirth.get(Calendar.YEAR);
                        // 誕生月を迎えていなければ年齢-1
                        if (calendarNow.get(Calendar.MONTH) < calendarBirth.get(Calendar.MONTH)) {
                                age -= 1;
                        } else if (calendarNow.get(Calendar.MONTH) == calendarBirth.get(Calendar.MONTH)) {
                                // 誕生月は迎えているが、誕生日を迎えていなければ年齢−１
                                if (calendarNow.get(Calendar.DATE) < calendarBirth.get(Calendar.DATE)) {
                                        age -= 1;
                                }

                        }
                } catch (ParseException e) {
                        System.out.println(e);
                        // NOP
                }
                // try-catchを入れるとreturnできない
                return age;
        }

}
