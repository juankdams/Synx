import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

class aoE extends cCH
{
  aoE(cPq paramcPq)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(cPq.a(this.dtX));
    paramByteBuffer.putInt(cPq.b(this.dtX));
    paramByteBuffer.put((byte)cPq.c(this.dtX).size());
    for (Map.Entry localEntry : cPq.c(this.dtX).entrySet()) {
      paramByteBuffer.putInt(((bfE)localEntry.getKey()).ok());
      paramByteBuffer.putShort(((Short)localEntry.getValue()).shortValue());
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cPq.a(this.dtX, paramByteBuffer.getInt());
    cPq.b(this.dtX, paramByteBuffer.getInt());

    dCi localdCi = cPq.d(this.dtX);
    if (localdCi == null) {
      K.error("Unable to get target spell inventory");
    }
    int i = paramByteBuffer.get();
    cPq.c(this.dtX).clear();
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.getInt();
      short s = paramByteBuffer.getShort();
      bfE localbfE = (bfE)localdCi.hh(k);
      if (localbfE == null) {
        K.error("Unable to find spellf or PvPBuffGain : " + k);
      }
      else
        cPq.c(this.dtX).put(localbfE, Short.valueOf(s));
    }
  }

  public int cc()
  {
    return 9 + cPq.c(this.dtX).size() * 6;
  }
}