import java.util.ArrayList;
import java.util.List;

public abstract class cQo
  implements dqD
{
  protected boolean bKT;
  protected final aoL kBm = new aoL();
  private int kBn;
  private final List aEZ = new ArrayList();

  public dsj jb(long paramLong) {
    return (dsj)this.kBm.get(paramLong);
  }

  public void a(long paramLong, dsj paramdsj) {
    this.kBm.put(paramLong, paramdsj);
  }

  public void jc(long paramLong) {
    this.kBm.remove(paramLong);
  }

  public int cHh() {
    return this.kBm.size();
  }

  public boolean cHi() {
    return this.kBm.isEmpty();
  }

  public cHu cHj() {
    return this.kBm.aBa();
  }

  public void clear() {
    this.kBn = 0;
    this.kBm.s(fR.aDm);
    this.kBm.clear();
  }

  public boolean gI() {
    return this.bKT;
  }

  public void dq(boolean paramBoolean) {
    this.bKT = paramBoolean;
    cHl();
  }

  public int cHk() {
    return this.kBn;
  }

  public void yQ(int paramInt) {
    this.kBn = paramInt;
  }

  private void cHl() {
    for (int i = 0; i < this.aEZ.size(); i++)
      ((czw)this.aEZ.get(i)).j(this);
  }

  public boolean a(czw paramczw)
  {
    return (!this.aEZ.contains(paramczw)) && (this.aEZ.add(paramczw));
  }

  public boolean b(czw paramczw) {
    return this.aEZ.remove(paramczw);
  }
}