import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cgG
  implements cvW
{
  protected static final Logger K = Logger.getLogger(cgG.class);

  private static cgG hEE = new cgG();
  private boolean hEF;

  public static cgG ciL()
  {
    return hEE;
  }

  public void gV(boolean paramBoolean) {
    this.hEF = paramBoolean;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId())
    {
    case 2048:
      localObject = (jB)paramcWG;
      a((jB)localObject);

      return false;
    case 2046:
      localObject = (KG)paramcWG;
      a((KG)localObject);

      return false;
    case 2052:
      localObject = (bsM)paramcWG;
      a((bsM)localObject);

      return false;
    case 2050:
      a((Cd)paramcWG, this);

      return false;
    case 2056:
      ciM();
      return false;
    case 2070:
      localObject = (bLA)paramcWG;
      a((bLA)localObject);

      return false;
    case 2072:
      localObject = (drk)paramcWG;
      a((drk)localObject);
      return false;
    }

    return true;
  }

  private void a(drk paramdrk) {
    byte b = paramdrk.Kh();
    K.info("Résultat du renommage de personnage : errorCode=" + b);
    if (b == 0) {
      cBQ.cxL().mW("renameCharacterDialog");
      dLE.doY().removeProperty("renameCharater.dirty");
    } else {
      dLE.doY().t("renameCharater.dirty", Boolean.valueOf(false));
      aPz.bY(b);
    }
  }

  private void a(jB paramjB) {
    ArrayList localArrayList = paramjB.ro();
    if (!byv.bFN().c(aVQ.blh())) {
      byv.bFN().a(aVQ.blh());
    }

    try
    {
      bXb.cci().N(localArrayList);
    } catch (Exception localException) {
      K.error("Problème à la désérialisation de la liste des personnages", localException);
    }
    aVQ.blh().blj();

    if (bXb.cci().ccl() > 0) {
      Su localSu = bXb.cci().ccm();
      aVQ.blh().as(localSu);
    }

    bXb.cci().ccp();

    ciN();
  }

  private void a(KG paramKG) {
    byv.bFN().a(aVQ.blh());

    byte[] arrayOfByte = paramKG.Vf();
    if (arrayOfByte != null)
    {
      try
      {
        bKm localbKm = bXb.cci().ap(arrayOfByte);
        aVQ.blh().g(localbKm);

        aVQ.blh().as(localbKm);

        bXb.cci().ccp();
      }
      catch (Exception localException) {
        K.error(localException);
      }
    }

    ciN();
  }

  private void a(bsM parambsM) {
    if (parambsM.bAU()) {
      bXb.cci().he(parambsM.eq());
      aVQ.blh().blk();
      bXb.cci().ccp();
    }
    else
    {
      String str = "error.characterDeletion";
      cBQ.cxL().a(bU.fH().getString(str), Cn.et(1), 1027L, 6, 1);
    }

    if (byv.bFN().c(apc.duD))
      byv.bFN().b(apc.duD);
  }

  private void ciM()
  {
    byv.bFN().b(ciL());

    byv.bFN().a(aIj.aUl());

    bXb.cci().ccj();

    ciN();
  }

  private void a(bLA parambLA) {
    long l = parambLA.eq();

    aVQ.blh().eM(l);
  }

  public static boolean a(Cd paramCd, cvW paramcvW) {
    if (paramCd.Kh() == 0)
    {
      byv.bFN().b(paramcvW);

      byv.bFN().a(aOo.euG);
      byv.bFN().a(dDH.dfA());
      byv.bFN().a(dLM.mbX);
      byv.bFN().a(oI.aUo);

      bEs.bMK().e("world", true);
      bEs.bMK().e("common", true);
      bEs.bMK().e("binding", true);

      bXb.cci().ccj();

      return true;
    }

    String str = "error.characterSelection";
    cBQ.cxL().a(bU.fH().getString("error.characterSelection"), Cn.et(1), 1027L, 7, 1);

    return false;
  }

  private void ciN()
  {
    cwf.ctJ().a(new aYd(this));
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.hEF)
      {
        byv.bFN().a(aVQ.blh());
      }

      buj.bCk().setEnabled(false);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mW("renameCharacterDialog");

      byv.bFN().b(aVQ.blh());
    }
  }
}