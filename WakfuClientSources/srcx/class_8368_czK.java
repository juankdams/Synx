import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.Dimension;
import java.net.URL;
import org.apache.log4j.Logger;

public class czK extends cJF
{
  private static final Logger K = Logger.getLogger(czK.class);
  private final Dimension ioJ = new Dimension(800, 600);

  public czK() {
    try {
      String str = ay.bd().getString("appSkinPath");
      bFD localbFD1 = new bFD(str);
      bFD localbFD2 = new bFD(str, "Off", localbFD1);
      setTitle("WAKFU");
      a(localbFD1, localbFD2);

      int i = ay.bd().S("resolution.min.width", 800);
      int j = ay.bd().S("resolution.min.height", 600);
      this.ioJ.setSize(i, j);
    } catch (bdh localbdh) {
      K.error("Unable to create skinPath", localbdh);
    }
  }

  public void alw()
  {
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.quit"), Cn.et(0), 2073L, 102, 1);

    localcKX.a(new afI(this));
  }

  protected URL cwx()
  {
    return WakfuClientInstance.class.getResource("icon.png");
  }

  public Dimension getMinimumSize()
  {
    return this.ioJ;
  }

  public String toString()
  {
    return "WakfuApplicationUI{m_minDimensions=" + this.ioJ + "} ";
  }
}