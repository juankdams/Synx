import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bcN
  implements cTu, cvW
{
  protected static final Logger K = Logger.getLogger(bcN.class);

  private static final bcN fmU = new bcN();
  private bnm N;

  public static bcN bqJ()
  {
    return fmU;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();
      if (Nx.cdi.isEmpty()) {
        byv.bFN().b(this);
        return;
      }

      this.N = new cWd(this);

      cBQ.cxL().a(this.N);

      localbyz.aTn().a(this);

      cBQ.cxL().a("craftDialog", VV.dJ("craftDialog"), 32769L, (short)10000);

      bqK();

      cBQ.cxL().j("wakfu.craft", aaZ.class);

      aWc.blo().eO(600057L);

      if (!byv.bFN().c(duO.dax()))
        cBQ.cxL().j("wakfu.crafts", Rn.class);
    }
  }

  public void bqK()
  {
    int i = WakfuClientInstance.awy().awB().d(bmz.fEQ);
    oS(i);
  }

  public void oS(int paramInt)
  {
    aIV localaIV;
    if ((paramInt == -1) || (!byv.bFN().bFO().aTn().contains(paramInt)))
      localaIV = Nx.cdi.ZH();
    else
      localaIV = Nx.cdi.fW(paramInt);
    ajP localajP;
    if (localaIV.aET())
      localajP = ajP.dju;
    else {
      localajP = ajP.djt;
    }

    localaIV.a(localajP);

    dLE.doY().t("craftDisplayType", Byte.valueOf(localajP.bJ()));
    dLE.doY().a("craft", localaIV, "craftDialog");
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();
      localbyz.aTn().b(this);

      cBQ.cxL().mW("craftDialog");
      cBQ.cxL().mW("craftLinkedRecipeDialog");

      dLE.doY().removeProperty("linkedRecipes");
      dLE.doY().removeProperty("linkedRecipesItemName");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.craft");

      aWc.blo().eO(600058L);

      if (!byv.bFN().c(duO.dax()))
        cBQ.cxL().mN("wakfu.crafts");
    }
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 16833:
      localObject = (afk)paramcWG;
      int i = ((afk)localObject).getIntValue();
      oS(i);
      return false;
    case 16830:
      localObject = ((Lt)paramcWG).VT();
      ajP localajP = ajP.ba((byte)dLE.doY().rr("craftDisplayType"));
      switch (cUR.kHx[localajP.ordinal()]) {
      case 1:
        if (!((aIV)localObject).aET())
          localajP = ajP.djt; break;
      case 2:
        if (!((aIV)localObject).aES()) {
          localajP = ajP.dju;
        }
        break;
      }
      dLE.doY().t("craftDisplayType", Byte.valueOf(localajP.bJ()));

      dLE.doY().a("craft", localObject, "craftDialog");
      ((aIV)localObject).a(localajP);

      WakfuClientInstance.awy().awB().a(bmz.fEQ, ((aIV)localObject).aER());

      return false;
    case 16831:
      localObject = (afk)paramcWG;
      int j = ((afk)localObject).getIntValue();
      oT(j);

      return false;
    case 16832:
    }
    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void oT(int paramInt) {
    ArrayList localArrayList = new ArrayList();
    DA.bIr.h(new cWa(this, paramInt, localArrayList));

    dLE.doY().t("linkedRecipes", localArrayList);
    dLE.doY().t("linkedRecipesItemName", bU.fH().b(15, paramInt, new Object[0]));

    if (!cBQ.cxL().mZ("craftLinkedRecipeDialog"))
      cBQ.cxL().a("craftLinkedRecipeDialog", VV.dJ("craftLinkedRecipeDialog"), "craftDialog", "craftDialog", "craftLinkedRecipeDialog", 0L, (short)10000);
  }

  public void f(deT paramdeT)
  {
    dLE.doY().a(Nx.cdi, new String[] { "craftsByLevel" });
  }

  public void b(int paramInt, long paramLong) {
    dLE.doY().a(Nx.cdi, new String[] { "craftsByLevel" });
    asM localasM = (asM)dLE.doY().br("craft", "craftDialog");
    if (paramInt == localasM.aER())
      dLE.doY().a(localasM, new String[] { "currentXpPercentage", "level", "levelText" });
  }

  public void cj(int paramInt1, int paramInt2)
  {
  }
}