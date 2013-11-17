import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.Locale;
import org.eclipse.swt.browser.Browser;

public class oa extends AN
{
  private static final int aTc = 600000;
  private Runnable aTd = new dzX(this);

  public oa(dqy paramdqy, String paramString1, String paramString2)
  {
    super(paramdqy, paramString1, paramString2);
  }

  public void initialize() {
    dka.cSF().a(this.aTd, 600000L, -1);
  }

  public void clean() {
    dka.cSF().j(this.aTd);
  }

  public void a(dqy paramdqy) {
    paramdqy.cXC();

    aNR localaNR = new aNR(this, paramdqy);
    paramdqy.getBrowser().addProgressListener(localaNR);
  }

  public String getUrl() {
    String str = bU.fH().ajJ().cAZ().toString();
    int i = (int)(WakfuClientInstance.awy().awB().c(yR.bsC) * 100.0F);

    StringBuilder localStringBuilder = new StringBuilder(this.m_url);
    localStringBuilder.append('?');
    localStringBuilder.append("host=WAKFU");
    localStringBuilder.append("&lang=").append(str);
    localStringBuilder.append("&volume=").append(i);

    return localStringBuilder.toString();
  }
}