import java.util.ArrayList;
import org.apache.log4j.Logger;

public class vQ
  implements cvW
{
  private static final vQ bkV = new vQ();
  private static final Logger K = Logger.getLogger(vQ.class);
  private bnm N;

  public static vQ Fa()
  {
    return bkV;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 17720:
      byv.bFN().b(this);
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new bDV(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("spellsList", null);
      dLE.doY().t("craftSkillsList", null);
      Fb();
      Fc();

      cBQ.cxL().a("adminCharacterEditorDialog", VV.dJ("adminCharacterEditorDialog"), 1L, (short)10000);

      cBQ.cxL().j("wakfu.adminCharacterEditor", cMZ.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dLE.doY().removeProperty("spellsList");
      dLE.doY().removeProperty("craftSkillsList");
      cBQ.cxL().mW("adminCharacterEditorDialog");
      cBQ.cxL().mW("adminCharacterColorEditorDialog");
      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.adminCharacterEditor");
    }
  }

  public static void Fb()
  {
    ArrayList localArrayList = new ArrayList();
    for (apX localapX : byv.bFN().bFO().auK()) {
      localArrayList.add(localapX);
    }
    dLE.doY().t("spellsList", localArrayList);
  }

  public static void Fc() {
    ArrayList localArrayList = new ArrayList();
    DA.bIr.h(new bDY(localArrayList));

    dLE.doY().t("craftSkillsList", localArrayList);
  }
}