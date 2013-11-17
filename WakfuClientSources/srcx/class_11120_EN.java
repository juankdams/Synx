import org.apache.log4j.Logger;

public class EN extends cMb
  implements AQ
{
  private static final Logger K = Logger.getLogger(EN.class);
  public static final short bKU = 1;
  protected dmA bKV;

  public void aJ()
  {
    super.aJ();
    x((short)1);
    setVisible(true);
    ev(true);
    eu(true);
    if ((!bB) && (this.bKV != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.bKV = null;
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (paramdJO == dJO.lVv) {
      cbs localcbs = new cbs(aqx.dyc.jy(this.bKV.aRs()));
      dLE.doY().t("arcadeDungeon", localcbs);
      cBQ.cxL().a("arcadeDungeonTeaserDialog", VV.dJ("arcadeDungeonTeaserDialog"), 257L, (short)10000);

      dot localdot = new dot(this);

      cBQ.cxL().a(localdot);
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
      K.error("[LD] L'IE de DungeonDisplayer " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    dmA localdmA = (dmA)aKY.epr.a(cdc.hwg, Integer.valueOf(arrayOfString[0]).intValue());
    if (localdmA == null) {
      K.error("[LD] L'IE de DungeonDisplayer " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.bKV = localdmA;
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
    aCH localaCH = clR.cni().vL(this.bKV.gC());
    if (localaCH == null) {
      K.error("[LD] Impossible de trouver le visuel " + this.bKV.gC() + " pour l'IE " + this.aTz, new IllegalArgumentException());
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
    return bU.fH().b(117, this.bKV.aRs(), new Object[0]);
  }

  public diP tj() {
    return this.bKV;
  }
}