import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class zu extends bIC
  implements dBv
{
  public static final String btS = "currentFighter";
  public static final String btT = "currentFighterPosition";
  public static final String btU = "fighters";
  public static final String btV = "secondTimelineFighters";
  public static final String btW = "currentTableTurn";
  public static final String btX = "availableBonuses";
  public static final String[] bF = { "currentFighter", "currentFighterPosition", "fighters", "secondTimelineFighters", "currentTableTurn", "availableBonuses" };
  private kd btY;
  private cbk btZ;

  public zu(arl paramarl, eB parameB, dDe paramdDe, cnv paramcnv, cMN paramcMN)
  {
    super(paramarl, parameB, paramdDe, paramcnv, paramcMN);
  }

  public int ag(long paramLong)
  {
    arl localarl = (arl)AY();
    if ((localarl.aEu() == dzm.lFL) || (localarl.aEu() == dzm.lFJ))
    {
      return a(bPL(), paramLong);
    }
    return a(AO(), paramLong);
  }

  private int a(cbQ paramcbQ, long paramLong)
  {
    int i = 0;
    long l = 0L;
    int j = 0; for (int k = paramcbQ.size(); j < k; j++) {
      if (paramLong == paramcbQ.get(j)) {
        return i;
      }
      if (paramcbQ.get(j) == l) {
        i--;
      }
      l = paramcbQ.get(j);

      i++;
    }
    return -1;
  }

  public int AR()
  {
    int i = this.bdk.cAv();
    cbQ localcbQ = this.bdk.cAr();
    if ((i == -1) || (i >= localcbQ.size())) {
      return -1;
    }
    return a(localcbQ, localcbQ.get(i)) + (this.bdr ? 1 : 0);
  }

  public Su aX(long paramLong)
  {
    return (Su)this.fnx.ez(paramLong);
  }

  public void c(String paramString, Object paramObject) {
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("currentFighter"))
    {
      return Ia();
    }if (paramString.equals("currentFighterPosition"))
      return HZ();
    if (paramString.equals("fighters"))
      return Id();
    if (paramString.equals("secondTimelineFighters"))
      return Ie();
    if (paramString.equals("currentTableTurn"))
      return bU.fH().getString("fight.turn", new Object[] { Short.valueOf(AU()) });
    if (paramString.equals("availableBonuses")) {
      long l = byv.bFN().bFO().getId();
      return aY(l);
    }

    return null;
  }

  public bSo[] aY(long paramLong) {
    List localList1 = bPN().lR();
    List localList2 = bPN().t(paramLong);

    cSR localcSR = new cSR();
    int i = 0;
    dpI localdpI;
    bSo localbSo;
    for (int j = localList1.size(); i < j; i++) {
      localdpI = (dpI)localList1.get(i);
      localbSo = (bSo)localcSR.get(localdpI.yR());
      if (localbSo == null) {
        localcSR.put(localdpI.yR(), new bSo(localdpI));
      }
    }
    i = 0; for (j = localList2.size(); i < j; i++) {
      localdpI = (dpI)localList2.get(i);
      localbSo = (bSo)localcSR.get(localdpI.yR());
      if (localbSo != null) {
        localbSo.bZh();
      }
    }
    bSo[] arrayOfbSo = (bSo[])localcSR.d(new bSo[localcSR.size()]);

    j = 0; for (int k = arrayOfbSo.length; j < k; j++) {
      if (j == k - 1)
        arrayOfbSo[j].dg(48, 48);
      else if (j == k - 2)
        arrayOfbSo[j].dg(40, 40);
      else
        arrayOfbSo[j].dg(32, 32);
    }
    return arrayOfbSo;
  }

  private Object HZ()
  {
    int i = AR();

    if (i == 0) {
      return Integer.valueOf(i);
    }

    cbQ localcbQ = AO();
    if (localcbQ.get(i - 1) == localcbQ.get(i)) {
      return Integer.valueOf(i - 1);
    }
    return Integer.valueOf(i);
  }

  public String[] getFields()
  {
    return bF;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(String paramString, Object paramObject) {
  }

  public void a(String paramString, Object paramObject) {
  }

  public void k(kd paramkd) {
    this.btY = paramkd;
  }

  public void a(cbk paramcbk) {
    this.btZ = paramcbk;
  }

  public Su Ia() {
    return AP() ? aX(AQ()) : null;
  }

  public boolean Ib() {
    cbQ localcbQ1 = AO();
    cbQ localcbQ2 = bPL();

    if (localcbQ2.size() != localcbQ1.size()) {
      return true;
    }

    int i = 0; for (int j = localcbQ2.size(); i < j; i++) {
      if (localcbQ1.uD(i) != localcbQ2.uD(i)) {
        return true;
      }
    }

    return false;
  }

  public int lQ()
  {
    return bPN().lQ();
  }

  public int aZ(long paramLong) {
    return bPN().r(paramLong);
  }

  public void Ic()
  {
    if (this.btZ != null)
      this.btZ.rT();
  }

  public List Id() {
    return b(AO());
  }

  public List Ie() {
    return b(bPL());
  }

  private List b(cbQ paramcbQ) {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramcbQ.size(); i++) {
      long l = paramcbQ.get(i);
      Su localSu = aX(l);
      if (localSu != null) {
        dpa localdpa = localSu.adI();
        if (localdpa == null) {
          localSu.a(new dpa(localSu, this));
        }
        else if (localdpa.aDp() != this) {
          K.warn('(' + localSu.getName() + " - " + l + ") a un lien vers une autre timeline que la sienne");

          localdpa.a(this);
        }

        if (!localArrayList.contains(localSu)) {
          localArrayList.add(localSu);
        }
      }
    }
    return localArrayList;
  }

  public void If() {
    dLE.doY().a(this, new String[] { "fighters" });
  }

  protected void rS()
  {
    if (Ij()) {
      if (this.btY != null) {
        this.btY.rS();
      }
      if (this.btZ != null) {
        this.btZ.rS();
      }

      Ig();
      dLE.doY().a(this, new String[] { "currentFighter", "currentFighterPosition", "fighters" });
    }
  }

  public void Ig() {
    dLE.doY().t("selectedFighter", Ih());
  }

  public Su Ih() {
    Su localSu = Ia();
    if (localSu == null) {
      cbQ localcbQ = bPL();
      if (localcbQ.size() > 0) {
        localSu = aX(localcbQ.get(0));
      }
    }
    return localSu;
  }

  private void a(Su paramSu, boolean paramBoolean) {
    bWE localbWE = new bWE();
    localbWE.d(18103);
    localbWE.c(paramBoolean);
    localbWE.aI(paramSu);
    cjO.clE().j(localbWE);
  }

  void m(Su paramSu)
  {
    if (paramSu.adI() == null) {
      paramSu.a(new dpa(paramSu, this));
    } else {
      K.warn("Le fighter ajouté n'a pas été bien nettoyé à la fin du combat précédent ! (" + paramSu.getName() + " - " + paramSu.getId() + ')');

      if (paramSu.adI().aDp() != this) {
        paramSu.adI().a(this);
      }
    }

    if (this.btY != null) {
      this.btY.d(paramSu);
    }
    if (this.btZ != null) {
      this.btZ.d(paramSu);
    }

    dLE.doY().a(this, new String[] { "fighters", "secondTimelineFighters" });

    a(paramSu, true);

    dLE.doY().t("selectedFighter", paramSu);
  }

  void n(Su paramSu)
  {
    if (this.btY != null) {
      this.btY.e(paramSu);
    }
    if (this.btZ != null) {
      this.btZ.e(paramSu);
    }

    dxz.x(paramSu.aeL());

    dLE.doY().a(this, new String[] { "fighters", "secondTimelineFighters" });

    a(paramSu, false);
    aKj.bbx().aj(paramSu);
  }

  protected void Ii()
  {
    List localList = Id();
    for (int i = localList.size() - 1; i >= 0; i--) {
      dpa localdpa = ((Su)localList.get(i)).adI();
      if (localdpa != null)
        localdpa.cWt();
    }
  }

  protected void ap(long paramLong)
  {
  }

  protected void aq(long paramLong)
  {
  }

  protected void rU()
  {
    super.rU();
    if (Ij()) {
      if (this.btY != null) {
        this.btY.rU();
      }
      if (this.btZ != null) {
        this.btZ.rU();
      }
      dLE.doY().a(this, new String[] { "currentTableTurn", "secondTimelineFighters" });
    }
  }

  protected void an(long paramLong)
  {
    if (Ij()) {
      Su localSu = aX(paramLong);

      if (localSu == null) {
        return;
      }
      if (this.btY != null) {
        this.btY.f(localSu);
      }
      if (this.btZ != null) {
        this.btZ.f(localSu);
      }
      dpa localdpa = localSu.adI();
      if (localdpa != null)
        localdpa.cWr();
    }
  }

  protected void ao(long paramLong)
  {
    if (Ij()) {
      Su localSu = aX(paramLong);
      if (this.btY != null) {
        this.btY.g(localSu);
      }
      if (this.btZ != null) {
        this.btZ.g(localSu);
      }

      localSu.adI().cWq();
    }
  }

  private boolean Ij()
  {
    if (AY() != null) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        arl localarl = localbyz.bGv();
        if (localarl != null) {
          return localarl.equals(AY());
        }
      }
    }
    return false;
  }

  public void AT()
  {
    super.AT();

    if (Ij())
      dLE.doY().a(this, new String[] { "secondTimelineFighters" });
  }

  public void aD(int paramInt)
  {
    bPN().aD(paramInt);
  }

  public void b(Su paramSu, boolean paramBoolean) {
    dpa localdpa = paramSu.adI();
    if (localdpa != null) {
      localdpa.setHighlighted(paramBoolean);
      if (paramBoolean) {
        dLE.doY().t("selectedFighter", paramSu);
      }
    }

    if (!paramBoolean)
      dLE.doY().t("selectedFighter", Ih());
  }
}