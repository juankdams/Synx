public class dTf extends dte
{
  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    byte[] arrayOfByte1 = { 1, 2, 3 };

    for (byte b : arrayOfByte1) {
      aIG localaIG = new aIG();
      localaIG.bM(b);
      localaIG.bf((short)13);
      localcyx.d(localaIG);
    }
  }
}