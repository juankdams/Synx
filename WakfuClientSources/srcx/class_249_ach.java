import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class ach
{
  private static final Map cQY = Collections.unmodifiableMap(localHashMap);

  private static final byte[] cQZ = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  static final String cRa = "UTF8";
  private static final String cRb = "utf-8";
  static final dxu cRc = new aKP("UTF8");

  static ByteBuffer i(ByteBuffer paramByteBuffer, int paramInt)
  {
    paramByteBuffer.limit(paramByteBuffer.position());
    paramByteBuffer.rewind();

    int i = paramByteBuffer.capacity() * 2;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i < paramInt ? paramInt : i);

    localByteBuffer.put(paramByteBuffer);
    return localByteBuffer;
  }

  static void a(ByteBuffer paramByteBuffer, char paramChar)
  {
    paramByteBuffer.put((byte)37);
    paramByteBuffer.put((byte)85);

    paramByteBuffer.put(cQZ[(paramChar >> '\f' & 0xF)]);
    paramByteBuffer.put(cQZ[(paramChar >> '\b' & 0xF)]);
    paramByteBuffer.put(cQZ[(paramChar >> '\004' & 0xF)]);
    paramByteBuffer.put(cQZ[(paramChar & 0xF)]);
  }

  public static dxu dY(String paramString)
  {
    if (dZ(paramString)) {
      return cRc;
    }

    if (paramString == null) {
      return new aKP();
    }

    di localdi = (di)cQY.get(paramString);

    if (localdi != null) {
      return localdi.hc();
    }

    try
    {
      Charset localCharset = Charset.forName(paramString);
      return new bOv(localCharset);
    } catch (UnsupportedCharsetException localUnsupportedCharsetException) {
    }
    return new aKP(paramString);
  }

  static boolean dZ(String paramString)
  {
    if (paramString == null)
    {
      paramString = System.getProperty("file.encoding");
    }
    return ("UTF8".equalsIgnoreCase(paramString)) || ("utf-8".equalsIgnoreCase(paramString));
  }

  static
  {
    HashMap localHashMap = new HashMap();

    char[] arrayOfChar1 = { 'Ç', 'ü', 'é', 'â', 'ä', 'à', 'å', 'ç', 'ê', 'ë', 'è', 'ï', 'î', 'ì', 'Ä', 'Å', 'É', 'æ', 'Æ', 'ô', 'ö', 'ò', 'û', 'ù', 'ÿ', 'Ö', 'Ü', '¢', '£', '¥', '₧', 'ƒ', 'á', 'í', 'ó', 'ú', 'ñ', 'Ñ', 'ª', 'º', '¿', '⌐', '¬', '½', '¼', '¡', '«', '»', '░', '▒', '▓', '│', '┤', '╡', '╢', '╖', '╕', '╣', '║', '╗', '╝', '╜', '╛', '┐', '└', '┴', '┬', '├', '─', '┼', '╞', '╟', '╚', '╔', '╩', '╦', '╠', '═', '╬', '╧', '╨', '╤', '╥', '╙', '╘', '╒', '╓', '╫', '╪', '┘', '┌', '█', '▄', '▌', '▐', '▀', 'α', 'ß', 'Γ', 'π', 'Σ', 'σ', 'µ', 'τ', 'Φ', 'Θ', 'Ω', 'δ', '∞', 'φ', 'ε', '∩', '≡', '±', '≥', '≤', '⌠', '⌡', '÷', '≈', '°', '∙', '·', '√', 'ⁿ', '²', '■', ' ' };

    di localdi1 = new di(arrayOfChar1);

    localHashMap.put("CP437", localdi1);
    localHashMap.put("Cp437", localdi1);
    localHashMap.put("cp437", localdi1);
    localHashMap.put("IBM437", localdi1);
    localHashMap.put("ibm437", localdi1);

    char[] arrayOfChar2 = { 'Ç', 'ü', 'é', 'â', 'ä', 'à', 'å', 'ç', 'ê', 'ë', 'è', 'ï', 'î', 'ì', 'Ä', 'Å', 'É', 'æ', 'Æ', 'ô', 'ö', 'ò', 'û', 'ù', 'ÿ', 'Ö', 'Ü', 'ø', '£', 'Ø', '×', 'ƒ', 'á', 'í', 'ó', 'ú', 'ñ', 'Ñ', 'ª', 'º', '¿', '®', '¬', '½', '¼', '¡', '«', '»', '░', '▒', '▓', '│', '┤', 'Á', 'Â', 'À', '©', '╣', '║', '╗', '╝', '¢', '¥', '┐', '└', '┴', '┬', '├', '─', '┼', 'ã', 'Ã', '╚', '╔', '╩', '╦', '╠', '═', '╬', '¤', 'ð', 'Ð', 'Ê', 'Ë', 'È', 'ı', 'Í', 'Î', 'Ï', '┘', '┌', '█', '▄', '¦', 'Ì', '▀', 'Ó', 'ß', 'Ô', 'Ò', 'õ', 'Õ', 'µ', 'þ', 'Þ', 'Ú', 'Û', 'Ù', 'ý', 'Ý', '¯', '´', '­', '±', '‗', '¾', '¶', '§', '÷', '¸', '°', '¨', '·', '¹', '³', '²', '■', ' ' };

    di localdi2 = new di(arrayOfChar2);

    localHashMap.put("CP850", localdi2);
    localHashMap.put("Cp850", localdi2);
    localHashMap.put("cp850", localdi2);
    localHashMap.put("IBM850", localdi2);
    localHashMap.put("ibm850", localdi2);
  }
}