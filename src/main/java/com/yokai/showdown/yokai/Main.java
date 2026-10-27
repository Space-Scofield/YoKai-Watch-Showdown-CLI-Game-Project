package com.yokai.showdown.yokai;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class Main {
public static void main(String[] args) {
    Gson gson = new Gson();

    try (Reader reader = new InputStreamReader(
            Main.class.getResourceAsStream("/Ability.json"),
            StandardCharsets.UTF_8)) {

        Map<String, Ability> habilidades =
            gson.fromJson(reader,
                new TypeToken<Map<String, Ability>>() {}.getType());

        habilidades.forEach((name, habilidad) ->
            System.out.println(name + " -> " + habilidad)
        );

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}