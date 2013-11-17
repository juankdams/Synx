import com.ankamagames.wakfu.client.binaryStorage.TimelineBuffListBinaryData;
import org.apache.log4j.Logger;

public final class Pt
  implements asq
{
  private static final Logger K = Logger.getLogger(Pt.class);

  public String getName() {
    return bU.fH().getString("contentLoader.timeline.buff.list");
  }

  public void a(dnq paramdnq) {
    try {
      cze.cwb().a(new TimelineBuffListBinaryData(), new cFn(this));
    }
    catch (Exception localException)
    {
      K.error("", localException);
    }

    paramdnq.c(this);
  }
}