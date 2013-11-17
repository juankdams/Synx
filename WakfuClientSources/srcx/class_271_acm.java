import java.util.ArrayList;
import java.util.List;

public class acm extends csx
  implements bye
{
  private VI cRx;
  private boolean cRy;
  public static final int ENABLED = 0;
  public static final int cRz = 1;
  private int cRA;

  acm()
  {
  }

  public acm(VI paramVI)
  {
    this.cRx = paramVI;
  }

  public void Q(Object paramObject)
  {
    super.Q(paramObject);
    setEnabled(!(this.cRy = ((dhJ)this.dvI).c(dKm.lWU)));
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();

    if (this.cRx.xH() == rn.aZk.bJ()) if (!bGP.gDv.a(new aGH[] { localbyz })) {
        this.cRA = 1;
        return false;
      }
    this.cRA = 0;
    return true;
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.c(dKm.lXE))
      return false;
    return ((this.dvI instanceof byo)) && (!((byo)this.dvI).isDead()) && (!((byo)this.dvI).i(dKm.lXq)) && (this.cRx.h((byo)this.dvI));
  }

  public void run()
  {
    byz localbyz = byv.bFN().bFO();
    localbyz.aeL().b(this);
    int i = localbyz.ML().ac(((byo)this.dvI).ML());
    boolean bool = i > 2;

    if ((!this.cRx.cDS()) || ((i <= 1) && (localbyz.aeL().dpz() == null))) {
      yB();
    } else {
      ArrayList localArrayList = new ArrayList();
      cYk localcYk = ((byo)this.dvI).ML();
      localArrayList.add(new cYk(localcYk.getX() + 1, localcYk.getY(), localcYk.IB()));
      localArrayList.add(new cYk(localcYk.getX() - 1, localcYk.getY(), localcYk.IB()));
      localArrayList.add(new cYk(localcYk.getX(), localcYk.getY() + 1, localcYk.IB()));
      localArrayList.add(new cYk(localcYk.getX(), localcYk.getY() - 1, localcYk.IB()));
      if (!localbyz.a(false, bool, localArrayList)) {
        localbyz.aeL().c(this);
        avW.aIb().a(2, 3, new Object[0]);
      }
    }
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    yB();
  }

  private void yB() {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    byo localbyo = (byo)this.dvI;

    localcew.c(this);
    int i = localbyz.ML().ac(localbyo.ML());
    if ((this.cRx.cDS()) && (i > 1))
      return;
    this.cRx.a(localbyo);
  }

  protected int qc()
  {
    return this.cRx.te().aOR();
  }

  public String getLabel()
  {
    lZ locallZ = new lZ().tz().am(this.cRy ? ict : icr);
    locallZ.a(bU.fH().getString("desc.mru." + this.cRx.te().aOS()));
    locallZ.tA();

    if (!isEnabled()) {
      switch (this.cRA) {
      case 1:
        locallZ.tH().am(ict).a(bU.fH().getString("error.playerNotSubscribed"));
      }
    }

    return locallZ.tP();
  }

  public String qa()
  {
    return null;
  }

  public aiI pW()
  {
    return aiI.dge;
  }

  public csx qb()
  {
    return new acm(this.cRx);
  }

  public String toString()
  {
    return "MRUMonsterAction{m_action=" + this.cRx + ", m_busy=" + this.cRy + '}';
  }
}