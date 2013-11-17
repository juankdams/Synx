import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class dcy extends Vl
{
  public static final dcy kVz = new dcy();

  private final Object aNy = new Object();
  private final List aEZ = new ArrayList();
  private boolean kVA;
  private Map kVB;

  private dcy()
  {
    super(ay.bd().getString("gameAuthentificationSOAPUrl", null), new cuo());
  }

  public void a(dxk paramdxk)
  {
    synchronized (this.aNy) {
      if (this.kVB != null) {
        paramdxk.e(this.kVB);
      } else {
        this.aEZ.add(paramdxk);
        if (!this.kVA) {
          this.kVA = true;
          bbN.fls.a(new bho(this));
        }
      }
    }
  }

  public void r(Map paramMap)
  {
    synchronized (this.aNy) {
      this.kVB = paramMap;
      int i = 0; for (int j = this.aEZ.size(); i < j; i++) {
        ((dxk)this.aEZ.get(i)).e(paramMap);
      }
      this.aEZ.clear();
      this.kVA = false;
    }
  }

  private void oT(String paramString) {
    synchronized (this.aNy) {
      b(new CR(paramString));
    }
  }

  public void clear() {
    synchronized (this.aNy) {
      this.kVA = false;
      this.aEZ.clear();
      this.kVB = null;
    }
  }

  public String toString()
  {
    return "AuthentificationManager{}";
  }
}