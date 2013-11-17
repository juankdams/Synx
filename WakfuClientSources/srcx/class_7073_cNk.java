import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class cNk
  implements akF, dDB
{
  private final JCheckBox gzv;
  dnq fZp;

  public cNk()
  {
    this.gzv = new JCheckBox("VSync", false);
    this.gzv.addItemListener(new aCw(this));
  }

  public void b(dnq paramdnq)
  {
    this.fZp = paramdnq;
    paramdnq.rs().a(this);
    this.gzv.setSelected(paramdnq.rs().bJE());
  }

  public void c(dnq paramdnq) {
    this.fZp = null;
    paramdnq.rs().b(this);
  }

  public JComponent bMJ() {
    return this.gzv;
  }

  public String getName() {
    return "Switch VSync";
  }

  public void co(boolean paramBoolean) {
    this.gzv.setSelected(paramBoolean);
  }
}