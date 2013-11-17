public class aeq extends bPa
{
  private static final bNa cVr = new bNa();

  public aeq(boolean paramBoolean) {
    super((byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, paramBoolean);
  }

  public boolean a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5) {
    return (paramByte1 == paramByte2) && (paramByte2 == paramByte3);
  }

  private static void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, int paramInt) {
    if (paramInt == 17)
      cVr.d(paramByte1, paramByte2, paramByte3, paramByte4);
    else
      cVr.d(paramByte3, paramByte2, paramByte1, paramByte4);
  }

  public void a(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    a(paramArrayOfByte[paramInt], paramArrayOfByte[paramInt], paramArrayOfByte[paramInt], (byte)-1, paramByte);
    float f = cVr.bEK();
    a(this.gVm, this.gVn, this.gVo, this.gVp, paramByte);
    f *= cVr.bUS();
    cVr.bx(bCO.t(f, 0.0F, 1.0F));
    paramArrayOfByte[paramInt] = cVr.bUL();
    paramArrayOfByte[(paramInt + 1)] = cVr.bUM();
    paramArrayOfByte[(paramInt + 2)] = cVr.bUN();
    if (this.gVq)
    {
      int tmp108_107 = (paramInt + 3);
      byte[] tmp108_104 = paramArrayOfByte; tmp108_104[tmp108_107] = ((byte)(int)(tmp108_104[tmp108_107] * cVr.getAlpha()));
    }
  }
}