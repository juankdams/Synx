import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.List;

final class cxY extends dcW
{
  private Su ddR;

  private String aPS()
  {
    dqU localdqU = vC.Ew();

    if (localdqU == null) {
      return null;
    }

    lZ locallZ = new lZ();

    boolean bool = Ev();
    if (bool) {
      locallZ.tI().am(bNa.gRz.bUV());
      locallZ.a("\n").a(bU.fH().getString("desc.mru.illegalAction"));
      locallZ.tJ();
    }

    List localList1 = Ex();
    if ((localdqU == dqU.ltr) && (localList1.size() > 0)) {
      locallZ.tH().tI().am(vC.ics);
      locallZ.tz().a(bU.fH().getString("nation.law.mru.good")).tA();
      locallZ.tJ();
      vC.a(locallZ, localList1, vC.ics, bool);
    }
    List localList2 = Ez();
    if (localList2.size() > 0) {
      locallZ.tH().tI().am(vC.ict);
      locallZ.tz().a(bU.fH().getString("nation.law.mru.bad")).tA();
      locallZ.tJ();
      vC.a(locallZ, localList2, vC.ict, bool);
    }
    List localList3 = Ey();
    if ((localdqU == dqU.ltr) && (localList3.size() > 0)) {
      locallZ.tH().tI().am("9ed34b");
      locallZ.tz().a(bU.fH().getString("nation.law.mru.probablyGood")).tA();
      locallZ.tJ();
      vC.a(locallZ, localList3, "9ed34b", bool);
    }
    List localList4 = EA();
    if (localList4.size() > 0) {
      locallZ.tH().tI().am("f48140");
      locallZ.tz().a(bU.fH().getString("nation.law.mru.probablyBad")).tA();
      locallZ.tJ();
      vC.a(locallZ, localList4, "f48140", bool);
    }
    return locallZ.length() > 0 ? locallZ.tP() : null;
  }

  private boolean Ev() {
    if (vC.Ew() != dqU.ltq) {
      return false;
    }
    List localList = Ez();
    return !localList.isEmpty();
  }

  private List Ex() {
    return dWf.T(EB());
  }

  private List Ey() {
    return dWf.T(EC());
  }

  private List Ez() {
    return dWf.U(EB());
  }

  private List EA() {
    return dWf.U(EC());
  }

  private List EB() {
    byz localbyz = byv.bFN().bFO();

    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    ArrayList localArrayList3 = new ArrayList();

    localArrayList2.add(localbyz);
    localArrayList1.add(this.ddR);

    En localEn = new En(localbyz, dTw.mqi, localbyz, this.ddR, null, localArrayList1);
    bkt localbkt = new bkt(localbyz, dTw.mqi, this.ddR, localbyz, localArrayList2);

    bcX localbcX = new bcX(localbyz, true);
    localArrayList3.addAll(localbcX.bDr());

    localbcX = new bcX(localbyz, false);
    localArrayList3.addAll(localbcX.bDr());

    localArrayList3.addAll(localEn.bDr());
    localArrayList3.addAll(localbkt.bDr());

    return localArrayList3;
  }

  private List EC() {
    byz localbyz = byv.bFN().bFO();

    ArrayList localArrayList = new ArrayList();

    bbb localbbb = new bbb(localbyz, this.ddR, (byte)0, (byte)1, dTw.mqi);
    localArrayList.addAll(localbbb.bDr());

    cxQ localcxQ = new cxQ(localbyz, dTw.mqi, localbyz);
    bbY localbbY = new bbY(localbyz, dTw.mqi);

    localArrayList.addAll(localcxQ.bDr());
    localArrayList.addAll(localbbY.bDr());
    return localArrayList;
  }

  public boolean a(ta paramta) {
    long l = paramta.AD();
    Su localSu = CA.Lv().bj(l);

    if (localSu == null) {
      r(l, false);
      return false;
    }
    this.ddR = localSu;
    String str1 = localSu.getName();

    if (dmY.cUs().cUv().ky(l) != null) {
      r(l, false);
      return false;
    }

    String str2 = aPS();
    String str3 = bU.fH().getString("fight.invitation.dialog", new Object[] { str1 });
    if (str2 != null) {
      str3 = str3 + "\n" + str2;
    }
    cKX localcKX = cBQ.cxL().a(str3, Cn.et(6), 2073L, 102, 1);

    localcKX.a(new bKr(this, l));

    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<text color=\"").append(cPU.kAA).append("\">");
    localStringBuilder.append(bU.fH().getString("fight.invitation.dialog", new Object[] { str1 }));
    localStringBuilder.append("</text>");
    aEe localaEe = new aEe(localStringBuilder.toString());
    localaEe.mm(4);
    CM.LV().a(localaEe);

    return false;
  }

  private void r(long paramLong, boolean paramBoolean) {
    cNw localcNw = new cNw();

    if (paramBoolean) {
      Su localSu = CA.Lv().bj(paramLong);

      if (localSu == null)
        localcNw.iB(false);
      else
        localcNw.iB(paramBoolean);
    }
    else {
      localcNw.iB(false);
    }
    localcNw.setLocked(WakfuClientInstance.awy().awB().a(bmz.fEy));
    localcNw.j(paramLong);
    byv.bFN().aJK().d(localcNw);
  }
}