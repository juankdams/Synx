import org.apache.log4j.Logger;

public final class QI
{
  public static final QI cpK = new QI();
  protected static final Logger K = Logger.getLogger(QI.class);

  private final cSR cpL = new cSR();
  private atU cpM;

  public atU acq()
  {
    return this.cpM;
  }

  public void a(atU paramatU) {
    this.cpM = paramatU;
  }

  public bGI gp(int paramInt) {
    if (this.cpM != null)
      return this.cpM.gp(paramInt);
    return null;
  }

  public boolean a(bGI parambGI) {
    if (parambGI == null)
      return false;
    int i = parambGI.getId();

    bGI localbGI = (bGI)this.cpL.get(i);
    if ((localbGI != null) && (localbGI != parambGI)) {
      K.error("Tentative d'écrase de territoire.");
      return false;
    }

    this.cpL.put(i, parambGI);
    return true;
  }

  public bGI gq(int paramInt) {
    return (bGI)this.cpL.get(paramInt);
  }

  public cSR acr() {
    return this.cpL;
  }

  public int[] acs()
  {
    return this.cpL.qe();
  }

  public void clear() {
    this.cpL.clear();
  }
}