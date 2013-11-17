import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import org.apache.log4j.Logger;

public class bsz extends JDialog
{
  private static Logger K = Logger.getLogger(bsz.class);
  private final dnq fZp;
  private JTabbedPane fZq;
  private JTabbedPane fZr;
  private aoL fZs;
  private aLq fZt;
  private dCL fZu;

  public bsz(dnq paramdnq)
  {
    super(paramdnq.aww().cHK(), "moderation panel");

    this.fZs = new aoL();
    this.fZp = paramdnq;

    JFrame localJFrame = this.fZp.aww().cHK();

    setLocation(localJFrame.getLocationOnScreen().x + localJFrame.getSize().width, localJFrame.getLocationOnScreen().y);

    Dimension localDimension = new Dimension(500, localJFrame.getHeight());
    setPreferredSize(localDimension);
    setMinimumSize(localDimension);
    setMaximumSize(localDimension);

    setLayout(new BorderLayout());

    this.fZq = new JTabbedPane();
    this.fZq.setTabPlacement(1);
    add(this.fZq, "Center");

    bAC();
    bAB();
    bAD();
  }

  private void bAB() {
    this.fZt = new aLq();
    this.fZq.addTab("search", this.fZt);
  }

  private void bAC() {
    this.fZr = new JTabbedPane();
    this.fZr.setTabPlacement(2);
    this.fZq.addTab("players", this.fZr);
  }

  private void bAD() {
    this.fZu = new dCL();
    this.fZq.addTab("log", this.fZu);
  }

  public cIH fY(long paramLong) {
    cIH localcIH = new cIH(paramLong);
    this.fZr.addTab("playerId=" + paramLong, localcIH);
    int i = this.fZr.getTabCount();

    this.fZs.put(paramLong, localcIH);

    localcIH.cCP();

    return localcIH;
  }

  public cIH fZ(long paramLong) {
    cIH localcIH = (cIH)this.fZs.get(paramLong);
    if (localcIH == null) {
      localcIH = fY(paramLong);
    }

    return localcIH;
  }

  public void bAE() {
    this.fZs.s(new aYW(this));
  }

  public aLq bAF()
  {
    return this.fZt;
  }

  public void log(String paramString) {
    this.fZu.log(paramString);
  }
}