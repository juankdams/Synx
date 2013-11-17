import java.util.ArrayList;

public class dFn
  implements cvW
{
  private static dFn lPf = new dFn();
  private String lPg;
  private bnm N;

  public static dFn dgL()
  {
    return lPf;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId())
    {
    case 16409:
      aSP localaSP = (aSP)paramcWG;
      if (localaSP.getButton() == 3) {
        a(localaSP.QI(), localaSP.getStringValue());
      } else {
        apX localapX = (apX)dLE.doY().br("editableDescribedSpell", localaSP.getStringValue());
        dLE.doY().a("editableDescribedSpell", localaSP.QI(), localaSP.getStringValue());
        if (localapX != null) {
          byz localbyz = byv.bFN().bFO();
          ArrayList localArrayList = localbyz.auK().hi(((dSR)localapX.bsL()).getId());
          if (localArrayList.size() != 1) {
            dLE.doY().a((dBv)localapX.bsL(), new String[] { "isSelected" });
            return false;
          }
          dLE.doY().a((dBv)((apX)localArrayList.get(0)).bsL(), new String[] { "isSelected" });
        }
      }
      return false;
    }

    return true;
  }

  private void a(apX paramapX, String paramString) {
    String str = "spellDescriptionDialog" + paramapX.ok();
    if (!cBQ.cxL().mZ(str)) {
      cBQ.cxL().a(str, VV.dJ("spellDescriptionDialog"), this.lPg == null ? paramString : this.lPg, paramString, "spellDescriptionDialog", 129L, (short)10000);

      this.lPg = str;
      dLE.doY().a("describedSpell", paramapX, str);
      dLE.doY().a("editableDescribedSpell", paramapX.k(false, true), str);
    } else {
      cBQ.cxL().mW(str);
    }
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new ddv(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().j("wakfu.spellDetails", aTo.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.spellDetails");
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