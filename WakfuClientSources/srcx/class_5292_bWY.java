import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import org.apache.log4j.Logger;

class bWY
{
  private static final Logger K = Logger.getLogger(bWY.class);

  public static boolean c(bjC parambjC, long paramLong) {
    if (!c(parambjC)) {
      return false;
    }
    if (!parambjC.asT().bD(paramLong)) {
      return false;
    }
    return true;
  }

  public static boolean c(bjC parambjC)
  {
    if (!parambjC.atb()) {
      return false;
    }
    if (!SoundFunctionsLibrary.ckJ().atb())
      return false;
    return true;
  }

  public static boolean hd(long paramLong) {
    long l = System.currentTimeMillis();
    if (!aGb.aSn().i(l, paramLong)) {
      return false;
    }
    aGb.aSn().v(l, paramLong);
    return true;
  }

  public static void a(bjC parambjC, long paramLong, byte paramByte, short paramShort, int paramInt, boolean paramBoolean) {
    if (paramLong == 0L) {
      K.debug("Id du son nul");
      return;
    }
    try
    {
      ahm localahm = (ahm)parambjC;
      aVB localaVB = SoundFunctionsLibrary.ckJ().a(paramLong, paramByte / 100.0F, paramShort, -1L, -1L, parambjC.aeR(), localahm, paramInt);

      if ((paramBoolean) && (localaVB != null))
        localahm.j(paramLong, localaVB.akM());
    }
    catch (Exception localException) {
      K.debug("soundExtension or soundPath not initialized " + localException);
    }
  }

  public static void a(bjC parambjC, long paramLong, byte paramByte, short paramShort, boolean paramBoolean) {
    if (paramLong == 0L) {
      K.debug("Id du son nul");
      return;
    }
    try {
      aVB localaVB = SoundFunctionsLibrary.ckJ().a(paramLong, paramByte / 100.0F, paramShort, -1L, -1L, parambjC.aeR());

      if ((paramBoolean) && (localaVB != null))
        ((ahm)parambjC).j(paramLong, localaVB.akM());
    } catch (Exception localException) {
      K.debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}