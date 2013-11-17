import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class daI extends PU
  implements bNK
{
  private static final Logger K = Logger.getLogger(daI.class);
  public static final short bKU = 1;
  private dnA kSx;
  private static final csx[] kSy = csx.icw;

  protected void R(ByteBuffer paramByteBuffer)
  {
  }

  public void bc()
  {
    super.bc();
    this.kSx = null;
  }

  public void aJ()
  {
    super.aJ();
    x((short)1);
    setVisible(true);
    eu(false);
    ev(true);
    D(true);
    setSelectable(true);
    if ((!bB) && (this.kSx != null)) throw new AssertionError();
  }

  public void a(abc paramabc)
  {
  }

  public Ka[] sJ()
  {
    return new Ka[] { Ka.bWi };
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (!super.a(paramdJO, parambhL)) {
      d(paramdJO);
    }
    return true;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  protected dJO[] abG() {
    return new dJO[] { dJO.lVv };
  }

  protected csx[] abH() {
    if (this.kSx == null) {
      K.error("Pas de m_info pour craftTableId=" + this.aTz);
      return kSy;
    }
    aCH localaCH = clR.cni().vL(this.kSx.gC());
    if (localaCH == null) {
      K.error("Pas de visual id=" + this.kSx.gC());
      return kSy;
    }

    abu localabu = (abu)aiI.dfI.avt();
    localabu.a(localaCH);
    return new csx[] { localabu };
  }

  public short OL()
  {
    return 60;
  }

  public String getName()
  {
    if (this.kSx == null) {
      K.error("Pas de paramétrage valide pour craftTableId=" + this.aTz);
      return "#ERROR#";
    }

    return bU.fH().b(59, this.kSx.getId(), new Object[0]);
  }

  public void al()
  {
    super.al();
    dnA localdnA = (dnA)aKY.epr.a(cdc.hvN, Integer.valueOf(this.fgH).intValue());
    if (localdnA == null) {
      K.error("[LD] La Machine de Craft " + this.aTz + " à un paramètre [" + Integer.valueOf(this.fgH) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.kSx = localdnA;
    D(true);
  }

  public int axX() {
    return this.kSx.axX();
  }

  public boolean tF(int paramInt) {
    return this.kSx.cqk().contains(paramInt);
  }

  protected void a(Dy paramDy)
  {
  }

  public boolean x(int paramInt, byte paramByte)
  {
    return this.kSx != null ? this.kSx.cqk().contains(paramInt) : false;
  }

  public int gC() {
    return this.kSx != null ? this.kSx.gC() : 0;
  }

  public aFk sK() {
    return aFk.ebi;
  }
}