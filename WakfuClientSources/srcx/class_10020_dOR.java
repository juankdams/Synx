import com.ankamagames.wakfu.client.binaryStorage.AptitudeBinaryData;
import org.apache.log4j.Logger;

public class dOR
  implements asq
{
  private static final Logger K = Logger.getLogger(dOR.class);

  private static final dOR mgz = new dOR();

  public static dOR dqr() {
    return mgz;
  }

  public void a(dnq paramdnq)
  {
    cze.cwb().a(new AptitudeBinaryData(), new dwD(this));

    paramdnq.c(this);
  }

  private bJw b(AptitudeBinaryData paramAptitudeBinaryData) {
    int[] arrayOfInt = aNl.bN(paramAptitudeBinaryData.getId(), paramAptitudeBinaryData.uO());
    eu localeu = eu.a(Byte.valueOf(paramAptitudeBinaryData.cFK()));
    qE localqE = aNl.a(arrayOfInt, localeu);

    return new bJw((short)paramAptitudeBinaryData.getId(), paramAptitudeBinaryData.bQA(), arrayOfInt, localeu, paramAptitudeBinaryData.atR(), paramAptitudeBinaryData.bQB(), paramAptitudeBinaryData.bQC(), paramAptitudeBinaryData.nV(), paramAptitudeBinaryData.cFL(), paramAptitudeBinaryData.cFM(), paramAptitudeBinaryData.cFN(), localqE);
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.aptitudes");
  }
}