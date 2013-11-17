import java.util.ArrayList;
import java.util.List;

final class aCr
{
  private final KR dWM = new KR();
  private final KR dWN = new KR();

  private List dWO = null;

  public void g(short paramShort, int paramInt) {
    int i = this.dWM.b(paramShort, paramInt, paramInt);
    if (this.dWO != null) {
      int j = 0; for (int k = this.dWO.size(); j < k; j++)
        ((dyI)this.dWO.get(j)).d(paramShort, i);
    }
  }

  public int aY(short paramShort)
  {
    return this.dWM.L(paramShort);
  }

  public void h(short paramShort, int paramInt) {
    int i = this.dWN.b(paramShort, paramInt, paramInt);
    if (this.dWO != null) {
      int j = 0; for (int k = this.dWO.size(); j < k; j++)
        ((dyI)this.dWO.get(j)).e(paramShort, i);
    }
  }

  public int aZ(short paramShort)
  {
    return this.dWN.L(paramShort);
  }

  public void a(dyI paramdyI) {
    if (this.dWO == null) {
      this.dWO = new ArrayList(2);
    }

    this.dWO.add(paramdyI);
  }

  public void b(dyI paramdyI) {
    if (this.dWO == null) {
      return;
    }

    this.dWO.remove(paramdyI);
  }

  public void clear() {
    this.dWM.clear();
    this.dWN.clear();
    this.dWO = null;
  }
}