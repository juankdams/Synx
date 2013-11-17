import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class ctU
  implements Iterable
{
  private static final Logger K = Logger.getLogger(ctU.class);
  private final short aDx;
  private final int ieb;
  protected final List iec;
  protected final cSR bel = new cSR(1);

  public ctU(short paramShort, int paramInt, List paramList) {
    this.aDx = paramShort;
    this.ieb = paramInt;
    this.iec = paramList;
  }

  public ctU(short paramShort, int paramInt) {
    this.aDx = paramShort;
    this.ieb = paramInt;
    this.iec = new ArrayList();
  }

  public short nc() {
    return this.aDx;
  }

  public Iterator iterator() {
    return this.iec.iterator();
  }

  protected List csv() {
    return this.iec;
  }

  public void c(bBn parambBn) {
    if (parambBn == null) {
      K.warn("ajout d'un item null dans le set " + nc());
      return;
    }
    this.iec.add(parambBn);
  }

  public void t(Collection paramCollection) {
    this.iec.addAll(paramCollection);
  }

  public void a(int paramInt, dpI paramdpI)
  {
    bog localbog = (bog)this.bel.get(paramInt);

    if (localbog == null) {
      localbog = new bog((short)paramInt, this.aDx);
      this.bel.put(paramInt, localbog);
    }

    localbog.a(paramdpI);
  }

  public bog z(int paramInt, boolean paramBoolean) {
    if (paramInt == 0) {
      return null;
    }
    bog localbog = (bog)this.bel.get(paramInt);
    if (localbog != null) {
      return localbog;
    }

    if (paramBoolean) {
      paramInt--;
      return z(paramInt, paramBoolean);
    }
    return null;
  }

  public ArrayList wJ(int paramInt) {
    bog localbog = z(paramInt, false);
    if (localbog == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(0);
    for (dpI localdpI : localbog) {
      localArrayList.add(localdpI);
    }

    return localArrayList;
  }

  public bog wK(int paramInt)
  {
    return z(paramInt, true);
  }

  public ArrayList wL(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 1; i <= paramInt; i++) {
      bog localbog = z(i, false);
      if (localbog != null) {
        localArrayList.add(localbog);
      }
    }

    return localArrayList;
  }

  public int wM(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    bog localbog = (bog)this.bel.get(paramInt);
    if (localbog == null) {
      paramInt--;
      return wM(paramInt);
    }
    return localbog.bxP();
  }

  public int csw() {
    return this.iec.size();
  }

  public int csx() {
    return this.ieb;
  }

  public final int[] HY() {
    int[] arrayOfInt = new int[this.iec.size()];
    for (int i = 0; i < this.iec.size(); i++) {
      arrayOfInt[i] = ((bBn)this.iec.get(i)).getId();
    }
    return arrayOfInt;
  }
}