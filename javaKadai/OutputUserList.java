package javaKadai;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class OutputUserList {
        public static void main(String args[]) {

                List<UserList> userList = new ArrayList<UserList>();

                UserList user = new UserList();
                user.setId(1);
                user.setLastName("田中");
                user.setFirstName("太郎");
                user.setGender(1);
                user.setBirthDate("1999-01-01");
                user.setAddress("東京都");
                userList.add(user);

                user = new UserList(
                                2,
                                "佐藤",
                                "花子",
                                2,
                                "1995-01-01",
                                "埼玉県");
                userList.add(user);

                user = new UserList(
                                3,
                                "伊藤",
                                "二郎",
                                1,
                                "1997-01-01",
                                "北海道");
                userList.add(user);

                user = new UserList(
                                4,
                                "山田",
                                "優子",
                                3,
                                "1989-01-01",
                                "千葉県");
                userList.add(user);

                user = new UserList(
                                5,
                                "山田",
                                "一郎",
                                1,
                                "1999-01-01",
                                "東京都");
                userList.add(user);

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
}