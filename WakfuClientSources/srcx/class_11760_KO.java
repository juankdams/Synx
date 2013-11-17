import java.util.Iterator;
import java.util.LinkedList;

public class KO
  implements dUd
{
  private static final KO bXv = new KO();
  private LinkedList bXw = new LinkedList();
  private fm bXx = null;

  public static KO Vm()
  {
    return bXv;
  }

  public void a(coS paramcoS)
  {
    for (Object localObject = this.bXw.iterator(); ((Iterator)localObject).hasNext(); ) { coS localcoS = (coS)((Iterator)localObject).next();
      if (!localcoS.mn().cFE().isBlocking()) {
        this.bXw.remove(localcoS);
      }
    }
    if (this.bXx == null)
    {
      this.bXx = paramcoS.mn().cFE();
      this.bXx.a(paramcoS);
    }
    else if (this.bXx.isBlocking())
    {
      localObject = paramcoS.mn().cFE();
      if (((fm)localObject).isBlocking())
        this.bXw.addLast(paramcoS);
    }
    else {
      this.bXx.m(this.bXx.mn() != paramcoS.mn());
      this.bXx = paramcoS.mn().cFE();
      this.bXx.a(paramcoS);
    }
  }

  public boolean a(cWG paramcWG)
  {
    if (this.bXx != null) {
      if (!this.bXw.isEmpty()) {
        coS localcoS = (coS)this.bXw.removeFirst();
        this.bXx.m(this.bXx.mn() != localcoS.mn());
        this.bXx = localcoS.mn().cFE();
        this.bXx.a(localcoS);
      } else {
        this.bXx.m(true);
        this.bXx = null;
      }
    }
    return false;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}