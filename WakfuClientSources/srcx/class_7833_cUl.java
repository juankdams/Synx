import java.nio.ByteBuffer;

public class cUl extends aRw
{
  private cSi kGF = new cSi();
  private cSR kGG = new cSR();

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate((this.kGF != null ? this.kGF.size() : 0) * 4 + 2 + 21 * (this.kGG != null ? this.kGG.size() : 0) + 2);

    if (this.kGF != null) {
      localByteBuffer.putShort((short)this.kGF.size());
      for (int i = 0; i < this.kGF.size(); i++) {
        localByteBuffer.putInt(this.kGF.get(i));
      }
      this.kGF = null;
    } else {
      localByteBuffer.putShort((short)0);
    }

    if (this.kGG != null) {
      localByteBuffer.putShort((short)this.kGG.size());
      dmn localdmn = this.kGG.yF();
      while (localdmn.hasNext()) {
        localdmn.fl();

        localByteBuffer.putInt(localdmn.zY());
        dlK localdlK = new dlK();
        ((dKD)localdmn.value()).b(localdlK);
        localdlK.g(localByteBuffer);
      }

      this.kGG = null;
    } else {
      localByteBuffer.putShort((short)0);
    }

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 9101;
  }

  public void a(byte paramByte1, byte paramByte2, byte paramByte3, dKD paramdKD) {
    int i = e(paramByte1, paramByte2, paramByte3);
    this.kGG.put(i, paramdKD);
  }

  public void d(byte paramByte1, byte paramByte2, byte paramByte3) {
    this.kGF.add(e(paramByte1, paramByte2, paramByte3));
  }

  private int e(byte paramByte1, byte paramByte2, byte paramByte3) {
    return (paramByte1 << 16) + (paramByte2 << 8) + paramByte3;
  }
}