import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dfy extends dno
  implements bXd
{
  private static final Logger K = Logger.getLogger(dfy.class);
  protected dsj[] ixz;
  protected final dli ixA;
  protected final adL cHT;
  protected bPr cHU;

  public dfy(adL paramadL, bPr parambPr, short paramShort, boolean paramBoolean)
  {
    super(paramBoolean, paramShort);
    this.ixz = ((dsj[])new dsj[paramShort]);
    this.ixA = new dli(paramShort);
    this.cHT = paramadL;
    this.cHU = parambPr;
  }

  public boolean dy(short paramShort)
  {
    if (paramShort < this.laZ) {
      K.error("Can't decrease the size of an ArrayInventory");
      return false;
    }

    if ((this.ixz != null) && (paramShort == this.laZ)) {
      return true;
    }

    if (!super.dy(paramShort)) {
      return false;
    }

    dsj[] arrayOfdsj = (dsj[])new dsj[paramShort];
    System.arraycopy(this.ixz, 0, arrayOfdsj, 0, this.ixz.length);
    this.ixz = arrayOfdsj;

    this.ixA.ensureCapacity(paramShort);
    return true;
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
    if (this.ixA.containsKey(paramdsj.oj())) {
      throw new dcF("Item with uniqueID " + paramdsj.oj() + " is already present in the inventory");
    }
    if ((this.cHU != null) && (this.cHU.b(this, paramdsj) != 0)) {
      return false;
    }

    short s1 = -1;
    short s2 = -1;
    short s3 = 0;
    int j;
    for (short s4 = (short)this.ixz.length; s3 < s4; s3 = (short)(s3 + 1)) {
      if ((this.ixz[s3] != null) && 
        (paramdsj.b(this.ixz[s3]))) {
        j = paramdsj.nR() > 1 ? 1 : 0;

        if (s1 != -1)
        {
          if (this.ixz[s1].nP() < this.ixz[s3].nP()) {
            j = 0;
          }
        }

        if (j != 0) {
          s1 = s3;
        }
      }

      if ((this.ixz[s3] == null) && (s2 == -1))
      {
        s2 = s3;
      }

    }

    if ((isFull()) && (s1 == -1)) {
      throw new dI("Cannot add item : maximum size of inventory is reached (" + cFy() + ')');
    }

    if ((s1 >= 0) && (paramdsj.nP() + this.ixz[s1].nP() > paramdsj.nR()) && (s2 == -1)) {
      throw new dI("Cannot add item : There is a possible stack, but his maxSize will be reached, and there is no free place for the rest.  MaxSize : " + cFy());
    }

    s3 = 0;
    if (s1 != -1) {
      int i = this.ixz[s1].nR() - this.ixz[s1].nP();
      j = paramdsj.nP();
      s3 = (short)(i < j ? i : j);
      this.ixz[s1].a(s3);
      b(YS.a(this, this.ixz[s1], s1, s3));
    }
    if (paramdsj.nP() - s3 > 0) {
      paramdsj.a((short)-s3);
      if ((paramdsj.nP() > 0) && (s2 != -1)) {
        this.ixz[s2] = paramdsj;
        this.ixA.r(paramdsj.oj(), s2);
        b(YS.b(this, paramdsj, s2));
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

  public boolean b(dsj paramdsj, short paramShort)
  {
    if (paramdsj == null) {
      K.info("Impossible d'ajouter un item null");
      return false;
    }
    if ((paramShort < 0) || (paramShort >= this.laZ)) {
      K.info("Impossible d'ajouter un item : position en dehors des limites : " + paramShort, new Exception());
      return false;
    }
    if ((this.cHU != null) && (this.cHU.a(this, paramdsj, paramShort) != 0)) {
      K.info("Position refusée par le checker");
      return false;
    }

    if (this.ixA.containsKey(paramdsj.oj())) {
      throw new dcF("Item with uniqueID " + paramdsj.oj() + " is already present in the inventory");
    }

    dsj localdsj = this.ixz[paramShort];
    if (localdsj == null)
    {
      this.ixz[paramShort] = paramdsj;
      this.ixA.r(paramdsj.oj(), paramShort);
      b(YS.b(this, paramdsj, paramShort));
      return true;
    }

    if (!paramdsj.b(localdsj)) {
      throw new bQT("Cannot add item " + paramdsj + " at position " + paramShort + " item " + this.ixz[paramShort] + "already present");
    }

    if (localdsj.nR() - localdsj.nP() < paramdsj.nP()) {
      throw new bQT("Cannot add item " + paramdsj + " at position " + paramShort + " item " + this.ixz[paramShort] + "already present");
    }

    return c(localdsj.oj(), paramdsj.nP());
  }

  public boolean d(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if (this.ixA.N(paramdsj.oj())) {
      short s = this.ixA.jK(paramdsj.oj());
      if ((this.ixz[s] == null) || (this.ixz[s].oj() != paramdsj.oj())) {
        K.error("Problème de logique : table d'index et tableau incohérents. Item attendu à la position " + s + " : " + paramdsj + " item trouvé : " + this.ixz[s]);

        return false;
      }
      if (!t(paramdsj)) {
        return false;
      }
      b(YS.f(this, paramdsj, s));
      return true;
    }
    return false;
  }

  public boolean e(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if (this.ixA.N(paramdsj.oj())) {
      short s = this.ixA.jK(paramdsj.oj());
      if ((this.ixz[s] == null) || (this.ixz[s].oj() != paramdsj.oj())) {
        K.error("Problème de logique : table d'index et tableau incohérents. Item attendu à la position " + s + " : " + paramdsj + " item trouvé : " + this.ixz[s]);

        return false;
      }
      if (!t(paramdsj)) {
        return false;
      }
      b(YS.f(this, paramdsj, s));
      paramdsj.release();
      return true;
    }
    return false;
  }

  public dsj dz(short paramShort)
  {
    dsj localdsj = this.ixz[paramShort];
    if (localdsj == null) {
      return null;
    }
    if (!t(localdsj)) {
      return null;
    }
    b(YS.f(this, localdsj, paramShort));
    return localdsj;
  }

  public boolean dA(short paramShort)
  {
    if ((paramShort < 0) || (paramShort >= this.laZ)) {
      return false;
    }
    dsj localdsj = this.ixz[paramShort];
    if (localdsj == null) {
      return false;
    }
    if (!t(localdsj)) {
      return false;
    }
    b(YS.f(this, localdsj, paramShort));
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
      short s = this.ixA.jL(paramLong);
      if ((this.ixz[s] == null) || (this.ixz[s].oj() != paramLong)) {
        K.error("Problème de logique : table d'index et tableau incohérents. Item attendu à la position " + s + " : id " + paramLong + ". item trouvé : " + this.ixz[s] + (this.ixz[s] == null ? "" : new StringBuilder().append("(id : ").append(this.ixz[s].oj()).append(')').toString()));

        this.ixz[s] = null;
        return null;
      }
      dsj localdsj = this.ixz[s];
      if ((this.cHU != null) && (this.cHU.a(this, localdsj) != 0)) {
        return null;
      }
      this.ixz[s] = null;
      b(YS.f(this, localdsj, s));
      return localdsj;
    }
    return null;
  }

  public void c(dVX paramdVX) {
    for (dsj localdsj : this.ixz)
      if ((localdsj != null) && ((paramdVX == null) || (paramdVX.j(localdsj))))
        e(localdsj);
  }

  public int nP(int paramInt)
  {
    int i = 0;
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt)) {
        i += localdsj.nP();
        e(localdsj);
      }
    }
    return i;
  }

  public int bP(int paramInt1, int paramInt2)
  {
    int i = 0;
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt1)) {
        int m = localdsj.nP();
        if (m <= paramInt2 - i) {
          if (e(localdsj))
            i += m;
        }
        else {
          localdsj.a((short)(i - paramInt2));
          return paramInt2;
        }
      }
      if (i >= paramInt2) {
        return i;
      }
    }
    return i;
  }

  public Iterator iterator()
  {
    return jb(false);
  }

  public Iterator jb(boolean paramBoolean) {
    return new tK(this.ixz, paramBoolean);
  }

  public dsj[] a(dsj[] paramArrayOfdsj) {
    System.arraycopy(this.ixz, 0, paramArrayOfdsj, 0, this.ixz.length);
    return paramArrayOfdsj;
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

  public dsj a(int paramInt, dVX paramdVX)
  {
    for (dsj localdsj : this.ixz) {
      if ((localdsj != null) && (localdsj.ok() == paramInt) && (paramdVX.j(localdsj))) {
        return localdsj;
      }
    }
    return null;
  }

  public short r(dsj paramdsj) {
    short s = 0;
    for (dsj localdsj : this.ixz) {
      if (paramdsj.b(localdsj)) {
        return s;
      }
      s = (short)(s + 1);
    }
    return -1;
  }

  public short bQI() {
    short s = 0;
    for (dsj localdsj : this.ixz) {
      if (localdsj == null) {
        return s;
      }
      s = (short)(s + 1);
    }
    return -1;
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
    if (i == 0) {
      return 0;
    }
    for (int j = this.ixz.length - 1; j >= 0; j--) {
      this.ixz[j] = null;
    }
    this.ixA.clear();

    b(cLs.a(this));
    return i;
  }

  public int ajy()
  {
    int i = size();
    if (i == 0) {
      return 0;
    }
    for (int j = this.ixz.length - 1; j >= 0; j--) {
      if (this.ixz[j] != null) {
        this.ixz[j].release();
      }
      this.ixz[j] = null;
    }
    this.ixA.clear();
    b(cLs.a(this));
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

  public boolean l(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }

    if (paramdsj.nP() <= 0) {
      K.error("On essaye de simuler l'ajout d'un item avec une quantité de " + paramdsj.nP(), new Exception());
      return false;
    }

    if (ci(paramdsj.oj()) != null) {
      K.error("Simulation : Item with uniqueID " + paramdsj.oj() + " is already present in the inventory", new dcF());
      return false;
    }

    if ((this.cHU != null) && (this.cHU.b(this, paramdsj) != 0)) {
      return false;
    }

    if (!isFull()) {
      return true;
    }
    if (!this.lmK) {
      return false;
    }

    int i = paramdsj.nP();
    int j = 0; for (int k = this.ixz.length; (j < k) && (i > 0); j++) {
      dsj localdsj = this.ixz[j];
      if (paramdsj.b(localdsj))
      {
        int m = localdsj.nR() - localdsj.nP();
        i = (short)(i - m);
      }
    }
    return i <= 0;
  }

  public boolean a(dsj paramdsj, short paramShort) {
    if (paramdsj == null) {
      return false;
    }

    if (paramdsj.nP() <= 0) {
      K.error("On essaye de simuler l'ajout d'un item avec une quantité de " + paramdsj.nP(), new Exception());
      return false;
    }

    if (ci(paramdsj.oj()) != null) {
      K.error("Simulation : Item with uniqueID " + paramdsj.oj() + " is already present in the inventory", new dcF());
      return false;
    }

    if ((paramShort < 0) || (paramShort > this.laZ - 1)) {
      return false;
    }

    if ((this.cHU != null) && (this.cHU.a(this, paramdsj, paramShort) != 0)) {
      return false;
    }

    dsj localdsj = this.ixz[paramShort];
    if (localdsj == null) {
      return true;
    }

    int i = localdsj.nR() - localdsj.nP() >= paramdsj.nP() ? 1 : 0;
    return (this.lmK) && (paramdsj.b(localdsj)) && (i != 0);
  }

  public boolean m(dsj paramdsj) {
    return (paramdsj != null) && (!isEmpty()) && (ch(paramdsj.oj())) && (f(paramdsj)) && ((this.cHU == null) || (this.cHU.a(this, paramdsj) == 0));
  }

  public boolean n(long paramLong, short paramShort)
  {
    dsj localdsj = ci(paramLong);

    if (localdsj == null) {
      return false;
    }

    if (paramShort > localdsj.nP()) {
      return false;
    }

    return (this.cHU == null) || (this.cHU.a(this, localdsj) == 0);
  }

  public boolean s(dsj paramdsj)
  {
    if (paramdsj == null) {
      return false;
    }
    if (paramdsj.nP() <= 0) {
      K.error("On essaye de simuler l'ajout d'un item avec une quantité de " + paramdsj.nP(), new Exception());
      return false;
    }

    if (this.ixA.containsKey(paramdsj.oj())) {
      throw new dcF("Simulation : Item with uniqueID " + paramdsj.oj() + " is already present in the inventory");
    }
    if ((this.cHU != null) && (this.cHU.b(this, paramdsj) != 0)) {
      return false;
    }

    int i = -1;
    short s1 = -1;
    short s2 = 0;
    int j;
    for (short s3 = (short)this.ixz.length; s2 < s3; s2 = (short)(s2 + 1)) {
      if ((this.ixz[s2] != null) && 
        (this.ixz[s2] != null) && (paramdsj.b(this.ixz[s2]))) {
        j = 1;

        if (i != -1)
        {
          if (this.ixz[i].nP() < this.ixz[s2].nP()) {
            j = 0;
          }
        }

        if (j != 0) {
          i = s2;
        }
      }

      if ((this.ixz[s2] == null) && (s1 == -1))
      {
        s1 = s2;
      }

    }

    if ((isFull()) && (i == -1)) {
      return false;
    }

    if ((i >= 0) && (paramdsj.nP() + this.ixz[i].nP() > paramdsj.nR()) && (s1 == -1)) {
      return false;
    }

    s2 = 0;
    s3 = -1;
    if (i != -1) {
      j = this.ixz[i].nR() - this.ixz[i].nP();
      int k = paramdsj.nP();
      s2 = (short)(j < k ? j : k);
      s3 = this.ixz[i].nP();
      this.ixz[i].a(s2);
    }
    if (paramdsj.nP() - s2 > 0) {
      if (i != -1) {
        this.ixz[i].a((short)-s2);
      }
      if ((paramdsj.nP() > 0) && (s1 != -1)) {
        this.ixz[s1] = paramdsj;
        this.ixA.r(paramdsj.oj(), s1);

        this.ixz[s1] = null;
        this.ixA.jL(paramdsj.oj());
        return true;
      }
    } else if (s3 != -1) {
      this.ixz[i].l(s3);
      return true;
    }
    return false;
  }

  public boolean d(dsj paramdsj, short paramShort)
  {
    Object localObject = ci(paramdsj.oj());
    if (localObject == null) {
      for (dsj localdsj : hi(paramdsj.ok())) {
        if (localdsj.nP() > 1) {
          localObject = localdsj;
        }
      }
    }
    if (localObject == null) {
      return false;
    }
    if (((dsj)localObject).nP() + paramShort <= 0)
      t((dsj)localObject);
    else {
      ((dsj)localObject).a(paramShort);
    }
    return true;
  }

  public boolean q(long paramLong, short paramShort)
  {
    dsj localdsj = ci(paramLong);
    if (localdsj == null) {
      return false;
    }
    if (localdsj.nP() + paramShort <= 0)
      t(localdsj);
    else {
      localdsj.a(paramShort);
    }
    return true;
  }

  public adL ajw() {
    return this.cHT;
  }

  private boolean t(dsj paramdsj)
  {
    if ((this.cHU != null) && (this.cHU.a(this, paramdsj) != 0)) {
      return false;
    }
    int i = this.ixA.jL(paramdsj.oj());
    if ((i == 0) && ((this.ixz[i] == null) || (this.ixz[i].oj() != paramdsj.oj()))) {
      return false;
    }
    this.ixz[i] = null;
    return true;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append(getClass().getSimpleName());
    int i = 0; for (int j = this.ixz.length; i < j; i++) {
      dsj localdsj = this.ixz[i];
      localStringBuilder.append(' ').append(i).append(": ");
      if (localdsj != null)
        localStringBuilder.append(localdsj);
      else {
        localStringBuilder.append("{}");
      }
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }

  public String ov() {
    return "arrayInventory";
  }
}