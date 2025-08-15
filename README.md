# 💱 Conversor de Moedas em Java

Este projeto é um conversor de moedas via console, desenvolvido em Java, que consome uma API de taxas de câmbio em tempo real.

## 🎯 Objetivo

Oferecer uma interface textual para conversão entre diferentes moedas, com taxas atualizadas dinamicamente via API.

## 🚀 Funcionalidades

- Menu com pelo menos 6 opções de conversão
- Taxas de câmbio obtidas em tempo real
- Interface interativa via terminal
- Estrutura modular com classes separadas

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Maven
- VS Code
- API de câmbio (ex: [ExchangeRate API](https://www.exchangerate-api.com/))

## 📦 Como Executar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="Main"
```

## 📁 Estrutura do Projeto

conversor-de-moedas/
├── src/
│ └── main/
│ └── java/
│ ├── Main.java
│ ├── ConversorComImagem.java
│ ├── CurrencyConverter.java
│ └── ExchangeRateService.java
├── pom.xml
├── README.md
└── .gitignore

## 👨‍💻 Autor

Diego Miranda Gregório – Brasília, Brasil
Projeto desenvolvido como desafio de aprendizado em Java.
