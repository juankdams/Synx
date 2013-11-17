import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class aTx extends aph
{
  public aTx(ArrayList paramArrayList)
  {
    super(paramArrayList);
  }

  public Enum gm()
  {
    return Bz.bzm;
  }

  protected Collection a(dbE paramdbE, axQ paramaxQ)
  {
    if ((paramdbE == null) || (paramaxQ == null))
      return Collections.emptyList();
    return paramdbE.cj(paramaxQ.Fx());
  }
}