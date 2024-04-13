package org.higgs.model.service;

import com.google.gson.Gson;
import org.higgs.model.PlayerData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class PlayerService {
    public static List<PlayerData.Hole> getProgress(int playerId) throws IOException {
        URL url = new URL("https://www.masters.com/en_US/scores/feeds/2024/track/" + playerId + ".json");

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET (default value is GET)
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        // Read the response from the server
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        Gson gson = new Gson();
        PlayerData data = gson.fromJson(response.toString(), PlayerData.class);

        List<PlayerData.Hole> progress = data.getProgress();
        return progress;
    }
}
