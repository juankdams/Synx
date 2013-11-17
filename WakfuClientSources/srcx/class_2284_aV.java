import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

final class aV extends Mo
{
  private final bgx iJ;

  private aV(byo parambyo, bgx parambgx)
  {
    this.iJ = parambgx;
    this.iJ.ao().a(this);
  }

  public void aS() {
    byo.asw().error("Le client ne devrait pas sérialiser le chemin courant du NPC");
  }

  public void aT() {
    if (this.iJ.cfK != null) {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(this.iJ.cfK.mvl);
      dtq localdtq = dtq.aO(localByteBuffer);
      if (localdtq != null)
        this.iK.aeL().a(localdtq);
    }
  }
}