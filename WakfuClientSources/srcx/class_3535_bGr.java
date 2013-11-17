import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class bGr extends cGj
{
  protected static final Logger K = Logger.getLogger(bGr.class);
  public static final String gCG = "members";
  public static final String gCH = "leader";
  public static final String gCI = "isLeader";
  public static final String gCJ = "availableSlotsCount";
  public static final String gCK = "partyFull";
  public static final String gCL = "localPlayerMember";
  public static final String gCM = "editableMember";
  public static final String[] bF = { "members", "leader", "isLeader", "availableSlotsCount", "partyFull", "localPlayerMember", "editableMember" };
  private Jl gCN;
  private aoL gCO = new aoL();
  private dUc gCP;
  private dUc gCQ;
  private dUc gCR;

  public bGr(Jl paramJl)
  {
    a(paramJl);
  }

  public void a(dUc paramdUc) {
    this.gCR = paramdUc;
  }

  public void a(Jl paramJl) {
    clear();
    this.gCN = paramJl;

    if (paramJl.Ta() != null) {
      cHu localcHu = paramJl.Ta().dbC();
      while (localcHu.hasNext()) {
        localcHu.fl();
        aay localaay = (aay)localcHu.value();

        dUc localdUc = new dUc(this, localaay, null);
        localdUc.dun();
        this.gCO.put(localaay.eq(), localdUc);
        if (localaay.eq() == byv.bFN().bFO().getId()) {
          this.gCQ = localdUc;
        }
        if (localaay.eq() == paramJl.Ta().Ph()) {
          this.gCP = localdUc;
        }

        if ((localdUc.anv()) && (localaay.Lk() != byv.bFN().bFO().Lk()))
        {
          n(localaay.eq(), false);
        }
      }
    }
  }

  public void clear() {
    cHu localcHu = this.gCO.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      ((dUc)localcHu.value()).duo();
    }
    this.gCO.clear();
    this.gCQ = null;
    this.gCP = null;
    this.gCR = null;
  }

  public void bH(long paramLong)
  {
    this.gCN.bH(paramLong);
    aay localaay = (aay)this.gCN.Ta().kp(paramLong);
    if (localaay == null) {
      K.error("impossible de retrouver le membre du groupe d'id : " + paramLong);
      return;
    }
    String str = paramLong == byv.bFN().bFO().getId() ? bU.fH().getString("group.party.memberDeletedSelf") : bU.fH().getString("group.party.memberDeleted", new Object[] { localaay.getName() });

    CM.LV().f(str, 4);
  }

  public void n(long paramLong, boolean paramBoolean)
  {
    if (paramLong < 0L) {
      K.error("on essai d'appliquer la boussole sur un membre invalide d'id : " + paramLong);
      return;
    }
    aay localaay = (aay)this.gCN.Ta().kp(paramLong);
    if (localaay == null) {
      K.error("impossible de retrouver le membre du groupe d'id : " + paramLong);
      return;
    }
    String str;
    if (paramBoolean) {
      if (localaay.Lk() != byv.bFN().bFO().Lk()) {
        cBQ.cxL().a(bU.fH().getString("error.group.memberTooFar"), Cn.et(1), 3L, 102, 1);

        dLE.doY().a((dBv)this.gCO.get(localaay.eq()), new String[] { "isFollowed" });
        return;
      }

      str = bU.fH().getString("group.party.memberFollowed", new Object[] { localaay.getName() });
      CM.LV().f(str, 4);
    } else {
      str = bU.fH().getString("group.party.stopFollowing", new Object[] { localaay.getName() });
      CM.LV().f(str, 4);
    }
    localaay.bK(paramBoolean);
    dLE.doY().a((dBv)this.gCO.get(localaay.eq()), new String[] { "isFollowed" });
  }

  public void jK(String paramString)
  {
    this.gCN.ch(paramString);
  }

  public dUc gE(long paramLong) {
    return (dUc)this.gCO.get(paramLong);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("members")) {
      Object[] arrayOfObject1 = this.gCO.getValues();
      ArrayList localArrayList = new ArrayList();
      for (Object localObject : arrayOfObject1) {
        localArrayList.add((dUc)localObject);
      }
      Collections.sort(localArrayList);
      return localArrayList.size() > 0 ? localArrayList : null;
    }if (paramString.equals("leader"))
      return this.gCP;
    if (paramString.equals("isLeader"))
      return Boolean.valueOf(this.gCP == this.gCQ);
    if (paramString.equals("availableSlotsCount")) {
      int i = 6 - this.gCO.size();
      return bU.fH().getString("partyList.availableSlots", new Object[] { Integer.valueOf(i) });
    }if (paramString.equals("partyFull"))
      return Boolean.valueOf(this.gCO.size() >= 6);
    if (paramString.equals("localPlayerMember"))
      return this.gCQ;
    if (paramString.equals("editableMember")) {
      return this.gCR;
    }
    return null;
  }
}