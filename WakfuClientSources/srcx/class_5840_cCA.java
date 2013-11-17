import java.nio.ByteBuffer;

public abstract class cCA
{
  public static final byte bRz = 0;
  public static final byte iuW = 1;
  public static final byte iuX = 2;

  public static cCA ed(byte paramByte)
  {
    switch (paramByte) {
    case 0:
      return new dOx();
    case 1:
      return new cSd();
    case 2:
      return new z();
    }
    return null;
  }

  public abstract byte L();

  public abstract void a(cXr paramcXr);

  public abstract void a(ByteBuffer paramByteBuffer);
}