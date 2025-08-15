package br.com.alura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {
    private static final String API_KEY = "f130c2aee79962c8bc31c5be";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double getExchangeRate(String fromCurrency, String toCurrency) throws IOException {
        URL url = new URL(BASE_URL + fromCurrency);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();
        reader.close();

        return json.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
    }
}
