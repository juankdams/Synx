import java.util.Iterator;

class drt extends cGk
{
  drt(aSI paramaSI)
  {
  }

  protected boolean h(bFe parambFe)
  {
    for (Iterator localIterator = this.ltU.cDC(); localIterator.hasNext(); ) {
      if (!((bNe)localIterator.next()).a(parambFe)) {
        return true;
      }
    }
    return false;
  }
}