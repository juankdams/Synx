public class cDM extends cHO
{
  private static final String ixo = "content.";
  private static final char ixp = '.';

  public static cDM czF()
  {
    return (cDM)iDb;
  }

  public String ec(int paramInt1, int paramInt2)
  {
    String str = "content." + paramInt1 + '.' + paramInt2;

    return nq(str);
  }

  public String b(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    String str = "content." + paramInt1 + '.' + paramInt2;
    return getString(str, paramArrayOfObject);
  }

  public boolean ed(int paramInt1, int paramInt2)
  {
    String str = "content." + paramInt1 + '.' + paramInt2;
    return containsKey(str);
  }
}