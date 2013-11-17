import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cGk extends aQU
{
  private final List iBv;
  private cOu iBw;

  public cGk()
  {
    this.iBv = new ArrayList();
  }

  protected Iterator bht()
  {
    Object localObject;
    if (bhs()) {
      if (this.iBw == null)
      {
        this.iBw = new cOu(this, bhu().iterator());
      }

      localObject = new cHl(this, this.iBw);
    } else {
      localObject = new cOu(this, bhu().iterator());
    }
    return localObject;
  }

  protected int getSize()
  {
    Iterator localIterator = bht();
    int i = 0;
    while (localIterator.hasNext()) {
      localIterator.next();
      i++;
    }
    return i;
  }

  protected boolean h(bFe parambFe)
  {
    return false;
  }
}