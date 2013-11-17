import java.util.ArrayList;

public final class aDR
{
  private final int aw;
  private final ArrayList cub = new ArrayList();

  public aDR() {
    this(0);
  }

  public aDR(int paramInt) {
    this.aw = paramInt;
  }

  public int getId() {
    return this.aw;
  }

  public final void a(bfh parambfh) {
    if (parambfh != null)
      this.cub.add(new dRE(parambfh, this.aw));
  }

  ArrayList aQb() {
    return this.cub;
  }

  public final int BL() {
    return this.cub.size();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[ Ambiance : ").append(BL()).append(" effect(s)");
    return localStringBuilder.toString();
  }

  public void update(int paramInt) {
    for (int i = 0; i < this.cub.size(); i++)
      ((dRE)this.cub.get(i)).update(paramInt);
  }
}