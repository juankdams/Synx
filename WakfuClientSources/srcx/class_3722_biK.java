import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class biK
{
  private static final Logger K = Logger.getLogger(biK.class);
  public static final int LOOP = 128;
  public static final int fzh = 64;
  public static final int fzi = 63;
  static final byte fzj = 1;
  static final byte fzk = 2;
  static final byte fzl = 3;
  static final byte fzm = 4;
  public short aDx;
  public String m_name;
  public int fzn;
  int fzo;
  byte car;
  private boolean fzp;
  public int Sz = -1;

  public final String getName() {
    return this.m_name;
  }

  public final boolean akR() {
    return (this.car & 0x80) != 0;
  }

  public final int buD() {
    return this.car & 0x3F;
  }

  public final boolean buE() {
    return this.fzp;
  }

  protected final void buF() {
    this.fzp = true;
  }

  public final String toString()
  {
    return this.aDx + " [" + this.m_name + "]";
  }

  public abstract int getFrameCount();

  public abstract int qg();

  public abstract int qh();

  public void d(aYQ paramaYQ) {
    this.aDx = paramaYQ.readShort();
    this.car = paramaYQ.readByte();
    if ((this.car & 0x40) != 0) {
      this.m_name = paramaYQ.readString();
      this.fzn = byn.jq(this.m_name);
      int i = this.m_name.indexOf('_') + 1;
      this.fzo = byn.jq(this.m_name.substring(i));
    } else {
      this.fzn = (this.fzo = 0);
    }

    paramaYQ.readInt();

    paramaYQ.readInt();
  }

  public abstract void b(int paramInt, ArrayList paramArrayList);

  public abstract short[] aT(int paramInt);

  public abstract boolean qi();

  public abstract short qj();

  public abstract int aU(int paramInt);

  public abstract void qk();

  public abstract short b(axM paramaxM1, axM paramaxM2);

  public static biK a(dGK paramdGK, aYQ paramaYQ, boolean paramBoolean)
  {
    cSr localcSr;
    if (paramdGK == null) {
      localcSr = new cSr(paramBoolean);
    } else {
      int i = paramaYQ.readByte();
      switch (i) {
      case 1:
        return new bHP(paramdGK);
      case 2:
        return new it(paramdGK);
      case 3:
        return new Hx(paramdGK);
      case 4:
        return new wx(paramdGK);
      }
      K.error("type incoonu " + i);
      return null;
    }

    return localcSr;
  }
}