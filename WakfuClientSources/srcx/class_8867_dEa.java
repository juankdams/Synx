import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class dEa
  implements aWz, dDB
{
  private final JPanel lMN;
  private final JCheckBox gzv;
  private final JSlider lMO;

  public dEa()
  {
    this.lMN = new JPanel(new FlowLayout());
    this.gzv = new JCheckBox("Heure:", false);
    this.lMO = new JSlider(0, 100);
    this.lMO.setPaintTicks(true);
    this.lMO.setMajorTickSpacing(25);
    this.lMN.add(this.gzv, 0);
    this.lMN.add(this.lMO, 1);

    this.gzv.addActionListener(new dwU(this));
  }

  public void b(dnq paramdnq)
  {
    bzZ.goz.a(this);
  }

  public void c(dnq paramdnq) {
    bzZ.goz.a(null);
  }

  public JComponent bMJ() {
    return this.lMN;
  }

  public String getName() {
    return "Switch Heure du jour";
  }

  public float b(aKS paramaKS) {
    if (!this.gzv.isSelected()) {
      float f = paramaKS.bcv();
      this.lMO.setValue((int)f);
      return f;
    }
    return this.lMO.getValue();
  }
}