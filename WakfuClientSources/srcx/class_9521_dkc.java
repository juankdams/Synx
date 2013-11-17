import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dkc
  implements ccc
{
  private static final Logger K = Logger.getLogger(dkc.class);
  private static final int lhl = 375;
  private cPV gTp;
  private btb kKo;
  private bMp gTr;
  private final aIJ aDa;

  public dkc(aIJ paramaIJ)
  {
    this.aDa = paramaIJ;
  }

  void c(dcd paramdcd)
  {
    this.kKo.a(paramdcd, paramdcd.cNQ());
    cSL();
  }

  public void a(cPV paramcPV, btb parambtb, bMp parambMp)
  {
    this.gTp = paramcPV;
    this.kKo = parambtb;
    this.gTr = parambMp;
  }

  public void P(short paramShort1, short paramShort2) {
    dCl localdCl = this.aDa.e(paramShort1, paramShort2);

    cwO.a(this.aDa.D(), paramShort1, paramShort2, (short)0, localdCl);

    dGr localdGr = this.aDa.v(paramShort1, paramShort2);
    this.gTr.a(paramShort1, paramShort2, localdGr);

    dJN localdJN = this.aDa.w(paramShort1, paramShort2);
    bap.fij.a(localdJN);
    this.gTp.a(paramShort1, paramShort2, localdJN);

    if (ayg.aJQ().ais()) {
      cfb localcfb = (cfb)ayg.aJQ().bY(paramShort1, paramShort2);
      if (localcfb != null)
        localcfb.P(new dxg(this));
    }
  }

  public void cX(short paramShort)
  {
    try
    {
      c(this.aDa.aUH());
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  private void cSL() {
    int[] arrayOfInt = { 1 };
    akR localakR = new akR();

    bPu localbPu = new bPu();
    this.aDa.e(new dxh(this, arrayOfInt, localbPu, localakR));

    a(localakR, localbPu);

    LC.We().a(arrayOfInt[0], localbPu);
  }

  private void a(akR paramakR, bPu parambPu)
  {
    ArrayList localArrayList = new ArrayList();
    this.aDa.e(new dxc(this, localArrayList));

    for (Iterator localIterator1 = localArrayList.iterator(); localIterator1.hasNext(); ) { localaXL1 = (aXL)localIterator1.next();
      for (aXL localaXL2 : localArrayList)
        if (localaXL1 != localaXL2)
        {
          cfh localcfh1 = (cfh)paramakR.get(localaXL1);
          cfh localcfh2 = (cfh)paramakR.get(localaXL2);

          cfh.a(localcfh1, localcfh2, parambPu);
        } }
    aXL localaXL1;
  }

  public boolean Q(short paramShort1, short paramShort2) {
    return this.aDa.f(paramShort1, paramShort2);
  }

  public void clear() {
  }

  public void cY(short paramShort) {
    bGc.bOn().sH(375);
    bGc.bOn().load();
  }
}