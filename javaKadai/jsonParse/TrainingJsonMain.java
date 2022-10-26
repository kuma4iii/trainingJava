package javaKadai.jsonParse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class TrainingJsonMain {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonMapping jsonMapping = mapper.readValue(new File("trainingJsonParse.json"),JsonMapping.class);

            System.out.println("property:");
            System.out.println(" getTime:" + jsonMapping.property.getGetTime() + " region:" + jsonMapping.property.getRegion());
            System.out.println("result:");
            System.out.println(" userList:");
            for(UserList user: jsonMapping.result.getUserList()){
                System.out.println("  id:" + user.getId() + " lastName:" + user.getLastName() + " firstName:" + user.getFirstName() + " gender:" + user.getGender() + " BirthDate:" + user.getBirthDate() + " Address:" + user.getAddress());
            }
            System.out.println(" weather:");
            for(Weather wea: jsonMapping.result.getWeather()){
                System.out.println("  place:" + wea.getPlace() + " weatherName:" +  wea.getWeatherName() + " rainyPercent:" + wea.getRainyPercent());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

@JsonIgnoreProperties(ignoreUnknown=true)
class JsonMapping {
    public Property property;
    public Result result;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
@JsonIgnoreProperties(ignoreUnknown=true)
class Property{
    public String getTime;
    public String region;

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
@JsonIgnoreProperties(ignoreUnknown=true)
class Result{
    public List<UserList> userList;
    public List<Weather> weather;

    public List<UserList> getUserList() {
        return userList;
    }

    public void setUserList(List<UserList> userList) {
        this.userList = userList;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
@JsonIgnoreProperties(ignoreUnknown=true)
class UserList{
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
@JsonIgnoreProperties(ignoreUnknown=true)
class Weather{
    public String place;
    public String weatherName;
    public int rainyPercent;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWeatherName() {
        return weatherName;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    public int getRainyPercent() {
        return rainyPercent;
    }

    public void setRainyPercent(int rainyPercent) {
        this.rainyPercent = rainyPercent;
    }
}