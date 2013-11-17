public class dcF extends amq
{
  public dcF()
  {
  }

  public dcF(String paramString)
  {
    super(paramString);
  }

  public dcF(String paramString, dsj paramdsj1, dsj paramdsj2) {
    super(paramString + " (old item : " + paramdsj2 + " refid : " + (paramdsj2 == null ? "<null>" : Integer.valueOf(paramdsj2.ok())) + " new item : " + paramdsj1 + " refid : " + (paramdsj1 == null ? "<null>" : Integer.valueOf(paramdsj1.ok())));
  }

  public dcF(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public dcF(Throwable paramThrowable) {
    super(paramThrowable);
  }
}