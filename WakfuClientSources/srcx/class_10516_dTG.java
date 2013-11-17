import java.util.ArrayList;

public class dTG
  implements nc
{
  public static final dTG mqC = new dTG();

  private final ArrayList hmm = new ArrayList();

  public void e(ckJ paramckJ) {
    synchronized (this.hmm) {
      this.hmm.add(paramckJ);
    }
  }

  public void start() {
    bXT.hnW.a(this);
  }

  public void stop() {
    bXT.hnW.b(this);
  }

  public void uD() {
    synchronized (this.hmm) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz == null) {
        return;
      }
      bCP localbCP = localbyz.bGa();

      dxL localdxL = dDE.dft().VN();
      for (int i = this.hmm.size() - 1; i >= 0; i--) {
        ckJ localckJ = (ckJ)this.hmm.get(i);
        localckJ.cmC();
        dEE localdEE = localbCP.sq(localckJ.getId());
        if ((localdEE.bnd() == null) && (!bbK.e(localdEE, localdxL)) && (!bbK.f(localdEE, localdxL)))
        {
          this.hmm.remove(i);
        }
      }
    }

    ab.bl.aD();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("QuestTimeManager");
    localStringBuilder.append("{m_achievements=").append(this.hmm);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}