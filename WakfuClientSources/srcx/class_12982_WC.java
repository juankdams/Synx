import org.apache.log4j.Logger;

public class WC
  implements bYw
{
  private static final Logger K = Logger.getLogger(WC.class);
  private String bYJ;
  private String SK;
  private boolean cGx;
  private boolean aDl = false;

  public WC(String paramString1, String paramString2) {
    this.bYJ = paramString1;
    this.SK = paramString2;
    this.cGx = false;

    this.aDl = true;
  }

  public WC(String paramString1, String paramString2, boolean paramBoolean) {
    this.bYJ = paramString1;
    this.SK = paramString2;
    this.cGx = paramBoolean;

    this.aDl = true;
  }

  public WC(K paramK) {
    if ((!paramK.getName().equalsIgnoreCase("texture")) || (paramK.e("path") == null) || (paramK.e("id") == null))
    {
      return;
    }
    try {
      if (paramK.e("path") != null) {
        this.SK = paramK.e("path").getStringValue();

        K localK = paramK.e("permanent");
        if (localK != null) {
          this.cGx = localK.getBooleanValue();
        }

        this.bYJ = paramK.e("id").getStringValue();

        this.aDl = true;
      }
    }
    catch (Exception localException) {
      K.error("Impossible de créer l'instance de texture", localException);
    }
  }

  public void a(uk paramuk) {
    if (this.aDl)
      paramuk.a(this.bYJ, this.SK, this.cGx);
  }

  public void a(bKD parambKD) {
    if (!this.aDl) {
      return;
    }

    String str = parambKD.bSL();

    parambKD.a(new bol(null, "loadTexture", str, new String[] { "\"" + this.bYJ + "\"", "\"" + this.SK + "\"", String.valueOf(this.cGx) }));
  }

  public boolean isInitialized()
  {
    return this.aDl;
  }
}