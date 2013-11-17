import java.util.ArrayList;
import org.apache.log4j.Logger;

class azF
{
  protected static final Logger K = Logger.getLogger(azF.class);
  private static final dGy dRe = new cDQ();

  private static final dGy dRf = new cDT();

  private final dGy dRg = new cDR(this);

  private final cSR dRh = new cSR();
  private final ArrayList dRi = new ArrayList();
  private final cSR dRj = new cSR();

  void a(ckq paramckq, cXf paramcXf)
  {
    if ((!bB) && (this.dRh.size() != 0)) throw new AssertionError();
    agQ[] arrayOfagQ1 = paramckq.cmp();
    for (agQ localagQ : arrayOfagQ1)
      if (localagQ.adi() == sF.bbM) {
        bYb localbYb = (bYb)localagQ;
        bGg localbGg = localbYb.xv();
        int k = localagQ.xj();
        this.dRh.put(k, new aIL(this, localbGg, null));
        localbGg.f(paramcXf);
        this.dRj.put(k, new ArrayList());
      }
  }

  ArrayList A(ArrayList paramArrayList)
  {
    this.dRi.clear();
    if (paramArrayList.isEmpty()) {
      return this.dRi;
    }
    int i = -1;
    int j = 0; for (int k = paramArrayList.size(); j < k; j++) {
      dRE localdRE = (dRE)paramArrayList.get(j);
      if (localdRE.isActive())
      {
        float f = localdRE.xP();
        if (i != localdRE.dsx()) {
          i = localdRE.dsx();
          aLz();
        }
        ArrayList localArrayList = localdRE.mnh.bsF();
        int m = localArrayList.size();
        for (int n = 0; n < m; n++) {
          cwG localcwG = (cwG)localArrayList.get(n);
          if (localcwG.isActive())
            a(localcwG, f); 
        }
      }
    }
    aLz();

    this.dRh.s(this.dRg);

    return this.dRi;
  }

  private void a(cwG paramcwG, float paramFloat) {
    int i = paramcwG.xj();
    paramcwG.cr(paramFloat);
    ((aIL)this.dRh.get(i)).a(paramcwG);
    ((ArrayList)this.dRj.get(i)).add(paramcwG);
  }

  private void aLz() {
    this.dRj.s(new cDU(this));
  }

  public final void clear()
  {
    this.dRh.s(dRe);
  }

  public final void reset() {
    this.dRh.s(dRf);
  }
}