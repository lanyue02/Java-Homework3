package ChatGPT; 

import java.awt.*;
import java.awt.event.*;

public class WindowExample {
    public static void main(String[] args) {

        Frame frame = new Frame("Java 視窗範例");

        Label label = new Label("歡迎使用 Java！");
        Button button = new Button("按我");

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(button);

        // 按鈕事件
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("你按下了按鈕！");
            }
        });

        frame.setSize(300, 150);
        frame.setVisible(true);

        // 關閉視窗事件
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
