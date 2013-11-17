import java.util.ArrayList;
import java.util.Iterator;

public class bfz
  implements cuM
{
  private final aoL fsQ = new aoL();
  private String bYV = null;

  private avP a(cbI paramcbI, int paramInt1, int paramInt2) {
    if (!(paramcbI instanceof cew)) {
      return null;
    }

    cew localcew = (cew)paramcbI;
    bhh localbhh = localcew.cbD().aJp();

    long l = 910L;

    if ((localbhh instanceof SB)) {
      l = l * 10000L + (paramInt1 != -1 ? paramInt1 : localbhh.uO());
      l = l * 10L + localcew.cbD().xK();
    } else {
      l = l * 100000L + (paramInt1 != -1 ? paramInt1 : localbhh.uO());
    }

    l = l * 100L + paramInt2;

    bHX localbHX = (bHX)this.fsQ.get(l);
    if (localbHX == null) {
      return null;
    }

    return localbHX.bPs();
  }

  public avP a(cbI paramcbI, int paramInt) {
    return a(paramcbI, -1, paramInt);
  }

  public avP b(cbI paramcbI, int paramInt1, int paramInt2) {
    return a(paramcbI, paramInt2, paramInt1);
  }

  public static avP x(K paramK)
  {
    K localK1 = paramK.e("id");
    if (localK1 == null) {
      return null;
    }

    avP localavP = new avP();
    localavP.l(localK1.ah());

    K localK2 = paramK.e("gain");
    if (localK2 != null) {
      localavP.ae(localK2.getIntValue() / 100.0F);
    }

    K localK3 = paramK.e("rollOff");
    if (localK3 != null) {
      localavP.hz(localK3.getIntValue());
    }
    return localavP;
  }

  public void reload() {
    cG(this.bYV);
  }

  public void cG(String paramString) {
    this.bYV = paramString;

    bpA localbpA = new bpA();
    bwZ localbwZ = new bwZ();

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    this.fsQ.clear();

    CC localCC = localbwZ.bEx();

    long l1 = 0L;
    K localK1 = localCC.e("prefix");
    if (localK1 != null) {
      l1 = localK1.ah();
    }

    for (K localK2 : localCC.d("bark")) {
      i = 0;
      K localK3 = localK2.e("type");
      if (localK3 != null) {
        i = localK3.getIntValue();
      }

      for (K localK4 : localK2.d("skin")) {
        cSi localcSi = new cSi();
        K localK5 = localK4.e("value");

        if (localK5 != null) {
          localObject1 = localK5.getStringValue();
          localObject2 = ((String)localObject1).split(",");
          for (Object localObject4 : localObject2) {
            int i1 = bUD.f(localObject4.trim(), -1);
            if (i1 != -1) {
              localcSi.add(i1);
            }
          }
        }

        Object localObject1 = new bHX(null);

        for (Object localObject2 = localK4.d("sound").iterator(); ((Iterator)localObject2).hasNext(); ) { ??? = (K)((Iterator)localObject2).next();
          avP localavP = x((K)???);
          if (localavP != null) {
            ((bHX)localObject1).c(localavP);
          }
        }

        int j = 0; for (int k = localcSi.size(); j < k; j++) {
          long l2 = l1;
          l2 = l2 * 100000L + localcSi.get(j);
          l2 = l2 * 100L + i;
          this.fsQ.put(l2, localObject1);
        }
      }
    }
    int i;
    this.fsQ.compact();
  }
}