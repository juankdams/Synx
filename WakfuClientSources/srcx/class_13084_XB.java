import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.apache.log4j.Logger;

public abstract class XB extends dno
{
  private static final Logger K = Logger.getLogger(XB.class);
  protected final HashMap cHS;
  protected final adL cHT;
  protected bPr cHU;
  protected final boolean cHV;
  protected final boolean cHW;

  public XB(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramBoolean2, paramShort);
    this.cHS = (paramBoolean1 ? new LinkedHashMap() : new HashMap());
    dy(paramShort);
    this.cHT = paramadL;
    this.cHU = parambPr;
    this.cHV = paramBoolean1;
    this.cHW = paramBoolean3;
  }

  public adL ajw() {
    return this.cHT;
  }

  public boolean c(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if (paramdsj.nP() <= 0) {
      K.warn("Impossile d'ajouter un item avec un quantitée de " + paramdsj.nP());
      return false;
    }

    if (!this.lmK) {
      if (isFull()) {
        throw new dI("Cannot add item : maximum size of inventory is reached (" + cFy() + ')');
      }
      if (this.cHS.containsKey(Long.valueOf(paramdsj.oj()))) {
        throw new dcF("Item with uniqueID " + paramdsj.oj() + " is already present in the inventory", paramdsj, (dsj)this.cHS.get(Long.valueOf(paramdsj.oj())));
      }

      if ((this.cHU != null) && (this.cHU.b(this, paramdsj) != 0)) {
        return false;
      }
      this.cHS.put(Long.valueOf(paramdsj.oj()), paramdsj);
      b(YS.c(this, paramdsj));
      return true;
    }

    int i = paramdsj.nP();

    for (Object localObject = this.cHS.values().iterator(); ((Iterator)localObject).hasNext(); ) { dsj localdsj = (dsj)((Iterator)localObject).next();
      if (paramdsj.b(localdsj)) {
        int j = localdsj.nR() - localdsj.nP();
        if (j > 0) {
          int k = (short)(i < j ? i : j);
          i = (short)(i - k);
          localdsj.a(k);
          b(YS.c(this, localdsj, k));
          if (i <= 0)
          {
            break;
          }
        }
      }
    }
    localObject = paramdsj;
    while (i > 0) {
      short s = i < paramdsj.nR() ? i : paramdsj.nR();
      ((dsj)localObject).l(s);
      i = (short)(i - s);
      if ((this.cHU != null) && (this.cHU.b(this, (dsj)localObject) != 0)) {
        return false;
      }
      this.cHS.put(Long.valueOf(((dsj)localObject).oj()), localObject);
      b(YS.c(this, (dsj)localObject));
      if (i > 0) {
        localObject = ((dsj)localObject).r(false);
      }
    }

    return true;
  }

  public boolean c(long paramLong, short paramShort)
  {
    dsj localdsj = ci(paramLong);
    if (localdsj == null) {
      return false;
    }

    if (localdsj.nP() + paramShort <= 0) {
      return e(localdsj);
    }
    localdsj.a(paramShort);
    b(YS.c(this, localdsj, paramShort));
    return true;
  }

  public short cf(long paramLong)
  {
    dsj localdsj = ci(paramLong);
    if (localdsj == null) {
      return 0;
    }
    return localdsj.nP();
  }

  public boolean d(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if ((this.cHU != null) && (this.cHU.a(this, paramdsj) != 0)) {
      return false;
    }
    if (this.cHS.remove(Long.valueOf(paramdsj.oj())) == null) {
      return false;
    }
    b(YS.d(this, paramdsj));
    return true;
  }

  public boolean e(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if ((this.cHU != null) && (this.cHU.a(this, paramdsj) != 0)) {
      return false;
    }
    if (this.cHS.remove(Long.valueOf(paramdsj.oj())) == null) {
      return false;
    }
    b(YS.d(this, paramdsj));
    paramdsj.release();
    return true;
  }

  public dsj cg(long paramLong)
  {
    dsj localdsj = (dsj)this.cHS.get(Long.valueOf(paramLong));
    if (localdsj == null) {
      return null;
    }
    if ((this.cHU != null) && (this.cHU.a(this, localdsj) != 0)) {
      return null;
    }
    this.cHS.remove(Long.valueOf(paramLong));
    b(YS.d(this, localdsj));
    return localdsj;
  }

  public Iterator iterator()
  {
    return this.cHS.values().iterator();
  }

  public boolean f(dsj paramdsj)
  {
    return (paramdsj != null) && (this.cHS.containsKey(Long.valueOf(paramdsj.oj())));
  }

  public boolean ch(long paramLong)
  {
    return this.cHS.containsKey(Long.valueOf(paramLong));
  }

  public boolean hg(int paramInt)
  {
    for (dsj localdsj : this.cHS.values()) {
      if (localdsj.ok() == paramInt) {
        return true;
      }
    }
    return false;
  }

  public dsj ci(long paramLong)
  {
    return (dsj)this.cHS.get(Long.valueOf(paramLong));
  }

  public dsj hh(int paramInt)
  {
    for (dsj localdsj : this.cHS.values()) {
      if (localdsj.ok() == paramInt) {
        return localdsj;
      }
    }
    return null;
  }

  public dsj a(int paramInt, dVX paramdVX) {
    for (dsj localdsj : this.cHS.values()) {
      if ((localdsj.ok() == paramInt) && (paramdVX.j(localdsj))) {
        return localdsj;
      }
    }
    return null;
  }

  public ArrayList hi(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    for (dsj localdsj : this.cHS.values()) {
      if ((localdsj.ok() == paramInt) || (paramInt == -1)) {
        localArrayList.add(localdsj);
      }
    }
    return localArrayList;
  }

  public ArrayList b(int paramInt, dVX paramdVX) {
    ArrayList localArrayList = new ArrayList();
    for (dsj localdsj : this.cHS.values()) {
      if (((localdsj.ok() == paramInt) || (paramInt == -1)) && (paramdVX.j(localdsj))) {
        localArrayList.add(localdsj);
      }
    }
    return localArrayList;
  }

  public ArrayList a(dVX paramdVX) {
    ArrayList localArrayList = new ArrayList();
    for (dsj localdsj : this.cHS.values()) {
      if ((localdsj != null) && (paramdVX.j(localdsj))) {
        localArrayList.add(localdsj);
      }
    }
    return localArrayList;
  }

  public int size()
  {
    return this.cHS.size();
  }

  public int ajx()
  {
    int i = size();
    this.cHS.clear();
    if (i > 0) {
      b(cLs.a(this));
    }
    return i;
  }

  public int ajy()
  {
    int i = size();
    for (dsj localdsj : this.cHS.values()) {
      localdsj.release();
    }
    this.cHS.clear();
    if (i > 0) {
      b(cLs.a(this));
    }
    return i;
  }

  public bPr ajz()
  {
    return this.cHU;
  }

  public void a(bPr parambPr)
  {
    this.cHU = parambPr;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("StackInventory = ");
    for (dsj localdsj : this.cHS.values()) {
      localStringBuilder.append(localdsj.oj()).append(' ');
    }
    return localStringBuilder.toString();
  }
}