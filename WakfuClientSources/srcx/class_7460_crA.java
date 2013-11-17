import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class crA
  implements dDB
{
  private final JPanel iaO;
  private final JCheckBox iaP;
  private final JCheckBox iaQ;

  public crA()
  {
    this.iaO = new JPanel();
    this.iaO.setLayout(new BoxLayout(this.iaO, 1));

    this.iaQ = new JCheckBox("Scene partic.", true);
    this.iaQ.addItemListener(new cqS(this));

    this.iaQ.setBorder(new EmptyBorder(0, 0, 0, 0));

    this.iaP = new JCheckBox("Xulor partic.", true);
    this.iaP.addItemListener(new cqP(this));

    this.iaP.setBorder(new EmptyBorder(0, 0, 0, 0));

    this.iaO.add(this.iaQ);
    this.iaO.add(this.iaP);
  }

  public void b(dnq paramdnq)
  {
    this.iaQ.setSelected(cWS.cKD().czt());
    this.iaP.setSelected(cDz.iwP.czt());
  }

  public void c(dnq paramdnq) {
  }

  public JComponent bMJ() {
    return this.iaO;
  }

  public String getName() {
    return "Switch Particles";
  }
}