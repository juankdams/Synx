import java.nio.ByteBuffer;

public class uA
{
  final int biu;
  final boolean biv;
  final bdY biw;
  final cFB bix;
  final short[] biy;
  final bjI biz = new bjI();
  private static final int biA = 32001;

  public uA(ByteBuffer paramByteBuffer)
  {
    this.biu = paramByteBuffer.getInt();
    this.biv = (paramByteBuffer.get() != 0);

    this.biw = new bdY(paramByteBuffer);
    this.bix = new cFB(paramByteBuffer);

    int i = paramByteBuffer.get() & 0xFF;
    this.biy = new short[i];
    for (int j = 0; j < i; j++) {
      this.biy[j] = paramByteBuffer.getShort();
    }

    if (this.biu == 32001) {
      this.biz.o(bUW.hhe.getId(), (byte)0);
      this.biz.o(bUW.hhf.getId(), (byte)1);
      this.biz.o(bUW.hhg.getId(), (byte)0);
    } else {
      this.biz.o(bUW.hhe.getId(), (byte)1);
      this.biz.o(bUW.hhf.getId(), (byte)1);
      this.biz.o(bUW.hhg.getId(), (byte)1);
    }
  }

  public uA(int paramInt, boolean paramBoolean, bdY parambdY, cFB paramcFB, short[] paramArrayOfShort)
  {
    this.biu = paramInt;
    this.biv = paramBoolean;
    this.biw = parambdY;
    this.bix = paramcFB;
    this.biy = paramArrayOfShort;
  }

  public void a(dSw paramdSw) {
    paramdSw.writeInt(this.biu);
    paramdSw.writeByte((byte)(this.biv ? 1 : 0));
    this.biw.a(paramdSw);
    this.bix.a(paramdSw);

    paramdSw.writeByte((byte)this.biy.length);
    for (int i = 0; i < this.biy.length; i++)
      paramdSw.writeShort(this.biy[i]);
  }

  public int DB()
  {
    return this.biu;
  }

  public bdY DC() {
    return this.biw;
  }

  public cFB DD() {
    return this.bix;
  }

  public short[] DE() {
    return this.biy;
  }

  public boolean da(int paramInt) {
    return (!this.biz.contains(paramInt)) || (this.biz.get(paramInt) == 1);
  }
}