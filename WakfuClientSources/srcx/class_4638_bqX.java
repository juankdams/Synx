import java.util.Collection;
import java.util.HashSet;

public final class bqX
{
  public static final bqX fMi = new bqX();
  private drS fMj;
  private final Collection fMk = new HashSet();

  public drS a(int paramInt, long paramLong1, long paramLong2) {
    drS localdrS = new drS(paramInt, paramLong1, paramLong2);
    if (this.fMj != null) {
      this.fMj.a(localdrS);
    }
    this.fMj = localdrS;
    this.fMk.add(new amQ(this, paramInt, paramLong1, paramLong2, null));
    return localdrS;
  }

  void bzM() {
    drS localdrS = this.fMj;
    if (this.fMj.cYC() != null)
      localdrS.cYC().b(this.fMj);
    this.fMj = this.fMj.cYC();
    localdrS.clear();
  }

  public boolean g(int paramInt, long paramLong) {
    if (this.fMj == null)
      return false;
    if ((this.fMj.yR() == paramInt) && (this.fMj.gA() == paramLong))
      return true;
    return this.fMj.B(paramInt, paramLong);
  }

  drS bzN() {
    return this.fMj;
  }

  public void clear() {
    this.fMj = null;
    this.fMk.clear();
  }

  public String toString()
  {
    if (this.fMj == null)
      return "empty";
    return this.fMj.toString();
  }

  public boolean b(int paramInt, long paramLong1, long paramLong2) {
    return this.fMk.contains(new amQ(this, paramInt, paramLong1, paramLong2, null));
  }
}