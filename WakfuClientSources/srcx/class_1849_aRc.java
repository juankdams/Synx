import com.ankamagames.wakfu.client.binaryStorage.ProtectorEcosystemProtectionBinaryData;
import org.apache.log4j.Logger;

public class aRc
  implements asq
{
  protected static Logger K = Logger.getLogger(aRc.class);

  public void a(dnq paramdnq) {
    bhA();
    paramdnq.c(this);
  }

  public void bhA() {
    cze.cwb().a(new ProtectorEcosystemProtectionBinaryData(), new bDO(this));
  }

  private void a(ProtectorEcosystemProtectionBinaryData paramProtectorEcosystemProtectionBinaryData, lU paramlU)
  {
    for (BI localBI : paramProtectorEcosystemProtectionBinaryData.dvq())
      paramlU.b(localBI.KL(), localBI.KM(), localBI.KN(), localBI.KO(), localBI.KP());
  }

  private void b(ProtectorEcosystemProtectionBinaryData paramProtectorEcosystemProtectionBinaryData, lU paramlU)
  {
    for (btV localbtV : paramProtectorEcosystemProtectionBinaryData.dvp())
      paramlU.a(localbtV.bCe(), localbtV.KM(), localbtV.KN(), localbtV.KO(), localbtV.KP());
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.protectorEcosystem");
  }
}