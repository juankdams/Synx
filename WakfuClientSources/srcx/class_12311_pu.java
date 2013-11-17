import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class pu extends cCH
{
  pu(avO paramavO, int paramInt)
  {
    super(paramInt);
  }
  public int cc() {
    int i = 10 * wQ();
    return 2 + i;
  }

  private int wQ() {
    return avO.a(this.aVH) == null ? 0 : avO.a(this.aVH).size();
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    int i = wQ();
    paramByteBuffer.putShort((short)i);
    for (int j = 0; j < i; j++) {
      cYk localcYk = (cYk)avO.a(this.aVH).get(j);
      paramByteBuffer.putInt(localcYk.getX());
      paramByteBuffer.putInt(localcYk.getY());
      paramByteBuffer.putShort(localcYk.IB());
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.getShort();
    if (i == 0)
      return;
    avO.a(this.aVH, new ArrayList());
    for (int j = 0; j < i; j++) {
      avO.a(this.aVH).add(new cYk(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort()));
    }
    avO.a(this.aVH, (cYk)avO.a(this.aVH).get(avO.a(this.aVH).size() - 1));
  }
}