import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aAG extends PU
{
  private static final Logger K = Logger.getLogger(aAG.class);
  public static final short bKU = 1;
  private int dTC;
  protected cxh dTD;

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
    if ((!bB) && (this.dTD != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.dTD = null;
  }

  public void a(abc paramabc)
  {
  }

  public Ka[] sJ()
  {
    return this.dTD == null ? new Ka[] { Ka.bWh } : this.dTD.cuB();
  }

  public void al()
  {
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] L'IE de Decoration " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    cxh localcxh = (cxh)aKY.epr.a(cdc.hvO, Integer.valueOf(arrayOfString[0]).intValue());
    if (localcxh == null) {
      K.error("[LD] L'IE de Decoration " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.dTD = localcxh;
  }

  public dJO eR()
  {
    return null;
  }

  protected dJO[] abG() {
    return dJO.lWj;
  }

  protected csx[] abH() {
    return csx.icw;
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
    return aFk.ebf;
  }
}