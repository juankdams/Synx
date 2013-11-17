import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class bEf
  implements dDB
{
  private final JCheckBox gzv;
  private final ddH gzw = new dnZ();
  private alQ gzx;

  public bEf()
  {
    this.gzv = new JCheckBox("Météo", false);

    this.gzv.addActionListener(new cct(this));

    this.gzv.addItemListener(new ccs(this));
  }

  public void b(dnq paramdnq)
  {
  }

  public void c(dnq paramdnq)
  {
    anK.drx.a(null);
  }

  public JComponent bMJ() {
    return this.gzv;
  }

  public String getName() {
    return "Switch Météo";
  }
}