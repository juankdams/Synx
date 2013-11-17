import com.ankamagames.wakfu.client.binaryStorage.ProtectorBuffBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ProtectorBuffListBinaryData;
import org.apache.log4j.Logger;

public class dcQ
  implements asq
{
  protected static final Logger K = Logger.getLogger(dcQ.class);

  public void a(dnq paramdnq) {
    dPR.mji.a(new aNc());
    cOk();
    cOl();
    paramdnq.c(this);
  }

  private void cOk() {
    cze.cwb().a(new ProtectorBuffBinaryData(), new dET(this));
  }

  private void a(ProtectorBuffBinaryData paramProtectorBuffBinaryData)
  {
    for (int k : paramProtectorBuffBinaryData.djI()) {
      cFp localcFp = (cFp)ciQ.ckL().vt(k);
      if (localcFp != null)
        dPR.mji.b(localcFp);
      else
        K.error("Problème de chargmeent de ProtectorBuff " + paramProtectorBuffBinaryData.acm());
    }
  }

  private void cOl()
  {
    cze.cwb().a(new ProtectorBuffListBinaryData(), new dER(this));
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.nationBuffs");
  }
}