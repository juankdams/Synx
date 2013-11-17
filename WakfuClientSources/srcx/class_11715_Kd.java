import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

public final class Kd
{
  private static final Kd bWu = new Kd();
  private final cSR bWv = new cSR();
  private final cSR bWw = new cSR();
  private final cSR bWx = new cSR();
  private final WeakHashMap bWy = new WeakHashMap();

  public static Kd UN()
  {
    return bWu;
  }

  public cbM fw(int paramInt) {
    return (cbM)this.bWw.get(paramInt);
  }

  public void a(int paramInt, cbM paramcbM) {
    this.bWw.put(paramInt, paramcbM);
  }

  public void fx(int paramInt) {
    this.bWw.remove(paramInt);
  }

  public void b(int paramInt, cbM paramcbM) {
    this.bWv.put(paramInt, paramcbM);
  }

  public void fy(int paramInt) {
    this.bWv.remove(paramInt);
  }

  public cbM fz(int paramInt) {
    return (cbM)this.bWv.get(paramInt);
  }

  public void b(int paramInt, dIJ paramdIJ) {
    this.bWx.put(paramInt, paramdIJ);
  }

  public dIJ fA(int paramInt) {
    return (dIJ)this.bWx.get(paramInt);
  }

  public dIJ fB(int paramInt) {
    return (dIJ)this.bWx.remove(paramInt);
  }

  public void clear() {
    this.bWx.clear();
    this.bWv.clear();
    this.bWw.clear();
  }

  public void a(dcY paramdcY) {
    this.bWy.put(Integer.valueOf(paramdcY.getAdviserId()), paramdcY);
  }

  public dcY fC(int paramInt) {
    return (dcY)this.bWy.get(Integer.valueOf(paramInt));
  }

  public void fD(int paramInt) {
    this.bWy.remove(Integer.valueOf(paramInt));
  }

  public Collection a(bVf parambVf) {
    ArrayList localArrayList = new ArrayList();
    for (dcY localdcY : this.bWy.values()) {
      if (localdcY.getTarget() == parambVf) {
        localArrayList.add(localdcY);
      }
    }
    return localArrayList;
  }
}