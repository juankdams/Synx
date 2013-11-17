import java.util.Collection;
import java.util.Iterator;

public class dto extends aZm
{
  private static final aNA lvP = new dne();

  public void a(aZK paramaZK, dhJ paramdhJ)
  {
    awT localawT = byv.bFN().bFO().bGF();
    ((cMb)paramaZK).a(((dWu)paramaZK).adT());
    localawT.kN((int)paramaZK.getId());
  }

  public void b(aZK paramaZK, dhJ paramdhJ)
  {
    a(paramdhJ, paramaZK, -1L);
  }

  public dwZ b(dhJ paramdhJ, aZK paramaZK, long paramLong)
  {
    dlz localdlz = (dlz)aot.dtv.a(cHc(), paramaZK.getId());

    if (vd.QM().dh(localdlz.gw()) == null) {
      return dwZ.lDa;
    }

    if (!bGP.gDv.a(new aGH[] { (aGH)paramdhJ })) {
      return dwZ.lDg;
    }

    if (paramdhJ.bHr().yi(localdlz.gw()) < localdlz.cTq()) {
      return dwZ.lDc;
    }
    return dwZ.lDa;
  }

  protected void c(dhJ paramdhJ, aZK paramaZK, long paramLong)
  {
    cAK localcAK = (cAK)paramaZK;
    Collection localCollection = localcAK.sL();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      abc localabc = (abc)localIterator.next();
      if ((localabc instanceof djm))
      {
        ((djm)localabc).a(lvP);
      }
    }
    localcAK.x((short)2);
    localcAK.sM();
  }

  public boolean a(byz parambyz, cAK paramcAK)
  {
    return b(parambyz, paramcAK, -1L) == dwZ.lDa;
  }

  public dFN cHc()
  {
    return dFN.lQg;
  }

  public String a(cAK paramcAK)
  {
    return bU.fH().b(84, (int)paramcAK.getId(), new Object[0]);
  }

  public String b(cAK paramcAK)
  {
    dlz localdlz = (dlz)aot.dtv.a(cHc(), paramcAK.getId());
    bBn localbBn = vd.QM().dh(localdlz.gw());
    if (localbBn == null) {
      return null;
    }
    byz localbyz = byv.bFN().bFO();
    lZ locallZ = new lZ();
    dwZ localdwZ = b(localbyz, paramcAK, -1L);
    int i = (localdwZ == dwZ.lDc) || (localdwZ == dwZ.lDb) ? 1 : 0;
    locallZ.am((i != 0 ? bNa.gRz : bNa.gRA).bUV());
    locallZ.a("[").a(localbBn.getName()).a("]").a(" x").bw(localdlz.cTq());
    return locallZ.tP();
  }
}