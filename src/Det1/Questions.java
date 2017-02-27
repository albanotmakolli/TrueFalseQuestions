package Det1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by VALA on 2/24/2017.
 */
public class Questions extends JFrame{
    QandA obj = new QandA();
    int i = 0;

    JButton right = new AnswerButton("E Saktë");
    JButton wrong = new AnswerButton("Gabim");
    JLabel count = new JLabel("Keni edhe " + (obj.questions.size()-(i+1)) + " pyetje të mbetura");

    JLabel[] questions = new JLabel[obj.questions.size()];
    JLabel[] answers = new JLabel[obj.questions.size()];
    JLabel[] rez = new JLabel[obj.questions.size()];

    JLabel ju = new JLabel("Përgjigjet tuaja:");

    public void question() {
        for (int j = 0; j < obj.questions.size(); j++) {
            questions[j] = new JLabel("" + obj.questions.get(j));
            answers[j] = new JLabel("" + obj.answers.get(j));
        }
    }

    public void colors() {

        if(rez[i].getText().equals(answers[i].getText())) {
            rez[i].setForeground(Color.GREEN);
        }
        else {
            rez[i].setForeground(Color.RED);
        }
    }

    public void play() {
        JFrame frame = new JFrame("Pyetjet");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(3,1));

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new FlowLayout());
        panel.add(questions[i]);
        frame.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(new FlowLayout());
        panel2.add(right);
        panel2.add(wrong);
        frame.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(new FlowLayout());
        panel3.add(count);
        frame.add(panel3);
        frame.setSize(700,150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        right.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rez[i] = new JLabel("E Saktë", SwingConstants.CENTER);
                colors();
                panel.remove(questions[i]);
                i++;

                panel.add(questions[i]);

                panel.repaint();
                count.setText("Keni edhe " + (obj.questions.size()-(i+1)) + " pyetje të mbetura");
                if (i==obj.questions.size()-1) {
                    rez[i] = new JLabel("E Saktë",SwingConstants.CENTER);
                    colors();
                    frame.getContentPane().removeAll();
                    frame.getContentPane().setLayout(new BorderLayout());
                    panel2.removeAll();
                    panel2.setLayout(new FlowLayout());
                    panel3.removeAll();
                    panel3.setLayout(new GridLayout(21,2));
                    for (int j = 0; j < obj.questions.size(); j++) {
                        panel2.add(ju);
                        panel3.add(questions[j]);
                        panel3.add(rez[j]);
                    }
                    frame.add(panel2, BorderLayout.NORTH);
                    frame.add(panel3,BorderLayout.CENTER);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.repaint();
                }
            }
        });

        wrong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rez[i] = new JLabel("Gabim",SwingConstants.CENTER);
                colors();
                panel.remove(questions[i]);
                i++;
                panel.add(questions[i]);
                panel.repaint();
                count.setText("Keni edhe " + (obj.questions.size()-(i+1)) + " pyetje të mbetura");
                if (i==obj.questions.size()-1) {
                    rez[i] = new JLabel("Gabim",SwingConstants.CENTER);
                    colors();
                    frame.getContentPane().removeAll();
                    frame.getContentPane().setLayout(new BorderLayout());
                    panel2.removeAll();
                    panel2.setLayout(new FlowLayout());
                    panel3.removeAll();
                    panel3.setLayout(new GridLayout(21,2));
                    for (int j = 0; j < obj.questions.size(); j++) {
                        panel2.add(ju);
                        panel3.add(questions[j]);

                        panel3.add(rez[j]);
                    }
                    frame.add(panel2,BorderLayout.NORTH);
                    frame.add(panel3,BorderLayout.CENTER);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.repaint();
                }
            }
        });
    }
    public static void main(String[] args) {
        Questions q = new Questions();
        q.question();
        q.play();
    }
}
