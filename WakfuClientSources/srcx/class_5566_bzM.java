public enum bzM
{
  public static bzM by(float paramFloat)
  {
    if (paramFloat < 0.334F) {
      return gok;
    }
    if (paramFloat < 0.667F) {
      return gol;
    }
    return gom;
  }
}