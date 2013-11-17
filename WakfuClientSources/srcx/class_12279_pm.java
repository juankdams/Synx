public class pm
{
  private int count;
  private String name;
  private String aVj;
  private String prefix;
  private String aVk;

  public void setName(String paramString)
  {
    h("name", paramString);
    this.name = paramString;
  }

  public void setRegex(String paramString)
  {
    h("regex", paramString);
    this.aVj = paramString;
  }

  public void setPrefix(String paramString)
  {
    h("prefix", paramString);
    this.prefix = paramString;
  }

  public void a(dmq paramdmq)
  {
    String str = paramdmq.getValue();
    h("builtin", str);
    this.aVk = str;
  }

  private void h(String paramString1, String paramString2) {
    if ((paramString2 == null) || (paramString2.length() < 1)) {
      throw new cJ("Invalid attribute: " + paramString1);
    }

    if (++this.count != 1)
      throw new cJ("Attributes name, regex, and prefix are mutually exclusive");
  }

  public String toString()
  {
    return "name=" + this.name + ", regex=" + this.aVj + ", prefix=" + this.prefix + ", builtin=" + this.aVk;
  }
}