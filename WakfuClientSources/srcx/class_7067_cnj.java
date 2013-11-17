import java.util.ArrayList;
import java.util.Iterator;

public class cnj
  implements cFh
{
  private static final cnj hTe = new cnj();

  private final ArrayList etX = new ArrayList();

  public static cnj cnO()
  {
    return hTe;
  }

  public void b(bwF parambwF)
  {
    this.etX.add(parambwF);
  }

  public void a(adG paramadG, int paramInt)
  {
    int i = 0; for (int j = this.etX.size(); i < j; i++)
      ((bwF)this.etX.get(i)).cz(paramInt);
  }

  public void b(adG paramadG, float paramFloat1, float paramFloat2)
  {
    for (Iterator localIterator = this.etX.iterator(); localIterator.hasNext(); ) {
      bwF localbwF = (bwF)localIterator.next();

      if (localbwF.isRemovable())
        localIterator.remove();
    }
  }
}