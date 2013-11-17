import java.nio.ByteBuffer;

class bfO extends cCH
{
  bfO(bVU parambVU, int paramInt)
  {
    super(paramInt);
  }
  public void a(ByteBuffer paramByteBuffer, int paramInt) { bVU.a(this.ftA).ac(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
    this.ftA.aSg = paramByteBuffer.getInt();
    byte[] arrayOfByte = new byte[paramByteBuffer.getShort() & 0xFFFF];
    paramByteBuffer.get(arrayOfByte);
    String str = dzp.aJ(arrayOfByte);
    bVU.a(this.ftA, str != null ? str.intern() : null);
    this.ftA.initialize(); }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}