import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aTd
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aTd.class);

  private static aTd eQw = new aTd();

  public static aTd biu()
  {
    return eQw;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    long l1;
    Object localObject4;
    CM localCM;
    switch (paramcWG.getId())
    {
    case 3140:
      localObject1 = (dcp)paramcWG;

      localObject2 = ((dcp)localObject1).Xc();

      if (dmY.cUs().cUv().py((String)localObject2) != null) {
        return false;
      }
      localObject3 = new aEe((String)localObject2, ((dcp)localObject1).Xd());
      localObject5 = ((dcp)localObject1).aKB();
      int i = 1;

      int j = -1;
      if ("admin_channel".equals(localObject5)) {
        j = 10;
        i = 0;
      } else if ("all_channel".equals(localObject5)) {
        j = 11;
        i = 0;
      } else if ((localObject5 != null) && (((String)localObject5).startsWith("guild_"))) {
        j = 6;
        i = 0;
      }
      ((aEe)localObject3).mm(j);
      aYD.g((aEe)localObject3);
      if (((aEe)localObject3).getMessage().length() == 0) {
        return false;
      }
      if (i != 0)
        CM.LV().a((aEe)localObject3, (String)localObject5);
      else {
        CM.LV().a((aEe)localObject3);
      }

      return false;
    case 3156:
      localObject1 = (bXE)paramcWG;

      localObject2 = new dbV(((bXE)localObject1).aJm(), ((bXE)localObject1).ccV(), true, ((bXE)localObject1).ccW(), true, ((bXE)localObject1).ccX(), ((bXE)localObject1).ccY(), "", ((bXE)localObject1).ccZ());
      dmY.cUs().a((short)1, (dbV)localObject2);
      localObject3 = new lZ();
      dju.a((lZ)localObject3, "characterName_" + ((bXE)localObject1).ccW(), ((bXE)localObject1).aJm());

      localObject5 = bU.fH().getString("chat.notify.addFriend", new Object[] { ((lZ)localObject3).tP(), ((bXE)localObject1).ccV() });
      localObject6 = new aEe((String)localObject5);
      ((aEe)localObject6).mm(4);
      CM.LV().a((aEe)localObject6);

      return false;
    case 3160:
      localObject1 = (dNU)paramcWG;

      if (!dmY.cUs().a((short)1, ((dNU)localObject1).ccV())) {
        localObject2 = bU.fH().getString("error.chat.userNotFound", new Object[] { ((dNU)localObject1).ccV() });
        localObject3 = new aEe((String)localObject2);
        ((aEe)localObject3).mm(3);
        CM.LV().a((aEe)localObject3);
      } else {
        localObject2 = bU.fH().getString("chat.notify.removeFriend", new Object[] { ((dNU)localObject1).ccV() });
        localObject3 = new aEe((String)localObject2);
        ((aEe)localObject3).mm(4);
        CM.LV().a((aEe)localObject3);
      }

      return false;
    case 3148:
      localObject1 = (dgq)paramcWG;

      localObject2 = dmY.cUs().cUu();
      if (localObject2 != null) {
        localObject3 = ((dEh)localObject2).ky(((dgq)localObject1).aFL());
        if (localObject3 == null)
          localObject3 = ((dEh)localObject2).px(((dgq)localObject1).ccV());
        if (localObject3 != null)
        {
          ((dbV)localObject3).cf(((dgq)localObject1).aJm());
          ((dbV)localObject3).G(true);
          ((dbV)localObject3).a(((dgq)localObject1).aFL());
          ((dbV)localObject3).oP(((dgq)localObject1).cPP());
          ((dbV)localObject3).F(((dgq)localObject1).uO());
          ((dbV)localObject3).cO(((dgq)localObject1).xK());
          ((dbV)localObject3).aM(((dgq)localObject1).ayX());
          if (((dbV)localObject3).cNB()) {
            localObject5 = new lZ();
            dju.a((lZ)localObject5, "characterName_" + ((dgq)localObject1).aFL(), ((dgq)localObject1).aJm());

            localObject6 = bU.fH().getString("chat.notify.friendOnline", new Object[] { ((lZ)localObject5).tP(), ((dgq)localObject1).ccV() });
            localObject7 = new aEe((String)localObject6);
            ((aEe)localObject7).mm(4);
            CM.LV().a((aEe)localObject7);
          }
        } else {
          K.error("Ami inconnu " + ((dgq)localObject1).ccV());
          localObject5 = bU.fH().getString("error.chat.userNotFound", new Object[] { ((dgq)localObject1).ccV() });
          localObject6 = new aEe((String)localObject5);
          ((aEe)localObject6).mm(3);
          CM.LV().a((aEe)localObject6);
          return false;
        }
        ((dbV)localObject3).bot();
      }
      return false;
    case 3150:
      localObject1 = (cWn)paramcWG;

      localObject2 = dmY.cUs().cUu();
      if (localObject2 != null) {
        localObject3 = ((dEh)localObject2).ky(((cWn)localObject1).aFL());
        if (localObject3 == null)
          localObject3 = ((dEh)localObject2).px(((cWn)localObject1).ccV());
        if (localObject3 != null) {
          ((dbV)localObject3).a(((cWn)localObject1).aFL());
          ((dbV)localObject3).cf("");
          ((dbV)localObject3).G(false);
          ((dbV)localObject3).F((short)-1);
          ((dbV)localObject3).aM(-1L);

          if (((dbV)localObject3).cNB()) {
            localObject5 = bU.fH().getString("chat.notify.friendOffline", new Object[] { ((cWn)localObject1).aJm(), ((cWn)localObject1).ccV() });
            localObject6 = new aEe((String)localObject5);
            ((aEe)localObject6).mm(4);
            CM.LV().a((aEe)localObject6);
          }
          dLE.doY().a((dBv)localObject3, ((dbV)localObject3).getFields());
          dLE.doY().a((dBv)localObject2, new String[] { "contentList" });
        } else {
          K.error("Ami inconnu " + ((cWn)localObject1).ccV());
        }
      }

      return false;
    case 3144:
      localObject1 = (bpc)paramcWG;

      localObject2 = new ArrayList();
      for (localObject3 = ((bpc)localObject1).byG().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject5 = (ayb)((Iterator)localObject3).next();
        ((ArrayList)localObject2).add(new dbV(((ayb)localObject5).dNE, ((ayb)localObject5).name, ((ayb)localObject5).bIa != -1L, ((ayb)localObject5).bIa, ((ayb)localObject5).dNG, ((ayb)localObject5).bWC, ((ayb)localObject5).bUn, ((ayb)localObject5).dNF, ((ayb)localObject5).aGh));
      }

      dmY.cUs().a((short)1, (Iterable)localObject2);

      return false;
    case 3158:
      localObject1 = (bUi)paramcWG;

      localObject2 = new dbV(((bUi)localObject1).cal(), ((bUi)localObject1).aFJ(), ((bUi)localObject1).aJm());
      dmY.cUs().a((short)2, (dbV)localObject2);

      localObject3 = bU.fH().getString("chat.notify.addIgnore", new Object[] { ((bUi)localObject1).aJm(), ((bUi)localObject1).aFJ() });
      localObject5 = new aEe((String)localObject3);
      ((aEe)localObject5).mm(4);
      CM.LV().a((aEe)localObject5);

      return false;
    case 3162:
      localObject1 = (dBs)paramcWG;

      if (!dmY.cUs().a((short)2, ((dBs)localObject1).aFJ())) {
        localObject2 = bU.fH().getString("error.chat.userNotFound", new Object[] { ((dBs)localObject1).aFJ() });
        localObject3 = new aEe((String)localObject2);
        ((aEe)localObject3).mm(3);
        CM.LV().a((aEe)localObject3);
      } else {
        localObject2 = bU.fH().getString("chat.notify.removeIgnore", new Object[] { ((dBs)localObject1).aFJ() });
        localObject3 = new aEe((String)localObject2);
        ((aEe)localObject3).mm(4);
        CM.LV().a((aEe)localObject3);
      }

      return false;
    case 3164:
      localObject1 = (atw)paramcWG;

      localObject2 = dmY.cUs().cUu();
      if (localObject2 != null) {
        localObject3 = ((dEh)localObject2).ky(((atw)localObject1).aFL());
        if (localObject3 == null)
          localObject3 = ((dEh)localObject2).px(((atw)localObject1).aFJ());
        if (localObject3 != null) {
          ((dbV)localObject3).cf(((atw)localObject1).aFK());
          ((dbV)localObject3).G(true);
          ((dbV)localObject3).a(((atw)localObject1).aFL());
        } else {
          K.error("Ignoré inconnu " + ((atw)localObject1).aFJ());
        }
      }

      return false;
    case 3166:
      localObject1 = (dkG)paramcWG;

      localObject2 = dmY.cUs().cUu();
      if (localObject2 != null) {
        localObject3 = ((dEh)localObject2).ky(((dkG)localObject1).aFL());
        if (localObject3 == null)
          localObject3 = ((dEh)localObject2).px(((dkG)localObject1).aFJ());
        if (localObject3 != null) {
          ((axJ)localObject3).a(((dkG)localObject1).aFL());
          ((axJ)localObject3).G(false);
        } else {
          K.error("Ignoré inconnu " + ((dkG)localObject1).aFJ());
        }
      }

      return false;
    case 3146:
      localObject1 = (adv)paramcWG;

      localObject2 = new ArrayList();
      for (localObject3 = ((adv)localObject1).apt().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject5 = (Cs)((Iterator)localObject3).next();
        localObject6 = (String)((Cs)localObject5).Lp();
        ((ArrayList)localObject2).add(new dbV(((Long)((Cs)localObject5).getFirst()).longValue(), (String)localObject6, (String)localObject6));
      }

      dmY.cUs().a((short)2, (Iterable)localObject2);

      return false;
    case 3154:
      localObject1 = (bux)paramcWG;

      localObject2 = ((bux)localObject1).Xc();

      if (dmY.cUs().cUv().py((String)localObject2) != null) {
        return false;
      }

      localObject3 = new aEe(((bux)localObject1).Xc(), ((bux)localObject1).Xb(), ((bux)localObject1).Xd());
      ((aEe)localObject3).mm(2);

      aYD.g((aEe)localObject3);
      if (((aEe)localObject3).getMessage().length() == 0) {
        return false;
      }
      CM.LV().a((aEe)localObject3, (String)localObject2);
      CM.LV().by((String)localObject2);

      biw();

      return false;
    case 3152:
      localObject1 = (bBI)paramcWG;

      localObject2 = ((bBI)localObject1).Xc();
      if (dmY.cUs().cUv().py((String)localObject2) != null) {
        return false;
      }

      l1 = ((bBI)localObject1).Xb();
      if (((String)localObject2).equals("")) {
        localObject6 = CA.Lv().bj(l1);
        if (localObject6 != null)
          localObject2 = ((Su)localObject6).getName();
        else {
          localObject2 = "UNDEFFINED";
        }
      }

      localObject6 = new aEe((String)localObject2, l1, ((bBI)localObject1).Xd());
      ((aEe)localObject6).mm(1);

      aYD.g((aEe)localObject6);
      if (((aEe)localObject6).getMessage().length() == 0) {
        return false;
      }
      CM.LV().a((aEe)localObject6);

      if (((bBI)localObject1).Xd().toUpperCase().contains(byv.bFN().bFO().getName().toUpperCase())) {
        biw();
      }

      return false;
    case 3168:
      localObject1 = (czh)paramcWG;

      if (dmY.cUs().cUv().py(((czh)localObject1).Xc()) != null) {
        return false;
      }

      localObject2 = ((czh)localObject1).Xc();
      l1 = ((czh)localObject1).Xb();
      if (((String)localObject2).equals("")) {
        localObject6 = CA.Lv().bj(l1);
        if (localObject6 != null)
          localObject2 = ((Su)localObject6).getName();
        else {
          localObject2 = "UNDEFFINED";
        }
      }

      localObject6 = new aEe((String)localObject2, l1, ((czh)localObject1).Xd());
      ((aEe)localObject6).mm(7);

      aYD.g((aEe)localObject6);
      if (((aEe)localObject6).getMessage().length() == 0) {
        return false;
      }
      CM.LV().a((aEe)localObject6);

      return false;
    case 3176:
      localObject1 = (aBT)paramcWG;

      if (dmY.cUs().cUv().py(((aBT)localObject1).Xc()) != null) {
        return false;
      }

      localObject2 = ((aBT)localObject1).Xc();
      l1 = ((aBT)localObject1).Xb();
      if (((String)localObject2).equals("")) {
        localObject6 = CA.Lv().bj(l1);
        if (localObject6 != null)
          localObject2 = ((Su)localObject6).getName();
        else {
          localObject2 = "UNDEFFINED";
        }
      }

      localObject6 = new aEe((String)localObject2, l1, ((aBT)localObject1).Xd());
      ((aEe)localObject6).mm(12);

      aYD.g((aEe)localObject6);
      if (((aEe)localObject6).getMessage().length() == 0) {
        return false;
      }
      CM.LV().a((aEe)localObject6);

      return false;
    case 3174:
      localObject1 = (aJt)paramcWG;

      if (dmY.cUs().cUv().py(((aJt)localObject1).Xc()) != null) {
        return false;
      }

      localObject2 = ((aJt)localObject1).Xc();
      l1 = ((aJt)localObject1).Xb();
      if (((String)localObject2).equals("")) {
        localObject6 = CA.Lv().bj(l1);
        if (localObject6 != null)
          localObject2 = ((Su)localObject6).getName();
        else {
          localObject2 = "UNDEFFINED";
        }
      }

      localObject6 = new aEe((String)localObject2, l1, ((aJt)localObject1).Xd());
      ((aEe)localObject6).mm(8);

      aYD.g((aEe)localObject6);
      if (((aEe)localObject6).getMessage().length() == 0) {
        return false;
      }
      CM.LV().a((aEe)localObject6);

      biv();

      return false;
    case 3170:
      localObject1 = (aBx)paramcWG;
      localObject2 = ((aBx)localObject1).Xc();

      if (dmY.cUs().cUv().py((String)localObject2) != null) {
        return false;
      }

      localObject4 = ((aBx)localObject1).Xc();
      long l2 = ((aBx)localObject1).Xb();
      if (((String)localObject4).equals("")) {
        localObject7 = CA.Lv().bj(l2);
        if (localObject7 != null)
          localObject4 = ((Su)localObject7).getName();
        else {
          localObject4 = "UNDEFFINED";
        }
      }

      localObject7 = new aEe((String)localObject4, l2, ((aBx)localObject1).Xd());
      ((aEe)localObject7).mm(9);

      aYD.g((aEe)localObject7);
      if (((aEe)localObject7).getMessage().length() == 0) {
        return false;
      }
      CM.LV().a((aEe)localObject7);

      return false;
    case 3172:
      localObject1 = (Sb)paramcWG;
      localObject2 = ((Sb)localObject1).Xc();

      if (dmY.cUs().cUv().py((String)localObject2) != null) {
        return false;
      }

      localObject4 = new aEe(((Sb)localObject1).Xc(), ((Sb)localObject1).Xb(), ((Sb)localObject1).Xd());
      ((aEe)localObject4).mm(8);

      aYD.g((aEe)localObject4);
      if (((aEe)localObject4).getMessage().length() == 0) {
        return false;
      }
      CM.LV().a((aEe)localObject4);

      if (((Sb)localObject1).Xb() != byv.bFN().bFO().getId()) {
        biv();
      }

      return false;
    case 3202:
      localObject1 = (ayy)paramcWG;

      localObject2 = bU.fH().getString("error.chat.channelNotFound", new Object[] { ((ayy)localObject1).aKB() });

      localObject4 = new aEe((String)localObject2);
      ((aEe)localObject4).mm(3);

      CM.LV().a((aEe)localObject4);

      return false;
    case 3214:
      localObject1 = bU.fH().getString("error.chat.targetIsYourself");

      localObject2 = new aEe((String)localObject1);
      ((aEe)localObject2).mm(3);

      CM.LV().a((aEe)localObject2);

      return false;
    case 3204:
      localObject1 = (bMO)paramcWG;

      localObject2 = bU.fH().getString("error.chat.userNotFound", new Object[] { ((bMO)localObject1).getUserName() });

      localObject4 = new aEe((String)localObject2);
      ((aEe)localObject4).mm(3);

      localCM = CM.LV();
      localCM.a((aEe)localObject4);

      return false;
    case 3218:
      localObject1 = (bKA)paramcWG;

      localObject2 = bU.fH().getString("error.chat.userIgnoreYou", new Object[] { ((bKA)localObject1).getUserName() });

      localObject4 = new aEe((String)localObject2);
      ((aEe)localObject4).mm(3);

      localCM = CM.LV();
      localCM.a((aEe)localObject4);

      return false;
    case 3216:
      localObject1 = bU.fH().getString("error.chat.operationNotPermited");

      localObject2 = new aEe((String)localObject1);
      ((aEe)localObject2).mm(3);

      CM.LV().a((aEe)localObject2);

      return false;
    case 3141:
    case 3142:
    case 3143:
    case 3145:
    case 3147:
    case 3149:
    case 3151:
    case 3153:
    case 3155:
    case 3157:
    case 3159:
    case 3161:
    case 3163:
    case 3165:
    case 3167:
    case 3169:
    case 3171:
    case 3173:
    case 3175:
    case 3177:
    case 3178:
    case 3179:
    case 3180:
    case 3181:
    case 3182:
    case 3183:
    case 3184:
    case 3185:
    case 3186:
    case 3187:
    case 3188:
    case 3189:
    case 3190:
    case 3191:
    case 3192:
    case 3193:
    case 3194:
    case 3195:
    case 3196:
    case 3197:
    case 3198:
    case 3199:
    case 3200:
    case 3201:
    case 3203:
    case 3205:
    case 3206:
    case 3207:
    case 3208:
    case 3209:
    case 3210:
    case 3211:
    case 3212:
    case 3213:
    case 3215:
    case 3217: } return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  private void biv() {
    aWc.blo().eO(600109L);
  }

  private void biw() {
    aWc.blo().eO(600145L);
  }
}