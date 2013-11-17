import java.util.Collection;
import org.apache.log4j.Logger;

class bKQ
  implements dGy
{
  bKQ(cBQ paramcBQ, Collection paramCollection)
  {
  }

  public boolean m(aNL paramaNL)
  {
    try
    {
      if ((!paramaNL.isUnloading()) && (paramaNL.getElementMap().getId().equals("MRU")))
        this.gOD.add(paramaNL);
    }
    catch (Exception localException) {
      cBQ.ch().error("Exception levée lors du parcours des éléments chargés pour pouvoir fermer les MRU", localException);
    }

    return true;
  }
}