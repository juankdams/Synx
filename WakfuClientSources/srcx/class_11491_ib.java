import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

public class ib extends JButton
{
  private final dwL aHC;
  private JPopupMenu aHD;

  public ib(String paramString, dwL paramdwL)
  {
    super(paramString);

    this.aHC = paramdwL;

    pM();
  }

  private void pM() {
    this.aHD = new JPopupMenu("ban request");
    this.aHD.setEnabled(true);
    pN();

    addMouseListener(new cjp(this));
  }

  public void pN()
  {
    this.aHD.setEnabled(false);
    this.aHD.removeAll();
    ArrayList localArrayList = bkh.fAz.bvk();
    for (int i = 0; i < localArrayList.size(); i++) {
      daw localdaw = (daw)localArrayList.get(i);
      this.aHD.add(new jl(this, localdaw));
    }
    this.aHD.setEnabled(true);
  }
}