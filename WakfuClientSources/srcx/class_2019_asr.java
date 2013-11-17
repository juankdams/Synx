import java.io.IOException;

public class asr extends vi
{
  private dwE dCj;
  private int level = 2;

  public asr(dwE paramdwE)
  {
    this.dCj = paramdwE;
  }

  public asr(aGK paramaGK, int paramInt)
  {
    this(paramaGK, paramInt);
  }

  public asr(dwE paramdwE, int paramInt)
  {
    this(paramdwE);
    this.level = paramInt;
  }

  protected void Ee()
  {
    try
    {
      super.Ee();
    }
    catch (IOException localIOException) {
      throw new RuntimeException("Impossible IOException caught: " + localIOException);
    }
  }

  protected void aO(String paramString)
  {
    r(paramString, this.level);
  }

  protected void r(String paramString, int paramInt)
  {
    this.dCj.d(paramString, paramInt);
  }

  public int aEH()
  {
    return this.level;
  }
}