import org.apache.log4j.Logger;

class xT extends avU
{
  private xT(cKg paramcKg)
  {
    super(paramcKg);
  }

  public void a(short paramShort1, int paramInt, short paramShort2, short paramShort3, long paramLong1, long paramLong2) {
    try {
      a(new bFA(paramLong1, paramShort1, paramInt, paramShort2, paramShort3), paramLong2);
    } catch (bcw localbcw) {
      bZv.Re().error("Problème dr'ajout du groupe refId=" + paramShort1 + "en x=" + paramShort2 + ", y=" + paramShort3 + " uid=" + paramLong1, localbcw);
    }
  }

  public void aT(long paramLong) {
    try {
      cJ(paramLong);
    } catch (bcw localbcw) {
      bZv.Re().error("Problème de suppression du batiment uid=" + paramLong, localbcw);
    }
  }
}