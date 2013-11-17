import com.ankamagames.wakfu.client.binaryStorage.PetBinaryData;
import org.apache.log4j.Logger;

public class atb
  implements asq
{
  private static final Logger K = Logger.getLogger(atb.class);

  public static final atb dDc = new atb();

  public void a(dnq paramdnq)
  {
    cze.cwb().a(new PetBinaryData(), new bfw(this));

    paramdnq.c(this);
  }

  public static dlp a(PetBinaryData paramPetBinaryData) {
    dlp localdlp = new dlp(paramPetBinaryData.getId(), Integer.toString(paramPetBinaryData.oc()), paramPetBinaryData.aFZ(), paramPetBinaryData.aGa(), paramPetBinaryData.aGb(), paramPetBinaryData.aGc(), paramPetBinaryData.aGd(), paramPetBinaryData.aGe(), paramPetBinaryData.aGf(), paramPetBinaryData.aGg(), paramPetBinaryData.aGh(), paramPetBinaryData.alN());
    Object localObject3;
    for (localObject3 : paramPetBinaryData.aGi()) {
      localdlp.a(cDI.ef(localObject3.bTo()), localObject3.bTp());
    }
    for (localObject3 : paramPetBinaryData.aGj()) {
      localdlp.eJ(localObject3.gw(), localObject3.getValue());
    }
    for (localObject3 : paramPetBinaryData.aGk()) {
      localdlp.d(localObject3.gw(), localObject3.isVisible());
    }
    for (localObject3 : paramPetBinaryData.aGl()) {
      localdlp.a(localObject3.gw(), kb.I(localObject3.getDuration()));
    }
    ??? = paramPetBinaryData.aGm();
    if (??? != null) {
      for (int m : ???) {
        localdlp.Ay(m);
      }
    }
    for (Object localObject4 : paramPetBinaryData.aGn()) {
      localdlp.ad(localObject4.gw(), localObject4.aps(), localObject4.aIX());
    }
    return localdlp;
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.item");
  }
}