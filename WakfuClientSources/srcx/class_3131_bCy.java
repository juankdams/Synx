import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bCy extends aSv
{
  private static final Logger K = Logger.getLogger(bCy.class);

  private final agT gwO = new agT();

  public bCy(int paramInt1, int paramInt2) {
    this.hY = (paramInt1 * 18);
    this.hZ = (paramInt2 * 18);
  }

  public void J(int paramInt1, int paramInt2, short paramShort) {
    if ((!bB) && (!p(paramInt1, paramInt2))) throw new AssertionError();
    short s = cJ(paramInt1, paramInt2);
    this.gwO.m(s, paramShort);
  }

  public int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfbep))) throw new AssertionError();

    bep localbep = paramArrayOfbep[paramInt3];
    localbep.hY = paramInt1;
    localbep.hZ = paramInt2;
    localbep.aOl = cI(paramInt1, paramInt2);
    boolean bool = I(paramInt1, paramInt2);
    localbep.flI = (bool ? -1 : 7);
    localbep.gPY = false;
    localbep.io = (bool ? 127 : 0);
    localbep.frm = 0;
    localbep.frn = 0;
    return 1;
  }

  public int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfcZc))) throw new AssertionError();

    cZc localcZc = paramArrayOfcZc[paramInt3];
    localcZc.hY = paramInt1;
    localcZc.hZ = paramInt2;
    localcZc.aOl = cI(paramInt1, paramInt2);
    localcZc.gPY = false;
    localcZc.io = (I(paramInt1, paramInt2) ? 127 : 0);
    return 1;
  }

  public void b(cXr paramcXr) {
    int i = this.gwO.size();
    paramcXr.dT((short)i);

    this.gwO.a(new bKd(this, paramcXr));
  }

  public void i(ByteBuffer paramByteBuffer)
  {
    if ((!bB) && (!this.gwO.isEmpty())) throw new AssertionError();
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      short s1 = paramByteBuffer.getShort();
      short s2 = paramByteBuffer.getShort();
      this.gwO.m(s1, s2);
    }
  }

  public final boolean I(int paramInt1, int paramInt2)
  {
    if (!this.gwO.contains(cJ(paramInt1, paramInt2))) {
      return true;
    }
    return super.I(paramInt1, paramInt2);
  }

  public final short cI(int paramInt1, int paramInt2) {
    short s1 = cJ(paramInt1, paramInt2);
    short s2 = this.gwO.au(s1);
    if (s2 != 0)
      return s2;
    return this.gwO.contains(s1) ? s2 : -32768;
  }

  private short cJ(int paramInt1, int paramInt2) {
    byte b1 = (byte)(paramInt1 - this.hY);
    byte b2 = (byte)(paramInt2 - this.hZ);
    return bCO.l(b1, b2);
  }
}