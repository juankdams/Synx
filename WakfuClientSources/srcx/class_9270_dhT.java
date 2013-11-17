import java.util.ArrayList;
import java.util.Iterator;

public class dhT extends bNs
{
  public dhT(cUQ paramcUQ)
  {
    super(paramcUQ);
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("content")) {
      ArrayList localArrayList = new ArrayList();
      for (Iterator localIterator = ((aCp)bVc().bPk()).aOG().iterator(); localIterator.hasNext(); ) {
        localArrayList.add(localIterator.next());
      }
      return localArrayList;
    }if (paramString.equals("kama"))
      return Integer.valueOf(Qt());
    if (paramString.equals("freeBagSlotsSize")) {
      return Integer.valueOf(cRv());
    }
    return super.getFieldValue(paramString);
  }

  private int cRv() {
    dno localdno = ((aCp)bVc().bPk()).aOG();
    return localdno.cFy();
  }

  protected boolean isValid() {
    return false;
  }

  public void Qs() {
  }

  public int Qt() {
    return ((aCp)bVc().bPk()).bDx();
  }
}