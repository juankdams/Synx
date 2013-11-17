public class dMO extends aic
{
  public dMO(aYr paramaYr)
  {
    super(paramaYr);
    a(jF.aMl);
  }

  protected void g(int paramInt, int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      iy(paramInt);
    }
    crV localcrV = iz(paramInt);
    localcrV.clear();
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
      localcrV.wl(paramArrayOfInt[j]);
  }

  public void b(int paramInt, int[] paramArrayOfInt) {
    throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
  }

  public void d(int paramInt, int[] paramArrayOfInt) {
    throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
  }

  public void iw(int paramInt) {
    throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
  }

  public void c(int paramInt, int[] paramArrayOfInt) {
    g(paramInt, paramArrayOfInt);
    byz localbyz = byv.bFN().bFO();
    if (localbyz != null)
      localbyz.bGR();
  }
}