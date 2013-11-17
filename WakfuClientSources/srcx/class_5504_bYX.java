import java.io.Writer;
import java.util.Arrays;
import java.util.EnumSet;

public class bYX extends cVQ
{
  private final EnumSet hpl;

  public bYX(akS[] paramArrayOfakS)
  {
    if (paramArrayOfakS.length > 0)
      this.hpl = EnumSet.copyOf(Arrays.asList(paramArrayOfakS));
    else
      this.hpl = EnumSet.copyOf(Arrays.asList(new akS[] { akS.dlH }));
  }

  public boolean a(akS paramakS)
  {
    return this.hpl == null ? false : this.hpl.contains(paramakS);
  }

  public int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter)
  {
    int i = paramCharSequence.length();

    if ((paramCharSequence.charAt(paramInt) == '&') && (paramInt < i - 2) && (paramCharSequence.charAt(paramInt + 1) == '#')) {
      int j = paramInt + 2;
      int k = 0;

      int m = paramCharSequence.charAt(j);
      if ((m == 120) || (m == 88)) {
        j++;
        k = 1;

        if (j == i) {
          return 0;
        }
      }

      int n = j;

      while ((n < i) && (((paramCharSequence.charAt(n) >= '0') && (paramCharSequence.charAt(n) <= '9')) || ((paramCharSequence.charAt(n) >= 'a') && (paramCharSequence.charAt(n) <= 'f')) || ((paramCharSequence.charAt(n) >= 'A') && (paramCharSequence.charAt(n) <= 'F'))))
      {
        n++;
      }

      int i1 = (n != i) && (paramCharSequence.charAt(n) == ';') ? 1 : 0;

      if (i1 == 0) {
        if (a(akS.dlH)) {
          return 0;
        }
        if (a(akS.dlJ)) {
          throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
        }
      }
      int i2;
      try
      {
        if (k != 0)
          i2 = Integer.parseInt(paramCharSequence.subSequence(j, n).toString(), 16);
        else
          i2 = Integer.parseInt(paramCharSequence.subSequence(j, n).toString(), 10);
      }
      catch (NumberFormatException localNumberFormatException) {
        return 0;
      }

      if (i2 > 65535) {
        char[] arrayOfChar = Character.toChars(i2);
        paramWriter.write(arrayOfChar[0]);
        paramWriter.write(arrayOfChar[1]);
      } else {
        paramWriter.write(i2);
      }

      return 2 + (n - j) + (k != 0 ? 1 : 0) + (i1 != 0 ? 1 : 0);
    }
    return 0;
  }
}