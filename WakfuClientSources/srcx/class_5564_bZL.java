public class bZL
{
  private final String hqs;
  private String hqt;
  private String defaultValue;

  public bZL(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("prompt must not be null");
    }

    this.hqs = paramString;
  }

  public String getPrompt()
  {
    return this.hqs;
  }

  public void kN(String paramString)
  {
    this.hqt = paramString;
  }

  public boolean cep()
  {
    return true;
  }

  public String getInput()
  {
    return this.hqt;
  }

  public String getDefaultValue()
  {
    return this.defaultValue;
  }

  public void setDefaultValue(String paramString)
  {
    this.defaultValue = paramString;
  }
}