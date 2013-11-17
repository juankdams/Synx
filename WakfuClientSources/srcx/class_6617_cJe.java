import java.util.Iterator;

class cJe
  implements dFU
{
  public boolean a(axt paramaxt)
  {
    byz localbyz = byv.bFN().bFO();
    Vu localVu = (Vu)localbyz.b(RS.cru);

    deU localdeU = new deU(localVu);

    for (Iterator localIterator = paramaxt.anF(); localIterator.hasNext(); ) {
      ((jI)localIterator.next()).a(localdeU);
    }
    return false;
  }

  public int vN() {
    return 15998;
  }
}