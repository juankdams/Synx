import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public enum dLq
  implements bYj, ccI
{
  private static final Logger K = Logger.getLogger(dLq.class);
  private final byte hV;
  private final String aLm;

  private dLq(int arg3, String arg4)
  {
    int i;
    this.hV = ((byte)i);
    Object localObject;
    this.aLm = localObject;
  }

  public static dLq fO(byte paramByte)
  {
    dLq[] arrayOfdLq = values();
    for (int i = 0; i < arrayOfdLq.length; i++) {
      dLq localdLq = arrayOfdLq[i];
      if (localdLq.hV == paramByte)
        return localdLq;
    }
    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aLm;
  }

  public String bN() {
    return null;
  }

  public static ArrayList aP(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get() & 0xFF;
    if (i == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.get() & 0xFF;
      dLq localdLq = fO((byte)k);
      if (localdLq != null)
        localArrayList.add(localdLq);
      else
        K.warn("propriété incoonu " + k);
    }
    return localArrayList;
  }
}