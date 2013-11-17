import java.util.ArrayList;
import java.util.HashMap;

public class bND extends cay
{
  private HashMap gSI = new HashMap();

  public String[] getFields() {
    return cay.bF;
  }

  public Iterable aeA() {
    if (!aeE())
      return this.gSI.values();
    return ceK();
  }

  public apX bV(long paramLong) {
    if (!aeE())
      return (apX)this.gSI.get(Long.valueOf(paramLong));
    return (apX)ceK().ci(paramLong);
  }

  public void a(ArrayList paramArrayList, short paramShort) {
    for (bvM localbvM : paramArrayList) {
      dSR localdSR = (dSR)localbvM.Lp();
      int i = localbvM.aBP() == -1 ? paramShort : localbvM.aBP();
      apX localapX = new apX(localdSR, (short)i, localdSR.getId());
      this.gSI.put(Long.valueOf(localapX.oj()), localapX);
    }
  }

  public void f(apX paramapX) {
    this.gSI.put(Long.valueOf(paramapX.oj()), paramapX);
  }

  public void clear() {
    this.gSI.clear();
  }
}