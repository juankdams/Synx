import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class cok extends apG
{
  private static final int[] hVN = new int[Ka.values().length];

  public byte aBD()
  {
    return 9;
  }

  public boolean bj(byte paramByte) {
    return (paramByte >= 0) && (paramByte < aBD());
  }

  public short[] bk(byte paramByte) {
    int i = paramByte / 3 * 6;
    int j = paramByte % 3 * 6;
    return new short[] { (short)i, (short)j };
  }

  public boolean aBC() {
    return super.aBC();
  }

  public void a(cCB paramcCB) {
    cpy localcpy = new cpy();
    for (byte b = 0; b < aBD(); b = (byte)(b + 1)) {
      localcpy.dP(b);
    }
    Set localSet = this.dvK.entrySet();
    for (Map.Entry localEntry : localSet) {
      localcpy.dQ(((Byte)localEntry.getKey()).byteValue());
    }

    localcpy.c(new lI(this, paramcCB));
  }
}