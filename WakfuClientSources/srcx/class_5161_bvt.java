import com.ankamagames.wakfu.client.binaryStorage.TreasureBinaryData;
import org.apache.log4j.Logger;

public class bvt
  implements asq
{
  private static final Logger K = Logger.getLogger(bvt.class);

  public void a(dnq paramdnq) {
    cze.cwb().a(new TreasureBinaryData(), new HH(this));

    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.treasure");
  }

  public static awl rj(int paramInt) {
    awl localawl = new awl(paramInt);
    try {
      cze.cwb().a(paramInt, new TreasureBinaryData(), new HF(localawl));
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return localawl;
  }
}