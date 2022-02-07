import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pack.EncryptionAlgorithms.CaesarCipher;
import pack.EncryptionAlgorithms.XOR;
import pack.EncryptionAlgorithms.GFG;

public class EncryptGui extends JFrame {

    private JPanel panel;
    private JTextField keyText;
    private JLabel label1;
    private JTextField cipheredText;
    private JTextField plainText;
    private JLabel label2;
    private JButton encButton;
    private JButton decButton;
    private JComboBox algoBox;


    public EncryptGui(String title) {
        super(title);
        algoBox.setModel(new DefaultComboBoxModel<>(new String[]{"CaesarCipher", "XOR", "GFG" }));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();

        encButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==encButton) {
                    System.out.println("Enc");
                    switch (algoBox.getSelectedIndex()) {
                        case 0:
                            cipheredText.setText(CaesarCipher.encrypt(plainText.getText(), Integer.parseInt(keyText.getText())));
                            break;
                        case 1:
                            cipheredText.setText(XOR.encryptDecrypt(plainText.getText(), keyText.getText()));
                            break;
                        case 2:
                            cipheredText.setText(GFG.decode(plainText.getText()));
                            break;
                    }
                }

            }
        });

        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==decButton) {
                    System.out.println("Dec");
                    switch (algoBox.getSelectedIndex()) {
                        case 0:
                            cipheredText.setText(CaesarCipher.encrypt(plainText.getText(), Integer.parseInt(keyText.getText())));
                            break;
                        case 1:
                            cipheredText.setText(XOR.encryptDecrypt(plainText.getText(), keyText.getText()));
                            break;
                        case 2:
                            cipheredText.setText("GFG can not be decrypted");
                            break;
                    }
                }

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new EncryptGui("Encryption Gui");
        frame.setVisible(true);
    }



}
