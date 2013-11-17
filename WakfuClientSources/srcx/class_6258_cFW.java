import org.apache.log4j.Logger;

public class cFW extends cMb
  implements AQ
{
  private static final Logger K = Logger.getLogger(cFW.class);
  public static final short bKU = 1;
  protected zs iBa;

  public void aJ()
  {
    super.aJ();
    x((short)1);
    setVisible(true);
    ev(true);
    eu(true);
    if ((!bB) && (this.iBa != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.iBa = null;
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (paramdJO == dJO.lVv) {
      String str1 = bU.fH().b(119, this.iBa.getId(), new Object[0]);
      String str2 = bU.fH().b(120, this.iBa.getId(), new Object[0]);
      dLE.doY().t("arcadeDungeon", new Zz(str1, str2, this.iBa.HY()));
      cBQ.cxL().a("arcadeDungeonTeaserDialog", VV.dJ("arcadeDungeonTeaserDialog"), 257L, (short)10000);

      ddK localddK = new ddK(this);

      cBQ.cxL().a(localddK);
      cBQ.cxL().j("wakfu.arcadeDungeon", dSq.class);

      aWc.blo().eO(600120L);
      return true;
    }

    return false;
  }

  public void al()
  {
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] L'IE de RewardDisplayer " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    zs localzs = (zs)aKY.epr.a(cdc.hwh, Integer.valueOf(arrayOfString[0]).intValue());
    if (localzs == null) {
      K.error("[LD] L'IE de RewardDisplayer " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.iBa = localzs;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public csx[] am()
  {
    aCH localaCH = clR.cni().vL(this.iBa.gC());
    if (localaCH == null) {
      K.error("[LD] Impossible de trouver le visuel " + this.iBa.gC() + " pour l'IE " + this.aTz, new IllegalArgumentException());
      return csx.icw;
    }
    byp localbyp = (byp)aiI.dgl.avt();
    localbyp.iT(localaCH.aOR());
    localbyp.setName("desc.mru." + localaCH.aOS());
    localbyp.b(adT());
    return new csx[] { localbyp };
  }

  public String getName()
  {
    return "";
  }

  public diP tj()
  {
    return this.iBa;
  }
}