import com.ankamagames.wakfu.client.binaryStorage.StateBinaryData;
import org.apache.log4j.Logger;

public class dvc
  implements bwC
{
  private static final Logger K = Logger.getLogger(dvc.class);
  private final aVS lAh;

  public dvc()
  {
    this(new aVG(new StateBinaryData()));
  }

  public dvc(aVS paramaVS) {
    this.lAh = paramaVS;
  }

  public bJC rs(int paramInt)
  {
    if (paramInt <= 0)
      return null;
    bXU localbXU = daQ();
    a(localbXU, (StateBinaryData)this.lAh.jt(paramInt));
    return localbXU;
  }

  protected bXU daQ() {
    return new bXU();
  }

  private static void a(bXU parambXU, StateBinaryData paramStateBinaryData) {
    bhl localbhl = new bhl(parambXU);

    localbhl.iT(paramStateBinaryData.oc());
    localbhl.eG(paramStateBinaryData.Od());
    localbhl.eH(paramStateBinaryData.Oc());

    localbhl.eL((short)paramStateBinaryData.getId());
    localbhl.eK(paramStateBinaryData.nV());
    localbhl.eM(paramStateBinaryData.NO());
    localbhl.dC(paramStateBinaryData.NQ());
    localbhl.la(paramStateBinaryData.zm());
    localbhl.lb(paramStateBinaryData.zl());
    localbhl.De(paramStateBinaryData.NP());
    localbhl.Df(paramStateBinaryData.NR());
    localbhl.lc(paramStateBinaryData.NT());
    localbhl.ld(paramStateBinaryData.zS());
    localbhl.le(paramStateBinaryData.NS());
    localbhl.lf(paramStateBinaryData.NW());
    localbhl.ac(paramStateBinaryData.NX());
    localbhl.rE(paramStateBinaryData.NV());
    localbhl.ad(paramStateBinaryData.NL());
    localbhl.rF(paramStateBinaryData.NU());
    localbhl.lg(paramStateBinaryData.zN());
    localbhl.li(paramStateBinaryData.NY());
    localbhl.lh(paramStateBinaryData.zI());
    localbhl.fT(paramStateBinaryData.NZ());
    localbhl.fU(paramStateBinaryData.Oa());
    localbhl.lj(paramStateBinaryData.Ob());

    localbhl.rF(paramStateBinaryData.NU());

    b(parambXU, paramStateBinaryData);
  }

  private static void b(bXU parambXU, StateBinaryData paramStateBinaryData) {
    int[] arrayOfInt1 = paramStateBinaryData.vD();
    if ((arrayOfInt1 == null) || (arrayOfInt1.length == 0)) {
      return;
    }
    for (int k : arrayOfInt1) {
      dpI localdpI = ciQ.ckL().vt(k);
      if (localdpI != null)
        parambXU.a(localdpI);
      else
        K.error("Problème de chargmeent de State " + paramStateBinaryData.getId());
    }
  }

  public static cSR DZ()
  {
    cSR localcSR = new cSR();
    try {
      cze.cwb().a(new StateBinaryData(), new bnw(localcSR));
    }
    catch (Exception localException)
    {
      K.error("", localException);
    }

    return localcSR;
  }
}