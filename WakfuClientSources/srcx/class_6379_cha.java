public final class cha
{
  private static final String dDQ = System.getProperty("os.name").toLowerCase();

  public static boolean ciR()
  {
    return (dDQ.indexOf("nux") != -1) || (dDQ.indexOf("nix") != -1) || (dDQ.indexOf("freebsd") != -1);
  }

  public static boolean bPY()
  {
    return dDQ.indexOf("win") != -1;
  }

  public static boolean bPT()
  {
    return dDQ.indexOf("mac") != -1;
  }

  public static int hr(long paramLong)
  {
    aHA.debug("nativeComponentId={}", new Object[] { Long.valueOf(paramLong) });
    if ((paramLong < -2147483648L) || (paramLong > 2147483647L)) {
      aHA.warn("Native component id is too big for int", new Object[0]);
      throw new IllegalArgumentException("long value " + paramLong + " cannot be safely converted to an int.");
    }

    return (int)paramLong;
  }

  public static String ciS()
  {
    return bPY() ? "libvlc" : "vlc";
  }

  public static String ciT()
  {
    if (ciR()) {
      return "libvlc.so";
    }
    if (bPY()) {
      return "libvlc.dll";
    }
    if (bPT()) {
      return "libvlc.dylib";
    }

    throw new RuntimeException("Unknown operating system");
  }

  public static String ciU()
  {
    if (ciR()) {
      return "libvlccore.so";
    }
    if (bPY()) {
      return "libvlccore.dll";
    }
    if (bPT()) {
      return "libvlccore.dylib";
    }

    throw new RuntimeException("Unknown operating system");
  }

  public static String ciV()
  {
    if (!bPY()) {
      return "vlc/plugins";
    }

    return "plugins";
  }
}