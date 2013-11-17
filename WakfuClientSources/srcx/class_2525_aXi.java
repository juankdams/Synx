import java.util.List;
import org.apache.log4j.Logger;

public class aXi extends vC
  implements bye
{
  protected String m_name;
  protected int aSg;
  private dJO fct;

  public aXi()
  {
  }

  private aXi(String paramString, int paramInt)
  {
    this.m_name = paramString;
    this.aSg = paramInt;
  }

  public aXi arH()
  {
    return new aXi(this.m_name, this.aSg);
  }

  public String qa()
  {
    return this.m_name;
  }

  public List EB()
  {
    if (Ew() != dqU.ltr)
      return null;
    byz localbyz = byv.bFN().bFO();
    j localj = new j(localbyz);
    localj.b(((DO)this.dvI).getId());
    return localj.bDr();
  }

  public List EC()
  {
    return null;
  }

  public boolean pZ()
  {
    return (!byv.bFN().bFO().adF()) && (!aYP.feK.bnQ());
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    byz localbyz = byv.bFN().bFO();
    if (!localbyz.q(false, true)) {
      return;
    }
    localbyz.aeL().b(this);
    dWu localdWu = (dWu)this.dvI;

    if (!localbyz.a(false, true, localdWu.bVi())) {
      localbyz.aeL().c(this);
      bmD();
    }
  }

  private void bmD() {
    c(this.fct);
  }

  public aiI pW()
  {
    return aiI.dfP;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    bmD();
  }

  protected int qc()
  {
    return this.aSg;
  }

  public boolean isEnabled()
  {
    return (super.isEnabled()) && (bmE());
  }

  public boolean bmE() {
    return ((cMb)this.dvI).ta();
  }

  public String getLabel()
  {
    lZ locallZ = new lZ().tz().am(isEnabled() ? icr : ict);
    String str = bmE() ? this.m_name : "error.playerNotSubscribed";
    locallZ.a(bU.fH().getString(str)).tA();
    return locallZ.tP();
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public void iT(int paramInt) {
    this.aSg = paramInt;
  }

  public void b(dJO paramdJO) {
    this.fct = paramdJO;
  }

  public String toString()
  {
    return "MRUGenericInteractiveAction{m_name='" + this.m_name + '\'' + ", m_gfxId=" + this.aSg + ", m_actionToExecute=" + this.fct + '}';
  }
}