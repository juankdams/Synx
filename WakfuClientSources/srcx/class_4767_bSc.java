import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class bSc
  implements cvW, Runnable
{
  public static final int hcm = 0;
  public static final int hcn = 1;
  public static final int hco = 2;
  public static final int hcp = 5000;
  protected static final Logger K = Logger.getLogger(bSc.class);
  private static final bSc hcq = new bSc();
  private bnm N;
  private LinkedList hcr;
  private LinkedList hcs;
  private static final int hct = 9;
  private static final int hcu = 1000;
  private static final int hcv = 100;
  private boolean hcw;
  private boolean hcx;
  private long hcy;
  public ArrayList aBf;
  private cbj hcz;
  private boolean bKT;
  private boolean hcA;

  public bSc()
  {
    this.hcr = new LinkedList();
    this.hcs = new LinkedList();

    this.hcx = false;

    this.aBf = new ArrayList();
  }

  public void a(cbj paramcbj)
  {
    this.hcz = paramcbj;
    dLE.doY().t("currentNotification", this.hcz);
  }

  public void gD(boolean paramBoolean) {
    this.hcA = paramBoolean;
    if (!this.hcA)
      bYU();
  }

  private void bYU() {
    this.hcy = System.currentTimeMillis();
  }

  public static bSc bYV()
  {
    return hcq;
  }

  public boolean a(cyu paramcyu) {
    return (!this.aBf.contains(paramcyu)) && (this.aBf.add(paramcyu));
  }

  public void b(cyu paramcyu) {
    this.aBf.remove(paramcyu);
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId())
    {
    case 16163:
      synchronized (hcq) {
        az localaz = (az)paramcWG;
        cbj localcbj = new cbj(localaz.bu(), localaz.getTitle(), localaz.getText(), localaz.getSoundId(), localaz.bv());

        if ((this.bKT) && (bZc() < 9)) {
          b(localcbj);
        }
        else {
          this.hcr.addLast(localcbj);
        }
      }

      return false;
    }

    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new bEk(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("notificationPanel", this.hcs.toArray());

      dRq localdRq = (dRq)cBQ.cxL().a("informationMessageDialog", VV.dJ("informationMessageDialog"), 139264L, (short)10004);

      this.bKT = false;
      localdRq.setEnablePositionEvents(true);
      localdRq.a(CH.bGK, new bEl(this, localdRq), true);

      cBQ.cxL().j("wakfu.notificationPanel", cda.class);

      bYU();

      dka.cSF().a(this, 1000L, -1);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      clean();

      dLE.doY().removeProperty("notificationPanel");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("informationMessageDialog");

      cBQ.cxL().mN("wakfu.notificationPanel");

      dka.cSF().j(this);
    }
  }

  private void clean() {
    this.hcw = false;
    this.hcx = false;
    this.hcs.clear();
    this.hcr.clear();
    dka.cSF().j(this);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  private void b(cbj paramcbj) {
    if (paramcbj == null)
      return;
    bYU();

    this.hcs.addFirst(paramcbj);
    bYX();

    int i = paramcbj.getSoundId();
    if (i != -1) {
      aWc.blo().eO(i);
    }

    if (this.hcs.size() > 1)
      return;
    a(paramcbj);

    dRq localdRq = bYW();
    localdRq.J(cPt.class);

    localdRq.setVisible(true);

    int j = 100;
    cPt localcPt = new cPt(localdRq.getY(), 100, localdRq, 0, 1000, ddp.kWG, true);

    localcPt.a(new bEm(this, localcPt));

    localdRq.a(localcPt);

    cpa localcpa = cBQ.cxL().coO().nf("informationMessageDialog");
    axU localaxU = (axU)localcpa.fi("renderableContainer");
    ccG localccG = (ccG)localcpa.fi("messagesList");

    Gv.a(new Gv(this, paramcbj, localaxU, localccG, null));

    this.hcw = true;
  }

  private dRq bYW()
  {
    cpa localcpa = cBQ.cxL().coO().nf("informationMessageDialog");
    if (localcpa == null)
      return null;
    return (dRq)localcpa.fi("mainContainer");
  }

  private void bYX() {
    dLE.doY().t("notificationPanel", null);
    dLE.doY().t("notificationPanel", this.hcs.toArray());
  }

  public void run() {
    if (this.hcA)
      return;
    a(false, null);
  }

  public void a(boolean paramBoolean, cbj paramcbj) {
    synchronized (hcq) {
      if (this.hcw) {
        this.hcx = true;
        return;
      }
      this.hcx = false;

      if (this.hcs.isEmpty()) {
        return;
      }
      cbj localcbj = (cbj)this.hcs.getFirst();
      if (localcbj != null) {
        if (!paramBoolean) {
          long l = System.currentTimeMillis();
          if (l - this.hcy < localcbj.bu().getDuration())
            return;
        }
      }
      else
        return;
      Object localObject1;
      Object localObject2;
      if (this.hcs.size() == 1) {
        localObject1 = bYW();
        fr(false);
        ((dRq)localObject1).J(cPt.class);

        localObject2 = new cPt(((dRq)localObject1).getY(), -200, (dOc)localObject1, 0, 1000, ddp.kWG, false);

        ((cKq)localObject2).a(new bEp(this, (dRq)localObject1, (cKq)localObject2));

        ((dRq)localObject1).a((cKq)localObject2);
        this.hcw = true;
      }
      else {
        if ((paramBoolean) && (paramcbj != null)) {
          this.hcs.remove(paramcbj);
          localObject1 = paramcbj;
        } else {
          localObject1 = (cbj)this.hcs.removeLast();
        }

        if (!this.hcr.isEmpty()) {
          localObject2 = (cbj)this.hcr.poll();
          b((cbj)localObject2);
        } else {
          bYU();
        }

        if (localObject1 == this.hcz) {
          a((cbj)this.hcs.getLast());
        }
        bYX();
      }
    }
  }

  private void bYY() {
    for (int i = this.aBf.size() - 1; i >= 0; i--)
      ((cyu)this.aBf.get(i)).ayc();
  }

  private void bYZ()
  {
    for (int i = this.aBf.size() - 1; i >= 0; i--)
      ((cyu)this.aBf.get(i)).ayd();
  }

  public void fr(boolean paramBoolean)
  {
  }

  public void bZa()
  {
    cpa localcpa = cBQ.cxL().coO().nf("informationMessageDialog");

    ArrayList localArrayList = new ArrayList();
    axU localaxU1 = (axU)localcpa.fi("renderableContainer");

    a(localaxU1.getInnerElementMap(), localArrayList);

    ccG localccG = (ccG)localcpa.fi("messagesList");
    for (axU localaxU2 : localccG.getRenderables()) {
      a(localaxU2.getInnerElementMap(), localArrayList);
    }
    int i = 0; for (int j = localArrayList.size(); i < j; i++)
      a(true, localaxU1, localArrayList, true);
  }

  private void a(boolean paramBoolean1, dOc paramdOc, ArrayList paramArrayList, boolean paramBoolean2)
  {
    int i;
    int j;
    if (paramBoolean1) {
      i = bNa.gRu.get();
      j = bNa.gRx.get();
    } else {
      i = bNa.gRx.get();
      j = bNa.gRu.get();
    }

    if (i != j) {
      if (paramBoolean1)
        aWc.blo().blC();
      else {
        aWc.blo().blD();
      }

      bNa localbNa1 = new bNa(i);
      bNa localbNa2 = new bNa(j);

      paramdOc.J(aga.class);
      aga localaga = new aga(localbNa1, localbNa2, paramArrayList, 0, paramBoolean2 ? 0 : 1000, 1, ddp.kWG);
      paramdOc.a(localaga);
    }
  }

  private void a(cpa paramcpa, ArrayList paramArrayList) {
    if (paramcpa == null)
      return;
    for (aOG localaOG = new aOG(paramcpa); localaOG.hasNext(); ) {
      aNL localaNL = localaOG.bfH();
      if ((localaNL instanceof dOc)) {
        dOc localdOc = (dOc)localaNL;
        paramArrayList.add(localdOc.getAppearance());
      }
    }
  }

  public boolean bZb() {
    return bZc() == 0;
  }

  private int bZc() {
    int i = 0;
    for (cbj localcbj : this.hcs) {
      if (localcbj != null) {
        i++;
      }
    }
    return i;
  }

  public void bZd() {
    synchronized (hcq) {
      if ((bZb()) || (this.hcw)) {
        return;
      }
      a(true, this.hcz);
    }
  }

  public boolean a(ana paramana) {
    for (cbj localcbj : this.hcs) {
      if ((localcbj != null) && (localcbj.bu() == paramana)) {
        return true;
      }
    }

    return false;
  }
}