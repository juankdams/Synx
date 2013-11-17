import java.io.Writer;

public class qQ extends cVQ
{
  private static int aYd = 377;

  public int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter)
  {
    if ((paramCharSequence.charAt(paramInt) == '\\') && (paramInt < paramCharSequence.length() - 1) && (Character.isDigit(paramCharSequence.charAt(paramInt + 1)))) {
      int i = paramInt + 1;

      int j = paramInt + 2;
      while ((j < paramCharSequence.length()) && (Character.isDigit(paramCharSequence.charAt(j)))) {
        j++;
        if (Integer.parseInt(paramCharSequence.subSequence(i, j).toString(), 10) > aYd) {
          j--;
        }

      }

      paramWriter.write(Integer.parseInt(paramCharSequence.subSequence(i, j).toString(), 8));
      return 1 + j - i;
    }
    return 0;
  }
}