import java.util.ArrayList;
import java.util.Collection;

public final class drS
{
  private final int baA;
  private final long bux;
  private final long kD;
  private final Collection luj = new ArrayList();
  private drS luk;

  drS(int paramInt, long paramLong1, long paramLong2)
  {
    this.baA = paramInt;
    this.bux = paramLong1;
    this.kD = paramLong2;
  }

  void a(drS paramdrS) {
    this.luj.add(paramdrS);
    paramdrS.luk = this;
  }

  boolean b(drS paramdrS) {
    return this.luj.remove(paramdrS);
  }

  boolean B(int paramInt, long paramLong) {
    if (this.luk == null)
      return false;
    if ((this.luk.baA == paramInt) && (this.luk.kD == paramLong))
      return true;
    return this.luk.B(paramInt, paramLong);
  }

  boolean c(int paramInt, long paramLong1, long paramLong2) {
    if (this.luk == null)
      return false;
    if ((this.luk.baA == paramInt) && (this.luk.kD == paramLong1) && (this.luk.bux == paramLong2))
      return true;
    return this.luk.c(paramInt, paramLong1, paramLong2);
  }

  public boolean c(drS paramdrS) {
    return this.luj.contains(paramdrS);
  }

  public int yR() {
    return this.baA;
  }

  public drS cYC() {
    return this.luk;
  }

  public long gA() {
    return this.kD;
  }

  public void clear() {
    this.luk = null;
    this.luj.clear();
  }

  public String toString()
  {
    if (this.luk == null)
      return this.baA + "( casterId = " + this.bux + "), ( targetId = " + this.kD + ")";
    return this.baA + "( casterId = " + this.bux + "), ( targetId = " + this.kD + ") <- " + this.luk.toString();
  }
}