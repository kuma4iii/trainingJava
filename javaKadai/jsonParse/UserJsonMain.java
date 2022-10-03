package javaKadai.jsonParse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javaKadai.UserList;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.spec.ECParameterSpec;

public class UserJsonMain {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        UserList userList = mapper.readValue(new File("userList.json"), UserList.class);

        System.out.println(userList);

    }

}
