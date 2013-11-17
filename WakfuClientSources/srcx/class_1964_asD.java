public class asD extends coZ
{
  private final int dCs;
  private final cyd dCt = new cyd();
  private int bmM;
  private final float[] dCu;
  private int aKT;

  public asD(float[] paramArrayOfFloat, int paramInt, long paramLong)
  {
    super(1.0F);
    this.dCu = paramArrayOfFloat;
    this.dCs = (paramInt * 1000);
    this.aKT = ((int)(paramLong / this.dCs) % this.dCu.length);
    this.dCt.setSpeed(1.0F / (paramInt * 0.5F));
    this.dCt.set(this.dCu[this.aKT]);
  }

  public asD(int paramInt, long paramLong) {
    this(jY(100), paramInt, paramLong);
  }

  public static float[] jY(int paramInt) {
    btz localbtz = new btz(0.550000011920929D, 0.3499999940395355D, paramInt);
    float[] arrayOfFloat = new float[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfFloat[i] = bCO.t((float)localbtz.nextDouble(), 0.0F, 1.0F);
    }
    return arrayOfFloat;
  }

  public boolean dT(int paramInt)
  {
    this.bmM += paramInt;
    if (this.bmM > this.dCs) {
      this.bmM = 0;
      this.aKT += 1;
      if (this.aKT >= this.dCu.length) {
        this.aKT = 0;
      }
      this.dCt.cu(this.dCu[this.aKT]);
    }
    this.dCt.xd(paramInt);
    return super.dT(paramInt);
  }

  public float xP()
  {
    return super.xP() * this.dCt.getValue();
  }
}