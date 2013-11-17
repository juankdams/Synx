import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class dhc extends cCH
{
  dhc(cIV paramcIV, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(cIV.a(this.lcj).ordinal());
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.getInt();
    for (cDZ localcDZ : cDZ.values())
      if (localcDZ.ordinal() == i)
      {
        cIV.a(this.lcj, localcDZ);
        return;
      }
    K.error("Unknown orndinal for MOnsterSpellLevel : " + i);
  }
}