import com.ankamagames.wakfu.client.binaryStorage.MonsterTypePestBinaryData;
import org.apache.log4j.Logger;

public final class kG
  implements asq
{
  private static final Logger K = Logger.getLogger(kG.class);

  public void a(dnq paramdnq) {
    cze.cwb().a(new MonsterTypePestBinaryData(), new dFy(this));

    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.monsterFamilyPest");
  }
}