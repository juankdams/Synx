import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class dPR
{
  public static final dPR mji = new dPR();

  protected static final Logger K = Logger.getLogger(dPR.class);

  private final cSR mjj = new cSR();
  private final cSR bel = new cSR();
  private final cSR RF = new cSR();
  private nU mjk;

  private dPR()
  {
    this.mjk = new aYI(this);
  }

  public void a(nU paramnU)
  {
    this.mjk = paramnU;
  }

  public void b(cFp paramcFp) {
    if (paramcFp != null)
      this.bel.put(paramcFp.yR(), paramcFp);
  }

  public cFp Dn(int paramInt) {
    return (cFp)this.bel.get(paramInt);
  }

  public cHN a(int paramInt, bZA parambZA, byte paramByte, int[] paramArrayOfInt) {
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfInt != null) {
      for (int k : paramArrayOfInt) {
        cFp localcFp = (cFp)this.bel.get(k);
        if (localcFp != null)
          localArrayList.add(localcFp);
        else {
          K.error("L'effet n'existe pas (ID=" + k + "), ou n'a pas pu etre chargé pour le buff ID=" + paramInt);
        }
      }
    }

    ??? = this.mjk.a(paramInt, parambZA, paramByte, localArrayList);
    this.RF.put(paramInt, ???);
    return ???;
  }

  public cHN Do(int paramInt) {
    return (cHN)this.RF.get(paramInt);
  }

  public void m(int paramInt, int[] paramArrayOfInt) {
    Eh localEh = new Eh(paramInt, paramArrayOfInt);
    this.mjj.put(paramInt, localEh);
  }

  public Eh Dp(int paramInt) {
    return (Eh)this.mjj.get(paramInt);
  }

  public dmn dqX() {
    return this.RF.yF();
  }
}