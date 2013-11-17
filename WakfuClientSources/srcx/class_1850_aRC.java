import java.io.ByteArrayOutputStream;

public class aRC extends ByteArrayOutputStream
{
  private FF aIn;
  private String Ru;
  private boolean eOD;

  public aRC(FF paramFF, String paramString)
  {
    this(paramFF, paramString, true);
  }

  public aRC(FF paramFF, String paramString, boolean paramBoolean)
  {
    this.aIn = paramFF;
    this.Ru = paramString;
    this.eOD = paramBoolean;
  }

  public void close()
  {
    if ((this.aIn != null) && (this.Ru != null)) {
      String str = new String(toByteArray());
      this.aIn.p(this.Ru, this.eOD ? str.trim() : str);
    }
  }
}