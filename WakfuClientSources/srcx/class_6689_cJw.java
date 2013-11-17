import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class cJw extends cwV
{
  private final List iHE = new ArrayList();

  public cJw()
  {
  }

  public cJw(bNe[] paramArrayOfbNe)
  {
    for (int i = 0; i < paramArrayOfbNe.length; i++)
      a(paramArrayOfbNe[i]);
  }

  public void a(bNe parambNe)
  {
    if (cum()) {
      throw cur();
    }
    if (parambNe == null) {
      return;
    }
    this.iHE.add(parambNe);
    setChecked(false);
  }

  public boolean lT()
  {
    if (cum()) {
      return ((cJw)cup()).lT();
    }
    cuo();
    return !this.iHE.isEmpty();
  }

  public int lU()
  {
    if (cum()) {
      return ((cJw)cup()).lU();
    }
    cuo();
    return this.iHE.size();
  }

  public Iterator cDC()
  {
    if (cum()) {
      return ((cJw)cup()).cDC();
    }
    cuo();
    return Collections.unmodifiableList(this.iHE).iterator();
  }

  protected void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      for (bNe localbNe : this.iHE) {
        if ((localbNe instanceof cwV)) {
          b((cwV)localbNe, paramStack, paramFF);
        }
      }
      setChecked(true);
    }
  }
}