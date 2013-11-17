import java.util.Comparator;
import org.apache.log4j.Logger;

public abstract class bHV
{
  private static final Logger K = Logger.getLogger(bHV.class);

  public static Comparator bEa = new brk();
  protected cYq aHo;

  protected bHV(dxL paramdxL)
  {
    this.aHo = new cYq(paramdxL);
  }

  public dxL VN() {
    return this.aHo;
  }

  public abstract void a(aKS paramaKS);

  public bHV u(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.aHo.E(paramInt1, paramInt2, paramInt3, paramInt4);
    return this;
  }

  public bHV a(yd paramyd)
  {
    this.aHo.b(paramyd.getSeconds(), paramyd.getMinutes(), paramyd.getHours(), paramyd.getDays(), paramyd.getMonths(), paramyd.getYears());
    return this;
  }
}