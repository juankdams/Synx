import java.nio.ByteBuffer;

public class cvN
{
  private final byte fCH;
  private final byte fCK;
  private final byte fCI;
  private final byte fCL;
  private final byte fCJ;
  private final byte ctp;
  private final byte ctq;
  private final int ihl;
  private final int ihm;
  private final int ihn;

  public cvN(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, int paramInt1, int paramInt2, int paramInt3)
  {
    this.fCH = paramByte1;
    this.fCK = paramByte2;
    this.fCI = paramByte3;
    this.fCL = paramByte4;
    this.fCJ = paramByte5;
    this.ctp = paramByte6;
    this.ctq = paramByte7;
    this.ihl = paramInt1;
    this.ihm = paramInt2;
    this.ihn = paramInt3;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.fCH);
    paramByteBuffer.put(this.fCK);
    paramByteBuffer.put(this.fCI);
    paramByteBuffer.put(this.fCL);
    paramByteBuffer.put(this.fCJ);
    paramByteBuffer.put(this.ctp);
    paramByteBuffer.put(this.ctq);
    paramByteBuffer.putInt(this.ihl);
    paramByteBuffer.putInt(this.ihm);
    paramByteBuffer.putInt(this.ihn);
  }

  public static cvN aC(ByteBuffer paramByteBuffer) {
    return new cvN(paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getInt());
  }

  public int O() {
    return 19;
  }

  public byte bRJ() {
    return this.fCH;
  }

  public byte bRK() {
    return this.fCK;
  }

  public byte bRO() {
    return this.fCI;
  }

  public byte bRP() {
    return this.fCL;
  }

  public byte bRM() {
    return this.fCJ;
  }

  public int ctz() {
    return this.ihl;
  }

  public int ctA() {
    return this.ihm;
  }

  public int ctB() {
    return this.ihn;
  }

  public byte afn() {
    return this.ctp;
  }

  public byte afo() {
    return this.ctq;
  }
}