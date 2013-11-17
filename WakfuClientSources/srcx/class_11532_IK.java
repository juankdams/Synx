import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class IK extends cCH
{
  IK(aVc paramaVc, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.bRW.evo != null ? this.bRW.evo.getId() : 0L);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    long l = paramByteBuffer.getLong();
    if (l == 0L) {
      this.bRW.evo = null;
    }
    else if ((this.bRW.ejP != null) && (this.bRW.ejP.LD() != null))
    {
      this.bRW.i(this.bRW.ejP.LD().bk(l));
      if (this.bRW.evo != null);
    }
    else
    {
      K.error("pas de contexte, impossible de récuperer la cible type de RE : " + this.bRW.aw);
    }
  }
}