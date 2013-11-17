import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class beO
  implements cvW
{
  private static beO fsb = new beO();
  private bnm N;
  protected static final Logger K = Logger.getLogger(beO.class);

  private ArrayList bYx = new ArrayList();
  private int aKT = 0;
  private int fsc;

  public static beO bsr()
  {
    return fsb;
  }

  public void next()
  {
    if (this.bYx.size() != 0) {
      this.aKT = ((this.aKT + 1) % this.bYx.size());
      bst();
    }
  }

  public void bss() {
    if (this.bYx.size() != 0) {
      this.aKT = ((this.aKT - 1 + this.bYx.size()) % this.bYx.size());
      bst();
    }
  }

  private void bst() {
    if (this.bYx.size() != 0) {
      aYn localaYn = (aYn)this.bYx.get(this.aKT);

      String str = this.aKT + 1 + "/" + this.bYx.size();
      dLE.doY().a("currentPage", str, "dimensionalBagAppearanceManagerDialog");
      dLE.doY().t("dimensionalBag.selected.appearance", localaYn);

      a(localaYn);
    }
  }

  private void a(aYn paramaYn) {
    dUx localdUx = bDk.bLI().cr((short)9);
    int i = cbp.hsN.uw(paramaYn.vH());
    localdUx.Ed(i);
    dDH.a(WakfuClientInstance.awy().cUW(), localdUx);
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 17012:
      aJa localaJa = (aJa)paramcWG;
      dLE.doY().t("dimensionalBag.selected.appearance", localaJa.aVj());
      return false;
    }

    return true;
  }

  private void sendMessage() {
    if (this.bYx.size() != 0) {
      aYn localaYn = (aYn)this.bYx.get(this.aKT);
      int i = localaYn.vH();
      if (i != this.fsc) {
        this.fsc = i;
        bLL localbLL = new bLL();
        localbLL.bP(i);
        byv.bFN().aJK().d(localbLL);
      }
    }
  }

  private ArrayList bsu() {
    this.aKT = -1;
    boolean bool1 = false;

    byz localbyz = byv.bFN().bFO();
    dwN localdwN = localbyz.bHb();
    if (localdwN != null) {
      bool1 = localdwN.aNM();
      this.fsc = localdwN.dbV();
    }

    int i = b(localbyz);
    int j = 0;

    ArrayList localArrayList = new ArrayList();
    dFu localdFu = ((bIW)acs.aoN().bEn()).da(cCy.iuQ.Xf());
    aso localaso = localdFu.abR();
    while (localaso.hasNext()) {
      localaso.fl();
      int k = localaso.zY();
      boolean bool2 = localbyz.bHq().uj(k);
      if ((bool2) && 
        (cun.dK(i, k)))
      {
        if (bool1)
          bool2 = cbp.hsN.uv(k);
        else
          bool2 = cbp.hsN.uu(k);
        if (bool2)
        {
          if (k == this.fsc)
            this.aKT = j;
          localArrayList.add(new aYn(k, localaso.value()));
          j++;
        }
      }
    }
    if (this.aKT == -1) {
      this.aKT = 0;
      this.fsc = ((aYn)localArrayList.get(this.aKT)).vH();
    }

    return localArrayList;
  }

  private static int b(byz parambyz) {
    cvY localcvY = parambyz.cJf();
    return localcvY == null ? 0 : localcvY.bP();
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new dLD(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("dimensionalBagAppearanceManagerDialog", VV.dJ("dimensionalBagAppearanceManagerDialog"), 32768L, (short)10000);

      this.aKT = 0;
      this.bYx = bsu();
      bst();

      cBQ.cxL().j("wakfu.appearanceManager", Um.class);

      aWc.blo().blC();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      sendMessage();

      dwN localdwN = byv.bFN().bFO().bHb();
      if (localdwN != null) {
        localdwN.BS(this.fsc);
      }

      this.bYx = null;

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("editableDimensionalBag");

      cBQ.cxL().mW("dimensionalBagAppearanceManagerDialog");

      cBQ.cxL().mN("wakfu.appearanceManager");

      aWc.blo().blD();
    }
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}