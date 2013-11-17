import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class ceu
  implements akF, dDB
{
  private final JCheckBox gzv;
  private cXf cQs;

  public ceu()
  {
    this.gzv = new JCheckBox("Cellule walkable", false);
    this.gzv.addItemListener(new dti(this));
  }

  public void b(dnq paramdnq)
  {
    this.cQs = paramdnq.Dg();
    this.cQs.cLf();
  }

  public void c(dnq paramdnq) {
  }

  public JComponent bMJ() {
    return this.gzv;
  }

  public String getName() {
    return "Afficher Walkabilité";
  }

  public void co(boolean paramBoolean) {
    this.gzv.setSelected(paramBoolean);
  }
}