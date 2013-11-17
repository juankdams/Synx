import org.apache.log4j.Logger;

public class aOA extends aJD
{
  public aOA(ayT paramayT, cOE paramcOE)
  {
    a(paramayT);
    b(paramcOE);
  }

  public void a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, dle paramdle)
  {
  }

  public byte[] bbl()
  {
    return null;
  }

  public cjK ee(long paramLong)
  {
    aAn localaAn = bMF.bUo().fo(paramLong);
    if (localaAn == null) {
      K.error("pas de modele de zone d'effet d'id " + paramLong);
      return null;
    }
    return localaAn.a(null);
  }
}