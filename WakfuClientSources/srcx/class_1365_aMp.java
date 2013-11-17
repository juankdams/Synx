import java.io.IOException;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aMp extends csi
  implements dBv
{
  protected static final Logger K = Logger.getLogger(aMp.class);
  public static final String bC = "name";
  public static final String bsP = "level";
  public static final String RH = "iconUrl";
  public static final String erv = "breedName";
  public static final String erw = "isAvailable";
  public static final String erx = "unavailableReasons";
  public static final String csN = "leaderShipCost";
  public static final String ery = "hp";
  public static final String dwL = "mp";
  public static final String dwK = "ap";
  public static final String dwM = "wp";
  public static final String erz = "init";
  public static final String erA = "tackle";
  public static final String erB = "dodge";
  public static final String erC = "tackleIcon";
  public static final String erD = "dodgeIcon";
  public static final String erE = "dmgFirePercent";
  public static final String erF = "dmgWaterPercent";
  public static final String erG = "dmgEarthPercent";
  public static final String erH = "dmgWindPercent";
  public static final String erI = "resFirePercent";
  public static final String erJ = "resWaterPercent";
  public static final String erK = "resEarthPercent";
  public static final String erL = "resWindPercent";
  public static final String csy = "debuffApVisible";
  public static final String csz = "debuffMpVisible";
  public static final String erM = "buffApPercent";
  public static final String erN = "buffMpPercent";
  public static final String erO = "resApPercent";
  public static final String erP = "resMpPercent";
  public static final String csp = "actorDescriptorLibrary";
  public static final String erQ = "actorStandardScale";
  public static final String erR = "canBeRenamed";
  static final String[] bF = { "name", "level", "iconUrl", "breedName", "isAvailable", "unavailableReasons", "hp", "ap", "mp", "wp", "init", "tackle", "dodge", "tackleIcon", "dodgeIcon", "dmgFirePercent", "dmgWaterPercent", "dmgEarthPercent", "dmgWindPercent", "resFirePercent", "resWaterPercent", "resEarthPercent", "resWindPercent", "debuffApVisible", "debuffMpVisible", "buffApPercent", "buffMpPercent", "resApPercent", "resMpPercent", "canBeRenamed" };

  private boolean erS = true;
  private static final short erT = 3;

  public aMp(short paramShort1, String paramString, int paramInt, long paramLong, short paramShort2)
  {
    super(paramShort1, paramString, paramInt, paramLong, paramShort2);
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return getName();
    }
    if (paramString.equals("hp")) {
      if (cMn.cFp().dP(Rw()) != null)
        return h(eu.ayM);
      return null;
    }
    if (paramString.equals("level"))
      return Short.valueOf(cqI());
    Object localObject2;
    if (paramString.equals("iconUrl")) {
      try {
        cwv localcwv = cwv.dO(nU(), cqF());
        localObject2 = cMn.cFp().dP(Rw());
        ciJ localciJ = bRu.bYI().tP(((bdi)localObject2).nn());

        int j = localciJ.ckB();
        String str = null;
        if (j != 0) { str = localcwv.wW(j);
          if (bAy.jy(str)); }
        return localcwv.wW(0);
      }
      catch (Exception localException)
      {
      }

    }

    if (paramString.equals("breedName")) {
      if (cMn.cFp().dP(Rw()) != null) {
        return "(" + cMn.cFp().dP(Rw()).getName() + ")";
      }
      return null;
    }if (paramString.equals("isAvailable"))
      return Boolean.valueOf(this.erS);
    Object localObject1;
    if (paramString.equals("unavailableReasons")) {
      localObject1 = null;
      localObject2 = byv.bFN().bFO();
      if (((byz)localObject2).aeQ() == null)
        return localObject1;
      if (bdB())
        return bU.fH().getString("desc.gobgobInvoke");
      if (((byz)localObject2).nU() < 3)
        localObject1 = bU.fH().getString("desc.osamodasBadLevelToInvoke", new Object[] { Short.valueOf(3) });
      else if (!bdC()) {
        localObject1 = bU.fH().getString("desc.osamodasInsufferableCreaturesLevel");
      }
      return localObject1;
    }if (paramString.equals("ap"))
      return h(eu.ayN);
    if (paramString.equals("mp"))
      return h(eu.ayO);
    if (paramString.equals("wp"))
      return h(eu.ayP);
    if (paramString.equals("init"))
      return h(eu.azq);
    if (paramString.equals("init"))
      return h(eu.azq);
    if (paramString.equals("tackle"))
      return h(eu.ayQ);
    if (paramString.equals("dodge"))
      return h(eu.ayR);
    if (paramString.equals("tackle"))
      return h(eu.ayQ);
    if (paramString.equals("dmgFirePercent"))
      return g(eu.azd);
    if (paramString.equals("dmgEarthPercent"))
      return g(eu.azf);
    if (paramString.equals("dmgWaterPercent"))
      return g(eu.aze);
    if (paramString.equals("dmgWindPercent"))
      return g(eu.azg);
    if (paramString.equals("resEarthPercent"))
      return g(eu.azm);
    if (paramString.equals("resFirePercent"))
      return g(eu.azk);
    if (paramString.equals("resWaterPercent"))
      return g(eu.azl);
    if (paramString.equals("resWindPercent"))
      return g(eu.azn);
    if (paramString.equals("resWindPercent"))
      return g(eu.azn);
    if (paramString.equals("debuffApVisible")) {
      localObject1 = h(eu.azA);
      localObject2 = h(eu.azy);
      return Boolean.valueOf((localObject1 != null) && (localObject2 != null) && (((Integer)localObject1).intValue() != 0) && (((Integer)localObject2).intValue() != 0));
    }if (paramString.equals("debuffMpVisible")) {
      localObject1 = h(eu.azB);
      localObject2 = h(eu.azx);
      return Boolean.valueOf((localObject1 != null) && (localObject2 != null) && (((Integer)localObject1).intValue() != 0) && (((Integer)localObject2).intValue() != 0));
    }if (paramString.equals("buffApPercent"))
      return g(eu.azA);
    if (paramString.equals("buffMpPercent"))
      return g(eu.azB);
    if (paramString.equals("resApPercent"))
      return g(eu.azy);
    if (paramString.equals("resMpPercent")) {
      return g(eu.azx);
    }
    if (paramString.equals("tackleIcon"))
      return ay.bd().B(4);
    if (paramString.equals("dodgeIcon")) {
      return ay.bd().B(3);
    }
    if (paramString.equals("actorDescriptorLibrary")) {
      return aAT();
    }
    if (paramString.equals("actorStandardScale")) {
      int i = (short)cMn.cFp().dP(Rw()).bY();
      float f = aAT().aty().getScale();
      return Float.valueOf(6.0F / Math.max(i, 6.0F) * 1.4F * f);
    }

    if (paramString.equals("canBeRenamed")) {
      return Boolean.valueOf(bdE());
    }
    if (paramString.equals("leaderShipCost")) {
      return Integer.valueOf(cMn.cFp().dP(Rw()).anj());
    }
    return null;
  }

  private boolean bdB() {
    byz localbyz = byv.bFN().bFO();
    return localbyz.afe();
  }

  private boolean bdC() {
    byz localbyz = byv.bFN().bFO();
    int i = localbyz.nU() + localbyz.e(eu.ayV) * localbyz.e(eu.aAn);

    return localbyz.e(this) <= i;
  }

  public boolean bdD() {
    return nU() == cqF();
  }

  public boolean bdE() {
    return nU() == cqF();
  }

  private bVf aAT()
  {
    bVf localbVf = new bVf(dsE.cYX(), 0.0F, 0.0F, 0.0F);

    int i = cMn.cFp().dP(Rw()).ajB();
    try {
      localbVf.b(String.format(ay.bd().getString("npcGfxPath"), new Object[] { Integer.valueOf(i) }), true);
    } catch (IOException localIOException) {
      K.error("", localIOException);
      return null;
    } catch (bdh localbdh) {
      K.error("", localbdh);
      return null;
    }
    localbVf.em(String.valueOf(i));
    localbVf.c(CG.bFH);
    localbVf.eq("AnimStatique");

    return localbVf;
  }

  public String g(eu parameu) {
    Object localObject = h(parameu);
    return bPe.f(localObject == null ? 0 : ((Integer)localObject).intValue(), -1, true);
  }

  public Object h(eu parameu) {
    bdi localbdi = cMn.cFp().dP(Rw());
    if (localbdi == null) {
      return null;
    }
    float f1 = 1.0F;
    float f2 = 1.0F;
    apX localapX = (apX)byv.bFN().bFO().auK().hh(787);
    if (localapX == null)
      return null;
    Iterator localIterator = localapX.iterator();
    while (localIterator.hasNext()) {
      dpI localdpI = (dpI)localIterator.next();
      if (localdpI.eo() == bsj.fSv.getId()) {
        f1 = localdpI.o(0, localapX.nU()) / 100.0F;
        f2 = localdpI.o(1, localapX.nU()) / 100.0F;
        break;
      }
    }

    return Integer.valueOf(deI.kYD.a(parameu, nU(), localbdi.dhn(), f1, f2));
  }

  public boolean l(String paramString) {
    if (paramString.equals("name")) {
      return true;
    }
    return false;
  }

  public void b(String paramString, Object paramObject) {
  }

  public void a(String paramString, Object paramObject) {
    if (paramString.equals("name"))
      setName(paramObject.toString());
  }

  public void ej(long paramLong)
  {
    super.ej(paramLong);
    dLE.doY().a(this, new String[] { "isAvailable" });
  }

  public void setName(String paramString) {
    super.setName(paramString);

    dLE.doY().a(this, new String[] { "name" });
  }

  public void dG(boolean paramBoolean) {
    this.erS = paramBoolean;

    dLE.doY().a(this, new String[] { "isAvailable" });
  }

  public String getShortDescription() {
    return getName();
  }

  public boolean bdF() {
    return true;
  }
}