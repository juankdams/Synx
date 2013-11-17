import com.sun.jna.Native;
import java.nio.ByteBuffer;

public abstract interface bra extends cST
{
  public static final bra fMl = (bra)Native.e(bIG.bPY() ? "msvcrt" : "c", bra.class);

  public abstract int a(ByteBuffer paramByteBuffer, int paramInt, String paramString, axA paramaxA);

  public abstract int a(axA paramaxA, Sx paramSx);

  public abstract int b(axA paramaxA, Sx paramSx);
}