import java.util.ArrayList;

public class fY extends cfH
  implements aSH, dBv
{
  public static final String aDs = "temporaryBagInventory";
  public static final String aDt = "temporaryBagSize";
  private ArrayList cm;

  public fY(dqG paramdqG)
  {
    super(paramdqG);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("temporaryBagInventory")) {
      if (this.cm == null) {
        na();
      }
      return this.cm;
    }if (paramString.equals("temporaryBagSize")) {
      return Integer.valueOf(2);
    }
    return null;
  }

  protected boolean a(gA paramgA) {
    byz localbyz = byv.bFN().bFO();
    return (mX() != null) && (mX().ajz().a(paramgA, localbyz, localbyz.ayL()));
  }

  protected bZH mX()
  {
    return byv.bFN().bFO().ayJ();
  }

  protected cRs D(long paramLong)
  {
    return byv.bFN().bFO().bGP().iO(paramLong);
  }

  private void mY() {
    this.cm = null;
    dLE.doY().a(this, new String[] { "temporaryBagInventory", "temporaryBagSize" });
  }

  public void b(gA paramgA)
  {
    if (!byv.bFN().c(tL.Ca())) {
      byv.bFN().a(tL.Ca());
    }

    aEe localaEe = new aEe(bU.fH().getString("temporaryInventory.itemAdded", new Object[] { Short.valueOf(paramgA.nP()), paramgA.getName() }));
    localaEe.mm(4);
    CM.LV().a(localaEe);

    mY();
  }

  public void c(gA paramgA) {
    dqG localdqG = ciq();
    if (localdqG.isEmpty()) {
      if (byv.bFN().c(tL.Ca()))
        byv.bFN().b(tL.Ca());
    }
    else
      mY();
  }

  public void d(gA paramgA)
  {
    mY();
  }

  public void mZ() {
    mY();
  }

  private void na() {
    this.cm = new ArrayList();
    dqG localdqG = ciq();
    localdqG.d(new cVd(this));
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    return false;
  }
}