public class cYj
  implements FP
{
  private static final float[][] kLI = { { 0.0F, 2.0F }, { 0.0F, -2.0F }, { 2.0F, 0.0F }, { -2.0F, 0.0F }, { 0.0F, -2.0F }, { 0.0F, 2.0F }, { -2.0F, 0.0F }, { 2.0F, 0.0F } };

  private static final float[][] kLJ = { { 0.0F, 0.0F }, { 0.0F, 1.0F }, { 0.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 1.0F }, { 1.0F, 0.0F }, { 1.0F, 0.0F }, { 0.0F, 0.0F } };

  private static final dUU kLK = new dUU(new short[] { 0, 1, 2, 7, 7, 2, 3, 6, 3, 6, 5, 4 });

  private static final dUU kLL = new dUU(new short[] { 0, 1, 2, 3, 4, 5, 6, 7, 0 });

  public int getBottomMargin()
  {
    return 5;
  }

  public int getLeftMargin() {
    return 5;
  }

  public int getRightMargin() {
    return 5;
  }

  public int getTopMargin() {
    return 5;
  }

  public float[][] PU() {
    return kLI;
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
}