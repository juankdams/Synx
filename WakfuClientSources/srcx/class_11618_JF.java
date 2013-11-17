public class JF
{
  private final int aw;
  private final float aN;

  JF(int paramInt, float paramFloat)
  {
    this.aw = paramInt;
    this.aN = paramFloat;
  }

  public int getId() {
    return this.aw;
  }

  public float W() {
    return this.aN;
  }

  public String getName() {
    return bU.fH().b(114, this.aw, new Object[0]);
  }

  public String getDescription() {
    return bU.fH().b(115, this.aw, new Object[0]);
  }
}