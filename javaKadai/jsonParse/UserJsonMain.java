package javaKadai.jsonParse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractAction;

public class UserJsonMain {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            ParseJson parseJson = mapper.readValue(new File("userList.json"), ParseJson.class);

            for (User user : parseJson.getUserListJson2()) {
                System.out.println("ID：" + user.getId() + " " + user.getLastName() + user.getFirstName() +
                        " 性別：" + user.getGender() + " 誕生日：" + user.getBirthDate() + " 住所：" + user.getAddress());
            }

        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }

    }

}

class ParseJson {

    public List<User> userListJson1;
    public List<User> userListJson2;

    public List<User> getUserListJson1() {
        return userListJson1;
    }

    public void setUserListJson1(List<User> userListJson1) {
        this.userListJson1 = userListJson1;
    }

    public List<User> getUserListJson2() {
        return userListJson2;
    }

    public void setUserListJson2(List<User> userListJson2) {
        this.userListJson2 = userListJson2;
    }

}

class User {
    public int id;

    public String lastName;

    public String firstName;

    public int gender;

    public String birthDate;

    public String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
