public class dfn
  implements cDi
{
  public static final dfn kZm = new dfn();
  public static final byte bRz = 0;
  public static final byte kZn = 1;
  public static final byte kZo = 2;
  public static final byte kZp = 3;
  public static final byte kZq = 4;
  public static final byte kZr = 5;
  public static final byte kZs = 6;
  public static final byte kZt = 7;
  public static final byte kZu = 9;
  public static final byte kZv = 10;
  public static final byte kZw = 11;
  public static final byte kZx = 12;
  public static final byte kZy = 39;

  public String a(byte paramByte, String paramString)
  {
    return new lZ().tI().a(eT(paramByte), -1, -1, paramString).tP();
  }

  public static String eT(byte paramByte) {
    return String.format(ay.bd().getString("textIconsPath"), new Object[] { Byte.valueOf(paramByte) });
  }
}