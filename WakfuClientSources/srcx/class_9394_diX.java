import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

public class diX extends bxG
{
  private static ddt ehE = new ddt();

  private static long lfd = 500L;
  private String dFU = "execution_Time";
  private final byte kyD;
  private final boolean lfe;
  private int lff;

  public diX(int paramInt1, int paramInt2, int paramInt3, byte paramByte, int paramInt4, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.kyD = paramByte;
    this.lfe = paramBoolean;
  }

  public long mC()
  {
    Su localSu = dX(gA());
    if (localSu == null) {
      return 0L;
    }

    boolean bool = this.aBf.isEmpty();
    int i;
    switch (this.kyD) {
    case 0:
      i = bq(localSu);
      break;
    case 1:
      i = bp(localSu);
      break;
    case 2:
      i = bj(localSu);
      break;
    case 3:
      i = bi(localSu);
      break;
    default:
      i = 0;
    }
    return bool ? 0L : i;
  }

  private int bi(Su paramSu)
  {
    cew localcew = paramSu.aeL();
    String str = "AnimFuite";
    if (!localcew.J(str)) {
      str = "AnimStatique";
    }
    localcew.eq(str);
    int i = localcew.H(str);

    int j = i == 2147483647 ? 0 : i;
    bl(paramSu);
    return j;
  }

  private int bj(Su paramSu) {
    cew localcew = paramSu.aeL();
    if (cRI()) {
      if ((paramSu instanceof bKm)) {
        if ((mD() == null) || (mD().aEt().dts()))
          bm(paramSu);
      }
      else bk(paramSu);

      if (!paramSu.c(cfY.hBl)) {
        localcew.setStatus((byte)2);
      }
    }
    bl(paramSu);

    int i = this.lff > 0 ? this.lff : localcew.H("AnimMort");
    return i == 2147483647 ? 0 : i;
  }

  private void bk(Su paramSu) {
    boolean bool = bo(paramSu);
    if (!bool)
      bn(paramSu);
  }

  private boolean cRI()
  {
    return this.lfe;
  }

  private void bl(Su paramSu) {
    cew localcew = paramSu.aeL();
    localcew.es("AnimStatique");
    localcew.cgY();
  }

  private void bm(Su paramSu) {
    cew localcew = paramSu.aeL();
    localcew.eq("AnimKO-SortieHS");

    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(paramSu.afq());
    if (localFreeParticleSystem == null) {
      K.warn("le system de particule " + paramSu.afq() + "n'exsite pas");
      return;
    }

    localFreeParticleSystem.b(localcew);
    localFreeParticleSystem.cS(a());
    cWS.cKD().b(localFreeParticleSystem);
  }

  private void bn(Su paramSu) {
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(15000);
    aWc.blo().eP(15384L);
    if (localFreeParticleSystem == null) {
      K.warn("le system de particule 15000n'exsite pas");
      return;
    }

    localFreeParticleSystem.b(paramSu.aeL());
    localFreeParticleSystem.cS(a());
    cWS.cKD().b(localFreeParticleSystem);
  }

  private boolean bo(Su paramSu) {
    int i = paramSu.aeY();
    if (i == -1)
    {
      paramSu.aeL().eq("AnimMort");
      return true;
    }
    bXf localbXf = dlD.cTt().AE(i);
    if (localbXf == null) {
      localbXf = dlD.cTt().a(i, null, true);
    }
    if (localbXf == null) {
      K.warn("Impossible charger le script de mort d'id " + i);
      return false;
    }

    LuaState localLuaState = localbXf.getLuaState();
    try {
      localLuaState.pushObjectValue(Long.valueOf(paramSu.getId()));
      localLuaState.setGlobal("killedId");
      localLuaState.pushObjectValue(Integer.valueOf(paramSu.aeR()));
      localLuaState.setGlobal("fightId");
    } catch (LuaException localLuaException) {
      K.error("Exception levee", localLuaException);
    }

    localLuaState.resume(0);
    bFB localbFB = localbXf.kD(this.dFU);
    if ((localbFB != null) && (localbFB.bNs() == bxT.gjb)) {
      this.lff = ((Double)localbFB.getValue()).intValue();
    }
    return true;
  }

  private int bp(Su paramSu) {
    cew localcew = paramSu.aeL();
    int i = 0;
    if (this.lfe) {
      if (localcew.J("AnimKO-SortieOK")) {
        i = localcew.H("AnimKO-SortieOK");
        localcew.eq("AnimKO-SortieOK");
      } else {
        localcew.eq("AnimStatique");
      }
      localcew.es(a(localcew, "AnimStatique02", "AnimStatique"));
    }
    localcew.setStatus((byte)0);
    localcew.dI(paramSu.Fx());
    localcew.j(paramSu.E());
    return i;
  }

  private int bq(Su paramSu) {
    cew localcew = paramSu.aeL();
    int i = 0;
    if ((this.lfe) && (!paramSu.c(cfY.hBl)) && (!paramSu.c(cfY.hBr)))
    {
      if (localcew.J("AnimKO-Debut")) {
        localcew.eq("AnimKO-Debut");
        i = localcew.H("AnimKO-Debut");
      }
      localcew.es("AnimKO-Boucle");
      localcew.setStatus((byte)1);
    }
    localcew.chh();
    localcew.chm();
    localcew.chj();
    localcew.chn();
    long l;
    if ((paramSu instanceof byo))
      l = ((byo)paramSu).hf();
    else {
      l = -1L;
    }
    bOU.gUc.b(new bwJ(paramSu.getId(), paramSu.uO(), l));

    ckT localckT = mD();
    if ((localckT instanceof arl)) {
      Collection localCollection = ((arl)localckT).cc(paramSu.Fx());
      if (localCollection.size() == 1) {
        bOU.gUc.b(new bFE(l));
      }
    }

    return i;
  }

  protected void kO()
  {
    Su localSu = dX(gA());

    br(localSu);
    bv(localSu);
    super.kO();
  }

  private void br(Su paramSu) {
    switch (this.kyD) {
    case 0:
      bs(paramSu);
      break;
    case 2:
      bt(paramSu);
      break;
    case 1:
      bu(paramSu);
    }
  }

  private void bs(Su paramSu)
  {
    if (!Ij())
      return;
    if (paramSu == null) {
      return;
    }
    if (paramSu.c(cfY.hBr)) {
      return;
    }

    if ((paramSu.b(eu.ayX)) && (paramSu.e(eu.ayX) > 0))
    {
      String str = bU.fH().getString("fight.ko", new Object[] { new lZ().tz().a(paramSu.cQF()).tA().tP() });
      ehE.info(new lZ().tI().am(cPU.kAA).a(str).tJ().tP());
    }
  }

  private void bt(Su paramSu) {
    if ((Ij()) && (paramSu != null) && (!paramSu.c(cfY.hBl)) && ((mD() == null) || (mD().aEt().dts())))
    {
      if (paramSu.aeI()) {
        ehE.info(bU.fH().getString("fight.endForMe"));
      }
      else
      {
        String str;
        if (!paramSu.c(cfY.hCg))
          str = bU.fH().getString("fight.die", new Object[] { new lZ().tz().a(paramSu.getName()).tA().tP() });
        else
          str = bU.fH().getString("fight.die.for.copies", new Object[] { new lZ().tz().a(paramSu.adL().getName()).tA().tP() });
        ehE.info(new lZ().tI().am(cPU.kAA).a(str).tJ().tP());
      }
    }
  }

  private void bu(Su paramSu) {
    if (!Ij())
      return;
    if (paramSu == null) {
      return;
    }
    String str = bU.fH().getString("fight.raise", new Object[] { new lZ().tz().a(paramSu.cQF()).tA().tP() });
    ehE.info(new lZ().am(cPU.kAA).a(str).tJ().tP());
  }

  private void bv(Su paramSu) {
    if (paramSu == null) {
      return;
    }
    if (paramSu.aeQ() != null)
      bw(paramSu);
    else
      bx(paramSu);
  }

  private void bw(Su paramSu) {
    arl localarl = paramSu.aeQ();
    switch (this.kyD) {
    case 0:
      localarl.ak(paramSu);
      break;
    case 1:
      localarl.X(paramSu);
      break;
    case 3:
      paramSu.jl(true);
    case 2:
      if (!paramSu.aJu())
        localarl.ak(paramSu);
      if (paramSu.aJu())
        localarl.am(paramSu);
      break;
    }
  }

  private void bx(Su paramSu) {
    switch (this.kyD) {
    case 0:
      paramSu.ps();
      break;
    case 1:
      paramSu.adY();
      break;
    case 2:
      paramSu.adZ();
      break;
    case 3:
      paramSu.jl(true);
      paramSu.adZ();
    }
  }

  private String a(cew paramcew, String paramString1, String paramString2)
  {
    if (paramcew.J(paramString1)) {
      return paramString1;
    }
    return paramString2;
  }
}