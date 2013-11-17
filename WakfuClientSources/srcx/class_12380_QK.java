import java.io.Writer;

class QK extends cVQ
{
  private static final char cpN = ',';
  private static final char cpO = '"';
  private static final String cpP = String.valueOf('"');
  private static final char[] cpQ = { ',', '"', '\r', '\n' };

  public int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter)
  {
    if (paramInt != 0) {
      throw new IllegalStateException("CsvEscaper should never reach the [1] index");
    }

    if (cOg.e(paramCharSequence.toString(), cpQ)) {
      paramWriter.write(paramCharSequence.toString());
    } else {
      paramWriter.write(34);
      paramWriter.write(cOg.replace(paramCharSequence.toString(), cpP, cpP + cpP));
      paramWriter.write(34);
    }
    return paramCharSequence.length();
  }
}