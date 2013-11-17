public class cJ extends RuntimeException
{
  private static final long serialVersionUID = -5419014565354664240L;
  private aaA RX = aaA.cOW;

  public cJ()
  {
  }

  public cJ(String paramString)
  {
    super(paramString);
  }

  public cJ(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public cJ(String paramString, Throwable paramThrowable, aaA paramaaA)
  {
    this(paramString, paramThrowable);
    this.RX = paramaaA;
  }

  public cJ(Throwable paramThrowable)
  {
    super(paramThrowable);
  }

  public cJ(String paramString, aaA paramaaA)
  {
    super(paramString);
    this.RX = paramaaA;
  }

  public cJ(Throwable paramThrowable, aaA paramaaA)
  {
    this(paramThrowable);
    this.RX = paramaaA;
  }

  public Throwable getException()
  {
    return getCause();
  }

  public String toString()
  {
    return this.RX.toString() + getMessage();
  }

  public void a(aaA paramaaA)
  {
    this.RX = paramaaA;
  }

  public aaA gu()
  {
    return this.RX;
  }
}