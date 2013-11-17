import org.apache.log4j.Logger;

public class bvo extends cMb
  implements AQ
{
  private static final Logger K = Logger.getLogger(bvo.class);
  public static final short bKU = 1;
  protected HZ gfk;

  public void aJ()
  {
    super.aJ();
    x((short)1);
    setVisible(true);
    ev(true);
    eu(true);
    if ((!bB) && (this.gfk != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.gfk = null;
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (paramdJO == dJO.lVv) {
      Hv localHv = Hv.QV();
      localHv.eR(this.gfk.Rk());
      byv.bFN().a(localHv);
      a(paramdJO);
      return true;
    }

    return false;
  }

  public void al()
  {
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] L'IE de BackgroundDisplay " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    HZ localHZ = (HZ)aKY.epr.a(cdc.hvS, Integer.valueOf(arrayOfString[0]).intValue());
    if (localHZ == null) {
      K.error("[LD] L'IE de BackgroundDisplay " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.gfk = localHZ;
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
    aCH localaCH = clR.cni().vL(this.gfk.gC());
    if (localaCH == null) {
      K.error("[LD] Impossible de trouver le visuel " + this.gfk.gC() + " pour l'IE " + this.aTz, new IllegalArgumentException());
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
    return bU.fH().b(79, this.gfk.getId(), new Object[0]);
  }

  public diP tj() {
    return this.gfk;
  }
}