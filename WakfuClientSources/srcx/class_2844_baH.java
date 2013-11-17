import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class baH
  implements dFU
{
  public boolean a(bYY parambYY)
  {
    Nn.an().info("Réception d'un message de contenu de vente de MARKET");
    byte[] arrayOfByte = parambYY.brQ();
    int i = parambYY.brR();
    int j = parambYY.cdI();

    ArrayList localArrayList = wQ.a(aXq.fcu, ByteBuffer.wrap(arrayOfByte));
    cPR.kzo.f(localArrayList.iterator());
    cPR.kzo.yO(i);
    cPR.kzo.yP(j);
    cPR.kzo.cGO();
    return false;
  }

  public int vN() {
    return 20102;
  }
}