import java.nio.ByteBuffer;

public class dwI extends hk
{
  public dwI(aAY paramaAY)
  {
  }

  public void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = 0; for (int j = paramByteBuffer.getInt(); i < j; i++) {
      long l1 = paramByteBuffer.getLong();
      long l2 = paramByteBuffer.getLong();

      this.bdf.u(l1, l2);
    }
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("[NATION] Pas de sérialization de la part VoteUpdatePart de base, celà ne se fait que dans le global");
  }

  public int O()
  {
    return 0;
  }
}