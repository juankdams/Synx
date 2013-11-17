import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aYX
  implements cvW
{
  private static final Logger K = Logger.getLogger(aYX.class);

  private static final aYX ffw = new aYX();

  private final aQT ffx = aQT.bhr();

  private boolean bur = true;
  private boolean ffy = true;

  private int ffz = 0;

  private int ffA = -1;

  private boolean aFc = false;
  private cuB ffB;
  private final Qh ffC = new btM(this);

  public static aYX bnY()
  {
    return ffw;
  }

  public final void enable() {
    this.bur = true;
  }

  public final void disable() {
    this.bur = false;
    bod();
  }

  public void bnZ() {
    this.ffy = false;
    bod();
  }

  public void boa() {
    this.ffy = true;
  }

  public void bob() {
    this.ffz = 0;
  }

  public boolean a(cWG paramcWG) {
    if (!this.aFc) {
      K.warn("Traitement d'un message alors que la frame n'est plus active");
      bod();
    }

    if ((!this.bur) || (!this.ffy)) {
      return true;
    }

    switch (paramcWG.getId()) {
    case 18015:
      if (!axB.aIZ().aJe()) {
        axB.aIZ(); if (!axB.aJh())
          boe();
        else
          bod();
      }
      return true;
    case 19992:
      aqQ localaqQ = (aqQ)paramcWG;

      bWx.cbz().hide();

      if (!localaqQ.aCU()) {
        bod();
        axB.aUg.ac(0, 0, (short)32767);
        return true;
      }

      if (axB.aIZ().aJe()) {
        return true;
      }
      this.ffz = 0;

      if (axB.aUg == null) {
        return false;
      }
      Su localSu = boc();
      if (localSu == null) {
        return false;
      }
      if ((this.ffB == null) || (this.ffB.csW() <= 0)) {
        return false;
      }
      if ((this.ffB.csW() == 1) && (localSu.ML().ae(this.ffB.csY()[0], this.ffB.csY()[1]))) {
        return false;
      }

      this.ffz = this.ffB.csW();

      a(localSu, this.ffB);

      bnZ();
      bod();
      return false;
    }

    return true;
  }

  private Su boc() {
    Su localSu = null;
    try
    {
      localSu = axB.cUs.aDp().Ia();
      if (localSu.adL() != byv.bFN().bFO())
        K.warn("WORLD_SCENE_MOUSE_RELEASED demandé pour un fighter qui n'est pas à soi");
    }
    catch (NullPointerException localNullPointerException) {
      K.error("WORLD_SCENE_MOUSE_RELEASED dans une frame de combat, sans combat ou combattant");
    }
    return localSu;
  }

  private void a(Su paramSu, cuB paramcuB) {
    dpP localdpP = new dpP();
    localdpP.c(paramcuB);
    localdpP.X(paramSu.getId());
    byv.bFN().aJK().d(localdpP);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    this.aFc = true;
    this.ffy = true;
    clear();

    byv.bFN().bFO().aeL().a(this.ffC);
    axB.aIZ(); axB.aJh();
    boe();
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    this.aFc = false;
    clear();

    byv.bFN().bFO().aeL().b(this.ffC);
  }

  public void bod()
  {
    this.ffx.clear();
    this.ffB = null;
  }

  private void clear()
  {
    this.ffz = 0;
    this.ffA = -1;
    axB.aIZ(); axB.aJi();
    bod();
  }

  public void cf(int paramInt1, int paramInt2)
  {
  }

  public void boe()
  {
    Su localSu;
    try
    {
      byz localbyz = byv.bFN().bFO();
      localSu = axB.cUs.aDp().Ia();

      if (localSu.adL() != localbyz) {
        bod();
        K.warn("refreshPath demandé pour un fighter qui n'est pas à soi");
        return;
      }
    }
    catch (NullPointerException localNullPointerException) {
      bod();
      K.error("GRAVE > contexte de mouvement en combat, sans combat ou fighter");
      return;
    }

    if ((axB.aUg == null) || (localSu.c(cfY.hBd)) || (localSu.c(cfY.hCI)))
    {
      bod();
      return;
    }

    int i = localSu.e(eu.ayO);
    if (localSu.c(cfY.hBI)) {
      i *= 2;
    }
    if (localSu.c(cfY.hBH)) {
      i /= 2;
    }
    if (this.ffA != i) {
      this.ffA = i;
      this.ffz = 0;
    }
    else
    {
      i -= this.ffz;
    }
    if (i > 0) {
      cew localcew = localSu.aeL();
      if (localcew != null)
      {
        cuB localcuB = localSu.afg().a(localSu, localcew, i);

        if ((localcuB != null) && (localcuB.csW() > 0)) {
          this.ffx.a(localcuB);
          this.ffB = localcuB;
          String str = wj();
          if (str != null) {
            if (bWx.cbz().avJ())
              bWx.cbz().a(null, str, 30, 0, aFG.ecj);
            else
              bWx.cbz().setText(str);
          }
          else
            bWx.cbz().hide();
        }
        else {
          this.ffx.clear();
          this.ffB = null;
          bWx.cbz().hide();
        }
      }
    } else {
      this.ffx.clear();
      this.ffB = null;
      bWx.cbz().hide();
    }
  }

  private String wj() {
    String str1 = bof();
    String str2 = bog();

    if (str1 == null) {
      return str2;
    }
    if (str2 == null) {
      return str1;
    }
    return str1 + "\n" + str2;
  }

  private String bof() {
    byz localbyz = byv.bFN().bFO();
    Su localSu1 = localbyz.aeQ().aDp().Ia();
    if (localSu1.c(cfY.hCp))
      return null;
    bRh localbRh = new bRh(localSu1);
    cSi localcSi = new cSi(4);
    for (Su localSu2 : localbyz.aeQ().ah(localSu1)) {
      localbRh.b(localSu2);
      int j = localbRh.bXT();
      if ((j != -1) && (!localSu2.afk())) {
        localcSi.add(j);
      }
    }
    if ((localcSi.size() > 3) || (localcSi.isEmpty()))
      return null;
    float f;
    if (localcSi.size() == 1)
      f = localcSi.get(0) / 100.0F;
    else if (localcSi.size() == 2)
      f = aUp.L(localcSi.get(0) / 100.0F, localcSi.get(1) / 100.0F);
    else {
      f = aUp.n(localcSi.get(0) / 100.0F, localcSi.get(1) / 100.0F, localcSi.get(2) / 100.0F);
    }

    int i = 100 - Math.round(f * 100.0F);
    i = bCO.J(i, 5, 95);
    return bU.fH().getString("tacklePercentage", new Object[] { Integer.valueOf(i) });
  }

  private String bog() {
    byz localbyz = byv.bFN().bFO();
    Su localSu = localbyz.aeQ().aDp().Ia();
    if (!localSu.bnX()) {
      return null;
    }
    cSi localcSi = av(localSu);
    float f = d(localcSi);

    return bU.fH().getString("camouflagePercentage", new Object[] { Float.valueOf(f) });
  }

  private float d(cSi paramcSi) {
    float f1 = 1.0F;
    for (int i = 0; i < paramcSi.size(); i++) {
      float f2 = bCO.t(paramcSi.get(i) / 100.0F, 0.0F, 1.0F);
      f1 *= f2;
    }
    return f1 * 100.0F;
  }

  private cSi av(Su paramSu) {
    bKw localbKw = new bKw();
    localbKw.w(paramSu);
    localbKw.H(new cYk(this.ffB.csY()));

    cSi localcSi = new cSi();
    Collection localCollection = paramSu.aeQ().cb(paramSu.Fx());
    for (Su localSu : localCollection)
      if ((!a(paramSu, localSu)) && (aw(localSu)))
      {
        localbKw.x(localSu);
        localbKw.I(localSu.ML());
        localcSi.add(localbKw.bSH());
      }
    return localcSi;
  }

  private boolean a(Su paramSu1, Su paramSu2) {
    return paramSu2.ML().ac(paramSu1.ML()) <= 8;
  }

  private boolean aw(Su paramSu) {
    Iterator localIterator = this.ffB.iterator();
    while (localIterator.hasNext()) {
      int[] arrayOfInt = (int[])localIterator.next();
      if (paramSu.ML().X(arrayOfInt) <= 8)
        return true;
    }
    return false;
  }

  protected cYk D(int paramInt1, int paramInt2) {
    return bYZ.a(WakfuClientInstance.awy().Dg(), paramInt1, paramInt2, false);
  }
}