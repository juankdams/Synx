import org.apache.log4j.Logger;

public class dQG extends dfy
{
  private static final Logger K = Logger.getLogger(dQG.class);

  public dQG(adL paramadL, bPr parambPr, short paramShort, boolean paramBoolean) {
    super(paramadL, parambPr, paramShort, paramBoolean);
  }

  private void eN(short paramShort)
  {
    int i = 0;
    int j = paramShort; for (int k = (short)this.ixz.length; j < k; j = (short)(j + 1))
      if (this.ixz[j] == null) {
        i = (short)(i + 1);
      }
      else if (i > 0) {
        this.ixz[(j - i)] = this.ixz[j];
        this.ixA.jL(this.ixz[j].oj());
        this.ixz[j] = null;
        this.ixA.r(this.ixz[(j - i)].oj(), (short)(j - i));
      }
  }

  public dsj dz(short paramShort)
  {
    dsj localdsj = super.dz(paramShort);
    if (localdsj != null)
      eN(paramShort);
    return localdsj;
  }

  public boolean d(dsj paramdsj)
  {
    boolean bool = super.d(paramdsj);
    if (bool)
      eN((short)0);
    return bool;
  }

  public dsj cg(long paramLong)
  {
    dsj localdsj = super.cg(paramLong);
    if (localdsj != null)
      eN((short)0);
    return localdsj;
  }

  public int nP(int paramInt)
  {
    int i = super.nP(paramInt);
    eN((short)0);
    return i;
  }

  public boolean c(long paramLong, short paramShort)
  {
    boolean bool = super.c(paramLong, paramShort);
    eN((short)0);
    return bool;
  }

  public boolean d(dsj paramdsj, short paramShort)
  {
    boolean bool = super.d(paramdsj, paramShort);
    eN((short)0);
    return bool;
  }

  public boolean q(long paramLong, short paramShort)
  {
    boolean bool = super.q(paramLong, paramShort);
    eN((short)0);
    return bool;
  }

  public boolean e(dsj paramdsj, short paramShort)
  {
    if (paramdsj == null) {
      K.info("Impossible d'ajouter un item null");
      return false;
    }
    if ((paramShort < 0) || (paramShort >= this.laZ)) {
      K.info("Impossible d'ajouter un item : position en dehors des limites : " + paramShort);
      return false;
    }
    if ((this.cHU != null) && (this.cHU.a(this, paramdsj, paramShort) != 0)) {
      K.info("Position refusée par le checker");
      return false;
    }
    if (isFull())
      throw new dI("Cannot add item : maximum size of inventory is reached (" + cFy() + ")");
    if (this.ixA.containsKey(paramdsj.oj())) {
      throw new dcF("Item with uniqueID " + paramdsj.oj() + " is already present in the inventory");
    }

    if (this.ixz[(this.ixz.length - 1)] != null) {
      throw new cn("if the inventory is not full, then we should not have an object in the last position");
    }
    if (paramShort >= this.ixA.size())
      paramShort = (short)this.ixA.size();
    else {
      for (short s = this.ixz.length - 1; s > paramShort; s--) {
        this.ixz[s] = this.ixz[(s - 1)];
        this.ixz[(s - 1)] = null;
        if (this.ixz[s] != null) {
          this.ixA.r(this.ixz[s].oj(), (short)s);
        }
      }
    }
    if (this.ixz[paramShort] != null) {
      throw new bQT("Cannot add item " + paramdsj + " at position " + paramShort + " item " + this.ixz[paramShort] + "already present");
    }

    this.ixz[paramShort] = paramdsj;
    this.ixA.r(paramdsj.oj(), paramShort);
    b(YS.b(this, paramdsj, paramShort));

    return true;
  }
}