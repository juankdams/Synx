import org.apache.log4j.Logger;

public class dCe extends cMb
  implements AQ, bNK
{
  private static final Logger K = Logger.getLogger(dCe.class);
  private static final csx[] kSy = { new adP() };
  private dnA kSx;

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    return true;
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
    if (this.kSx == null) {
      K.error("Pas de m_info pour craftTableId=" + this.aTz);
      return kSy;
    }
    aCH localaCH = clR.cni().vL(this.kSx.gC());
    if (localaCH == null) {
      K.error("Pas de visual id=" + this.kSx.gC());
      return kSy;
    }

    abu localabu1 = (abu)aiI.dfI.avt();
    localabu1.a(localaCH);

    boolean bool = c(dLq.maH);

    if (!bool) {
      abu localabu2 = (abu)aiI.dgi.avt();
      localabu2.a(localaCH);
      return new csx[] { localabu1, localabu2 };
    }
    return new csx[] { localabu1 };
  }

  public short OL()
  {
    return (short)bY();
  }

  public String getName()
  {
    if (this.kSx == null) {
      K.error("Pas de paramétrage valide pour craftTableId=" + this.aTz);
      return "#ERROR#";
    }

    return bU.fH().b(59, this.kSx.getId(), new Object[0]);
  }

  public boolean x(int paramInt, byte paramByte) {
    return (paramByte == -2) || (paramByte == -1) || (this.kSx.cqk().contains(paramInt));
  }

  public boolean tF(int paramInt)
  {
    return this.kSx.cqk().contains(paramInt);
  }

  public int gC() {
    return this.kSx.gC();
  }

  public int axX() {
    return this.kSx.axX();
  }

  public void al()
  {
    dnA localdnA = (dnA)aKY.epr.a(cdc.hvN, Integer.valueOf(this.fgH).intValue());
    if (localdnA == null) {
      K.error("[LD] La Machine de Craft " + this.aTz + " à un paramètre [" + Integer.valueOf(this.fgH) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.kSx = localdnA;
    D(true);
  }

  public void tk()
  {
    super.tk();

    if (byv.bFN().c(duO.dax()))
      duO.dax().a(this);
  }

  public void bc()
  {
    super.bc();
    this.kSx = null;
  }

  public void aJ()
  {
    super.aJ();
    if ((!bB) && (this.kSx != null)) throw new AssertionError();
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }

  public diP tj() {
    return this.kSx;
  }
}