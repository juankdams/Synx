import org.apache.log4j.Logger;

public class Aa
  implements Comparable
{
  private static final Logger K = Logger.getLogger(Aa.class);
  private final int aw;
  private final int aSg;
  private final int RZ;
  private final short aFe;
  private final int bvk;
  private final int bvl;
  private String aGq;
  private final String bvm;
  private final boolean bvn;
  private final byte bvo;

  public Aa(int paramInt1, int paramInt2, int paramInt3, short paramShort, int paramInt4, int paramInt5, String paramString, boolean paramBoolean, byte paramByte)
  {
    this.aw = paramInt1;
    this.aSg = paramInt2;
    this.RZ = paramInt3;
    this.aFe = paramShort;
    this.bvk = paramInt4;
    this.bvl = paramInt5;
    this.bvm = paramString;
    this.bvn = paramBoolean;
    this.bvo = paramByte;
  }

  public int IQ() {
    return this.bvl;
  }

  public int getId() {
    return this.aw;
  }

  public int gw() {
    return this.RZ;
  }

  public short nP() {
    return this.aFe;
  }

  public boolean IR() {
    return this.bvn;
  }

  public byte IS() {
    return this.bvo;
  }

  public int a(Aa paramAa) {
    return this.bvo - paramAa.bvo;
  }

  public int IT() {
    return this.bvk;
  }
}