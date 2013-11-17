public class csR
{
  private String value;

  public final void setValue(String paramString)
  {
    if (this.value != null) {
      throw new IllegalStateException("Comment value already set.");
    }
    this.value = paramString;
  }

  public final String getValue()
  {
    return this.value;
  }

  public void addText(String paramString)
  {
    setValue(paramString);
  }
}