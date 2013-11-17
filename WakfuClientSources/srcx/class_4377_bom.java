import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;

public abstract class bom
{
  private static final byte[] fHM = bpr.fS(8448L);

  public static bpr b(Date paramDate)
  {
    return new bpr(fK(paramDate.getTime()));
  }

  public static byte[] fK(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);

    int i = localCalendar.get(1);
    if (i < 1980) {
      return ab(fHM);
    }
    int j = localCalendar.get(2) + 1;
    long l = i - 1980 << 25 | j << 21 | localCalendar.get(5) << 16 | localCalendar.get(11) << 11 | localCalendar.get(12) << 5 | localCalendar.get(13) >> 1;

    return bpr.fS(l);
  }

  public static long qu(int paramInt)
  {
    if (paramInt < 0) {
      return 4294967296L + paramInt;
    }
    return paramInt;
  }

  public static Date b(bpr parambpr)
  {
    long l = parambpr.getValue();
    return new Date(fL(l));
  }

  public static long fL(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();

    localCalendar.set(1, (int)(paramLong >> 25 & 0x7F) + 1980);
    localCalendar.set(2, (int)(paramLong >> 21 & 0xF) - 1);
    localCalendar.set(5, (int)(paramLong >> 16) & 0x1F);
    localCalendar.set(11, (int)(paramLong >> 11) & 0x1F);
    localCalendar.set(12, (int)(paramLong >> 5) & 0x3F);
    localCalendar.set(13, (int)(paramLong << 1) & 0x3E);

    return localCalendar.getTime().getTime();
  }

  static void a(dPL paramdPL, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    yW localyW = (yW)paramdPL.d(yW.bth);

    String str1 = paramdPL.getName();
    String str2 = a(localyW, paramArrayOfByte1);

    if ((str2 != null) && (!str1.equals(str2))) {
      paramdPL.setName(str2);
    }

    if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length > 0)) {
      afM localafM = (afM)paramdPL.d(afM.cYQ);

      String str3 = a(localafM, paramArrayOfByte2);

      if (str3 != null)
        paramdPL.setComment(str3);
    }
  }

  private static String a(EY paramEY, byte[] paramArrayOfByte)
  {
    if (paramEY != null) {
      CRC32 localCRC32 = new CRC32();
      localCRC32.update(paramArrayOfByte);
      long l = localCRC32.getValue();

      if (l == paramEY.Ou()) {
        try {
          return ach.cRc.K(paramEY.Ov());
        }
        catch (IOException localIOException)
        {
          return null;
        }
      }
    }
    return null;
  }

  static byte[] ab(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      byte[] arrayOfByte = new byte[paramArrayOfByte.length];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, arrayOfByte.length);
      return arrayOfByte;
    }
    return null;
  }

  static boolean b(dPL paramdPL)
  {
    return (c(paramdPL)) && (d(paramdPL));
  }

  private static boolean c(dPL paramdPL)
  {
    return !paramdPL.dqV().ack();
  }

  private static boolean d(dPL paramdPL)
  {
    return (paramdPL.getMethod() == 0) || (paramdPL.getMethod() == 8);
  }

  static void e(dPL paramdPL)
  {
    if (!c(paramdPL)) {
      throw new aml(dSK.moQ, paramdPL);
    }

    if (!d(paramdPL))
      throw new aml(dSK.moR, paramdPL);
  }
}