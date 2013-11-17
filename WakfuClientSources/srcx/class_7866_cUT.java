import java.io.Writer;

public class cUT extends cVQ
{
  private final cVQ[] kHy;

  public cUT(cVQ[] paramArrayOfcVQ)
  {
    this.kHy = ((cVQ[])aUP.k(paramArrayOfcVQ));
  }

  public int a(CharSequence paramCharSequence, int paramInt, Writer paramWriter)
  {
    for (cVQ localcVQ : this.kHy) {
      int k = localcVQ.a(paramCharSequence, paramInt, paramWriter);
      if (k != 0) {
        return k;
      }
    }
    return 0;
  }
}