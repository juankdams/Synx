import java.io.PrintStream;

public abstract class dwE
  implements Cloneable
{
  protected FF aIn;
  protected aaA RX = aaA.cOW;
  protected String description;

  public void b(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public aaA gu()
  {
    return this.RX;
  }

  public void a(aaA paramaaA)
  {
    this.RX = paramaaA;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public String getDescription()
  {
    return this.description;
  }

  public void log(String paramString)
  {
    d(paramString, 2);
  }

  public void d(String paramString, int paramInt)
  {
    if (Ga() != null) {
      Ga().d(paramString, paramInt);
    }
    else if (paramInt <= 2)
      System.err.println(paramString);
  }

  public Object clone()
  {
    dwE localdwE = (dwE)super.clone();
    localdwE.a(gu());
    localdwE.b(Ga());
    return localdwE;
  }
}