import org.apache.log4j.Logger;

public class aPz
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aPz.class);

  private static final aPz eMj = new aPz();
  private long iI;
  private String bSn;
  private bNO bSo = bNO.gSK;

  public static aPz bgu()
  {
    return eMj;
  }

  public void g(long paramLong)
  {
    this.iI = paramLong;
  }

  public void cf(String paramString) {
    this.bSn = paramString;
  }

  public void a(bNO parambNO) {
    this.bSo = parambNO;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId())
    {
    case 2050:
      boolean bool = cgG.a((Cd)paramcWG, this);

      if (!bool) {
        ckU.cmE().done();

        byv.bFN().b(this);

        cgG.ciL().gV(true);
        byv.bFN().a(cgG.ciL());
      }

      return false;
    case 2054:
      dQw localdQw = (dQw)paramcWG;

      K.info("Résultat de la création de perso : succes=" + localdQw.dru() + ", code=" + localdQw.drv());

      if (localdQw.dru())
      {
        ckU.cmE().ak(true).g(bU.fH().getString("loadingWorld.progress"), 0);
      } else {
        ckU.cmE().done();
        bY(localdQw.drv());
        dJt.setCreateCharacterFlag(false);
      }

      return false;
    }

    return true;
  }

  public static void bY(byte paramByte)
  {
    String str;
    switch (paramByte) {
    case 10:
      str = "error.characterCreation.existingName";
      break;
    case 11:
      str = "error.characterCreation.invalidName";
      break;
    case 12:
      str = "error.characterCreation.tooManyCharacters";
      break;
    default:
      str = "error.characterCreation";
    }

    cBQ.cxL().a(bU.fH().getString(str), Cn.et(1), 1027L, 8, 1);
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      Jd.Ss().g(this.iI);
      Jd.Ss().cf(this.bSn);
      Jd.Ss().a(this.bSo);
      byv.bFN().a(Jd.Ss());
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byv.bFN().b(Jd.Ss());
      this.iI = -1L;
      this.bSn = null;
      this.bSo = bNO.gSK;
    }
  }
}