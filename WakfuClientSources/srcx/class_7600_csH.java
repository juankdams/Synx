import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class csH
  implements akF, dDB
{
  private final JCheckBox gzv;

  public csH()
  {
    this.gzv = new JCheckBox("Lights", false);
    this.gzv.addItemListener(new dRj(this));
  }

  public void b(dnq paramdnq)
  {
    this.gzv.setSelected(btL.gcv.bBT());
  }

  public void c(dnq paramdnq) {
  }

  public JComponent bMJ() {
    return this.gzv;
  }

  public String getName() {
    return "Switch Lights";
  }

  public void co(boolean paramBoolean) {
    this.gzv.setSelected(paramBoolean);
  }
}