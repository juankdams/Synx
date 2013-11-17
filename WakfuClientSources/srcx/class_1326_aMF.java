import java.io.Writer;

class aMF extends cVQ
{
  private static final char cpN = ',';
  private static final char cpO = '"';
  private static final String cpP = String.valueOf('"');
  private static final char[] cpQ = { ',', '"', '\r', '\n' };

  public int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter)
  {
    if (paramInt != 0) {
      throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
    }

    if ((paramCharSequence.charAt(0) != '"') || (paramCharSequence.charAt(paramCharSequence.length() - 1) != '"')) {
      paramWriter.write(paramCharSequence.toString());
      return paramCharSequence.length();
    }

    String str = paramCharSequence.subSequence(1, paramCharSequence.length() - 1).toString();

    if (cOg.b(str, cpQ))
    {
      paramWriter.write(cOg.replace(str, cpP + cpP, cpP));
    }
    else paramWriter.write(paramCharSequence.toString());

    return paramCharSequence.length();
  }
}