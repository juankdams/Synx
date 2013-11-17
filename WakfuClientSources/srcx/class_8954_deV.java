public final class deV
{
  public static boolean jF(long paramLong)
  {
    byz localbyz = byv.bFN().bFO();

    brW localbrW1 = ars.dzL.aL(localbyz.Lk());
    if (localbrW1 == null) {
      return false;
    }

    bMG localbMG = localbyz.bSt();
    brW localbrW2 = ars.dzL.jG(localbMG.CF());
    if ((localbrW2 == null) || (localbrW2.arI() != localbyz.Lk())) {
      return false;
    }

    aCl localaCl = localbMG.ay(localbyz.getId());
    if (localaCl == null)
      return false;
    aUJ localaUJ = localbMG.az(localaCl.aOC());
    return (localaUJ != null) && (localaUJ.a(cnm.hTn));
  }
}