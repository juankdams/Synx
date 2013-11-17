import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class gB
{
  private final int aFl;
  private float aFm;
  private float aFn;
  private float aFo;
  private float aFp;
  private final float[] aFq = new float[6];
  private final float[] aFr = new float[6];
  private ArrayList aFs;
  private final float[] aFt = new float[6];

  private final Random aFu = new Random(0L);
  private int aFv;
  private float aFw;
  private float[] aFx;
  private float aFy;
  private ArrayList aFz;
  private float aFA;
  private float aFB;
  private float aFC;

  public gB(int paramInt)
  {
    this.aFl = paramInt;
  }

  public void a(aDJ paramaDJ, aCX paramaCX) {
    if (this.aFz == null)
      this.aFz = new ArrayList();
    else if (this.aFz.contains(paramaDJ))
      return;
    this.aFz.add(paramaDJ);

    this.aFA += paramaDJ.aPU();

    float f1 = paramaCX.oB();
    float f2 = paramaCX.oA();
    float f3 = paramaDJ.aPV();

    this.aFC = bCO.t(this.aFC + f3, f2 - this.aFo, f1 - this.aFp);

    this.aFB += paramaDJ.aPW();
  }

  public void b(aDJ paramaDJ, aCX paramaCX) {
    if (this.aFz == null)
      this.aFz = new ArrayList();
    else if (this.aFz.contains(paramaDJ)) {
      return;
    }
    this.aFz.clear();
    this.aFA = 0.0F;
    this.aFC = 0.0F;
    this.aFB = 0.0F;

    this.aFz.add(paramaDJ);

    this.aFA += paramaDJ.aPU();

    float f1 = paramaCX.oB();
    float f2 = paramaCX.oA();
    float f3 = paramaDJ.aPV();

    this.aFC = bCO.t(this.aFC + f3, f2 - this.aFo, f1 - this.aFp);

    this.aFB += paramaDJ.aPW();
  }

  public ArrayList ox() {
    return this.aFz;
  }

  public void aJ(int paramInt) {
    this.aFv = paramInt;
  }

  public int getDayOfMonth() {
    return this.aFl;
  }

  public float oy() {
    return this.aFm;
  }

  public void c(float paramFloat) {
    this.aFm = paramFloat;
  }

  public float oz() {
    return this.aFn;
  }

  public void d(float paramFloat) {
    this.aFn = paramFloat;
  }

  public float oA() {
    return this.aFo;
  }

  public void e(float paramFloat) {
    this.aFo = paramFloat;
  }

  public float oB() {
    return this.aFp;
  }

  public void f(float paramFloat) {
    this.aFp = paramFloat;
  }

  public byte oC() {
    if (this.aFx != null)
      return (byte)(int)(this.aFx[0] * 6.0F);
    return -1;
  }

  public short oD() {
    if (this.aFx != null)
      return (short)(int)this.aFx[1];
    return 0;
  }

  public float oE() {
    if (this.aFx != null)
      return this.aFx[2];
    return 0.0F;
  }

  public float oF() {
    return this.aFw;
  }

  public void g(float paramFloat)
  {
    this.aFw = paramFloat;
  }

  public float oG() {
    return this.aFy;
  }

  public float oH() {
    return this.aFA;
  }

  public float oI() {
    return this.aFB;
  }

  public float oJ() {
    return this.aFC;
  }

  public void oK()
  {
    this.aFu.setSeed(this.aFv);

    cSi localcSi = new cSi();
    for (int i = 0; i < this.aFq.length; i++) {
      localcSi.add(i);
      float tmp47_46 = 0.0F; this.aFr[i] = tmp47_46; this.aFq[i] = tmp47_46;
    }

    float f1 = this.aFm + this.aFA;
    float f2 = Math.max(Math.min(f1, 1.0F), 0.0F);

    int j = (int)Math.floor(f2 * this.aFq.length);
    float f3 = f1 / j;
    float f4 = 0.0F;
    int m;
    for (int k = 0; k < j; k++) {
      m = localcSi.wH((int)(this.aFu.nextFloat() * localcSi.size()));

      this.aFq[m] = 3600.0F;

      float f6 = (f1 - f3) * this.aFu.nextFloat();
      this.aFr[m] = (f1 - f6);

      f4 += this.aFr[m];
    }

    this.aFs = new ArrayList();
    if (j > 0) {
      float f5 = f2 / f4;
      for (m = 0; m < this.aFq.length; m++)
        if (this.aFr[m] > 0.0F)
        {
          this.aFs.add(new float[] { m / 6.0F, this.aFq[m], this.aFr[m] });
        }
    }
  }

  public void c(float paramFloat1, float paramFloat2)
  {
    this.aFu.setSeed(this.aFv);
    for (int i = 0; i < this.aFt.length; i++) {
      float f = paramFloat1 + this.aFu.nextFloat() * (paramFloat2 - paramFloat1) + this.aFB;
      this.aFt[i] = bCO.t(f, paramFloat1, paramFloat2);
    }
  }

  public float h(float paramFloat) {
    int i = (int)Math.floor(paramFloat * this.aFq.length);
    return this.aFq[i];
  }

  public float i(float paramFloat) {
    int i = (int)Math.floor(paramFloat * this.aFr.length);
    return this.aFr[i];
  }

  protected void j(float paramFloat)
  {
    int i = (int)Math.floor(paramFloat * (this.aFt.length - 1));
    this.aFy = this.aFt[i];

    float f = 0.1666667F;
    for (float[] arrayOfFloat : this.aFs) {
      if ((paramFloat >= arrayOfFloat[0]) && (paramFloat < arrayOfFloat[0] + 0.1666667F)) {
        this.aFx = arrayOfFloat;
        return;
      }
    }
    this.aFx = null;
  }

  public String toString() {
    return "DailyWeather{m_dayOfMonth=" + this.aFl + ", m_precipitations=" + this.aFm + ", m_windForce=" + this.aFn + ", m_tMin=" + this.aFo + ", m_tMax=" + this.aFp + ", m_rainEventDurations=" + Arrays.toString(this.aFq) + ", m_rainEventIntensity=" + Arrays.toString(this.aFr) + ", m_rainEventSchedule=" + this.aFs + ", m_winds=" + Arrays.toString(this.aFt) + ", m_random=" + this.aFu + ", m_randomSeed=" + this.aFv + ", m_currentTemperature=" + this.aFw + ", m_currentRainEventSchedule=" + Arrays.toString(this.aFx) + ", m_currentWind=" + this.aFy + ", m_modifiers=" + this.aFz + ", m_modifiersPrecipitations=" + this.aFA + ", m_modifierWind=" + this.aFB + ", m_modifierTemperature=" + this.aFC + '}';
  }
}