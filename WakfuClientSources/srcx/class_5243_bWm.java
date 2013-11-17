import java.nio.ByteBuffer;

class bWm extends cCH
{
  bWm(cNp paramcNp, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    if ((cNp.a(this.hix) == cfY.hBf) || (cNp.a(this.hix) == cfY.hBq)) {
      paramByteBuffer.put((byte)1);
      paramByteBuffer.putInt(cNp.b(this.hix).fa());
      paramByteBuffer.putInt(cNp.c(this.hix).fb());
      paramByteBuffer.putShort(cNp.d(this.hix).fc());
      paramByteBuffer.put((byte)cNp.e(this.hix).E().m_index);
    } else {
      paramByteBuffer.put((byte)0);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    if (paramByteBuffer.get() == 1) {
      cNp.a(this.hix, new cYk(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort()));
      cNp.a(this.hix, CG.eu(paramByteBuffer.get()));
    } else {
      cNp.a(this.hix, null);
    }
  }

  public int cc()
  {
    if ((cNp.a(this.hix) == cfY.hBf) || (cNp.a(this.hix) == cfY.hBq)) {
      return 12;
    }
    return 1;
  }
}