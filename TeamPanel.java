import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JPanel {

    private final int TEAM_SIZE = 4;
    private JLabel[] memberLabels;


    public TeamPanel() {
        memberLabels = new JLabel[TEAM_SIZE];

        // create your own label that have an image and your name as text.
        memberLabels[0] = new JLabel("Sample", new ImageIcon("smile.png"), SwingConstants.CENTER);
        memberLabels[0].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[0].setVerticalTextPosition(SwingConstants.BOTTOM);

        memberLabels[1] = new JLabel("Excalibur", new ImageIcon("3135715.png"), SwingConstants.CENTER);
        memberLabels[1].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[1].setVerticalTextPosition(SwingConstants.BOTTOM);
        memberLabels[3] = new JLabel("Jeremiah",new ImageIcon("mark,png"),SwingConstants.LEFT );
        memberLabels[2] = new JLabel("Kevin", new ImageIcon("insect.png"), SwingConstants.RIGHT);
        memberLabels[2].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[2].setVerticalTextPosition(SwingConstants.BOTTOM);
        memberLabels[3].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[3].setVerticalTextPosition(SwingConstants.BOTTOM);


        for (JLabel member : memberLabels) {
            this.add(member);
        }

        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.LIGHT_GRAY);


    }





}
