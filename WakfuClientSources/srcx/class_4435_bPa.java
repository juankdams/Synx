public abstract class bPa
  implements aWD
{
  protected byte gVi;
  protected byte gVj;
  protected byte gVk;
  protected byte gVl;
  protected byte gVm;
  protected byte gVn;
  protected byte gVo;
  protected byte gVp;
  protected boolean gVq = false;

  protected bPa(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, boolean paramBoolean) {
    this.gVi = paramByte1;
    this.gVj = paramByte2;
    this.gVk = paramByte3;
    this.gVl = paramByte4;
    this.gVm = paramByte5;
    this.gVn = paramByte6;
    this.gVo = paramByte7;
    this.gVp = paramByte8;
    this.gVq = paramBoolean;
  }

  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    this.gVi = paramByte1;
    this.gVj = paramByte2;
    this.gVk = paramByte3;
    this.gVl = paramByte4;
  }

  public void b(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    this.gVm = paramByte1;
    this.gVn = paramByte2;
    this.gVo = paramByte3;
    this.gVp = paramByte4;
  }

  public void oh(int paramInt) {
    if (paramInt == 32)
      this.gVq = true;
  }
}