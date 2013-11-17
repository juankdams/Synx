import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map.Entry;

public class bGE
{
  private final EnumMap gDf;

  public bGE()
  {
    this.gDf = new EnumMap(Rs.class);
  }

  public void a(iL paramiL) {
    this.gDf.put(paramiL.qL(), paramiL);
  }

  public boolean a(Rs paramRs) {
    return this.gDf.containsKey(paramRs);
  }

  public iL b(Rs paramRs) {
    return (iL)this.gDf.get(paramRs);
  }

  public int O() {
    return 2 + this.gDf.size() * iL.O();
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort((short)this.gDf.size());
    for (Map.Entry localEntry : this.gDf.entrySet()) {
      paramByteBuffer.put(((Rs)localEntry.getKey()).bJ());
      paramByteBuffer.putLong(((iL)localEntry.getValue()).getValue());
    }
  }

  public void U(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      byte b = paramByteBuffer.get();
      long l = paramByteBuffer.getLong();

      Rs localRs = Rs.ar(b);
      if (localRs != null)
      {
        this.gDf.put(localRs, new iL(localRs, l));
      }
    }
  }
}