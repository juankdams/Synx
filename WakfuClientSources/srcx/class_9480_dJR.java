import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import org.apache.log4j.Logger;

public class dJR extends JPanel
{
  private static Logger K = Logger.getLogger(dJR.class);

  private final String lWo = "debugBar.properties";
  private static final int HEIGHT = 38;
  private static final Border lWp = new EmptyBorder(0, 0, 0, 0);
  private final dnq fZp;
  private final Vector lWq = new Vector();
  private final JPanel lWr;
  private final Vector lWs = new Vector();

  public dJR(dnq paramdnq) {
    super(new BorderLayout(0, 0), true);

    this.fZp = paramdnq;

    setIgnoreRepaint(true);
    Dimension localDimension = new Dimension(-1, 38);
    setMaximumSize(localDimension);
    setMinimumSize(localDimension);
    setPreferredSize(localDimension);

    this.lWr = new JPanel(new FlowLayout(0, 0, 0));
    this.lWr.setMaximumSize(localDimension);
    this.lWr.setMinimumSize(localDimension);
    this.lWr.setPreferredSize(localDimension);

    add(this.lWr, "Center");
  }

  public void aq(Class paramClass) {
    for (Object localObject = this.lWq.iterator(); ((Iterator)localObject).hasNext(); ) { dDB localdDB = (dDB)((Iterator)localObject).next();
      if (localdDB.getClass().getCanonicalName().equals(paramClass.getCanonicalName())) {
        K.debug(paramClass.toString() + " component already present");
        return;
      }

    }

    try
    {
      localObject = (dDB)paramClass.newInstance();
    } catch (Exception localException) {
      K.info("Unable to instanciate a " + paramClass + " DebugComponent");
      return;
    }
    this.lWq.add(localObject);
    ((dDB)localObject).b(this.fZp);
    if (this.lWr.getComponentCount() > 0)
      this.lWr.add(new Xx(8, 38));
    JComponent localJComponent = ((dDB)localObject).bMJ();
    localJComponent.setBorder(lWp);
    this.lWr.add(localJComponent);
    this.lWr.validate();
  }

  public void ar(Class paramClass) {
    this.lWs.add(paramClass);
  }

  private void as(Class paramClass) {
    for (dDB localdDB : this.lWq)
      if (localdDB.getClass() == paramClass) {
        a(localdDB);
        break;
      }
  }

  private boolean a(dDB paramdDB)
  {
    int i = this.lWr.getComponentZOrder(paramdDB.bMJ());
    if (i == -1)
      return false;
    this.lWq.remove(paramdDB);
    this.lWr.remove(paramdDB.bMJ());
    if (this.lWr.getComponentCount() > 0)
      if (i > 0)
        this.lWr.remove(i - 1);
      else
        this.lWr.remove(i);
    paramdDB.c(this.fZp);
    this.lWr.validate();
    return true;
  }

  public void removeAll() {
    djc();
  }

  private void djc() {
    while (this.lWq.size() > 0) {
      dDB localdDB = (dDB)this.lWq.get(0);
      if (!a(localdDB)) {
        K.error("Error while deleting DebugComponent " + localdDB);
        this.lWq.remove(0);
      }
    }
    if (this.lWr.getComponentCount() != 0)
      K.error("Encore des composants de présent alors qu'on vient de tous les supprimer");
    if (this.lWq.size() != 0)
      K.error("Encore des debugcomposants de présent alors qu'on vient de tous les supprimer");
  }

  public void reset()
  {
    djc();
  }
}