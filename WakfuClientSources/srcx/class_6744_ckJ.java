import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ckJ extends azx
{
  public static final String bC = "name";
  public static final String RH = "iconUrl";
  public static final String dmh = "isCompleted";
  public static final String hLZ = "isFollowable";
  public static final String ceY = "isActivated";
  public static final String hMa = "isFollowed";
  public static final String dmg = "progressionText";
  public static final String hMb = "progressionValue";
  public static final String hMc = "goals";
  public static final String hMd = "remainingGoals";
  public static final String hMe = "hasBaseRewards";
  public static final String bke = "rewards";
  public static final String hMf = "xpReward";
  public static final String hMg = "aptitudeReward";
  public static final String hMh = "textRewards";
  public static final String hMi = "visualRewards";
  public static final String hMj = "stateColor";
  public static final String hMk = "isQuest";
  public static final String hMl = "isShareable";
  public static final String Ac = "duration";
  public static final String hMm = "recommandedLevel";
  public static final String hMn = "recommandedPlayers";
  public static final String dQQ = "remainingTime";
  public static final String hMo = "cooldown";
  public static final String hMp = "isRunning";
  public static final String hMq = "canReset";
  public static final String[] bF = { "name", "iconUrl", "isCompleted", "isFollowed", "isActivated", "progressionText", "progressionValue", "backgroundText", "goals", "rewards", "textRewards", "stateColor", "remainingGoals", "isQuest" };
  private final int aPh;
  private final int aSg;
  private final int hMr;
  public static final cds hMs = new kb(10, 0, 0, 0);

  public ckJ(int paramInt1, int paramInt2, int paramInt3)
  {
    this.aPh = paramInt1;
    this.hMr = paramInt2;
    this.aSg = paramInt3;
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("isCompleted"))
      return Boolean.valueOf(byv.bFN().bFO().bGa().md(this.aPh));
    if (paramString.equals("isActivated"))
      return Boolean.valueOf(isActive());
    if (paramString.equals("isFollowed"))
      return Boolean.valueOf(anv());
    if (paramString.equals("progressionText"))
      return cmx() + "/" + cmw();
    if (paramString.equals("progressionValue"))
      return Float.valueOf(cmx() / cmw());
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (paramString.equals("remainingGoals")) {
      localObject1 = new ArrayList();
      localObject2 = byv.bFN().bFO().bGa().sq(this.aPh);
      for (localObject3 = ((dEE)localObject2).dgh().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (aiJ)((Iterator)localObject3).next();
        if ((((aiJ)localObject4).avy()) && (!((aiJ)localObject4).Q())) {
          D localD = cHT.iDr.xP(((aiJ)localObject4).getId());
          ((Collection)localObject1).add(localD);
        }
      }
      return localObject1;
    }if (paramString.equals("aptitudeReward")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      for (localObject2 = ((dEE)localObject1).cfd().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (acg)((Iterator)localObject2).next();
        if (((acg)localObject3).aos() == bSa.hca) {
          return new cLu((acg)localObject3);
        }
      }
      return null;
    }if (paramString.equals("xpReward")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      for (localObject2 = ((dEE)localObject1).cfd().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (acg)((Iterator)localObject2).next();
        if (((acg)localObject3).aos() == bSa.hbZ) {
          return new cLu((acg)localObject3);
        }
      }
      return null;
    }if (paramString.equals("textRewards")) {
      localObject1 = new ArrayList();
      localObject2 = byv.bFN().bFO().bGa().sq(this.aPh);
      for (localObject3 = ((dEE)localObject2).cfd().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (acg)((Iterator)localObject3).next();
        if ((((acg)localObject4).aos().bYT()) && (((acg)localObject4).aos() != bSa.hbZ) && (((acg)localObject4).aos() != bSa.hca))
        {
          ((Collection)localObject1).add(new cLu((acg)localObject4));
        }
      }
      return localObject1;
    }if (paramString.equals("visualRewards")) {
      localObject1 = new ArrayList();
      localObject2 = byv.bFN().bFO().bGa().sq(this.aPh);
      for (localObject3 = ((dEE)localObject2).cfd().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (acg)((Iterator)localObject3).next();
        if (!((acg)localObject4).aos().bYT()) {
          ((Collection)localObject1).add(new cLu((acg)localObject4));
        }
      }
      return localObject1;
    }if (paramString.equals("rewards")) {
      localObject1 = new ArrayList();
      localObject2 = byv.bFN().bFO().bGa().sq(this.aPh);
      for (localObject3 = ((dEE)localObject2).cfd().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (acg)((Iterator)localObject3).next();
        ((Collection)localObject1).add(new cLu((acg)localObject4));
      }
      return localObject1;
    }if (paramString.equals("hasBaseRewards")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      for (localObject2 = ((dEE)localObject1).cfd().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (acg)((Iterator)localObject2).next();
        if ((!((acg)localObject3).aos().bYT()) || ((((acg)localObject3).aos() != bSa.hbZ) && (((acg)localObject3).aos() != bSa.hca)))
        {
          return Boolean.valueOf(true);
        }
      }
      return Boolean.valueOf(false);
    }if (paramString.equals("stateColor")) {
      localObject1 = byv.bFN().bFO().bGa();
      if (((bCP)localObject1).md(this.aPh))
        return new bNa(0.3F, 0.9F, 0.2F, 1.0F);
      if (((bCP)localObject1).mc(this.aPh)) {
        return bNa.gRx;
      }
      return bNa.gRz;
    }
    if (paramString.equals("isQuest"))
      return Boolean.valueOf(cHT.iDr.xT(this.aPh));
    if (paramString.equals("duration")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      if (((dEE)localObject1).getDuration() <= 0) {
        return null;
      }

      localObject2 = kb.I(((dEE)localObject1).getDuration() / 1000);
      return bU.fH().getString("duration") + bXW.m((cds)localObject2);
    }
    if (paramString.equals("isShareable")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      boolean bool = bbK.a((CS)localObject1, dDE.dft().VN());
      return Boolean.valueOf((((dEE)localObject1).dgk()) && (bool) && (!((dEE)localObject1).isComplete()));
    }if (paramString.equals("recommandedPlayers")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      return Integer.valueOf(((dEE)localObject1).dgn());
    }if (paramString.equals("recommandedLevel")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      return bU.fH().getString("levelShort.custom", new Object[] { Integer.valueOf(((dEE)localObject1).dgm()) });
    }if (paramString.equals("isFollowable")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      return Boolean.valueOf(((dEE)localObject1).dgj());
    }if (paramString.equals("canReset"))
      return Boolean.valueOf(byv.bFN().bFO().bGa().mk(this.aPh));
    if (paramString.equals("isRunning"))
      return Boolean.valueOf(byv.bFN().bFO().bGa().mg(this.aPh));
    if (paramString.equals("cooldown")) {
      localObject1 = byv.bFN().bFO().bGa().sq(this.aPh);
      if (!((dEE)localObject1).isComplete())
        return null;
      cds localcds;
      if ((((dEE)localObject1).bnb() != 0L) && (((dEE)localObject1).LZ() != 0L))
        localcds = bbK.g((CS)localObject1, dDE.dft().VN());
      else if (((dEE)localObject1).bnd() != null)
        localcds = bbK.a((aXM)localObject1, dDE.dft().VN());
      else {
        localcds = cds.hwQ;
      }

      if (!localcds.rN()) {
        return null;
      }

      return bXW.l(localcds);
    }
    return super.getFieldValue(paramString);
  }

  protected String aLh()
  {
    return bU.fH().b(63, this.aPh, new Object[0]);
  }

  protected String getName()
  {
    return bU.fH().b(62, this.aPh, new Object[0]);
  }

  protected String fJ()
  {
    return ay.bd().J(this.aSg);
  }

  public int getType()
  {
    return 1;
  }

  protected String aLi()
  {
    dEE localdEE = byv.bFN().bFO().bGa().sq(this.aPh);
    if ((!localdEE.isActive()) || (localdEE.getStartTime() == 0L))
      return null;
    cds localcds;
    if (localdEE.getDuration() != 0)
      localcds = bbK.h(localdEE, dDE.dft().VN());
    else if (localdEE.bnd() != null)
      localcds = bbK.i(localdEE, dDE.dft().VN());
    else {
      localcds = cds.hwQ;
    }

    if (!localcds.rN()) {
      return null;
    }

    return bXW.l(localcds);
  }

  protected ArrayList aLj()
  {
    ArrayList localArrayList = new ArrayList();
    dEE localdEE = byv.bFN().bFO().bGa().sq(this.aPh);
    for (aiJ localaiJ : localdEE.dgh()) {
      if (localaiJ.avy()) {
        D localD = cHT.iDr.xP(localaiJ.getId());
        localArrayList.add(localD);
      }
    }
    return localArrayList;
  }

  protected String aLk()
  {
    return null;
  }

  protected String getStyle() {
    return null;
  }

  public boolean anv() {
    return byv.bFN().bFO().bGa().mj(this.aPh);
  }

  public boolean cmv() {
    return byv.bFN().bFO().bGa().sq(this.aPh).isVisible();
  }

  public boolean isVisible() {
    return byv.bFN().bFO().bGa().a(this.aPh, byv.bFN().bFO());
  }

  public boolean isActive() {
    return byv.bFN().bFO().bGa().mc(this.aPh);
  }

  private int cmw() {
    ArrayList localArrayList = byv.bFN().bFO().bGa().sq(this.aPh).dgh();
    int i = 0;
    for (aiJ localaiJ : localArrayList) {
      if (localaiJ.avy()) {
        i++;
      }
    }
    return i;
  }

  private int cmx() {
    int i = 0;
    bCP localbCP = byv.bFN().bFO().bGa();
    for (aiJ localaiJ : localbCP.sq(this.aPh).dgh()) {
      if ((localaiJ.avy()) && ((!localbCP.lZ(localaiJ.getId())) || (localbCP.ma(localaiJ.getId())))) {
        i++;
      }
    }
    return i;
  }

  public int getId() {
    return this.aPh;
  }

  public int cmy() {
    return this.hMr;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ckJ)) {
      return false;
    }
    return this.aPh == ((ckJ)paramObject).aPh;
  }

  public void cmz() {
    dLE.doY().a(this, new String[] { "isFollowed" });
  }

  public void cmA() {
    dLE.doY().a(this, new String[] { "progressionText", "progressionValue", "remainingGoals" });
  }

  public void cmB()
  {
    dLE.doY().a(this, new String[] { "isActivated", "isCompleted", "isRunning", "canReset" });
  }

  public void cmC()
  {
    bCP localbCP = byv.bFN().bFO().bGa();
    dEE localdEE = localbCP.sq(this.aPh);
    if ((!localbCP.md(this.aPh)) && (localdEE.isActive()) && (localdEE.bnd() != null)) {
      cds localcds = bbK.i(localdEE, dDE.dft().VN());
      if (localcds.c(hMs)) {
        localbCP.u(localdEE.getId(), false);
        if (localbCP.mj(localdEE.getId())) {
          Zq localZq = new Zq(localdEE.getId(), false);
          byv.bFN().aJK().d(localZq);
        }
      }
    }

    dLE.doY().a(this, new String[] { "remainingTime", "cooldown" });
  }
}