package org.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, String> nameDetails = new HashMap<>();
        nameDetails.put("name", "Vlad");
        nameDetails.put("lastName", "Tsukaliuk");

        Gson gson = new Gson();
        String json = gson.toJson(nameDetails);

        System.out.println(json);
    }
}
