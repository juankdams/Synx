import org.apache.log4j.Logger;

class Uw
  implements bhG
{
  Uw(asf paramasf, byz parambyz, bBn parambBn)
  {
  }

  public boolean a(long paramLong, aPm paramaPm)
  {
    cRs localcRs = this.aOx.bGP().iO(paramaPm.bgh());
    if (localcRs != null) {
      gA localgA = gA.a(this.cxS);
      localgA.l(paramaPm.nP());
      try {
        short s = paramaPm.aks();
        if (s != -1)
          localcRs.i(localgA, s);
        else
          localcRs.av(localgA);
      }
      catch (dI localdI) {
        localgA.release();
        asf.K.error("Exception", localdI);
      } catch (dcF localdcF) {
        localgA.release();
        asf.K.error("Exception", localdcF);
      } catch (bQT localbQT) {
        localgA.release();
        asf.K.error("Exception", localbQT);
      }
    }
    return false;
  }
}