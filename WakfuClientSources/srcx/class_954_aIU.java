import java.util.ArrayList;

public class aIU
  implements cvW
{
  private static aIU ehL = new aIU();
  private anG ehM;
  private dBv ehN;
  private boolean ehO;
  private String ehP;
  private static final String ehQ = "spellDetailPopup";
  private static final String ehR = "skillDescription2";
  private static final String ehS = "itemDetailPopup";
  private static final String ehT = "itemSimplePopup";
  private String ehU = "";

  public static aIU aUP()
  {
    return ehL;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    if ((paramcWG instanceof dKQ)) {
      localObject = (dKQ)paramcWG;
      cAo.cxf().ia(((dKQ)localObject).czk());
      if (this.ehO) {
        return false;
      }
      WR();
      return false;
    }
    switch (paramcWG.getId())
    {
    case 19301:
      localObject = (Bs)paramcWG;

      boolean bool = false;

      if ((this.ehM == null) || (this.ehN == null)) {
        cAo.cxf().b(this);
        return false;
      }

      if (((this.ehN instanceof apX)) && ((((Bs)localObject).KB() instanceof apX))) {
        apX localapX1 = (apX)this.ehN;
        apX localapX2 = (apX)((Bs)localObject).KB();
        bool = ((dSR)localapX1.bsL()).getId() == ((dSR)localapX2.bsL()).getId();
      } else {
        bool = this.ehN.equals(((Bs)localObject).KB());
      }

      if (bool) {
        this.ehO = (!ayw.closePopup(null, this.ehM));
        dLE.doY().removeProperty(this.ehP);
      }
      return false;
    case 19300:
      localObject = (Bs)paramcWG;
      this.ehN = ((Bs)localObject).KB();
      if (this.ehN == null) {
        return false;
      }
      if (((Bs)localObject).getIntValue() > 0) {
        this.ehO = false;
        cAo.cxf().a(this, ((Bs)localObject).getIntValue(), -1, 1);
      } else {
        WR();
      }

      return false;
    }

    return true;
  }

  private void WR()
  {
    b(this.ehN);
    if (this.ehM != null)
      this.ehM.b((bqp)this.ehM.getParentOfType(dOc.class));
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      cBQ.cxL().j("wakfu.popupInfos", cDS.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mN("wakfu.popupInfos");

      this.ehU = null;
      this.ehN = null;
      this.ehM = null;
    }
  }

  public long getId() {
    return 10L;
  }

  public void a(long paramLong)
  {
  }

  public void b(dBv paramdBv)
  {
    String str = "";
    Object localObject;
    if ((paramdBv instanceof apX)) {
      str = "spellDetailPopup";
      this.ehP = "describedSpell";
    } else if (((paramdBv instanceof gA)) || ((paramdBv instanceof bVw)) || ((paramdBv instanceof BG)) || ((paramdBv instanceof cDm)))
    {
      gA localgA = null;
      if ((paramdBv instanceof gA)) {
        localObject = (bVw)((gA)paramdBv).oi();
        localgA = (gA)paramdBv;
      } else if ((paramdBv instanceof bVw)) {
        localObject = (bVw)paramdBv;
      } else if ((paramdBv instanceof BG)) {
        localObject = (bVw)((BG)paramdBv).getItem().oi();
      } else if ((paramdBv instanceof cDm)) {
        localObject = ((cDm)paramdBv).Hu();
      } else {
        return;
      }
      czM localczM = ((bVw)localObject).cbh();
      ArrayList localArrayList1 = localczM.cwF();
      ArrayList localArrayList2 = localczM.cwD();

      if ((localArrayList2 == null) && (localArrayList1 == null))
        str = "itemSimplePopup";
      else {
        str = "itemDetailPopup";
      }

      this.ehP = "itemPopupDetail";
    } else if ((paramdBv instanceof bPL)) {
      str = "skillDescription2";
    }

    if ((this.ehP != null) && (!this.ehP.equals("")) && (paramdBv != null) && (!paramdBv.equals(dLE.doY().rv(this.ehP)))) {
      dLE.doY().t(this.ehP, paramdBv);
    }
    if ((!str.equals("")) && (!str.equals(this.ehU))) {
      localObject = cBQ.cxL().coO().nf("worldAndFightBarDialog");
      if (localObject != null) {
        this.ehM = ((anG)((cpa)localObject).fi(str));
      }
      this.ehU = str;
    }
  }
}