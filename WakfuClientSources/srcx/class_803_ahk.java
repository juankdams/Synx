import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

final class ahk extends Mo
{
  private final bgx iJ;

  ahk(bKm parambKm, bgx parambgx)
  {
    this.iJ = parambgx;
    this.iJ.ao().a(this);
  }

  public void aS() {
    bKm.asw().error("Le chemin en cours ne devrait pas être envoyé par le client");
  }

  public void aT() {
    if (this.iJ.cfK != null) {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(this.iJ.cfK.mvl);
      dtq localdtq = dtq.aO(localByteBuffer);
      if ((localdtq != null) && (this.aHq.aeL() != null))
        this.aHq.aeL().a(localdtq);
    }
  }
}