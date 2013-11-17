import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class dzp
{
  private static final DecimalFormat lFQ = new DecimalFormat("###,###");
  private static final String lFR = "0123456789abcdef";
  private static final char lFS = '＃';
  private static final char lFT = '…';
  private static final char lFU = '‘';
  private static final char lFV = '’';
  private static final char lFW = '“';
  private static final char lFX = '”';
  private static final char lFY = '«';
  private static final char lFZ = '»';
  private static final char lGa = ' ';
  private static final String[] lGb = { "'", "'", "\"", "\"", "", "'", "'", "\"", "\"", "...", " ", "#" };

  private static final Pattern[] lGc = { Pattern.compile(String.valueOf('‘')), Pattern.compile(String.valueOf('’')), Pattern.compile("«\\s*"), Pattern.compile("\\s*»"), Pattern.compile("[\n\r]+"), Pattern.compile("[‘]+"), Pattern.compile("[’]+"), Pattern.compile("[“]+"), Pattern.compile("[”]+"), Pattern.compile("[…]+"), Pattern.compile("[ ]+"), Pattern.compile("[＃]+") };

  public static byte[] qC(String paramString)
  {
    if (paramString == null)
      return bPR.EMPTY_BYTE_ARRAY;
    try
    {
      return paramString.getBytes("UTF-8"); } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
    }
    return paramString.getBytes();
  }

  public static String aJ(byte[] paramArrayOfByte)
  {
    return m(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public static String m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    if (paramInt2 == 0)
      return "";
    try
    {
      return new String(paramArrayOfByte, paramInt1, paramInt2, "UTF-8"); } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
    }
    return new String(paramArrayOfByte);
  }

  public static String capitalize(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return paramString;
    }
    return paramString.substring(0, 1).toUpperCase() + paramString.substring(1).toLowerCase();
  }

  public static String qD(String paramString) {
    char[] arrayOfChar = paramString.trim().toLowerCase().toCharArray();
    int i = 0;

    int j = arrayOfChar.length;
    for (int k = 0; k < j; k++) {
      if (Character.isLetter(arrayOfChar[k])) {
        if (i == 0) {
          arrayOfChar[k] = Character.toUpperCase(arrayOfChar[k]);
          i = 1;
        }
      }
      else i = 0;
    }

    return String.valueOf(arrayOfChar);
  }

  public static String qE(String paramString) {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 1;

    for (char c : paramString.toLowerCase().toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        if (i != 0) {
          localStringBuilder.append(c);
        } else {
          localStringBuilder.append(Character.toUpperCase(c));
          i = 1;
        }
      }
      else i = 0;
    }
    return localStringBuilder.toString();
  }

  public static String ib(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String str = paramString.toLowerCase();
    str = cOg.nY(str);
    return str.trim();
  }

  public static String fa(int paramInt1, int paramInt2) {
    return Y(String.valueOf(paramInt1), paramInt2);
  }

  public static String Y(String paramString, int paramInt) {
    StringBuffer localStringBuffer = new StringBuffer(paramInt);
    for (int i = 0; i < paramInt - paramString.length(); i++) {
      localStringBuffer.append("0");
    }
    localStringBuffer.append(paramString);
    return localStringBuffer.toString();
  }

  public static String kt(long paramLong) {
    return t(paramLong, true);
  }

  public static String t(long paramLong, boolean paramBoolean) {
    Date localDate = new Date(paramLong);
    String str1 = localDate.getDate() + "/" + (localDate.getMonth() + 1) + "/" + (localDate.getYear() + 1900);
    if (!paramBoolean) {
      return str1;
    }
    String str2 = (localDate.getHours() < 10 ? "0" + localDate.getHours() : Integer.valueOf(localDate.getHours())) + ":" + (localDate.getMinutes() < 10 ? "0" + localDate.getMinutes() : Integer.valueOf(localDate.getMinutes()));
    return str1 + " à " + str2;
  }

  public static boolean qF(String paramString) {
    return (paramString == null) || (paramString.trim().length() == 0) || (paramString.equals("null"));
  }

  public static boolean qG(String paramString)
  {
    return qF(paramString) ? false : Pattern.matches("^[-]?\\d+$", paramString);
  }

  public static boolean qH(String paramString)
  {
    return qF(paramString) ? false : Pattern.matches("^[-]?[0-9.]+$", paramString);
  }

  public static int a(char paramChar, String paramString)
  {
    int i = 0;
    int j = paramString.length();

    for (int k = 0; k < j; k++)
    {
      if (paramString.charAt(k) == paramChar) {
        i++;
      }
    }
    return i;
  }

  public static int a(char paramChar, char[] paramArrayOfChar)
  {
    int i = 0;
    int j = paramArrayOfChar.length;

    for (int k = 0; k < j; k++)
    {
      if (paramArrayOfChar[k] == paramChar) {
        i++;
      }
    }
    return i;
  }

  public static String qI(String paramString)
  {
    Pattern localPattern = Pattern.compile("(.*)([0-9]+)");
    Matcher localMatcher = localPattern.matcher(paramString);
    if (!localMatcher.matches()) {
      return paramString + " 0";
    }
    String str = localMatcher.group(2);
    int i = Integer.parseInt(str);
    return localMatcher.group(1) + Integer.toString(i + 1);
  }

  public static boolean k(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean) {
      if (qF(paramString1))
        return qF(paramString2);
    }
    else {
      if (paramString1 == null)
        return paramString2 == null;
      if (paramString2 == null) {
        return false;
      }
    }

    return paramString1.equals(paramString2);
  }

  public static int compare(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return paramString2 == null ? 0 : "".compareTo(paramString2);
    }
    return paramString1.compareTo(paramString2 == null ? "" : paramString2);
  }

  public static int bj(String paramString1, String paramString2) {
    return bSL.hdZ.b(paramString1, paramString2);
  }

  public static String qJ(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    StringCharacterIterator localStringCharacterIterator = new StringCharacterIterator(paramString);
    int i = localStringCharacterIterator.current();
    while (i != 65535) {
      if (i == 60)
        localStringBuilder.append("&lt;");
      else if (i == 62)
        localStringBuilder.append("&gt;");
      else if (i == 34)
        localStringBuilder.append("&quot;");
      else if (i == 39)
        localStringBuilder.append("&#039;");
      else if (i == 38) {
        localStringBuilder.append("&amp;");
      }
      else
      {
        localStringBuilder.append(i);
      }
      int j = localStringCharacterIterator.next();
    }
    return localStringBuilder.toString();
  }

  public static String aK(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length * 2);
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      int j = paramArrayOfByte[i] & 0xFF;
      localStringBuffer.append("0123456789abcdef".charAt(j >>> 4)).append("0123456789abcdef".charAt(j & 0xF));
    }

    return localStringBuffer.toString();
  }

  public static void a(StringBuilder paramStringBuilder, byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      int j = paramArrayOfByte[i] & 0xFF;
      paramStringBuilder.append("0123456789abcdef".charAt(j >>> 4)).append("0123456789abcdef".charAt(j & 0xF));
    }
  }

  public static String ku(long paramLong)
  {
    return lFQ.format(paramLong);
  }

  public static String Ca(int paramInt) {
    return lFQ.format(paramInt);
  }

  public static String ey(short paramShort) {
    return lFQ.format(paramShort);
  }

  public static String b(adz paramadz) {
    if (paramadz.size() == 0) {
      return "";
    }
    return toString(paramadz.toArray());
  }

  public static String toString(int[] paramArrayOfInt) {
    if (paramArrayOfInt.length == 0) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfInt.length - 1; i++) {
      localStringBuilder.append(paramArrayOfInt[i]).append(",");
    }
    localStringBuilder.append(paramArrayOfInt[(paramArrayOfInt.length - 1)]);
    return localStringBuilder.toString();
  }

  public static String a(String[] paramArrayOfString, char paramChar) {
    if (paramArrayOfString.length == 0) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfString.length - 1; i++) {
      localStringBuilder.append(paramArrayOfString[i]).append(paramChar);
    }
    localStringBuilder.append(paramArrayOfString[(paramArrayOfString.length - 1)]);
    return localStringBuilder.toString();
  }

  public static int[] qK(String paramString) {
    return new adz(qL(paramString)).toArray();
  }

  public static int[] qL(String paramString) {
    cSi localcSi = new cSi();
    if (paramString.length() == 0) {
      return bPR.eWj;
    }
    String[] arrayOfString1 = c(paramString, ',');
    for (String str : arrayOfString1) {
      localcSi.add(Integer.parseInt(str.trim()));
    }
    return localcSi.cIf();
  }

  public static String d(String paramString1, String paramString2, Object paramObject) {
    int i = paramString1.indexOf(paramString2);
    return paramString1.substring(0, i) + paramObject + paramString1.substring(i + paramString2.length());
  }

  public static String[] aR(String paramString1, String paramString2) {
    if ((!bB) && (paramString1 == null)) throw new AssertionError();
    if (paramString1.length() == 0) {
      return new String[] { "" };
    }
    return cOg.aR(paramString1, paramString2);
  }

  public static String[] c(String paramString, char paramChar) {
    if ((!bB) && (paramString == null)) throw new AssertionError();
    if (paramString.length() == 0) {
      return new String[] { "" };
    }
    return cOg.c(paramString, paramChar);
  }

  public static String qM(String paramString)
  {
    if (paramString == null) {
      return null;
    }

    String str = paramString;

    for (int i = 0; i < lGc.length; i++) {
      str = lGc[i].matcher(str).replaceAll(lGb[i]);
    }

    return str;
  }

  public static void main(String[] paramArrayOfString) {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("x400");
    localArrayList.add("x15");
    localArrayList.add("x200a");
    localArrayList.add("x200");
    localArrayList.add("x20");
    localArrayList.add("x20b");
    localArrayList.add("x200a56");
    localArrayList.add("12");
    localArrayList.add("34");
    localArrayList.add("32f");
    localArrayList.add("ad21");
    Collections.sort(localArrayList, new cuP());

    for (String str : localArrayList)
      System.out.println(str);
  }
}