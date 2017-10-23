package swing;

import ciphers.CIPHER;
import ciphers.Converter;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private final static Converter converter = new Converter();
    private final static DefaultListModel<String> l1 = new DefaultListModel<>();

    private JButton decipherButton = new JButton("(De)cipher");
    private JButton appInfoButton = new JButton("App info");
    private JList<String> ciphersList = new JList<>(l1);
    private JTextField textFieldToDecipher = new JTextField();

    public MainFrame(String title) {
        super(title);

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel topPanel = new JPanel();
        GridLayout topPanelGrid = new GridLayout(1, 1);
        JPanel listPanel = new JPanel();
        GridLayout listPanelGrid = new GridLayout(1, 1);
        JPanel buttonsPanel = new JPanel();
        GridLayout buttonsPanelGrid = new GridLayout(1, 2);

        topPanel.setLayout(topPanelGrid);
        listPanel.setLayout(listPanelGrid);
        buttonsPanel.setLayout(buttonsPanelGrid);
        l1.addElement("GADERYPOLUKI");
        l1.addElement("POLITYKARENU");
        l1.addElement("KONIECMATURY");

        decipherButton.setPreferredSize(new Dimension(100, 30));
        appInfoButton.setPreferredSize(new Dimension(100, 30));
        textFieldToDecipher.setPreferredSize(new Dimension(200, 30));
        topPanel.add(textFieldToDecipher);
        listPanel.add(ciphersList);
        buttonsPanel.add(decipherButton);
        buttonsPanel.add(appInfoButton);

        this.add(topPanel);
        this.add(listPanel);
        this.add(buttonsPanel);

        decipherButton.addActionListener((e) -> {

                try {
                    if (getSelectedCipher() != null && textFieldToDecipher.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(MainFrame.this, "Please enter your text");
                    } else {
                        JOptionPane.showMessageDialog(MainFrame.this, "Result: " +
                                converter.decipher(textFieldToDecipher.getText(), getSelectedCipher()));
                    }
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(MainFrame.this, "Please enter your text");
                }
            }
        );

        appInfoButton.addActionListener((e) -> {
                    JOptionPane.showMessageDialog(MainFrame.this, "Application ciphers/deciphers " +
                            "letters only.\nVersion 1.0\nBy Filip Bielicki");
                }
        );

        this.setResizable(false);
        this.setSize(300, 180);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private CIPHER getSelectedCipher() {

        String selectedCipher = ciphersList.getSelectedValue();
        CIPHER assignedCipher = null;

        switch (selectedCipher) {
            case "GADERYPOLUKI":
                assignedCipher = CIPHER.GADERYPOLUKI;
                break;
            case "POLITYKARENU":
                assignedCipher = CIPHER.POLITYKARENU;
                break;
            case "KONIECMATURY":
                assignedCipher = CIPHER.KONIECMATURY;
                break;
        }
        return assignedCipher;
    }
}
