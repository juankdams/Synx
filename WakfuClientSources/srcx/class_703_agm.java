import java.util.ArrayList;
import java.util.Iterator;

public class agm extends aXi
{
  public static final int ENABLED = 0;
  public static final int cRz = 1;
  public static final int cZA = 2;
  public static final int cZB = 3;
  public static final int cZC = 4;
  public static final int cZD = 5;
  public static final int cZE = 6;
  public static final int cZF = 7;
  public static final int cZG = 8;
  private dxL cZH;
  private ArrayList cZI = new ArrayList();
  private int bgB;

  public agm()
  {
  }

  public agm(String paramString, int paramInt1, int paramInt2, dxL paramdxL)
  {
    this.cZH = paramdxL;
    this.m_name = paramString;
    this.aSg = paramInt1;
    this.bgB = paramInt2;
  }

  public aXi arH() {
    return new agm(this.m_name, this.aSg, this.bgB, this.cZH);
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();

    if (!bGP.gDv.a(new aGH[] { localbyz })) {
      hX(1);
    }
    bMG localbMG = localbyz.bSt();
    if (localbMG.CD() <= 0L) {
      hX(8);
      return false;
    }

    aCl localaCl = localbMG.ay(localbyz.getId());
    long l = localaCl.aOC();
    aUJ localaUJ = localbMG.az(l);

    if ((localbMG == null) || (localbMG.CD() == 0L) || (!localaUJ.a(cnm.hTn))) {
      hX(2);
    }
    if ((localbMG != null) && (localbMG.CD() > 0L) && (localbMG.nU() < 3)) {
      hX(3);
    }
    if ((localbMG != null) && (localbMG.CF() > 0)) {
      hX(7);
    }
    bcD localbcD = dJD.lVl.CL(this.bgB);
    if (localbcD == null) {
      hX(4);
    } else {
      dxL localdxL1 = dDE.dft().VN();
      dxL localdxL2 = a(localbcD);
      if (localdxL2.S(localdxL1)) {
        hX(6);
      }
    }
    if (this.cZI.size() > 0)
      return false;
    return this.bur;
  }

  private dxL a(bcD parambcD) {
    return this.cZH != null ? this.cZH : parambcD.EQ();
  }

  public void hX(int paramInt) {
    if (this.cZI.contains(Integer.valueOf(paramInt)))
      return;
    this.cZI.add(Integer.valueOf(paramInt));
  }

  public String getLabel() {
    lZ locallZ = new lZ().tz().am(isEnabled() ? icr : ict);
    locallZ.a(bU.fH().getString(this.m_name)).tA();
    Iterator localIterator;
    if (!isEnabled()) {
      for (localIterator = this.cZI.iterator(); localIterator.hasNext(); ) { int i = ((Integer)localIterator.next()).intValue();
        locallZ.tH().am(ict);
        bcD localbcD;
        switch (i) {
        case 1:
          locallZ.a(bU.fH().getString("error.playerNotSubscribed"));
          break;
        case 8:
          locallZ.a(bU.fH().getString("error.playerHasNoGuild"));
          break;
        case 2:
          locallZ.a(bU.fH().getString("error.rightToBuyHavenWorld"));
          break;
        case 3:
          locallZ.a(bU.fH().getString("error.badGuildLevelToBuyHavenWorld", new Object[] { Integer.valueOf(3) }));
          break;
        case 4:
          locallZ.a(bU.fH().getString("errorNoAuction"));
          break;
        case 7:
          locallZ.a(bU.fH().getString("errorHasAlreadyAHavenWorld"));
          break;
        case 5:
          localbcD = dJD.lVl.CL(this.bgB);
          locallZ.a(bU.fH().getString("errorAuctionFinished", new Object[] { bU.fH().c(localbcD.ES()) }));
          break;
        case 6:
          localbcD = dJD.lVl.CL(this.bgB);
          locallZ.a(bU.fH().getString("errorAuctionNotStarted", new Object[] { bU.fH().c(a(localbcD)) }));
          break;
        }

        locallZ.tJ();
      }
    }

    return locallZ.tP();
  }
}