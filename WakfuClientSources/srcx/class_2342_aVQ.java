import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aVQ
  implements auP, cvW
{
  private static final Logger K = Logger.getLogger(aVQ.class);

  private static aVQ eXZ = new aVQ();

  public static final CG eYa = CG.bFI;
  public static final String eYb = "AnimStatique";
  public static final String eYc = "AnimEmote-Coucou";
  public static final String eYd = "AnimEmote-Defaite";
  public static final String eYe = "AnimEmote-Defaite";
  public static final String bSr = "AnimStatique";
  public static final String bSs = "AnimStatique02";
  private boolean eYf;
  private cKX eYg = null;
  private boolean eYh;

  public static aVQ blh()
  {
    return eXZ;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 16514:
      aWc.blo().eO(600003L);

      localObject1 = (cgZ)paramcWG;

      localObject2 = ((cgZ)localObject1).St();
      if (localObject2 != null) {
        if (((bKm)localObject2).bRQ()) {
          a(bNO.gSL, ((bKm)localObject2).getId(), ((bKm)localObject2).getName());
        }
        else {
          ckU.cmE().ak(true).g(bU.fH().getString("loadingWorld.progress"), 0);

          aRs.bhJ().ayn();

          localObject3 = new dau();
          ((dau)localObject3).g(((bKm)localObject2).getId());
          byv.bFN().aJK().d((cWG)localObject3);
          WakfuClientInstance.awy().awB().c(bmz.fER, ((bKm)localObject2).getName());
        }
      }

      return false;
    case 16511:
      localObject1 = (cgZ)paramcWG;

      localObject2 = ((cgZ)localObject1).St();
      if (localObject2 != null) {
        this.eYf = true;
        localObject3 = ((bKm)localObject2).aeL();

        ((cew)localObject3).eq("AnimEmote-Defaite");

        this.eYg = cBQ.cxL().a(String.format(bU.fH().getString("question.removeCharacter", new Object[] { ((bKm)localObject2).cQF() }), new Object[0]), Cn.et(0), 2073L, 102, 1);

        this.eYg.a(new bgj(this, (cew)localObject3, (bKm)localObject2));
      }

      return false;
    case 16413:
      localObject1 = bU.fH().getString("question.characterCreation.tutorial");
      localObject2 = new NW(102, 0, (String)localObject1, null, Cn.et(0), 24L);

      localObject3 = cBQ.cxL().a((NW)localObject2);
      ((cKX)localObject3).a(new bgi(this));

      return false;
    case 16414:
      ckU.cmE().ak(true).g(bU.fH().getString("loadingWorldList.progress"), 0);

      localObject1 = new cvK();
      byv.bFN().aJK().d((cWG)localObject1);

      return false;
    case 16510:
      localObject1 = (cgZ)paramcWG;
      as(((cgZ)localObject1).St());
      return false;
    }

    return true;
  }

  private void a(bNO parambNO, long paramLong, String paramString)
  {
    byv.bFN().b(cgG.ciL());

    aPz.bgu().a(parambNO);
    aPz.bgu().g(paramLong);
    aPz.bgu().cf(paramString);

    byv.bFN().a(aPz.bgu());
  }

  public void g(bKm parambKm) {
    cew localcew = parambKm.aeL();
    localcew.c(eYa);
  }

  public void as(Su paramSu)
  {
    Su localSu = bXb.cci().cck();

    if (paramSu != localSu)
    {
      au(localSu);

      at(paramSu);
    }

    bXb.cci().aM(paramSu);
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      bXb localbXb = bXb.cci();

      dLE.doY().t("characterChoice.characterInfosList", localbXb.cco());

      aNL localaNL = cBQ.cxL().a("characterChoiceDialog", VV.dJ("characterChoiceDialog"), 8192L, (short)10000);
      ccG localccG = (ccG)localaNL.getElementMap().fi("characterList");
      localccG.a(new bgk(this, localbXb, localccG));

      bBq.bKG().a(this);

      cBQ.cxL().j("wakfu.characterChoice", bYW.class);

      aWc.blo().blv();

      blj();
      blk();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.eYh = false;
      bXb.cci().aN(null);
      bXb.cci().aM(null);

      dLE.doY().removeProperty("characterChoice.characterInfosList");

      bBq.bKG().b(this);

      dLE.doY().removeProperty("characterChoice.selectedCharacter");

      cBQ.cxL().mW("characterChoiceDialog");

      cBQ.cxL().mN("wakfu.characterChoice");
    }
  }

  public int x(String paramString)
  {
    if (ckU.cmE().isRunning()) {
      byv.bFN().brw();
      ckU.cmE().done();
    }
    return 0;
  }

  public final boolean bli() {
    return this.eYf;
  }

  private void at(Su paramSu) {
    if (paramSu != null) {
      cew localcew = paramSu.aeL();
      if ((!bB) && (localcew == null)) throw new AssertionError();
      localcew.eq("AnimStatique02");
      localcew.es("AnimStatique02");
      dLE.doY().a(paramSu, new String[] { "actorDescriptorLibrary", "actorAnimation" });
    }
  }

  private void au(Su paramSu) {
    if (paramSu != null) {
      cew localcew = paramSu.aeL();
      if ((!bB) && (localcew == null)) throw new AssertionError();
      localcew.eq("AnimStatique");
      localcew.es("AnimStatique");
      dLE.doY().a(paramSu, new String[] { "actorDescriptorLibrary" });
      dLE.doY().a(paramSu, new String[] { "actorAnimation" });
    }
  }

  public void blj() {
    ArrayList localArrayList = (ArrayList)dLE.doY().rv("characterChoice.characterInfosList");
    if (localArrayList != null)
      for (int i = 0; i < localArrayList.size(); i++)
        g((bKm)localArrayList.get(i));
  }

  public void blk()
  {
    Su localSu = bXb.cci().cck();
    at(localSu);
    dLE.doY().t("characterChoice.selectedCharacter", localSu);
  }

  public void eh(boolean paramBoolean) {
    this.eYh = paramBoolean;
  }

  public void eM(long paramLong) {
    if (paramLong != bXb.cci().cck().getId()) {
      bXb.cci().aM(bXb.cci().hf(paramLong));
    }
    cBQ.cxL().a("renameCharacterDialog", VV.dJ("renameCharacterDialog"), 8448L, (short)10000);

    dLE.doY().t("renameCharater.dirty", Boolean.valueOf(false));
  }
}