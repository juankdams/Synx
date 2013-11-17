public class bcw extends RuntimeException
{
  private final je eaV;

  public bcw(je paramje, String paramString)
  {
    super(paramje + " : " + paramString);
    this.eaV = paramje;
  }

  public bcw(je paramje, String paramString, Throwable paramThrowable) {
    super(paramje + " : " + paramString, paramThrowable);
    this.eaV = paramje;
  }

  public je aRB() {
    return this.eaV;
  }
}