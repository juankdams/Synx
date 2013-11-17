import com.ankamagames.wakfu.client.binaryStorage.ClimateBonusBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ClimateBonusListBinaryData;
import org.apache.log4j.Logger;

public class bVB
  implements asq
{
  protected static final Logger K = Logger.getLogger(bVB.class);

  public void a(dnq paramdnq)
  {
    aSx();
    paramdnq.c(this);
  }

  private boolean aSx()
  {
    cze.cwb().a(new ClimateBonusBinaryData(), new uV(this));

    cze.cwb().a(new ClimateBonusListBinaryData(), new uU(this));

    return true;
  }

  public String getName() {
    return bU.fH().getString("contentLoader.climateBonus");
  }
}