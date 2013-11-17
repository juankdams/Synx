import java.util.EventObject;

public class aaQ extends EventObject
{
  private static final long serialVersionUID = 4538050075952288486L;
  private final FF aIn;
  private final wZ aOL;
  private final aGK aON;
  private String message;
  private int cPk = 3;
  private Throwable exception;

  public aaQ(FF paramFF)
  {
    super(paramFF);
    this.aIn = paramFF;
    this.aOL = null;
    this.aON = null;
  }

  public aaQ(wZ paramwZ)
  {
    super(paramwZ);
    this.aIn = paramwZ.Ga();
    this.aOL = paramwZ;
    this.aON = null;
  }

  public aaQ(aGK paramaGK)
  {
    super(paramaGK);
    this.aIn = paramaGK.Ga();
    this.aOL = paramaGK.aSH();
    this.aON = paramaGK;
  }

  public void i(String paramString, int paramInt)
  {
    this.message = paramString;
    this.cPk = paramInt;
  }

  public void setException(Throwable paramThrowable)
  {
    this.exception = paramThrowable;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public wZ anA()
  {
    return this.aOL;
  }

  public aGK anB()
  {
    return this.aON;
  }

  public String getMessage()
  {
    return this.message;
  }

  public int getPriority()
  {
    return this.cPk;
  }

  public Throwable getException()
  {
    return this.exception;
  }
}