public class blM extends aGK
{
  private String uri = "";
  private ClassLoader fCX;

  public void setURI(String paramString)
  {
    if (paramString.equals("antlib:org.apache.tools.ant")) {
      paramString = "";
    }
    if (paramString.startsWith("ant:")) {
      throw new cJ("Attempt to use a reserved URI " + paramString);
    }
    this.uri = paramString;
  }

  public String getURI()
  {
    return this.uri;
  }

  public void d(ClassLoader paramClassLoader)
  {
    this.fCX = paramClassLoader;
  }

  public ClassLoader bwO()
  {
    return this.fCX;
  }
}