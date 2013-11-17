import java.io.File;
import java.nio.ByteBuffer;

public class aDo
{
  private static final int bt = 4096;
  private final dJe dXW = new dJe();
  private final String dXX;
  private final int bec;

  public aDo(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, 4096);
  }

  public aDo(String paramString1, String paramString2, int paramInt) {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString1));
    int i = localaYQ.readInt();

    this.dXW.ensureCapacity(i);

    for (int j = 0; j < i; j++) {
      this.dXW.C(localaYQ.readInt(), localaYQ.readLong());
    }

    this.dXX = paramString2;
    this.bec = paramInt;
  }

  public String aPq() {
    return this.dXX;
  }

  public cYJ gh(String paramString)
  {
    long l = this.dXW.get(paramString.hashCode());
    return dO(l);
  }

  public cYJ dO(long paramLong) {
    afP localafP = new afP(new File(this.dXX), this.bec);
    localafP.seek(paramLong);
    byte[] arrayOfByte = new byte[8];
    int i = 0;
    while (i != 8) {
      i += localafP.read(arrayOfByte, i, 8 - i);
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    long l = localByteBuffer.getLong();

    return new cYJ(localafP, paramLong + 8L, l);
  }

  public boolean gi(String paramString) {
    return this.dXW.containsKey(paramString.hashCode());
  }

  public void a(aCq paramaCq) {
    this.dXW.b(paramaCq);
  }
}