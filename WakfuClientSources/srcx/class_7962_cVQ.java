import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

public abstract class cVQ
{
  public abstract int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter);

  public final String x(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null)
      return null;
    try
    {
      StringWriter localStringWriter = new StringWriter(paramCharSequence.length() * 2);
      a(paramCharSequence, localStringWriter);
      return localStringWriter.toString();
    }
    catch (IOException localIOException) {
      throw new RuntimeException(localIOException);
    }
  }

  public final void a(CharSequence paramCharSequence, Writer paramWriter)
  {
    if (paramWriter == null) {
      throw new IllegalArgumentException("The Writer must not be null");
    }
    if (paramCharSequence == null) {
      return;
    }
    int i = 0;
    int j = paramCharSequence.length();
    while (i < j) {
      int k = a(paramCharSequence, i, paramWriter);
      if (k == 0) {
        char[] arrayOfChar = Character.toChars(Character.codePointAt(paramCharSequence, i));
        paramWriter.write(arrayOfChar);
        i += arrayOfChar.length;
      }
      else
      {
        for (int m = 0; m < k; m++)
          i += Character.charCount(Character.codePointAt(paramCharSequence, i));
      }
    }
  }

  public final cVQ a(cVQ[] paramArrayOfcVQ)
  {
    cVQ[] arrayOfcVQ = new cVQ[paramArrayOfcVQ.length + 1];
    arrayOfcVQ[0] = this;
    System.arraycopy(paramArrayOfcVQ, 0, arrayOfcVQ, 1, paramArrayOfcVQ.length);
    return new cUT(arrayOfcVQ);
  }

  public static String zg(int paramInt)
  {
    return Integer.toHexString(paramInt).toUpperCase(Locale.ENGLISH);
  }
}