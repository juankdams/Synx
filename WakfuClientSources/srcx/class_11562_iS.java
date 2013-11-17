import java.util.ArrayList;

public final class iS extends aKz
{
  public iS(ArrayList paramArrayList)
  {
    super(paramArrayList);
  }

  xj go() {
    return xj.bpA;
  }

  protected boolean c(cjK paramcjK) {
    return paramcjK.getType() == go().xj();
  }

  protected boolean a(cjK paramcjK, cYk paramcYk) {
    if (!c(paramcjK))
      return false;
    return paramcjK.ML().equals(paramcYk);
  }

  public Enum gm() {
    return Bz.bCn;
  }
}