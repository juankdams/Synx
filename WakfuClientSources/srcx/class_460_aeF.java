import java.util.regex.Pattern;

public abstract class aeF
{
  private static final String cWg = "(?:\\s+.*|$)";
  private static final String cWh = "\\s+";
  private String m_name;
  private Pattern cWi;
  private Pattern cWj;
  private byte cWk = -128;
  private boolean cWl = false;

  public aeF(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.m_name = "";

    String str1 = "";
    if ((paramString1 != null) && (paramString1.length() != 0) && 
      (!paramString1.endsWith("(?:\\s+.*|$)"))) {
      str1 = paramString1 + "(?:\\s+.*|$)";
    }

    this.cWi = Pattern.compile(str1);

    String str2 = "(" + paramString1 + "){1}";
    if ((paramString2 != null) && (paramString2.length() != 0) && 
      (!paramString2.startsWith(str2 + "\\s+"))) {
      str2 = str2 + "\\s+" + paramString2;
    }

    if (paramBoolean)
      str2 = str2 + "|(" + paramString1 + ")";
    this.cWj = Pattern.compile(str2);
  }

  public void setName(String paramString)
  {
    this.m_name = paramString;
  }

  public String getName()
  {
    return this.m_name;
  }

  public byte aql()
  {
    return this.cWk;
  }

  public void aN(byte paramByte)
  {
    this.cWk = paramByte;
  }

  public Pattern aqm()
  {
    return this.cWi;
  }

  public Pattern aqn()
  {
    return this.cWj;
  }

  public boolean aqo() {
    return this.cWl;
  }

  public void bV(boolean paramBoolean) {
    this.cWl = paramBoolean;
  }

  public abstract dnc aqp();
}