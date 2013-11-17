import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class afK extends JPanel
{
  JTextField cYM;
  JLabel cYN;

  private afK(chW paramchW)
  {
    super(new FlowLayout(0, 0, 0), true);
    this.cYN = new JLabel("fps");
    this.cYM = new JTextField();
    this.cYM.setEnabled(false);
    this.cYM.setDisabledTextColor(Color.BLACK);
    this.cYM.setHorizontalAlignment(4);
    this.cYM.setPreferredSize(new Dimension(40, 20));
    add(this.cYM);
    add(this.cYN);
  }
}