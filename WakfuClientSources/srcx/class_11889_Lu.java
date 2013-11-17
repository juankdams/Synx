import com.ankamagames.wakfu.client.binaryStorage.BoatBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.BoatLinkBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.CannonBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.DragoBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.TravelLoadingBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ZaapBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ZaapLinkBinaryData;
import org.apache.log4j.Logger;

public class Lu
  implements asq
{
  private static final Logger K = Logger.getLogger(Lu.class);

  private static final Lu bYc = new Lu();

  public void a(dnq paramdnq)
  {
    VZ();
    VY();

    VX();

    VW();
    VV();

    VU();

    paramdnq.c(this);
  }

  private void VU() {
    cze.cwb().a(new CannonBinaryData(), new bwf(this));
  }

  private void VV()
  {
    cze.cwb().a(new BoatLinkBinaryData(), new bwg(this));
  }

  private void VW()
  {
    cze.cwb().a(new BoatBinaryData(), new bwi(this));
  }

  private void VX()
  {
    cze.cwb().a(new DragoBinaryData(), new bwj(this));
  }

  private static dIk a(TravelLoadingBinaryData paramTravelLoadingBinaryData)
  {
    if (paramTravelLoadingBinaryData == null)
      return null;
    return new dIk(paramTravelLoadingBinaryData.anO(), paramTravelLoadingBinaryData.anP(), paramTravelLoadingBinaryData.anQ(), paramTravelLoadingBinaryData.anR());
  }

  private void VY()
  {
    cze.cwb().a(new ZaapLinkBinaryData(), new bwl(this));

    aot.dtv.aAK();
  }

  private void VZ() {
    cze.cwb().a(new ZaapBinaryData(), new bwm(this));
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.zaap");
  }

  public static Lu Wa() {
    return bYc;
  }
}