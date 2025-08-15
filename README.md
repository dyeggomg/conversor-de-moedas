# 💱 Conversor de Moedas em Java

Um projeto de console em Java que realiza conversões entre moedas utilizando taxas de câmbio em tempo real via API.

---

## 🎯 Objetivo

Oferecer uma interface interativa no terminal para conversão entre diferentes moedas, com dados atualizados dinamicamente.

---

## 🚀 Funcionalidades

- ✅ Menu com pelo menos 6 opções de conversão
- 🔄 Taxas de câmbio obtidas em tempo real via API
- 🖥️ Interface amigável via terminal
- 🧩 Estrutura modular com classes separadas

---

## 🛠️ Tecnologias Utilizadas

- ☕ Java 17+
- 📦 Maven
- 🧑‍💻 VS Code
- 🌐 API de câmbio ([ExchangeRate API](https://www.exchangerate-api.com/))

---

## 📦 Como Executar

No terminal, dentro da pasta do projeto:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="br.com.alura.Main"

---
## 📁 Estrutura do Projeto

conversor-de-moedas/
├── src/
│   └── main/
│       └── java/
│           └── br/
│               └── com/
│                   └── alura/
│                       ├── Main.java
│                       ├── ConversorComImagem.java
│                       ├── CurrencyConverter.java
│                       └── ExchangeRateService.java
├── pom.xml
├── README.md
└── .gitignore

---

## 👨‍💻 Autor

Diego Miranda Gregório – Brasília, Brasil Projeto desenvolvido como desafio de aprendizado em Java.
```

---
