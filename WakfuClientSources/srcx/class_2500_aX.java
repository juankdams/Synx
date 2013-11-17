import com.ankamagames.wakfu.client.binaryStorage.NationRankBinaryData;
import org.apache.log4j.Logger;

public class aX
  implements asq
{
  private static final Logger K = Logger.getLogger(aX.class);

  private static final aX iN = new aX();

  public static aX cg() {
    return iN;
  }

  public void a(dnq paramdnq)
  {
    cze.cwb().a(new NationRankBinaryData(), new boY(this));

    paramdnq.c(this);
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.nation.ranks");
  }
}