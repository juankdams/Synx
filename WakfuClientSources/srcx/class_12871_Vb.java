import java.util.ArrayList;
import java.util.Iterator;

public class Vb
{
  private static final Vb czs = new Vb();
  private final ArrayList czt = new ArrayList();

  public static Vb ain() {
    return czs;
  }

  public void a(dlY paramdlY) {
    if (!this.czt.contains(paramdlY))
      this.czt.add(paramdlY);
  }

  public void b(dlY paramdlY) {
    if (this.czt.contains(paramdlY))
      this.czt.remove(paramdlY);
  }

  public void aio() {
    for (dlY localdlY : this.czt)
      localdlY.beM();
  }

  public void a(cmV paramcmV, int paramInt1, int paramInt2) {
    if ((paramcmV == null) || ((paramInt1 == 0) && (paramInt2 == 0))) {
      return;
    }
    LJ.Wo().a(paramcmV, paramInt1, paramInt2);

    float f1 = paramcmV.MH();
    float f2 = paramcmV.MI();

    float f3 = f1 - paramInt1;
    float f4 = f2 - paramInt2;

    Iterator localIterator = cBQ.cxL().cye();
    while (localIterator.hasNext()) {
      aNL localaNL = (aNL)localIterator.next();

      if ((localaNL instanceof dOc))
      {
        dOc localdOc = (dOc)localaNL;
        if ((localdOc.getLayoutData() instanceof cwP))
        {
          cwP localcwP = (cwP)localdOc.getLayoutData();
          if (localcwP.isInitValue())
          {
            if ((localdOc instanceof bpn)) {
              bpn localbpn = (bpn)localdOc;
              if (localbpn.getStickData() != null);
            }
            else {
              int i = localdOc.getWidth();
              int j = localdOc.getHeight();

              int k = (int)((f1 - i) * localdOc.getXPercInParent());
              int m = (int)((f2 - j) * localdOc.getYPercInParent());

              k = bCO.J(k, 0, (int)(f1 - i));
              m = bCO.J(m, 0, (int)(f2 - j));

              localdOc.setPosition(k, m, 0, false, false);
            }
          }
        }
      }
    }
  }
}