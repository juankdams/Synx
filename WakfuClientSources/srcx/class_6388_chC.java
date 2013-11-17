import java.util.Arrays;
import org.apache.log4j.Logger;

public class chC
{
  protected static final Logger K = Logger.getLogger(chC.class);

  private static final TY hFQ = new TY();
  private static final dFu hFR = new dFu();
  private int aw;
  protected final cSR hFS = new cSR();

  public chC(int paramInt) {
    this.aw = paramInt;
  }

  public chC() {
  }

  public void a(dQR paramdQR) {
    this.hFS.put(paramdQR.getId(), paramdQR);
  }

  public dQR j(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    int i = l(paramObject1, paramObject2, paramObject3, paramObject4);
    return i == -1 ? null : (dQR)this.hFS.get(i);
  }

  public boolean k(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    return !this.hFS.isEmpty();
  }

  protected boolean a(dQR paramdQR, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    int i = paramdQR.G();
    bZA localbZA = paramdQR.F();
    return (i > 0) && ((localbZA == null) || (localbZA.i(paramObject1, paramObject2, paramObject3, paramObject4)));
  }

  public int l(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (this.hFS.isEmpty()) {
      return -1;
    }
    hFR.clear();
    hFQ.reset();
    if (!this.hFS.isEmpty()) {
      this.hFS.a(new bdt(this, paramObject1, paramObject2, paramObject3, paramObject4));
    }

    int i = hFQ.getValue();
    if (i == 0) {
      return -1;
    }

    int j = dpe.AX(i);
    int[] arrayOfInt = hFR.qe();
    Arrays.sort(arrayOfInt);
    int k = -1;
    int m = 0; for (int n = arrayOfInt.length; (m < n) && (k == -1); m++) {
      if (arrayOfInt[m] >= j) if (j > (m > 0 ? arrayOfInt[(m - 1)] : 0))
          k = arrayOfInt[m];
    }
    if (k == -1) {
      K.warn("Roll sur une DropTable non vide mais avec des poids de drop à 0");
      return -1;
    }

    m = hFR.get(k);

    if (m == -1) {
      K.warn("Roll étrange sur une dropTable : à vérifier");
    }
    return m;
  }

  public dQR vn(int paramInt) {
    return (dQR)this.hFS.get(paramInt);
  }

  public int getId() {
    return this.aw;
  }

  public cSR cjy() {
    return this.hFS;
  }

  public String toString()
  {
    return "DropTable{m_id=" + this.aw + ", m_drops=" + this.hFS.size() + '}';
  }
}