import java.nio.ByteBuffer;

public class blK
{
  public static final diO fCS = new diO("", -1, -1, null, "", false);
  public static final int fCT = 1;
  public static final int fCU = 5;
  public static final int fCV = 5;
  private static final int[] fCW = { 1, 5 };

  public static boolean qe(int paramInt)
  {
    return aUP.c(fCW, paramInt);
  }

  public static diO au(ByteBuffer paramByteBuffer) {
    bwV localbwV = new bwV();
    localbwV.h(paramByteBuffer);
    diO localdiO = new diO();
    localdiO.b(localbwV);
    return localdiO;
  }
}