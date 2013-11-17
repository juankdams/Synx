import java.nio.ByteBuffer;

public class dtF
{
  private static final byte lwG = 2;
  final aPF lwH = new aPF();
  private final bXV lwI;

  public dtF(bXV parambXV)
  {
    this.lwI = parambXV;
  }

  public void ki(long paramLong) {
    this.lwH.c(paramLong, (byte)2);
    cZQ();
  }

  public boolean dD(long paramLong) {
    return this.lwH.er(paramLong) != 0;
  }

  public void cKN() {
    for (cqI localcqI = this.lwH.bgx(); localcqI.hasNext(); ) {
      localcqI.fl();
      int i = localcqI.Gh();
      if (i == 1)
        localcqI.remove();
      localcqI.L((byte)(i - 1));
    }

    cZQ();
  }

  private void cZQ() {
    this.lwI.Kg();
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort((short)this.lwH.size());
    for (cqI localcqI = this.lwH.bgx(); localcqI.hasNext(); ) {
      localcqI.fl();
      paramByteBuffer.putLong(localcqI.bic());
      paramByteBuffer.put(localcqI.Gh());
    }
  }

  public void U(ByteBuffer paramByteBuffer) {
    this.lwH.clear();
    int i = 0; for (int j = paramByteBuffer.getShort(); i < j; i = (short)(i + 1))
      this.lwH.c(paramByteBuffer.getLong(), paramByteBuffer.get());
  }

  public int O()
  {
    return 2 + this.lwH.size() * 9;
  }
}