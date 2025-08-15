package br.com.alura;

import java.io.IOException;

public class CurrencyConverter {
    private ExchangeRateService service = new ExchangeRateService();

    public double convert(String from, String to, double amount) throws IOException {
        double rate = service.getExchangeRate(from, to);
        return amount * rate;
    }
}