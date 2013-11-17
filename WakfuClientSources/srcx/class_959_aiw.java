import java.util.Locale;

public class aiw extends aRw
{
  private Locale dff;

  public byte[] encode()
  {
    String str = this.dff.getLanguage();
    byte[] arrayOfByte = dzp.qC(str);
    return a((byte)3, arrayOfByte);
  }

  public void setLocale(Locale paramLocale) {
    this.dff = paramLocale;
  }

  public int getId()
  {
    return 13001;
  }
}