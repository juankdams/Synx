import java.io.Writer;
import java.util.HashMap;

public class aSQ extends cVQ
{
  private final HashMap eQj;
  private final int eQk;
  private final int eQl;

  public aSQ(CharSequence[][] paramArrayOfCharSequence)
  {
    this.eQj = new HashMap();
    int i = 2147483647;
    int j = 0;
    if (paramArrayOfCharSequence != null) {
      for (CharSequence[] arrayOfCharSequence1 : paramArrayOfCharSequence) {
        this.eQj.put(arrayOfCharSequence1[0], arrayOfCharSequence1[1]);
        int n = arrayOfCharSequence1[0].length();
        if (n < i) {
          i = n;
        }
        if (n > j) {
          j = n;
        }
      }
    }
    this.eQk = i;
    this.eQl = j;
  }

  public int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter)
  {
    int i = this.eQl;
    if (paramInt + this.eQl > paramCharSequence.length()) {
      i = paramCharSequence.length() - paramInt;
    }

    for (int j = i; j >= this.eQk; j--) {
      CharSequence localCharSequence1 = paramCharSequence.subSequence(paramInt, paramInt + j);
      CharSequence localCharSequence2 = (CharSequence)this.eQj.get(localCharSequence1);
      if (localCharSequence2 != null) {
        paramWriter.write(localCharSequence2.toString());
        return j;
      }
    }
    return 0;
  }
}