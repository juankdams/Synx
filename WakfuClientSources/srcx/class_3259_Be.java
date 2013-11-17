import com.ankamagames.wakfu.client.binaryStorage.SpellBinaryData;
import org.apache.log4j.Logger;

public class Be extends czE
{
  private final aVS bh;

  public dSR ea(int paramInt)
  {
    if (paramInt == 0) {
      return null;
    }
    dSR localdSR = (dSR)this.ioH.get(paramInt);
    if ((localdSR == null) && (!this.ioH.contains(paramInt))) {
      SpellBinaryData localSpellBinaryData = (SpellBinaryData)this.bh.jt(paramInt);
      if (localSpellBinaryData == null) {
        return null;
      }
      localdSR = b(localSpellBinaryData);
      if (localdSR != null) {
        c(localdSR);
      }
    }
    return localdSR;
  }

  public static Be Kj() {
    if (ioG == null) {
      ioG = new Be();
    }
    return (Be)ioG;
  }

  private Be() {
    this.bh = new aVG(new SpellBinaryData());
  }

  public bfE h(int paramInt, short paramShort)
  {
    long l = bfE.s(paramInt, paramShort);
    Object localObject = (bfE)this.ioI.get(l);
    if (localObject == null) {
      localObject = new apX(ea(paramInt), paramShort, l);
      this.ioI.put(l, localObject);
    }
    return localObject;
  }

  public void a(SpellBinaryData paramSpellBinaryData) {
    if ((!bB) && (paramSpellBinaryData == null)) throw new AssertionError();
    dSR localdSR = b(paramSpellBinaryData);
    c(localdSR);
  }

  private dSR b(SpellBinaryData paramSpellBinaryData) {
    if ((!bB) && (paramSpellBinaryData == null)) throw new AssertionError();
    dSR localdSR = new dSR(c(paramSpellBinaryData));
    a(localdSR, paramSpellBinaryData);

    int i = paramSpellBinaryData.uO();

    if (i == SB.cty.uO())
    {
      for (Object localObject2 : aQC.bhe().bhh())
        localObject2.a(localdSR, null);
    }
    else if ((i != 0) && (i != SB.ctz.uO())) {
      ??? = aQC.bhe().nx(i);
      if (??? != null) {
        ((Zp)???).a(localdSR, null);
      }

    }

    a(localdSR, paramSpellBinaryData.vD(), ciQ.ckL());
    return localdSR;
  }

  public static void a(bzj parambzj, SpellBinaryData paramSpellBinaryData) {
    if (paramSpellBinaryData.vv() != null)
      for (int i = 0; i < paramSpellBinaryData.vv().length; i = (byte)(i + 1))
        parambzj.rH(paramSpellBinaryData.vv()[i]);
  }

  public static doH c(SpellBinaryData paramSpellBinaryData)
  {
    doH localdoH = new doH();
    localdoH.d(paramSpellBinaryData.getId());
    localdoH.AW(paramSpellBinaryData.uN());
    localdoH.iT(paramSpellBinaryData.oc());
    localdoH.I(paramSpellBinaryData.nV());
    localdoH.zu(paramSpellBinaryData.uO());
    localdoH.ff((byte)paramSpellBinaryData.uP());
    localdoH.fg((byte)paramSpellBinaryData.uQ());
    localdoH.fh((byte)paramSpellBinaryData.uS());
    localdoH.jM(paramSpellBinaryData.uT());
    localdoH.jK(paramSpellBinaryData.uU());
    localdoH.jL(paramSpellBinaryData.uV());
    localdoH.jN(paramSpellBinaryData.uW());
    localdoH.jP(paramSpellBinaryData.uX());
    localdoH.jO(paramSpellBinaryData.uY());
    localdoH.AV(paramSpellBinaryData.uZ());
    bZA localbZA1 = null;
    try {
      String str = paramSpellBinaryData.va();
      localbZA1 = aVj.hn(str);
    } catch (Exception localException1) {
      K.error("Erreur lors de la compilation des critères du sort " + paramSpellBinaryData.getId(), localException1);
    }
    localdoH.e(localbZA1);

    a(paramSpellBinaryData, localdoH);
    localdoH.de(paramSpellBinaryData.vj());
    localdoH.df(paramSpellBinaryData.vk());

    localdoH.dg(paramSpellBinaryData.vh());
    localdoH.dh(paramSpellBinaryData.vi());
    localdoH.fj((byte)paramSpellBinaryData.vl());
    localdoH.fi((byte)paramSpellBinaryData.vm());
    localdoH.eo(paramSpellBinaryData.vn());
    localdoH.fm((byte)paramSpellBinaryData.vo());
    localdoH.ep(paramSpellBinaryData.vp());
    bZA localbZA2 = null;
    try {
      localbZA2 = aVj.hn(paramSpellBinaryData.vq());
    } catch (Exception localException2) {
      K.error("Erreur lors de la compilation des critères d'apprentissage du sort " + paramSpellBinaryData.getId(), localException2);
    }
    localdoH.d(localbZA2);
    localdoH.fl(paramSpellBinaryData.vr());
    localdoH.jV(paramSpellBinaryData.vs());
    localdoH.eH(paramSpellBinaryData.vt());
    localdoH.jR(paramSpellBinaryData.vu());
    localdoH.jS(paramSpellBinaryData.vx());
    localdoH.jT(paramSpellBinaryData.vy());
    localdoH.jU(paramSpellBinaryData.vz());
    localdoH.jW(paramSpellBinaryData.vA());
    localdoH.jX(paramSpellBinaryData.vB());
    localdoH.di(paramSpellBinaryData.uR());

    akR localakR = paramSpellBinaryData.vF();
    if ((localakR != null) && (localakR.size() != 0)) {
      localakR.b(new cTO(localdoH, paramSpellBinaryData));
    }

    return localdoH;
  }

  private static aql a(aDH paramaDH) {
    aql localaql = new aql(paramaDH.vb(), paramaDH.vc(), paramaDH.vf(), paramaDH.vg(), paramaDH.vd(), paramaDH.ve());

    localaql.cI(paramaDH.aCt());
    localaql.B(paramaDH.vh(), paramaDH.vi());

    dPx localdPx = paramaDH.aPP();
    if ((localdPx != null) && (localdPx.size() != 0)) {
      localdPx.b(new cTM(localaql));
    }

    return localaql;
  }

  private static void a(SpellBinaryData paramSpellBinaryData, doH paramdoH) {
    dPx localdPx = paramSpellBinaryData.vE();
    paramdoH.b(eu.ayN, paramSpellBinaryData.vb(), paramSpellBinaryData.vc());
    paramdoH.b(eu.ayO, paramSpellBinaryData.vd(), paramSpellBinaryData.ve());
    paramdoH.b(eu.ayP, paramSpellBinaryData.vf(), paramSpellBinaryData.vg());
    if ((localdPx != null) && (localdPx.size() == 0))
      localdPx.b(new cTR(paramdoH));
  }

  public static void a(bzj parambzj, int[] paramArrayOfInt, ciQ paramciQ)
  {
    for (int k : paramArrayOfInt) {
      dpI localdpI = paramciQ.vt(k);
      if (localdpI != null)
        parambzj.a(localdpI);
      else
        K.error("Problème de chargmeent de Spell " + parambzj.getId());
    }
  }
}