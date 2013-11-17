import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

public class aUk extends dqq
{
  public static final byte eUT = 1;
  public static final short MINOR = 28;
  public static final byte eUU = 2;
  public static final int eUV = -1;
  protected static final Logger K = Logger.getLogger(aUk.class);

  private static final aUk eUW = new aUk();

  public static final String eUX = str;
  public static final String eUY = String.format("%d.%02d (build %s [%4$tY-%4$tm-%4$td @ %4$tHH%4$tMmin%4$tS])", new Object[] { Integer.valueOf(1), Integer.valueOf(28), BUILD_VERSION, eVb });
  public static final String BUILD_VERSION;
  private static final String eUZ = "20131017";
  private static final String eVa = "101159";
  public static final Date eVb;
  public static final byte[] eVc;
  public static final int eVd;

  public static void display()
  {
    K.info(eUY);
  }

  protected boolean M(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      K.error("[implCheckVersion] check null");
      return false;
    }
    if (paramArrayOfByte.length < 5) {
      K.error("[implCheckVersion] wrong data length: " + paramArrayOfByte.length);
      return false;
    }

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    if (localByteBuffer.get() != 1) {
      return false;
    }
    if (localByteBuffer.getShort() != 28) {
      return false;
    }
    if (localByteBuffer.get() != 2) {
      return false;
    }

    return true;
  }

  protected byte[] bju()
  {
    return eVc;
  }

  public static String N(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4)) {
      return "<unknown>";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get() & 0xFF;
    int j = localByteBuffer.getShort() & 0xFFFF;
    int k = localByteBuffer.get() & 0xFFFF;
    localStringBuilder.append(i).append('.');
    if (j < 10) {
      localStringBuilder.append('0');
    }
    localStringBuilder.append(j).append('.');
    if (k < 10) {
      localStringBuilder.append('0');
    }
    localStringBuilder.append(k);
    int m = localByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[m];
    localByteBuffer.get(arrayOfByte);
    String str = dzp.aJ(arrayOfByte);
    int n = -1;
    try {
      n = Integer.parseInt(str);
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Numéro de build au format incorrect: " + str);
    }
    if (n >= 0) {
      localStringBuilder.append(" build ").append(str);
    }
    return localStringBuilder.toString();
  }

  static
  {
    int i = -1;
    if ("101159".length() > 0) {
      try {
        i = Integer.parseInt("101159");
      } catch (NumberFormatException localNumberFormatException) {
        K.error("TEAMCITY_BUILD_VERSION invalide : 101159");
      }
    }
    BUILD_VERSION = Integer.toString(i);
    Date localDate = new Date();
    if ("20131017".length() > 0) {
      try {
        localDate = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse("20131017");
      } catch (ParseException localParseException) {
        K.error("TEAMCITY_BUILD_DATE invalide : 20131017");
      }
    }
    eVb = localDate;
    byte[] arrayOfByte = dzp.qC(Integer.toString(-1));
    eVc = new byte[5 + arrayOfByte.length];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(eVc);
    localByteBuffer.put((byte)1);
    localByteBuffer.putShort((short)28);
    localByteBuffer.put((byte)2);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    eVd = 10028002;

    String str = String.format("%d.%02d.%d", new Object[] { Integer.valueOf(1), Integer.valueOf(28), Integer.valueOf(2) });

    if (i != -1)
      str = str + String.format(" (build %s)", new Object[] { BUILD_VERSION });
  }
}