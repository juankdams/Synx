public class dbt extends Exception
{
  private static final long serialVersionUID = 0L;
  private Throwable eda;

  public dbt(String paramString)
  {
    super(paramString);
  }

  public dbt(Throwable paramThrowable) {
    super(paramThrowable.getMessage());
    this.eda = paramThrowable;
  }

  public Throwable getCause() {
    return this.eda;
  }
}