import java.util.List;

public final class beA extends dte
{
  public final List frB;

  public beA(List paramList)
  {
    this.frB = paramList;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)141);
    for (int i = 0; i < this.frB.size(); i++) {
      int j = ((Integer)this.frB.get(i)).intValue();
      localaIG.mH(j);
    }

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}