import org.apache.log4j.Logger;

public class dKb
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dKb.class);

  private static dKb lWC = new dKb();

  private dxx lWD = dxx.lDK;
  private dTN lWE;
  private bal lWF;
  private bnm N;

  public static dKb djg()
  {
    return lWC;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 18200:
      localObject = (auc)paramcWG;
      switch (Iv.bRg[this.lWD.ordinal()]) {
      case 1:
        this.lWE.o(((auc)localObject).getColor());
        dLE.doY().t("guildBannerPrimaryColor", this.lWE.dtH().toString());
        break;
      case 2:
        this.lWE.n(((auc)localObject).getColor());
        dLE.doY().t("guildBannerSecondaryColor", this.lWE.dtG().toString());
      }

      djh();
      return false;
    case 18203:
      localObject = (auc)paramcWG;
      this.lWD = ((auc)localObject).aGo();
      return false;
    case 18201:
      localObject = (bzu)paramcWG;
      if (((bzu)localObject).getIntValue() < 0)
        ahL.auH().c(this.lWE);
      else {
        ahL.auH().b(this.lWE);
      }
      djh();
      return false;
    case 18202:
      localObject = (bzu)paramcWG;
      if (((bzu)localObject).getIntValue() < 0)
        ahL.auH().e(this.lWE);
      else {
        ahL.auH().d(this.lWE);
      }
      djh();
      return false;
    case 18204:
      localObject = (Zv)paramcWG;
      String str1 = bXy.kF(((Zv)localObject).getName());

      bzE localbzE = rl(str1);
      if (localbzE != bzE.gnO) {
        str2 = null;
        switch (Iv.bRh[localbzE.ordinal()]) {
        case 1:
          str2 = bU.fH().getString("error.guild.creation.forbiddenName");
          break;
        case 2:
          str2 = bU.fH().getString("error.guild.creation.invalidDashPosition");
          break;
        case 3:
          str2 = bU.fH().getString("error.characterCreation.tooManyConsonant");
          break;
        case 4:
          str2 = bU.fH().getString("error.characterCreation.tooManyVowel");
          break;
        case 5:
          str2 = bU.fH().getString("error.characterCreation.nameTooLong");
          break;
        case 6:
          str2 = bU.fH().getString("error.characterCreation.nameTooShort");
          break;
        case 7:
          str2 = bU.fH().getString("error.characterCreation.badChar");
          break;
        case 8:
          str2 = bU.fH().getString("error.characterCreation.tooManyConsecutiveIdentical");
          break;
        case 9:
          str2 = bU.fH().getString("error.characterCreation.tooFewVowelInPart");
          break;
        case 10:
          str2 = bU.fH().getString("error.characterCreation.tooFewConsonantInPart");
          break;
        case 11:
          str2 = bU.fH().getString("error.characterCreation.tooManySpecialInPart");
          break;
        case 12:
          str2 = bU.fH().getString("error.characterCreation.parTooLong");
          break;
        case 13:
          str2 = bU.fH().getString("error.characterCreation.tooManySpecial");
          break;
        case 14:
          str2 = bU.fH().getString("error.guild.creation.nameWithBadCase");
          break;
        default:
          str2 = bU.fH().getString("error.guild.creation.invalidName");
        }

        cBQ.cxL().a(str2, Cn.et(1), 2L, 102, 3);

        return false;
      }

      String str2 = str1;
      String str3 = bU.fH().getString("guild.creation.validate", new Object[] { str2 });
      cKX localcKX = cBQ.cxL().a(str3, Cn.et(4), 6L, 102, 3);

      localcKX.a(new Is(this, str2, (Zv)localObject));

      return false;
    }

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  private bzE rl(String paramString)
  {
    return bXy.kH(paramString);
  }

  private void djh() {
    uz localuz = ahL.auH().a(this.lWE);
    dLE.doY().t("guildBannerTexture", localuz);
  }

  private void Pu() {
    byz localbyz = byv.bFN().bFO();
    int i = localbyz.fO().bDx();
    int j = dQN.mlr.drM();
    int k = dQN.mlr.drL();

    gA localgA = localbyz.bGP().yf(j);
    bBn localbBn = Hh.QM().dh(j);

    dLE.doY().t("guildCreation.hasItem", Boolean.valueOf(localgA != null));
    dLE.doY().t("guildCreation.itemDescription", localbBn);
    dLE.doY().t("guildCreation.hasMoney", Boolean.valueOf(i >= k));
    dLE.doY().t("guildCreation.feeDescription", Integer.valueOf(k));
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new Iu(this);

      this.lWF.sM();

      Pu();

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("guildCreatorDialog", VV.dJ("guildCreatorDialog"), 33024L, (short)10000);

      cBQ.cxL().j("wakfu.guildBannerCreator", DK.class);

      dLE.doY().t("guildBannerColors", boJ.byr().bys());

      this.lWE = ahL.auH().auI();

      dLE.doY().t("guildBannerPrimaryColor", this.lWE.dtH().toString());
      dLE.doY().t("guildBannerSecondaryColor", this.lWE.dtG().toString());

      djh();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.lWF.sM();

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("guildCreatorDialog");

      cBQ.cxL().mN("wakfu.guildBannerCreator");

      dLE.doY().removeProperty("guildBannerColors");
      dLE.doY().removeProperty("guildBannerPrimaryColor");
      dLE.doY().removeProperty("guildBannerSecondaryColor");

      this.lWE.cleanUp();
      this.lWE = null;
    }
  }

  public void a(bal parambal) {
    this.lWF = parambal;
  }
}