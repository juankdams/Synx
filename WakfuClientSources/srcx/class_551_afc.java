public class afc
{
  public static final int cXl = 18;
  public int cXm;
  public int cXn;
  public byte[] cXo;

  public afc()
  {
    this.cXo = new byte[18];
  }

  public void a(byte[] paramArrayOfByte, bVk parambVk) {
    this.cXm = clH.d(paramArrayOfByte, parambVk);
    this.cXn = clH.d(paramArrayOfByte, parambVk);
    System.arraycopy(paramArrayOfByte, ((Integer)parambVk.get()).intValue(), this.cXo, 0, 18);
    parambVk.set(Integer.valueOf(((Integer)parambVk.get()).intValue() + 18));
  }

  public void d(dSw paramdSw) {
    paramdSw.writeInt(this.cXm);
    paramdSw.writeInt(this.cXn);
    paramdSw.writeBytes(this.cXo);
  }
}