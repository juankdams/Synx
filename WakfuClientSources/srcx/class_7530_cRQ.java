import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cRQ extends PU
{
  private static final Logger K = Logger.getLogger(cRQ.class);
  public static final short bKU = 1;
  private int dTC;
  protected cXc kEh;

  protected void R(ByteBuffer paramByteBuffer)
  {
    this.dTC = paramByteBuffer.getInt();
  }

  public void aJ()
  {
    super.aJ();
    x((short)1);
    setVisible(true);
    ev(true);
    eu(true);
    this.dTC = -1;
    if ((!bB) && (this.kEh != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.kEh = null;
  }

  public void a(abc paramabc)
  {
  }

  public Ka[] sJ()
  {
    return this.kEh == null ? new Ka[] { Ka.bWh } : this.kEh.cuB();
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (paramdJO == dJO.lVv) {
      Hv localHv = Hv.QV();
      localHv.eR(this.kEh.Rk());
      byv.bFN().a(localHv);
      return true;
    }

    return super.a(paramdJO, parambhL);
  }

  public void al()
  {
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] L'IE de DimensionalBagBackgroundDisplay " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    cXc localcXc = (cXc)aKY.epr.a(cdc.hvP, Integer.valueOf(arrayOfString[0]).intValue());
    if (localcXc == null) {
      K.error("[LD] L'IE de DimensionalBagBackgroundDisplay " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");

      return;
    }
    this.kEh = localcXc;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  protected dJO[] abG()
  {
    return new dJO[] { dJO.lVv };
  }

  protected csx[] abH()
  {
    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(coH.hWi.aw);
    localcsl.ma("desc.mru.lookAt");
    return new csx[] { localcsl };
  }

  public boolean aMB()
  {
    bBn localbBn = Hh.QM().dh(this.dTC);
    return localbBn != null;
  }

  public String getName()
  {
    bBn localbBn = Hh.QM().dh(this.dTC);
    if (localbBn != null) {
      return localbBn.getName();
    }
    return "<UNKNOWN>";
  }

  protected void a(Dy paramDy)
  {
  }

  public aFk sK()
  {
    return aFk.ebg;
  }
}