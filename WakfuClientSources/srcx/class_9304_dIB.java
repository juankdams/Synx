public class dIB
  implements FP
{
  public static final int lTs = 72;
  public static final int lTt = 20;
  private static final float[][] kLI = { { 1.0F, -11.0F }, { 2.0F, -11.0F }, { 0.0F, -11.0F }, { 0.0F, -8.0F }, { 2.0F, -8.0F }, { 2.0F, -7.0F }, { 1.0F, -7.0F }, { 1.0F, -4.0F }, { 4.0F, -4.0F }, { 4.0F, -6.0F }, { 6.0F, -6.0F }, { 6.0F, -4.0F }, { 4.0F, -4.0F }, { 4.0F, -1.0F }, { 7.0F, -1.0F }, { 7.0F, -2.0F }, { 8.0F, -2.0F }, { 8.0F, -0.0F }, { 11.0F, -0.0F }, { 11.0F, -2.0F }, { 11.0F, -1.0F }, { -11.0F, -1.0F }, { -11.0F, -2.0F }, { -11.0F, -0.0F }, { -8.0F, -0.0F }, { -8.0F, -2.0F }, { -7.0F, -2.0F }, { -7.0F, -1.0F }, { -4.0F, -1.0F }, { -4.0F, -4.0F }, { -6.0F, -4.0F }, { -6.0F, -6.0F }, { -4.0F, -6.0F }, { -4.0F, -4.0F }, { -1.0F, -4.0F }, { -1.0F, -7.0F }, { -2.0F, -7.0F }, { -2.0F, -8.0F }, { 0.0F, -8.0F }, { 0.0F, -11.0F }, { -2.0F, -11.0F }, { -1.0F, -11.0F }, { -1.0F, 31.0F }, { -2.0F, 31.0F }, { -0.0F, 31.0F }, { -0.0F, 28.0F }, { -2.0F, 28.0F }, { -2.0F, 27.0F }, { -1.0F, 27.0F }, { -1.0F, 24.0F }, { -4.0F, 24.0F }, { -4.0F, 26.0F }, { -6.0F, 26.0F }, { -6.0F, 24.0F }, { -4.0F, 24.0F }, { -4.0F, 21.0F }, { -7.0F, 21.0F }, { -7.0F, 22.0F }, { -8.0F, 22.0F }, { -8.0F, 20.0F }, { -11.0F, 20.0F }, { -11.0F, 22.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { -11.0F, 21.0F }, { 27.0F, 21.0F }, { 17.0F, 0.0F }, { 19.0F, 21.0F }, { 11.0F, 21.0F }, { 11.0F, 22.0F }, { 11.0F, 20.0F }, { 8.0F, 20.0F }, { 8.0F, 22.0F }, { 7.0F, 22.0F }, { 7.0F, 21.0F }, { 4.0F, 21.0F }, { 4.0F, 24.0F }, { 6.0F, 24.0F }, { 6.0F, 26.0F }, { 4.0F, 26.0F }, { 4.0F, 24.0F }, { 1.0F, 24.0F }, { 1.0F, 27.0F }, { 2.0F, 27.0F }, { 2.0F, 28.0F }, { 0.0F, 28.0F }, { 0.0F, 31.0F }, { 2.0F, 31.0F }, { 1.0F, 31.0F } };

  private static final float[][] kLJ = { { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F }, { 0.0F, 0.0F } };

  private static final dUU kLK = new dUU(new short[] { 0, 41, 42, 94, 2, 3, 38, 39, 92, 91, 45, 44, 4, 5, 36, 37, 90, 89, 47, 46, 6, 7, 8, 9, 35, 34, 33, 32, 88, 87, 86, 85, 48, 49, 50, 51, 6, 9, 32, 35, 88, 85, 51, 48, 10, 11, 30, 31, 84, 83, 53, 52, 11, 12, 13, 14, 30, 29, 28, 27, 83, 82, 81, 80, 53, 54, 55, 56, 11, 15, 26, 30, 83, 79, 57, 53, 11, 14, 15, 11, 30, 27, 26, 30, 83, 80, 79, 83, 53, 56, 57, 53, 16, 17, 18, 19, 25, 24, 23, 22, 78, 77, 76, 75, 58, 59, 60, 61, 19, 20, 21, 22, 75, 74, 62, 61, 71, 72, 73, 71 });

  private static final dUU kLL = new dUU(new short[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 0 });

  private float[][] lTu = (float[][])null;
  private float lTv;
  private float lTw;
  private boolean lTx;

  public int getBottomMargin()
  {
    return 32;
  }

  public int getLeftMargin() {
    return 12;
  }

  public int getRightMargin() {
    return 12;
  }

  public int getTopMargin() {
    return 12;
  }

  public float[][] PU() {
    return this.lTu;
  }

  public float[][] PV() {
    return kLJ;
  }

  public dUU PW() {
    return kLK;
  }

  public dUU PX() {
    return kLL;
  }

  public dIB()
  {
    this.lTu = new float[kLI.length][2];
    System.arraycopy(kLI, 0, this.lTu, 0, kLI.length);

    this.lTv = 0.0F;
    this.lTw = 0.0F;
  }

  public final float dip()
  {
    return this.lTv;
  }

  public final void dv(float paramFloat) {
    this.lTv = paramFloat;
  }

  public final float diq() {
    return this.lTw;
  }

  public final void dw(float paramFloat) {
    this.lTw = paramFloat;
  }

  public final void kV(boolean paramBoolean) {
    int i = paramBoolean ? 20 : 0;

    float f1 = this.lTu[73][0] + (this.lTu[71][0] - this.lTu[73][0]) / 2.0F;
    float f2 = this.lTu[73][1] + (this.lTu[71][1] - this.lTu[73][1]) / 2.0F;

    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = ((float)(Math.cos(-2.094395102393195D) * i + f1));
    arrayOfFloat[1] = ((float)(Math.sin(-2.094395102393195D) * i + f2));

    this.lTu[72] = arrayOfFloat;
  }

  public void setSparkAngle(float paramFloat)
  {
    paramFloat %= 3.141593F;
    if (paramFloat > 0.0F) {
      paramFloat = (float)(paramFloat - 3.141592653589793D);
    }

    float f1 = this.lTu[73][0] + (this.lTu[71][0] - this.lTu[73][0]) / 2.0F;
    float f2 = this.lTu[73][1] + (this.lTu[71][1] - this.lTu[73][1]) / 2.0F;

    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = ((float)(Math.cos(paramFloat) * 20.0D + f1));
    arrayOfFloat[1] = ((float)(Math.sin(paramFloat) * 20.0D + f2));

    this.lTu[72] = arrayOfFloat;
  }
}