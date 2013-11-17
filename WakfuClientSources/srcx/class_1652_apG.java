import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class apG
  implements Iterable
{
  private aRX dvJ;
  protected final HashMap dvK = new HashMap();

  public void b(aRX paramaRX)
  {
    this.dvJ = paramaRX;
  }

  public aRX aBB() {
    return this.dvJ;
  }

  public void a(byte paramByte, aqA paramaqA) {
    if ((paramaqA != null) && (bj(paramByte))) {
      short[] arrayOfShort = bk(paramByte);
      paramaqA.aI(arrayOfShort[0]);
      paramaqA.aJ(arrayOfShort[1]);
      paramaqA.bl(paramByte);
      paramaqA.a(this);
      this.dvK.put(Byte.valueOf(paramByte), paramaqA);
      paramaqA.aBC();
    }
  }

  public aqA bi(byte paramByte)
  {
    if (bj(paramByte))
      return (aqA)this.dvK.get(Byte.valueOf(paramByte));
    return null;
  }

  public Iterator iterator() {
    return this.dvK.values().iterator();
  }

  public aqA bj(int paramInt1, int paramInt2) {
    for (Map.Entry localEntry : this.dvK.entrySet()) {
      aqA localaqA = (aqA)localEntry.getValue();
      if (localaqA.bk(paramInt1, paramInt2)) {
        return localaqA;
      }
    }
    return null;
  }

  public boolean aBC() {
    for (Map.Entry localEntry : this.dvK.entrySet())
      if (!((aqA)localEntry.getValue()).aBC())
        return false;
    return true;
  }

  public void clear() {
    this.dvK.clear();
  }

  public abstract byte aBD();

  public abstract boolean bj(byte paramByte);

  public abstract short[] bk(byte paramByte);

  public abstract void a(cCB paramcCB);
}