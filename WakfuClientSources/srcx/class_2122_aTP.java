import com.ankamagames.wakfu.client.binaryStorage.EffectGroupBinaryData;
import org.apache.log4j.Logger;

public final class aTP
  implements asq
{
  private static final Logger K = Logger.getLogger(aTP.class);

  private static final aTP eSh = new aTP();

  public static aTP biW() {
    return eSh;
  }

  public void a(dnq paramdnq)
  {
    aww localaww = new aww();
    dap.a(localaww);

    cze.cwb().a(new EffectGroupBinaryData(), new dWB(this, localaww));

    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.effectGroups");
  }
}