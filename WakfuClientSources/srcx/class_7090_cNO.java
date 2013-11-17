import org.apache.log4j.Logger;

public class cNO
{
  protected static final Logger K = Logger.getLogger(cNO.class);

  protected final cSR ktn = new cSR();

  private static final cNO kto = new cNO();
  private bwC ktp;

  public static cNO cFX()
  {
    return kto;
  }

  public void a(bwC parambwC) {
    this.ktp = parambwC;
  }

  public void b(bJC parambJC) {
    if (parambJC != null)
      this.ktn.put(parambJC.bQW(), parambJC);
  }

  public bJC yF(int paramInt) {
    if (this.ktn.containsKey(paramInt))
      return (bJC)this.ktn.get(paramInt);
    bJC localbJC = rs(paramInt);
    if (localbJC == null)
      return null;
    this.ktn.put(localbJC.bQW(), localbJC);
    return localbJC;
  }

  public void yG(int paramInt) {
    if (this.ktp == null)
      return;
    bJC localbJC = this.ktp.rs(paramInt);
    if (localbJC == null)
      return;
    this.ktn.put(localbJC.bQW(), localbJC);
  }

  private bJC rs(int paramInt) {
    if (this.ktp == null)
      return null;
    return this.ktp.rs(paramInt);
  }

  public bJC yH(int paramInt) {
    int i = bJC.td(paramInt);
    return yF(i);
  }
}