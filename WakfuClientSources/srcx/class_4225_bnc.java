import org.apache.log4j.Logger;

public class bnc
{
  protected static final Logger K = Logger.getLogger(bnc.class);

  private static final bnc fFT = new bnc();

  private final cSR fFU = new cSR();

  public static bnc bxw()
  {
    return fFT;
  }

  public bvm a(arl paramarl, bSR parambSR)
  {
    if ((paramarl == null) || (parambSR == null)) {
      return null;
    }
    return a(paramarl.getId(), parambSR);
  }

  public bvm a(int paramInt, bSR parambSR) {
    dts localdts = qk(paramInt);
    return localdts.e(parambSR);
  }

  public void d(ckT paramckT)
  {
    if (paramckT == null) {
      return;
    }
    qj(paramckT.getId());
  }

  public void qj(int paramInt)
  {
    dts localdts = qk(paramInt);
    localdts.cZI();
  }

  private dts qk(int paramInt) {
    dts localdts = (dts)this.fFU.get(paramInt);

    if (localdts == null) {
      localdts = new dts();

      this.fFU.put(paramInt, localdts);
    }
    return localdts;
  }

  public void ql(int paramInt) {
    dts localdts = (dts)this.fFU.get(paramInt);
    if (localdts != null) {
      localdts.RF();
    }
    this.fFU.remove(paramInt);
  }

  public void qm(int paramInt) {
    dts localdts = (dts)this.fFU.remove(paramInt);
    if (localdts != null)
      localdts.cZF();
  }
}