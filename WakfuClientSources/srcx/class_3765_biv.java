import java.util.Vector;

public abstract interface biv
{
  public static final int fyM = 0;
  public static final int fyN = 256;
  public static final int MATCH_MULTILINE = 4096;
  public static final int MATCH_SINGLELINE = 65536;

  public abstract void setPattern(String paramString);

  public abstract String getPattern();

  public abstract boolean matches(String paramString);

  public abstract Vector iq(String paramString);

  public abstract boolean u(String paramString, int paramInt);

  public abstract Vector v(String paramString, int paramInt);
}