import java.nio.ByteBuffer;

public class auX
{
  private byte dJJ;
  private byte dJK;
  private byte dJL;
  private byte dJM;
  private byte dJN;
  private byte ctp;
  private byte ctq;

  private auX(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7)
  {
    this.dJJ = paramByte1;
    this.dJK = paramByte2;
    this.dJL = paramByte3;
    this.dJM = paramByte4;
    this.dJN = paramByte5;
    this.ctp = paramByte6;
    this.ctq = paramByte7;
  }

  public byte aHc() {
    return this.dJJ;
  }

  public byte aHd() {
    return this.dJK;
  }

  public byte aHe() {
    return this.dJL;
  }

  public byte aHf() {
    return this.dJM;
  }

  public byte aHg() {
    return this.dJN;
  }

  public byte afn() {
    return this.ctp;
  }

  public byte afo() {
    return this.ctq;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.dJJ);
    paramByteBuffer.put(this.dJK);
    paramByteBuffer.put(this.dJL);
    paramByteBuffer.put(this.dJM);
    paramByteBuffer.put(this.dJN);
    paramByteBuffer.put(this.ctp);
    paramByteBuffer.put(this.ctq);
  }

  public static auX af(ByteBuffer paramByteBuffer) {
    return new auX(paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get());
  }

  public int O() {
    return 7;
  }
}