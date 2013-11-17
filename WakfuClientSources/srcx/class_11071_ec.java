public abstract class ec
{
  private String m_name = "";
  private dou[] VQ = null;

  public ec(String paramString, dou[] paramArrayOfdou)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Nom de liste ne peut être null.");
    }

    this.m_name = paramString;
    this.VQ = paramArrayOfdou;
  }

  public ec(dou[] paramArrayOfdou)
  {
    this("", paramArrayOfdou);
  }

  public final int it()
  {
    return this.VQ != null ? this.VQ.length : 0;
  }

  public final String getName()
  {
    return this.m_name;
  }

  public dou aC(int paramInt)
  {
    return this.VQ[paramInt];
  }

  public abstract dou[] iu();
}