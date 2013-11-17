import com.ankamagames.wakfu.client.binaryStorage.AchievementBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.AchievementCategoryBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.AchievementListBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.AchievementVariableBinaryData;
import org.apache.log4j.Logger;

public class cdb
  implements asq
{
  protected static final Logger K = Logger.getLogger(cdb.class);

  public static final cdb hvM = new cdb();

  public void a(dnq paramdnq)
  {
    cfX();
    cfY();
    cfZ();
    cga();

    paramdnq.c(this);
  }

  private void cfX() {
    cze.cwb().a(new AchievementVariableBinaryData(), new cQp(this));
  }

  private void cfY()
  {
    cze.cwb().a(new AchievementCategoryBinaryData(), new cQs(this));
  }

  private void cfZ()
  {
    cze.cwb().a(new AchievementBinaryData(), new cQl(this));
  }

  private void cga()
  {
    cze.cwb().a(new AchievementListBinaryData(), new cQm(this));
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.achievements");
  }
}