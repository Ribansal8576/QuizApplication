
package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton Start , back;
    
    Rules(String name)
    {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel heading = new JLabel(" welcome " +name + " in mind game");
         heading.setBounds(50,20,700,28);
         heading.setFont(new Font("Vinew Hand ITC" , Font.BOLD , 28));
         heading.setForeground(new Color(30,144,254));
         add(heading);
         
         JLabel rules = new JLabel();
         rules.setBounds(20 ,90,700 ,350 );
         rules.setFont(new Font("Tahoma" , Font.BOLD , 16));
         rules.setText(
         
          "<html>"+ 
                "1. Welcome to the Quiz Application!" + "<br><br>" +
                "2.  Number of Questions: Each participant will receive 10 questions." + "<br><br>" +
                "3. Scoring: You will earn points for each correct answer." + "<br><br>" +
                "4. Correct Answer Points: Each correct answer is worth 10 points. " + "<br><br>" +
                "5. No Negative Marking: There is no penalty for wrong answers. You won't lose points for incorrect responses." + "<br><br>" +
                "6. Time Limit: You have a limited time to answer each question." + "<br><br>" +
                "7. Automatic Question Advancement: Questions will automatically advance to the next after 15 sec " + "<br><br>" +
                "8. Skipping Questions: You can choose to next questions without penalties." + "<br><br>" +
                "9. Final Score: Your total score will be displayed at the end of the quiz." + "<br><br>" +
            "<html>"
         );
         
           Start = new JButton("Start");
         Start.setBounds(400,500 ,100 ,30);
          Start.setBackground(new Color(30 ,144 ,254));
          Start.addActionListener(this);
         add(Start);
         
           back = new JButton("Back");
         back.setBounds(250 ,500 ,100 ,30);
          back.setBackground(new Color(30 ,144 ,254));
          back.addActionListener(this);
         add(back);
         
         add(rules);
         
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == Start)
       {
           setVisible(false);
           
           
       }
       else
       {
           setVisible(false);
           new Login();
       }
    }
    
    public static void main(String[] args) {
      new Rules("user");
    }

   
    
}
