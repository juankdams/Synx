public class up
{
  public static cYm a(adG paramadG, cqz paramcqz)
  {
    return a(paramadG, paramcqz.getWorldX(), paramcqz.getWorldY(), paramcqz.getAltitude());
  }

  public static cYm a(adG paramadG, float paramFloat1, float paramFloat2, float paramFloat3) {
    float f1 = paramadG.r(paramFloat1, paramFloat2);
    float f2 = paramadG.g(paramFloat1, paramFloat2, paramFloat3);

    return new cYm(f1, f2);
  }

  public static cYm b(adG paramadG, cqz paramcqz) {
    return b(paramadG, paramcqz.getWorldX(), paramcqz.getWorldY(), paramcqz.getAltitude());
  }

  public static cYm b(adG paramadG, float paramFloat1, float paramFloat2, float paramFloat3) {
    rp localrp = paramadG.apF();
    float f1 = localrp.csO();

    float f2 = paramadG.r(paramFloat1, paramFloat2) - localrp.yf();
    float f3 = paramadG.g(paramFloat1, paramFloat2, paramFloat3) - localrp.yg();

    f2 *= f1;
    f3 *= f1;

    return new cYm(f2, f3);
  }

  public static cYm c(adG paramadG, cqz paramcqz) {
    return c(paramadG, paramcqz.getWorldX(), paramcqz.getWorldY(), paramcqz.getAltitude());
  }

  public static cYm c(adG paramadG, float paramFloat1, float paramFloat2, float paramFloat3) {
    cYm localcYm = b(paramadG, paramFloat1, paramFloat2, paramFloat3);
    localcYm.aOR += paramadG.MH() * 0.5F;
    localcYm.aOS += paramadG.MI() * 0.5F;
    return localcYm;
  }

  public static int a(adG paramadG, short paramShort) {
    return (int)(paramShort * paramadG.apD() * paramadG.apF().csO());
  }
}