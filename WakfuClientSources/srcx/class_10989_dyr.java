import java.nio.ByteBuffer;

class dyr
  implements dMx
{
  private int bvk;

  dyr()
  {
  }

  dyr(int paramInt)
  {
    this.bvk = paramInt;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bvk);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.bvk = paramByteBuffer.getInt();
  }

  public void a(aCu paramaCu) {
    paramaCu.hk(this.bvk);
  }

  public cQy wt() {
    return cQy.kBz;
  }

  public String toString()
  {
    return "PetXpChange{m_xp=" + this.bvk + '}';
  }
}