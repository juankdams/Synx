import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;

final class aKJ
{
  private static final Logger K = Logger.getLogger(aKJ.class);
  private static final int eor = 1042;
  private static final int eos = 1043;
  private static final int eot = 2121;
  public static final String eou = "AnimChrage1-Debut";
  public static final String eov = "AnimChrage2-Debut";
  public static final String eow = "AnimStatique02-Debut";
  public static final String eox = "AnimChrage1-Fin";
  public static final String eoy = "AnimChrage2-Fin";
  public static final String eoz = "AnimStatique02-Fin";
  private static final int eoA = 40;
  private static final int eoB = 20;
  private int cug = -1;
  private Anm eoC;
  private Anm eoD;

  public void ak(Su paramSu)
  {
    if (paramSu.uO() != SB.ctK.uO()) {
      return;
    }
    if (paramSu.auK() == null) {
      return;
    }
    bfE localbfE = (bfE)paramSu.auK().hh(2121);
    if ((localbfE == null) || (localbfE.nU() <= 0)) {
      return;
    }
    if (paramSu.aeQ() == null) {
      Rx localRx = paramSu.d(eu.ayM);
      this.cug = (localRx.value() * 100 / localRx.max());
      return;
    }

    bnc.bxw().a(paramSu.aeR(), new cdV(this, dqt.cXz(), 0, 0, paramSu.aeR(), paramSu));

    bnc.bxw().qj(paramSu.aeR());
  }

  private int al(Su paramSu)
  {
    Rx localRx = paramSu.d(eu.ayM);
    if (localRx.max() == 0)
      return 0;
    int i = localRx.value() * 100 / localRx.max();

    int j = 0;
    if (mU(i)) {
      if (this.cug < 40)
        if (this.cug < 20)
          j = ao(paramSu);
        else
          j = an(paramSu);
    }
    else if ((mV(i)) && (!mV(this.cug))) {
      if (mW(this.cug))
        j = am(paramSu);
      else
        j = ap(paramSu);
    } else if (mW(i)) {
      if (mV(this.cug))
        j = aq(paramSu);
      else if (mU(this.cug)) {
        j = ar(paramSu);
      }
    }
    this.cug = i;
    return j;
  }

  private boolean mU(int paramInt) {
    return paramInt > 40;
  }

  private boolean mV(int paramInt) {
    return (paramInt <= 40) && (paramInt > 20);
  }

  private boolean mW(int paramInt) {
    return paramInt <= 20;
  }

  private int am(Su paramSu) {
    cew localcew = paramSu.aeL();
    if (localcew.cgZ().getType() != 2) {
      localcew.c(this.eoD);
      this.eoD = null;
      return 0;
    }
    localcew.eq("AnimChrage2-Fin");
    localcew.a(new cdS(this, localcew));

    return localcew.H("AnimChrage2-Fin");
  }

  private int an(Su paramSu)
  {
    cew localcew = paramSu.aeL();
    if (localcew.cgZ().getType() != 2) {
      localcew.c(this.eoC);
      this.eoC = null;
      return 0;
    }
    localcew.eq("AnimChrage1-Fin");
    localcew.a(new cdX(this, localcew));

    return localcew.H("AnimChrage1-Fin");
  }

  private int ao(Su paramSu)
  {
    cew localcew = paramSu.aeL();
    if (localcew.cgZ().getType() != 2) {
      localcew.c(this.eoC);
      localcew.c(this.eoD);
      this.eoC = null;
      this.eoD = null;
      return 0;
    }
    localcew.eq("AnimStatique02-Fin");
    localcew.a(new cdW(this, localcew));

    return localcew.H("AnimStatique02-Fin");
  }

  private int ap(Su paramSu)
  {
    cew localcew = paramSu.aeL();
    try {
      this.eoC = localcew.ep(bAF.rU(1043));
    } catch (bdh localbdh) {
      K.error("Exception levee", localbdh);
    }
    if (localcew.cgZ().getType() == 2) {
      localcew.a(this.eoC, new cdY(this, localcew));

      return localcew.H("AnimChrage1-Debut");
    }
    return 0;
  }

  private int aq(Su paramSu) {
    cew localcew = paramSu.aeL();
    try {
      this.eoD = localcew.ep(bAF.rU(1042));
    } catch (bdh localbdh) {
      K.error("Exception levee", localbdh);
    }
    if (localcew.cgZ().getType() == 2) {
      localcew.eq("AnimChrage2-Debut");
      return localcew.H("AnimChrage2-Debut");
    }
    return 0;
  }

  private int ar(Su paramSu) {
    cew localcew = paramSu.aeL();
    try {
      this.eoC = localcew.ep(bAF.rU(1043));
      this.eoD = localcew.ep(bAF.rU(1042));
    } catch (bdh localbdh) {
      K.error("Exception levee", localbdh);
    }
    if (localcew.cgZ().getType() == 2) {
      localcew.eq("AnimStatique02-Debut");
      return localcew.H("AnimStatique02-Debut");
    }
    return 0;
  }

  public void reset() {
    this.cug = -1;
  }
}