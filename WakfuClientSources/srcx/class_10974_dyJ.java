import java.util.ArrayList;
import java.util.Collections;

public class dyJ
{
  public static final dyJ lFm = new dyJ();

  private cSR luL = new cSR();

  private cSR lFn = new cSR();

  private boolean bIx = false;

  private static final ArrayList lFo = new ArrayList(0);

  public void init()
  {
    dmn localdmn1 = fj.mh().yF();
    Object localObject2;
    Object localObject3;
    int k;
    int m;
    while (localdmn1.hasNext()) {
      localdmn1.fl();
      localObject1 = (dxy)localdmn1.value();
      localObject2 = bcz.bH(((dxy)localObject1).bqt());

      if (localObject2 != null)
      {
        int i = 0; for (int j = ((dxy)localObject1).bqu(); i < j; i++) {
          localObject3 = (cRm)((dxy)localObject1).oP(i);
          k = 0; for (m = ((cRm)localObject3).coe(); k < m; k++) {
            bKi localbKi2 = (bKi)((cRm)localObject3).vW(k);
            if (localbKi2.UA())
            {
              for (int i4 : localbKi2.bAA()) {
                Object localObject5 = (dra)this.luL.get(i4);
                if (i4 != 0)
                {
                  if (localObject5 == null) {
                    localObject5 = new bdX(i4, localbKi2.gC(), ((dxy)localObject1).getId(), localbKi2.bOH(), localbKi2.bOI(), localbKi2.bOG() > 1, (bcz)localObject2);

                    this.luL.put(i4, localObject5);
                  }
                  else {
                    i5 = Math.min(((dra)localObject5).bOH(), localbKi2.bOH());
                    ((dra)localObject5).Bh(i5);
                  }

                  int i5 = localbKi2.axX();
                  cSi localcSi2 = (cSi)this.lFn.get(i5);
                  if (localcSi2 == null) {
                    localcSi2 = new cSi();
                    this.lFn.put(i5, localcSi2);
                  }

                  if (!localcSi2.contains(i4))
                    localcSi2.add(i4); 
                }
              }
            }
          }
        }
      }
    }
    Object localObject1 = cMn.cFp().DZ().yF();
    while (((dmn)localObject1).hasNext()) {
      ((dmn)localObject1).fl();
      localObject2 = (bdi)((dmn)localObject1).value();
      dmn localdmn2 = ((bdi)localObject2).dhl();
      while (localdmn2.hasNext()) {
        localdmn2.fl();
        bKi localbKi1 = (bKi)localdmn2.value();
        if (localbKi1.UA())
        {
          for (int n : localbKi1.bAA()) {
            ??? = (dra)this.luL.get(n);

            if (??? == null) {
              ciJ localciJ = bRu.bYI().tP(((bdi)localObject2).nn());
              ??? = new XD(n, localbKi1.gC(), localciJ.ckB(), localbKi1.bOH(), localbKi1.bOI(), localbKi1.bOG() > 1);

              this.luL.put(n, ???);
            }
            else {
              i2 = Math.min(((dra)???).bOH(), localbKi1.bOH());
              ((dra)???).Bh(i2);
            }

            int i2 = localbKi1.axX();
            cSi localcSi1 = (cSi)this.lFn.get(i2);
            if (localcSi1 == null) {
              localcSi1 = new cSi();
              this.lFn.put(i2, localcSi1);
            }

            if (!localcSi1.contains(n))
              localcSi1.add(n);
          }
        }
      }
    }
    this.bIx = true;
  }

  public boolean BZ(int paramInt) {
    if (!this.bIx) {
      init();
    }
    cSi localcSi = (cSi)this.lFn.get(paramInt);
    return (localcSi != null) && (localcSi.size() != 0);
  }

  public ArrayList dk(int paramInt1, int paramInt2)
  {
    if (!this.bIx) {
      init();
    }
    cSi localcSi = (cSi)this.lFn.get(paramInt1);
    if (localcSi != null) {
      ArrayList localArrayList = new ArrayList(localcSi.size());
      int i = 0; for (int j = localcSi.size(); i < j; i++) {
        dra localdra = (dra)this.luL.get(localcSi.get(i));
        if (localdra.bOH() <= paramInt2) {
          localArrayList.add(localdra);
        }
      }
      Collections.sort(localArrayList, fE.mH());
      return localArrayList;
    }
    return lFo;
  }
}