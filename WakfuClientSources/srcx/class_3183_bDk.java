import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

public class bDk
{
  private static final Logger K = Logger.getLogger(bDk.class);

  private final bPu gyl = new bPu();
  private static final bDk gym = new bDk();

  public static bDk bLI() {
    return gym;
  }

  public void load(String paramString)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(dtb.readFile(paramString));
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    int i = localByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      dUx localdUx = new dUx(localByteBuffer, null);
      this.gyl.c(localdUx.az, localdUx);
    }
  }

  public dUx cr(short paramShort)
  {
    return (dUx)this.gyl.cx(paramShort);
  }

  public bHu cs(short paramShort) {
    bHu localbHu = new bHu();
    bM localbM = this.gyl.bVW();
    while (localbM.hasNext()) {
      localbM.fl();
      if (((dUx)localbM.value()).mrN == paramShort) {
        localbHu.add(localbM.fm());
      }
    }
    return localbHu;
  }
}