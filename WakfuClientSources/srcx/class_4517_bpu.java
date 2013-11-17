import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bpu
{
  private static final Logger K = Logger.getLogger(bpu.class);
  private final long aT;
  private final String aQZ;
  private final long dUK;

  private bpu(long paramLong1, String paramString, long paramLong2)
  {
    this.aT = paramLong1;
    this.aQZ = paramString;
    this.dUK = paramLong2;
  }

  public long CD() {
    return this.aT;
  }

  public String uo() {
    return this.aQZ;
  }

  public long CH() {
    return this.dUK;
  }

  public String toString()
  {
    return "GuildInfo{m_guildId=" + this.aT + ", m_guildName='" + this.aQZ + '\'' + ", m_blazon=" + this.dUK + '}';
  }

  public static long c(cKg paramcKg)
  {
    if (paramcKg.aiJ() == null) {
      K.error("Demande d'info de guild sur un monde qui n'appartient pas à une guilde");
      return 0L;
    }
    return paramcKg.aiJ().CD();
  }

  public static bpu av(ByteBuffer paramByteBuffer) {
    long l1 = paramByteBuffer.getLong();
    if (l1 == 0L) {
      return null;
    }
    long l2 = paramByteBuffer.getLong();
    byte[] arrayOfByte = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte);
    String str = dzp.aJ(arrayOfByte);
    return new bpu(l1, str, l2);
  }

  public static void a(bpu parambpu, cXr paramcXr) {
    if (parambpu == null) {
      K.error("serialisation d'un HM qui n'appartient à personne");
      paramcXr.jn(0L);
      return;
    }

    paramcXr.jn(parambpu.CD());
    paramcXr.jn(parambpu.CH());
    byte[] arrayOfByte = dzp.qC(parambpu.uo());
    paramcXr.putInt(arrayOfByte.length);
    paramcXr.aD(arrayOfByte);
  }

  public static bpu a(long paramLong1, String paramString, long paramLong2) {
    if (paramLong1 == 0L)
      return null;
    return new bpu(paramLong1, paramString, paramLong2);
  }
}