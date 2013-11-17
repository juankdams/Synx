import com.ankamagames.wakfu.client.binaryStorage.CitizenRankBinaryData;

public final class asC
  implements asq
{
  private static asC dCr = new asC();

  public static asC aEO() {
    return dCr;
  }

  public void a(dnq paramdnq)
  {
    cze.cwb().a(new CitizenRankBinaryData(), new btT(this));

    dwC.dbQ().dbR();

    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.citizen.rank");
  }
}