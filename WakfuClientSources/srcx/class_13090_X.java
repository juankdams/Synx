import com.ankamagames.wakfu.client.binaryStorage.ItemTypeBinaryData;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class X extends aEg
{
  private static final X bg = new X();
  private final aVS bh;

  private X()
  {
    this.bh = new aVG(new ItemTypeBinaryData());
  }

  public static X aw()
  {
    return bg;
  }

  public ya f(int paramInt)
  {
    if (paramInt == 0)
      return null;
    ya localya = (ya)this.dZB.get(paramInt);

    if ((localya == null) && (!this.dZB.containsKey(paramInt))) {
      ItemTypeBinaryData localItemTypeBinaryData = (ItemTypeBinaryData)this.bh.jt(paramInt);
      if (localItemTypeBinaryData == null)
        return null;
      localya = b(localItemTypeBinaryData);
      if (localya != null) {
        e(localya);
      }
    }
    return localya;
  }

  public void a(ItemTypeBinaryData paramItemTypeBinaryData) {
    ya localya = b(paramItemTypeBinaryData);

    e(localya);
  }

  private static ya b(ItemTypeBinaryData paramItemTypeBinaryData)
  {
    if (paramItemTypeBinaryData == null) {
      return null;
    }
    int i = paramItemTypeBinaryData.nc();
    int j = paramItemTypeBinaryData.nd();

    String[] arrayOfString1 = paramItemTypeBinaryData.bZZ();
    ArrayList localArrayList1 = new ArrayList();
    for (String str1 : arrayOfString1) {
      if ((str1 != null) && (!str1.equals(""))) {
        azO localazO = azO.valueOf(str1);
        localArrayList1.add(localazO);
      } else {
        K.error("Le slot [" + str1 + "] n'est pas valide");
      }
    }
    ??? = paramItemTypeBinaryData.caa();
    ArrayList localArrayList2 = new ArrayList();
    for (String str2 : ???) {
      localArrayList2.add(azO.valueOf(str2));
    }

    ??? = a(localArrayList1);
    azO[] arrayOfazO = a(localArrayList2);

    ya localya = new ya((short)i, (short)j, (azO[])???);
    if (arrayOfazO != null) {
      localya.b(arrayOfazO);
    }
    localya.n(paramItemTypeBinaryData.nk());
    localya.o(paramItemTypeBinaryData.nl());
    localya.p(paramItemTypeBinaryData.nm());

    return localya;
  }

  private static azO[] a(ArrayList paramArrayList) {
    if (paramArrayList.size() > 0) {
      return (azO[])paramArrayList.toArray(new azO[paramArrayList.size()]);
    }
    return null;
  }

  public boolean isEmpty() {
    return this.dZB.isEmpty();
  }
}