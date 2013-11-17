import java.util.ArrayList;

public class cxu
{
  private final Class fHK;
  private final duv ilp;
  private final duv ilq;
  private boolean ehC;

  public cxu(Class paramClass, duv paramduv1, duv paramduv2)
  {
    this.fHK = paramClass;
    this.ilp = paramduv1;
    this.ilq = paramduv2;
  }

  public void start() {
    this.ehC = true;
    dGx.dhr().a(this.ilp, true);
  }

  public void stop() {
    this.ehC = false;
    dGx.dhr().unlock();
  }

  public void c(aTL paramaTL, int paramInt1, int paramInt2) {
    if (!this.ehC) {
      return;
    }
    cRz localcRz = e(paramaTL, paramInt1, paramInt2);
    if (localcRz != null)
      dGx.dhr().a(this.ilq, true);
    else
      dGx.dhr().a(this.ilp, true);
  }

  public void d(aTL paramaTL, int paramInt1, int paramInt2) {
    if (!this.ehC) {
      return;
    }
    cRz localcRz = e(paramaTL, paramInt1, paramInt2);
    if (localcRz != null) {
      csx localcsx = b(localcRz);
      if (localcsx != null) {
        localcsx.run();
      }
    }
    dGx.dhr().unlock();
    this.ehC = false;
  }

  private cRz e(aTL paramaTL, int paramInt1, int paramInt2) {
    ArrayList localArrayList = paramaTL.bT(paramInt1, paramInt2);
    if (localArrayList.isEmpty()) {
      return null;
    }
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dCb localdCb = (dCb)localArrayList.get(i);
      Object localObject = localdCb;
      if ((localdCb instanceof cew)) {
        localObject = ((cew)localdCb).cbD();
      }

      if ((localObject instanceof cRz))
      {
        cRz localcRz = (cRz)localObject;
        if (a(localcRz))
          return localcRz;
      }
    }
    return null;
  }

  private boolean a(cRz paramcRz) {
    return b(paramcRz) != null;
  }

  private csx b(cRz paramcRz) {
    csx[] arrayOfcsx1 = paramcRz.adN();
    for (csx localcsx : arrayOfcsx1) {
      if (localcsx.getClass().isAssignableFrom(this.fHK))
      {
        localcsx.Q(paramcRz);
        if ((localcsx.pZ()) && (localcsx.isEnabled())) {
          return localcsx;
        }
      }
    }
    return null;
  }
}