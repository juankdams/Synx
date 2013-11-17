import com.ankamagames.wakfu.client.console.command.display.EnableMiniMapCommand;
import org.apache.log4j.Logger;

public class bED
  implements cvW
{
  protected static final Logger K = Logger.getLogger(bED.class);

  private static bED gzI = new bED();
  private bnm N;
  private bGr gzJ;
  private long gzK;

  public static bED bMP()
  {
    return gzI;
  }

  public boolean a(cWG paramcWG)
  {
    bzu localbzu;
    long l;
    switch (paramcWG.getId())
    {
    case 19030:
      localbzu = (bzu)paramcWG;

      l = localbzu.ah();

      Jl localJl = byv.bFN().bFO().bHj();
      aay localaay = localJl.Ta().bv(l);

      if (localaay != null)
      {
        String str1;
        if (l == byv.bFN().bFO().getId()) {
          str1 = bU.fH().getString("group.party.leave.warn.you");
        } else {
          localObject = localaay.getName();
          str1 = bU.fH().getString("group.party.leave.warn.others", new Object[] { localObject });
        }

        Object localObject = bDk.bLI().cr(localaay.Lk());
        if ((localObject != null) && (((dUx)localObject).duy() == go.aEq)) {
          str1 = str1 + "\n" + bU.fH().getString("group.party.leave.warn.dungeon");
        }

        cKX localcKX = cBQ.cxL().a(str1, Cn.et(0), 2073L, 102, 1);

        localcKX.a(new dG(this, localbzu));
      }
      else
      {
        K.error("on demande l'exclusion d'un type qui n'est pas dans le group en local");
      }

      return false;
    case 19031:
      localbzu = (bzu)paramcWG;
      boolean bool = localbzu.getBooleanValue();
      l = localbzu.ah();
      this.gzJ.n(l, bool);

      if (bool) {
        EnableMiniMapCommand.es(true);
      }

      return false;
    case 19032:
      localbzu = (bzu)paramcWG;
      String str2 = localbzu.getStringValue();
      this.gzJ.jK(str2);
      String str3 = bU.fH().getString("group.party.invitationRequestSent", new Object[] { str2 });
      CM.LV().f(str3, 4);
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void gw(long paramLong) {
    dUc localdUc = this.gzJ.gE(paramLong);
    if (localdUc != null)
      localdUc.duj();
  }

  public void gx(long paramLong) {
    dUc localdUc = this.gzJ.gE(paramLong);
    if (localdUc != null)
      localdUc.dun();
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new dF(this);

      cBQ.cxL().a(this.N);

      Jl localJl = byv.bFN().bFO().bHj();

      this.gzJ = new bGr(localJl);
      dLE.doY().t("partyList", this.gzJ);

      cBQ.cxL().a("partyListDialog", VV.dJ("partyListDialog"), 8192L, (short)10000);

      cBQ.cxL().j("wakfu.partyList", cBJ.class);

      aWc.blo().blC();

      this.gzK = cAo.cxf().a(new dH(this, localJl), 4000L, 159159161);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.gzJ = null;
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("partyListDialog");

      dLE.doY().removeProperty("partyList");

      cBQ.cxL().mN("wakfu.partyList");

      cAo.cxf().ia(this.gzK);
    }
  }

  public void mY()
  {
    if (this.gzJ != null) {
      Jl localJl = byv.bFN().bFO().bHj();
      this.gzJ.a(localJl);
      dLE.doY().a(this.gzJ, bGr.bF);
    }
  }

  public void gy(long paramLong) {
    if (this.gzJ != null) {
      dUc localdUc = this.gzJ.gE(paramLong);
      if (localdUc != null)
        localdUc.fireStateChanged();
    }
  }
}