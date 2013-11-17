import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.apache.log4j.Logger;

public final class cNm
{
  public static final cNm ksA = new cNm();

  private static final Logger K = Logger.getLogger(cNm.class);
  private boolean bIx = false;
  private JFrame fsi;
  private cif ksB;
  private final cSR hGR = new cSR();

  public void initialize()
  {
    if (this.bIx) {
      return;
    }
    SwingUtilities.invokeLater(new dgd(this));

    this.bIx = true;
  }
}