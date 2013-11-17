import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class XQ extends PU
{
  private static final Logger K = Logger.getLogger(XQ.class);
  public static final short bKU = 1;
  private int cIl;
  private long kh;
  private short cIm;
  private boolean cIn;

  protected void R(ByteBuffer paramByteBuffer)
  {
    this.kh = paramByteBuffer.getLong();
    this.cIl = paramByteBuffer.getInt();
    this.cIm = paramByteBuffer.getShort();
    this.cIn = (paramByteBuffer.get() == 1);
  }

  public void aJ()
  {
    super.aJ();
    D(true);
    x((short)1);
    setVisible(true);
    ev(true);
    eu(true);

    this.cIl = 0;
    this.kh = 0L;
    this.cIm = 0;
    this.cIn = false;
  }

  public void a(abc paramabc)
  {
  }

  public boolean sI()
  {
    return isEmpty();
  }

  public boolean isEmpty() {
    return this.cIm == 0;
  }

  public Ka[] sJ() {
    return new Ka[] { Ka.bWg };
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    switch (dQH.av[paramdJO.ordinal()])
    {
    case 1:
    case 2:
    case 3:
      a(paramdJO);
      return true;
    }

    return super.a(paramdJO, parambhL);
  }

  public dJO eR()
  {
    return dJO.lVD;
  }

  protected dJO[] abG() {
    return new dJO[] { dJO.lVJ, dJO.lVK };
  }

  protected csx[] abH()
  {
    return new csx[] { aiI.dfH.avt(), aiI.dfL.avt() };
  }

  public String getName()
  {
    bBn localbBn = Hh.QM().dh(this.cIl);
    return localbBn != null ? localbBn.getName() : "<UNKNOWN>";
  }

  public long aiQ() {
    return this.kh;
  }

  protected void a(Dy paramDy) {
    if (paramDy.N() == 1) {
      cWJ localcWJ = (cWJ)paramDy;
      this.kh = localcWJ.hRk.cxL;
    }
  }

  public boolean ajK() {
    return this.cIn;
  }

  public int oc() {
    bBn localbBn = Hh.QM().dh(this.cIl);
    return localbBn != null ? localbBn.oc() : -1;
  }

  public aFk sK()
  {
    return aFk.ebh;
  }
}