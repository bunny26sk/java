import javax.swing.*;
import java.awt.*;
import java.io.*;
 
public class SwingFileApp extends JFrame {
    JTextArea area;
 
    SwingFileApp() {
        setTitle("File Read and Write");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        area = new JTextArea();
        JButton write = new JButton("Write to File");
        JButton read = new JButton("Read from File");
 
        JPanel panel = new JPanel();
        panel.add(write);
        panel.add(read);
 
        add(new JScrollPane(area), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
 
        write.addActionListener(e -> {
            try (FileWriter fw = new FileWriter("sample.txt")) {
                fw.write(area.getText());
                JOptionPane.showMessageDialog(this, "File saved");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Write error");
            }
        });
 
        read.addActionListener(e -> {
            try (BufferedReader br =
                    new BufferedReader(new FileReader("sample.txt"))) {
                String line;
                String text = "";
                while ((line = br.readLine()) != null) {
                    text += line + "\n";
                }
                area.setText(text);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "File not found. Write text first.");
            }
        });
 
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new SwingFileApp();
    }
}
