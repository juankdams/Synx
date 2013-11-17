import org.eclipse.swt.browser.Browser;

public abstract class AN
  implements we
{
  protected final dqy aGW;
  protected final String m_url;
  private final String bwD;

  protected AN(dqy paramdqy, String paramString1, String paramString2)
  {
    this.aGW = paramdqy;
    this.m_url = paramString1;
    this.bwD = paramString2;
  }

  public String getUrl() {
    return this.m_url;
  }

  public boolean a(String paramString, Object[] paramArrayOfObject) {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("try{").append(this.bwD).append('.');
    localStringBuilder.append(paramString);
    localStringBuilder.append('(');
    int i = 0; for (int j = paramArrayOfObject.length; i < j; i++) {
      if (i != 0) {
        localStringBuilder.append(", ");
      }
      if ((paramArrayOfObject[i] instanceof String)) {
        String str = (String)paramArrayOfObject[i];
        localStringBuilder.append('\'').append(str).append('\'');
      } else if (((paramArrayOfObject[i] instanceof Number)) || ((paramArrayOfObject[i] instanceof Boolean))) {
        localStringBuilder.append(String.valueOf(paramArrayOfObject[i]));
      } else {
        throw new IllegalArgumentException("Un des param n'est pas du bon type : " + paramArrayOfObject[i]);
      }
    }
    localStringBuilder.append(");} catch (err) {alert(err.message);};");

    return this.aGW.getBrowser().execute(localStringBuilder.toString());
  }
}