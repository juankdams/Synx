import java.util.ArrayList;
import java.util.Iterator;

public class LT
  implements dDc
{
  private Xg bYU = new Xg();
  private String bYV;
  private float bYW = 1.0F;

  public ZI b(byte paramByte1, byte paramByte2) {
    bTh localbTh = (bTh)this.bYU.get(paramByte1);
    if (localbTh == null) {
      return null;
    }

    return localbTh.dw(paramByte2);
  }

  public float sZ() {
    return this.bYW;
  }

  public static ZI p(K paramK)
  {
    K localK1 = paramK.e("id");
    if (localK1 == null) {
      return null;
    }

    ZI localZI = new ZI();
    localZI.l(localK1.ah());

    K localK2 = paramK.e("gain");
    if (localK2 != null) {
      localZI.ae(localK2.getIntValue() / 100.0F);
    }

    K localK3 = paramK.e("rollOff");
    if (localK3 != null) {
      localZI.hz(localK3.getIntValue());
    }
    return localZI;
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

    this.bYU.clear();

    CC localCC = localbwZ.bEx();

    ArrayList localArrayList = localCC.d("fightFspGain");
    if (localArrayList != null)
      for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localK1 = (K)localIterator.next();
        K localK2 = localK1.e("value");
        if (localK2 != null)
        {
          this.bYW = localK2.ai();
        }
      }
    K localK1;
    for (Iterator localIterator = localCC.d("ground").iterator(); localIterator.hasNext(); ) { localK1 = (K)localIterator.next();
      int i = 0;
      K localK3 = localK1.e("type");
      if (localK3 != null) {
        i = localK3.getIntValue();
      }

      bTh localbTh = new bTh(null);

      K localK4 = localK1.b("walk");

      for (Object localObject1 = localK4.d("sound").iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (K)((Iterator)localObject1).next();
        localObject3 = p((K)localObject2);
        if (localObject3 != null)
          localbTh.a((ZI)localObject3, (byte)0);
      }
      Object localObject3;
      localObject1 = localK1.b("run");

      for (Object localObject2 = ((K)localObject1).d("sound").iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (K)((Iterator)localObject2).next();
        ZI localZI = p((K)localObject3);
        if (localZI != null) {
          localbTh.a(localZI, (byte)1);
        }

      }

      this.bYU.put(i, localbTh);
    }
  }
}