import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class Nx extends cGj
{
  public static final Nx cdi = new Nx();
  public static final String cdj = "allKnownCrafts";
  public static final String cdk = "crafts";
  public static final String cdl = "craftsByLevel";
  public static final String cdm = "craftsByKnown";
  public static final String cdn = "harvests";
  public static final String cdo = "harvestsByLevel";
  public static final String cdp = "harvestsByKnown";
  private static final Logger K = Logger.getLogger(Nx.class);
  private final ArrayList cdq;
  private final ArrayList cdr;

  public Nx()
  {
    this.cdq = new ArrayList();
    this.cdr = new ArrayList();
  }

  public void clear()
  {
    this.cdr.clear();
    this.cdq.clear();
    dLE.doY().a(this, new String[] { "crafts", "harvests", "craftsByLevel", "harvestsByLevel", "craftsByKnown", "harvestsByKnown", "allKnownCrafts" });
  }

  public asM fT(int paramInt)
  {
    asM localasM;
    for (int i = this.cdr.size() - 1; i >= 0; i--) {
      localasM = (asM)this.cdr.get(i);
      if (localasM.aER() == paramInt) {
        return localasM;
      }
    }

    for (i = this.cdq.size() - 1; i >= 0; i--) {
      localasM = (asM)this.cdq.get(i);
      if (localasM.aER() == paramInt) {
        return localasM;
      }
    }

    return null;
  }

  protected asM fU(int paramInt)
  {
    asM localasM;
    for (int i = this.cdr.size() - 1; i >= 0; i--) {
      localasM = (asM)this.cdr.get(i);
      if (localasM.aER() == paramInt) {
        this.cdr.remove(i);
        return localasM;
      }
    }
    for (i = this.cdq.size() - 1; i >= 0; i--) {
      localasM = (asM)this.cdq.get(i);
      if (localasM.aER() == paramInt) {
        this.cdq.remove(i);
        return localasM;
      }
    }

    return null;
  }

  private boolean c(int[] paramArrayOfInt, int paramInt) {
    for (int k : paramArrayOfInt) {
      if (k == paramInt) {
        return true;
      }
    }
    return false;
  }

  public void k(int[] paramArrayOfInt) {
    this.cdr.clear();
    this.cdq.clear();
    DA.bIr.h(new aDA(this, paramArrayOfInt));

    dLE.doY().a(this, new String[] { "crafts", "harvests", "craftsByLevel", "harvestsByLevel", "craftsByKnown", "harvestsByKnown", "allKnownCrafts" });
  }

  public void fV(int paramInt)
  {
    asM localasM = fT(paramInt);
    if (localasM == null) {
      K.warn("On essaye d'apprendre un craft qui n'est pas dans le CraftManager : " + paramInt);
      return;
    }
    if (localasM.isUnknown()) {
      fU(paramInt);
      aIV localaIV = new aIV(paramInt);
      localaIV.a(new ccW(localaIV, 8));
      if (localaIV.aET())
        this.cdq.add(localaIV);
      else {
        this.cdr.add(localaIV);
      }
    }
    dLE.doY().a(this, new String[] { "crafts", "harvests", "craftsByLevel", "harvestsByLevel", "craftsByKnown", "harvestsByKnown", "allKnownCrafts" });
  }

  public aIV fW(int paramInt)
  {
    for (Iterator localIterator = this.cdr.iterator(); localIterator.hasNext(); ) { localasM = (asM)localIterator.next();
      if ((localasM.aER() == paramInt) && (!localasM.isUnknown()))
        return (aIV)localasM;
    }
    asM localasM;
    for (localIterator = this.cdq.iterator(); localIterator.hasNext(); ) { localasM = (asM)localIterator.next();
      if ((localasM.aER() == paramInt) && (!localasM.isUnknown()))
        return (aIV)localasM;
    }
    return ZH();
  }

  public aIV ZH() {
    int i = 0;
    asM localasM;
    for (int j = this.cdr.size(); i < j; i++) {
      localasM = (asM)this.cdr.get(i);
      if (!localasM.isUnknown())
        return (aIV)localasM;
    }
    i = 0; for (j = this.cdq.size(); i < j; i++) {
      localasM = (asM)this.cdq.get(i);
      if (!localasM.isUnknown()) {
        return (aIV)localasM;
      }
    }
    return null;
  }

  public boolean isEmpty() {
    return (this.cdr.isEmpty()) && (this.cdq.isEmpty());
  }

  public int size() {
    return this.cdr.size() + this.cdq.size();
  }

  public void b(int paramInt, long paramLong) {
    asM localasM = fT(paramInt);
    if ((localasM == null) || (localasM.isUnknown())) {
      return;
    }
    aIV localaIV = (aIV)localasM;
    localaIV.aVd();
  }

  public void fX(int paramInt) {
    asM localasM = fT(paramInt);
    if ((localasM == null) || (localasM.isUnknown())) {
      return;
    }
    aIV localaIV = (aIV)localasM;
    localaIV.aVd();
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("crafts")) {
      Collections.sort(this.cdr, dmC.cUd());
      return this.cdr;
    }if (paramString.equals("craftsByLevel")) {
      Collections.sort(this.cdr, vy.Es());
      return this.cdr;
    }if (paramString.equals("craftsByKnown")) {
      Collections.sort(this.cdr, fM.mR());
      return this.cdr;
    }if (paramString.equals("harvests")) {
      Collections.sort(this.cdq, dmC.cUd());
      return this.cdq;
    }if (paramString.equals("harvestsByLevel")) {
      Collections.sort(this.cdq, vy.Es());
      return this.cdq;
    }if (paramString.equals("harvestsByKnown")) {
      Collections.sort(this.cdq, fM.mR());
      return this.cdq;
    }if (paramString.equals("allKnownCrafts")) {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      asM localasM;
      for (int j = this.cdr.size(); i < j; i++) {
        localasM = (asM)this.cdr.get(i);
        if (!localasM.isUnknown())
        {
          localArrayList.add(localasM);
        }
      }
      i = 0; for (j = this.cdq.size(); i < j; i++) {
        localasM = (asM)this.cdq.get(i);
        if (!localasM.isUnknown())
        {
          localArrayList.add(localasM);
        }
      }
      return localArrayList;
    }

    return null;
  }
}