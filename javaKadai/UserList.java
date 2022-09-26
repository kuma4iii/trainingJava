package javaKadai;

//import java.sql.Date;

public class UserList {
    public int id;

    public String last_name;

    public String first_name;

    private int gender;

    public String birth_date;

    public String address;

    UserList() {
        // NOP
    }

    UserList(int id, String last_name, String first_name, int gender, String birth_date, String address) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
