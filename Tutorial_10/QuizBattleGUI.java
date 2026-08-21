import javax.swing.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    // fields appropriate for this class
    private Questions question;

    private JLabel lblQuestion;
    private JLabel lblResult;

    private JButton btn1;
    private JButton btn2;

    public QuizBattleGUI() {
        // name appropriate title
        super("Programming Quiz Battle");

        // set the size, find out the suitable size
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // by default set to close method
        setLayout(null);

        question = new Questions("Which keyword creates an object?", "new", "class", "new");

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(30, 20, 320, 20);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(50, 60, 120, 40);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(200, 60, 120, 40);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(30, 110, 300, 30);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    // the main entry point to open the app, what is it?

    public static void main(String[] args) {
        new QuizBattleGUI().setVisible(true);
    }
}
