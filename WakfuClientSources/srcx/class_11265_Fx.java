import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class Fx extends hk
{
  public Fx(aAY paramaAY)
  {
  }

  public void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.bdf.dUn.clear();
    int i = paramByteBuffer.getInt();

    aAY.K.info("Sérialisation de " + this.bdf.dUn.size() + " candidats (avec le nombre de votes) pour la nation " + this.bdf.UI());

    while (i-- > 0) {
      Qy localQy = Qy.T(paramByteBuffer);
      this.bdf.dUn.put(localQy.getId(), localQy);
    }
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    aAY.K.info("Sérialisation des " + this.bdf.dUn.size() + " candidats (avec le nombre de votes) de la nation " + this.bdf.UI());

    paramByteBuffer.putInt(this.bdf.dUn.size());
    for (cHu localcHu = this.bdf.dUn.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      Qy localQy = (Qy)localcHu.value();
      localQy.a(paramByteBuffer, true);
    }
  }

  public int O()
  {
    int i = 4;
    for (cHu localcHu = this.bdf.dUn.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      i += ((Qy)localcHu.value()).O();
    }
    return i;
  }
}