import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.HashMap;

public class cTB extends bgJ
{
  private long aPT;
  private int kv;
  private final dUy kFZ = new dUy();

  private sX kGa = null;

  public cTB(dle paramdle) {
    super(paramdle);
  }

  public void clear() {
    this.kFZ.clear();
    if (this.kGa != null)
      this.kGa.clear();
    super.clear();
  }

  public void bbk() {
    this.kFZ.clear();
    if (this.kGa != null)
      this.kGa.clear();
    super.bbk();
  }

  public void btm() {
    cAo.cxf().ia(this.aPT);
    super.btm();
  }

  public boolean a(cWG paramcWG)
  {
    if (!(paramcWG instanceof dKQ))
      return false;
    if (((dKQ)paramcWG).czk() != this.aPT)
      return super.a(paramcWG);
    if (!this.kFZ.isEmpty()) {
      this.kv += 1;
      HashMap localHashMap = new HashMap();

      for (long l : this.kFZ.aBb()) {
        aVc localaVc = (aVc)this.kCz.get(l);
        if (localaVc != null)
          localHashMap.put(Integer.valueOf(jg(l)), localaVc);
      }
      if (WakfuClientInstance.awy().awz().bFO() != null)
        WakfuClientInstance.awy().awz().bFO().a(new dTs(localHashMap));
      return true;
    }
    return true;
  }

  public boolean k(long paramLong, boolean paramBoolean)
  {
    this.kFZ.la(paramLong);
    return super.k(paramLong, paramBoolean);
  }

  public void F(aVc paramaVc)
  {
    int i = 0;
    doA localdoA = (doA)paramaVc;
    if (localdoA.aIq() != null) {
      if ((!localdoA.isInfinite()) && (localdoA.bWn())) {
        i = localdoA.bWm();
        this.kFZ.G(localdoA.oj(), this.kv + i / 1000);
      }
      super.F(paramaVc);
    }
  }

  public void a(dle paramdle, cOE paramcOE) {
    this.aPT = cAo.cxf().a(this, 1000L, 0);
    this.kv = 0;
    this.kGa = null;
    super.a(paramdle, paramcOE);
  }

  public void a(sX paramsX) {
    this.kGa = paramsX;
  }

  public int jg(long paramLong) {
    if (this.kFZ.kZ(paramLong) > this.kv) {
      return this.kFZ.kZ(paramLong) - this.kv;
    }
    return -1;
  }
}