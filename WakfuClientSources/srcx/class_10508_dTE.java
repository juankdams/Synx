import java.util.Iterator;
import org.apache.log4j.Logger;

class dTE
  implements dFU
{
  public boolean a(dyK paramdyK)
  {
    cyS localcyS = dqB.cXD().CG();
    if (localcyS == null) {
      sH.K.error("On reçoit un update de guilde alors qu'on en possède pas !");
      return false;
    }

    cbS localcbS = new cbS(localcyS);
    for (Iterator localIterator = paramdyK.anF(); localIterator.hasNext(); ) {
      ((dTK)localIterator.next()).a(localcbS);
    }
    return false;
  }

  public int vN() {
    return 20050;
  }
}