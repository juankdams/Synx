import java.awt.BorderLayout;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class dCL extends JPanel
{
  private JTextArea lLc;

  public dCL()
  {
    setLayout(new BorderLayout());

    this.lLc = new JTextArea();
    this.lLc.setEditable(false);
    add(new JScrollPane(this.lLc), "Center");
  }

  public void log(String paramString) {
    String str = this.lLc.getText();
    this.lLc.setText(str + "[" + DateFormat.getTimeInstance(2).format(new Date()) + "] " + paramString + "\n");
  }
}