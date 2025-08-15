package br.com.alura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class ConversorComImagem extends JFrame {

    private JComboBox<String> comboMoedas;
    private JTextField campoValor;
    private JLabel resultadoLabel;
    private CurrencyConverter converter = new CurrencyConverter();

    public ConversorComImagem() {
        setTitle("Conversor de Moedas");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel com imagem de fundo
        JPanel painel = new JPanel() {
            ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("/br/com/alura/resources/fundo.png"));
            Image background = backgroundIcon.getImage();

            {
                // Verifica se a imagem foi carregada corretamente
                URL url = getClass().getResource("/br/com/alura/resources/fundo.png");
                System.out.println("🔍 URL da imagem: " + url);

                if (backgroundIcon.getImageLoadStatus() != MediaTracker.COMPLETE || url == null) {
                    System.out.println("⚠️ Imagem não carregada corretamente.");
                } else {
                    System.out.println("✅ Imagem carregada com sucesso.");
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            }
        };
        painel.setLayout(null);

        JLabel titulo = new JLabel("Conversor de Moedas");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(130, 20, 300, 30);
        titulo.setOpaque(false);
        painel.add(titulo);

        comboMoedas = new JComboBox<>(new String[]{
            "USD para BRL", "BRL para USD", "EUR para BRL",
            "BRL para EUR", "USD para EUR", "EUR para USD"
        });
        comboMoedas.setBounds(150, 70, 200, 30);
        comboMoedas.setOpaque(false);
        painel.add(comboMoedas);

        campoValor = new JTextField();
        campoValor.setBounds(150, 120, 200, 30);
        campoValor.setBackground(new Color(255, 255, 255, 180)); // branco semi-transparente
        campoValor.setOpaque(true);
        painel.add(campoValor);

        JButton botaoConverter = new JButton("Converter");
        botaoConverter.setBounds(180, 170, 140, 30);
        botaoConverter.setContentAreaFilled(false);
        botaoConverter.setBorderPainted(true);
        botaoConverter.setForeground(Color.WHITE); // ✅ texto branco
        painel.add(botaoConverter);

        resultadoLabel = new JLabel("Valor convertido: ");
        resultadoLabel.setForeground(Color.WHITE);
        resultadoLabel.setBounds(150, 220, 300, 30);
        resultadoLabel.setOpaque(false);
        painel.add(resultadoLabel);

        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String opcao = (String) comboMoedas.getSelectedItem();
                    double valor = Double.parseDouble(campoValor.getText());
                    String[] moedas = opcao.split(" para ");
                    double resultado = converter.convert(moedas[0], moedas[1], valor);
                    resultadoLabel.setText(String.format("Valor convertido: %.2f %s", resultado, moedas[1]));
                } catch (IOException | NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao converter: " + ex.getMessage());
                }
            }
        });

        setContentPane(painel);
        revalidate();
        repaint();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ConversorComImagem());
    }
}