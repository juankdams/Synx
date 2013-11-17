import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cEd extends dno
{
  private static final Logger K = Logger.getLogger(cEd.class);
  private bPr ebM;
  protected Class ixy;
  protected dsj[] ixz;
  protected final dli ixA = new dli();
  protected final adL cHT;
  protected final boolean cHW;

  public bPr ajz()
  {
    return this.ebM;
  }

  public void a(bPr parambPr)
  {
    this.ebM = parambPr;
  }

  public cEd(Class paramClass, adL paramadL, bPr parambPr, short paramShort, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramBoolean1, paramShort);
    this.ixy = paramClass;
    this.ebM = parambPr;
    if ((!paramBoolean1) && (paramBoolean2)) {
      throw new IllegalArgumentException("Impossible de créer un inventaire à la fois non stackable (donc sans quantité) et pour lequel on veut sérialiser une quantité.");
    }

    dy(paramShort);
    this.cHT = paramadL;
    this.cHW = paramBoolean2;
  }

  public final boolean dy(short paramShort)
  {
    if (paramShort < cFy()) {
      K.error("Can't decrease the size of an ArrayInventory");
      return false;
    }
    if ((this.ixz != null) && (paramShort == cFy())) {
      return true;
    }

    super.dy(paramShort);

    if (this.ixz == null) {
      this.ixz = ((dsj[])Array.newInstance(this.ixy, paramShort));
    } else {
      dsj[] arrayOfdsj = (dsj[])Array.newInstance(this.ixy, paramShort);
      System.arraycopy(this.ixz, 0, arrayOfdsj, 0, this.ixz.length);
      this.ixz = arrayOfdsj;
    }

    this.ixA.ensureCapacity(paramShort);
    return true;
  }

  public boolean l(dsj paramdsj) {
    return this.ebM.b(this, paramdsj) == 0;
  }

  public boolean a(dsj paramdsj, short paramShort) {
    return this.ebM.a(this, paramdsj, paramShort) == 0;
  }

  public boolean ik(long paramLong) {
    return this.ebM.a(this, ci(paramLong)) == 0;
  }

  public boolean m(dsj paramdsj) {
    return this.ebM.a(this, paramdsj) == 0;
  }

  public boolean c(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if (paramdsj.nP() <= 0) {
      K.error("On essaye d'ajouter un item avec une quantité de " + paramdsj.nP(), new Exception());
      return false;
    }
    if (isFull()) {
      throw new dI("Cannot add item : maximum size of inventory is reached (" + cFy() + ')');
    }
    if (this.ixA.containsKey(paramdsj.oj())) {
      throw new dcF("Item with uniqueID " + paramdsj.oj() + " is already present in the inventory");
    }

    short s1 = -1;
    short s2 = 0; for (int i = (short)this.ixz.length; s2 < i; s2 = (short)(s2 + 1)) {
      if (this.ixz[s2] == null) {
        s1 = s2;
        break;
      }
    }
    if (s1 == -1) {
      throw new dI("Cannot add item : no left space for it (strange, should have said Inventory is full before. Size : " + size() + " MaxSize : " + cFy());
    }

    this.ixz[s1] = paramdsj;
    this.ixA.r(paramdsj.oj(), s1);
    b(YS.b(this, paramdsj, s1));
    return true;
  }

  public boolean c(long paramLong, short paramShort)
  {
    if (!this.lmK) {
      K.error("Cannot update quantity of a not stackable inventory");
      return false;
    }
    int i = this.ixA.jK(paramLong);
    if (i != -1) {
      dsj localdsj = this.ixz[i];
      if (localdsj != null) {
        if (localdsj.nP() + paramShort <= 0) {
          return e(localdsj);
        }
        if (localdsj.nP() + paramShort > localdsj.nR()) {
          return false;
        }
        localdsj.a(paramShort);
        b(YS.c(this, localdsj, paramShort));
        return true;
      }
    }
    K.error("Item Not found");
    return false;
  }

  public short cf(long paramLong)
  {
    dsj localdsj = ci(paramLong);
    if (localdsj == null) {
      return 0;
    }
    return localdsj.nP();
  }

  public boolean b(dsj paramdsj, short paramShort)
  {
    if (paramdsj == null) {
      K.info("Impossible d'ajouter un item null");
      return false;
    }
    if ((paramShort < 0) || (paramShort >= this.laZ)) {
      K.info("Impossible d'ajouter un item : position en dehors des limites : " + paramShort);
      return false;
    }
    if (this.ixz[paramShort] != null) {
      if ((paramdsj.b(this.ixz[paramShort])) && (paramdsj.nP() + this.ixz[paramShort].nP() < paramdsj.nR())) {
        c(this.ixz[paramShort].oj(), paramdsj.nP());
        return true;
      }
      throw new bQT("Cannot add item " + paramdsj + " at position " + paramShort + " item " + this.ixz[paramShort] + "already present");
    }

    if (this.ixA.containsKey(paramdsj.oj())) {
      throw new dcF("Item with uniqueID " + paramdsj.oj() + " is already present in the inventory");
    }

    this.ixz[paramShort] = paramdsj;
    this.ixA.r(paramdsj.oj(), paramShort);
    b(YS.b(this, paramdsj, paramShort));
    return true;
  }

  public boolean d(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if (this.ixA.N(paramdsj.oj())) {
      short s = this.ixA.jK(paramdsj.oj());
      if (this.ixz[s] != paramdsj) {
        K.error("Problème de logique : table d'index et tableau incohérents. Item attendu à la position " + s + " : " + paramdsj + " item trouvé : " + this.ixz[s]);

        return false;
      }
      this.ixz[s] = null;
      this.ixA.jL(paramdsj.oj());
      b(YS.f(this, paramdsj, s));
      return true;
    }
    return false;
  }

  public void c(dVX paramdVX) {
    for (dsj localdsj : this.ixz)
      if ((localdsj != null) && ((paramdVX == null) || (paramdVX.j(localdsj))))
        e(localdsj);
  }

  public boolean e(dsj paramdsj)
  {
    boolean bool = d(paramdsj);
    paramdsj.release();
    return bool;
  }

  public dsj dz(short paramShort)
  {
    if ((paramShort < 0) || (paramShort >= this.laZ)) {
      return null;
    }
    dsj localdsj = this.ixz[paramShort];
    if (localdsj == null) {
      return null;
    }
    this.ixz[paramShort] = null;
    this.ixA.jL(localdsj.oj());
    b(YS.f(this, localdsj, paramShort));
    return localdsj;
  }

  public boolean dA(short paramShort)
  {
    dsj localdsj = dz(paramShort);
    localdsj.release();
    return true;
  }

  public short il(long paramLong)
  {
    if (!this.ixA.containsKey(paramLong)) {
      return -1;
    }
    return this.ixA.jK(paramLong);
  }

  public short n(dsj paramdsj)
  {
    if (paramdsj == null) {
      return -1;
    }
    return il(paramdsj.oj());
  }

  public dsj cg(long paramLong)
  {
    if (this.ixA.N(paramLong)) {
      short s = this.ixA.jK(paramLong);
      return dz(s);
    }
    return null;
  }

  public bHu xy(int paramInt)
  {
    bHu localbHu = null;
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt)) {
        short s = il(localdsj.oj());
        if (dA(s)) {
          if (localbHu == null) {
            localbHu = new bHu();
          }
          localbHu.add(s);
        }
      }
    }
    return localbHu;
  }

  public bHu ee(int paramInt1, int paramInt2)
  {
    bHu localbHu = null;
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt1)) {
        short s = il(localdsj.oj());
        if (dA(s)) {
          if (localbHu == null) {
            localbHu = new bHu();
          }
          localbHu.add(s);
          if (paramInt2 == 1) {
            return localbHu;
          }
          paramInt2--;
        }
      }
    }

    return localbHu;
  }

  public int nP(int paramInt)
  {
    return 0;
  }

  public int bP(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public Iterator iterator()
  {
    return new tK(this.ixz, false);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[ ");
    localStringBuilder.append(getClass().getSimpleName()).append(' ');
    if (this.ixz == null) {
      localStringBuilder.append("contents=null");
    } else {
      int i = 0; for (int j = this.ixz.length; i < j; i++) {
        localStringBuilder.append(i).append(':');
        dsj localdsj = this.ixz[i];
        if (localdsj == null)
          localStringBuilder.append("<null>");
        else {
          localStringBuilder.append(localdsj.getClass().getSimpleName()).append(",ref=").append(localdsj.ok()).append(",unique=").append(localdsj.oj());
        }
        localStringBuilder.append(' ');
      }
    }
    localStringBuilder.append(" / idxByUid={ ");
    if ((this.ixA != null) && (!this.ixA.isEmpty())) {
      this.ixA.a(new dRr(this, localStringBuilder));
    }

    localStringBuilder.append("} ]");
    return localStringBuilder.toString();
  }

  public boolean f(dsj paramdsj)
  {
    return (paramdsj != null) && (this.ixA.containsKey(paramdsj.oj()));
  }

  public boolean ch(long paramLong)
  {
    return this.ixA.containsKey(paramLong);
  }

  public boolean hg(int paramInt)
  {
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt)) {
        return true;
      }
    }
    return false;
  }

  public boolean cH(short paramShort)
  {
    return (paramShort >= 0) && (paramShort < this.laZ) && (this.ixz[paramShort] == null);
  }

  public dsj dB(short paramShort)
  {
    if ((paramShort < 0) || (paramShort >= this.laZ)) {
      return null;
    }
    return this.ixz[paramShort];
  }

  public dsj ci(long paramLong)
  {
    if (!this.ixA.N(paramLong)) {
      return null;
    }
    int i = this.ixA.jK(paramLong);
    return this.ixz[i];
  }

  public dsj hh(int paramInt)
  {
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt)) {
        return localdsj;
      }
    }
    return null;
  }

  public dsj a(int paramInt, dVX paramdVX) {
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt) && (paramdVX.j(localdsj))) {
        return localdsj;
      }
    }
    return null;
  }

  public ArrayList hi(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt)) {
        localArrayList.add(localdsj);
      }
    }
    return localArrayList;
  }

  public ArrayList b(int paramInt, dVX paramdVX) {
    ArrayList localArrayList = new ArrayList();
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt) && (paramdVX.j(localdsj))) {
        localArrayList.add(localdsj);
      }
    }
    return localArrayList;
  }

  public ArrayList a(dVX paramdVX) {
    ArrayList localArrayList = new ArrayList();
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (paramdVX.j(localdsj))) {
        localArrayList.add(localdsj);
      }
    }
    return localArrayList;
  }

  public int size()
  {
    return this.ixA.size();
  }

  public int ajx()
  {
    int i = size();
    for (int j = this.ixz.length - 1; j >= 0; j--) {
      this.ixz[j] = null;
    }
    this.ixA.clear();
    if (i > 0) {
      b(cLs.a(this));
    }
    return i;
  }

  public int ajy()
  {
    int i = size();
    for (int j = this.ixz.length - 1; j >= 0; j--) {
      if (this.ixz[j] != null) {
        this.ixz[j].release();
      }
      this.ixz[j] = null;
    }
    this.ixA.clear();
    if (i > 0) {
      b(cLs.a(this));
    }
    return i;
  }
}