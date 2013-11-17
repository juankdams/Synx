import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dKD extends ahg
  implements dBv
{
  public static final String lYW = "uid";
  public static final String lYX = "rid";
  public static final String cKD = "smallIconUrl";
  public static final String aIE = "type";
  public static final String dwW = "usable";
  public static final String lYY = "backgroundTypeIcon";
  public static final String bsS = "quantity";
  public static final String lYZ = "cooldown";
  public static final String lZa = "particleFile";
  private byte dpP;
  public static final byte lZb = 0;
  public static final byte lZc = 1;
  public static final byte lZd = 2;
  public static final byte lZe = 3;
  public static final byte lZf = 4;
  public static final byte lZg = 5;
  private static final short[] lZh = { 0, 0, 1, 1, 0, 0 };

  public static final String[] bF = { "uid", "rid", "smallIconUrl", "type", "usable", "backgroundTypeIcon", "quantity" };

  private boolean dgA = true;

  private static final aee bx = new bOO(new aaB());

  private final bUP lZi = new bUP();

  public static dKD djz()
  {
    dKD localdKD;
    try
    {
      localdKD = (dKD)bx.Mm();
      localdKD.aOr = bx;
    } catch (Exception localException) {
      localdKD = new dKD();
      localdKD.aOr = null;
      localdKD.aJ();
      K.error("Erreur lors d'un checkOut sur un ShortCutItem : " + localException.getMessage());
    }
    return localdKD;
  }

  public static dKD b(bKq parambKq, long paramLong, int paramInt1, int paramInt2) {
    dKD localdKD = djz();
    localdKD.a(parambKq, paramLong, paramInt1, paramInt2);
    return localdKD;
  }

  public void release()
  {
    if (this.aOr != null) {
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.error("Exception dans le release de " + getClass().toString() + ". Normalement impossible");
      }
      this.aOr = null;
    } else {
      bc();
    }
  }

  public void c(String paramString, Object paramObject) {
  }

  public Object getFieldValue(String paramString) {
    byz localbyz1 = byv.bFN().bFO();

    if (paramString.equals("uid"))
      return Long.valueOf(oj());
    if (paramString.equals("rid"))
      return Integer.valueOf(ok());
    if (paramString.equals("type"))
      return asL();
    Object localObject1;
    if (paramString.equals("smallIconUrl")) {
      switch (aaz.cOV[asL().ordinal()]) {
      case 1:
        localObject1 = bmJ.fFu.qg(ok());
        if (localObject1 == null) {
          return null;
        }
        return ((cC)localObject1).fJ();
      case 2:
        return ay.bd().w(asM());
      case 3:
      case 4:
      case 5:
        return ay.bd().u(asM());
      }
      return null;
    }
    Object localObject2;
    Object localObject3;
    if (paramString.equals("usable")) {
      if (!this.dgA) {
        return Boolean.valueOf(this.dgA);
      }

      if (localbyz1.isDead())
        return Boolean.valueOf(false);
      Object localObject4;
      Object localObject5;
      Object localObject6;
      Object localObject7;
      switch (aaz.cOV[asL().ordinal()]) {
      case 1:
        return Boolean.valueOf(true);
      case 2:
        localObject1 = localbyz1.aeQ();
        if (localObject1 == null)
        {
          localObject2 = byv.bFN().bFO().bV(oj());
          if (((apX)localObject2).isLocked()) {
            return Boolean.valueOf(false);
          }
          return Boolean.valueOf(true);
        }

        localObject2 = cmI.cnw().boc();

        if ((localObject2 == null) || (((Su)localObject2).aeI()) || (((Su)localObject2).cQJ()) || (((Su)localObject2).adL() != localbyz1)) {
          localObject2 = localbyz1;
        }
        localObject3 = ((Su)localObject2).bV(oj());

        if (localObject3 != null) {
          if (!((dSR)((apX)localObject3).bsL()).vC()) {
            this.lZi.k((arl)localObject1);
            localObject4 = this.lZi.a((dhJ)localObject2, (bfE)localObject3, null, true);
            if (localObject4 == baf.fhx) {
              ((apX)localObject3).cH(true);
              return Boolean.valueOf(true);
            }
            if (localObject4 == baf.fhN) {
              ((apX)localObject3).cH(false);
              return Boolean.valueOf(false);
            }
            ((apX)localObject3).cH(true);
            return Boolean.valueOf(false);
          }

          localObject4 = (gA)localbyz1.ayJ().dB((short)((dSR)((apX)localObject3).bsL()).bIa());
          localObject5 = ((arl)localObject1).a((dhJ)localObject2, (gA)localObject4, (bfE)localObject3, null);
          if (localObject5 == baf.fhx) {
            ((apX)localObject3).cH(true);
            return Boolean.valueOf(true);
          }
          if (localObject5 == baf.fhN) {
            ((apX)localObject3).cH(false);
            return Boolean.valueOf(false);
          }
          ((apX)localObject3).cH(true);
          return Boolean.valueOf(false);
        }

        return Boolean.valueOf(false);
      case 3:
        localObject1 = localbyz1.aeQ();
        if (localObject1 == null) {
          return Boolean.valueOf(true);
        }

        if (ok() != 2145) {
          localObject4 = (gA)localbyz1.ayJ().dB((short)(int)-(oj() + 1L));
        } else {
          localObject5 = Hh.QM().dh(2145);
          localObject6 = new gA(-1L);
          ((gA)localObject6).b((bBn)localObject5);
          ((gA)localObject6).l((short)1);
          localObject4 = localObject6;
          localObject7 = cmI.cnw().boc();
          if (localObject7 == null) {
            return Boolean.valueOf(false);
          }
        }

        return Boolean.valueOf((localObject4 != null) && (((gA)localObject4).isActive()) && (((arl)localObject1).a(localbyz1, (gA)localObject4, null, true) == baf.fhx));
      case 5:
        localObject5 = Hh.QM().dh(ok());

        byz localbyz2 = localbyz1;

        if (localObject5 == null) {
          return Boolean.valueOf(false);
        }

        if ((((bBn)localObject5).bKr() instanceof alo)) {
          int j = ((alo)((bBn)localObject5).bKr()).alM();
          int k = ((alo)((bBn)localObject5).bKr()).axX();
          return Boolean.valueOf((localbyz2.aTn().contains(k)) && (localbyz2.aTn().getLevel(k) >= j) && (nP() > 0));
        }if (((bBn)localObject5).nU() > localbyz2.nU()) {
          return Boolean.valueOf(false);
        }

        if (localbyz2.adF()) {
          localObject6 = ((bBn)localObject5).a(Aq.bvP);
          localObject7 = cmI.cnw().boc();
          if (localObject7 == null)
            return Boolean.valueOf(false);
        }
        else {
          localObject6 = ((bBn)localObject5).a(Aq.bvO);
          localObject7 = localbyz1;
        }

        return Boolean.valueOf(((localObject6 == null) || (((bZA)localObject6).i(localObject7, ((Su)localObject7).ML(), null, ((Su)localObject7).bEY()))) && (nP() > 0));
      case 4:
        localObject5 = localbyz1.bGP().iS(oj());
        if ((localObject5 != null) && (((gA)localObject5).isActive())) {
          if ((((gA)localObject5).oi().bKn().nh().length == 0) || (azu() == 4))
          {
            if (localbyz1.adF()) {
              localObject6 = ((gA)localObject5).oi().a(Aq.bvP);
              localObject7 = cmI.cnw().boc();
              if (localObject7 == null)
                return Boolean.valueOf(false);
            }
            else {
              localObject6 = ((gA)localObject5).oi().a(Aq.bvO);
              localObject7 = localbyz1;
            }
            return Boolean.valueOf(((localObject6 == null) || (((bZA)localObject6).i(localObject7, ((Su)localObject7).ML(), localObject5, ((Su)localObject7).bEY()))) && (nP() > 0));
          }
          localObject6 = localbyz1;
          if (localbyz1.adF()) {
            if ((!((gA)localObject5).oi().a(azO.dRM)) && (!((gA)localObject5).oi().a(azO.dRN)))
            {
              return Boolean.valueOf(false);
            }
            localObject6 = cmI.cnw().boc();
            if (localObject6 == null) {
              return Boolean.valueOf(false);
            }
          }

          localObject7 = ((gA)localObject5).oi().a(Aq.bvQ);
          return Boolean.valueOf(((localObject7 == null) || (((bZA)localObject7).i(localObject6, ((Su)localObject6).ML(), localObject5, ((Su)localObject6).bEY()))) && (nP() > 0));
        }

        localObject5 = (gA)localbyz1.ayJ().hh(ok());
        if ((localObject5 != null) && (((gA)localObject5).isActive())) {
          if (localbyz1.c(cfY.hBN)) {
            return Boolean.valueOf(false);
          }
          if ((localbyz1.adF()) && (!((gA)localObject5).om())) {
            return Boolean.valueOf(false);
          }

          if (localbyz1.adF()) {
            localObject6 = ((gA)localObject5).oi().a(Aq.bvP);
            localObject7 = cmI.cnw().boc();

            if (localObject7 == null)
              return Boolean.valueOf(false);
          }
          else {
            localObject6 = ((gA)localObject5).oi().a(Aq.bvO);
            localObject7 = localbyz1;
          }
          return Boolean.valueOf(((localObject6 == null) || (((bZA)localObject6).i(localObject7, ((Su)localObject7).ML(), localObject5, ((Su)localObject7).bEY()))) && (((gA)localObject5).oi().bKg() <= ((Su)localObject7).e(eu.ayN)) && (nP() > 0));
        }

        return Boolean.valueOf(nP() > 0);
      }
    } else {
      if (paramString.equals("cooldown")) {
        switch (aaz.cOV[asL().ordinal()])
        {
        case 2:
          localObject1 = localbyz1.aeQ();
          if (localObject1 == null) {
            return "";
          }

          localObject2 = localbyz1.bV(oj());
          if (localObject2 != null) {
            if (!((dSR)((apX)localObject2).bsL()).vC()) {
              localObject3 = localbyz1.cQH().c((bfE)localObject2, ((arl)localObject1).aDp().AU());
              if (localObject3 == baf.fhx) {
                return "";
              }
              if (localObject3 == baf.fhJ) {
                int i = localbyz1.cQH().b((bfE)localObject2, ((arl)localObject1).aDp().AU());
                if (i > 0) {
                  return String.valueOf(i);
                }
                return String.valueOf('∞');
              }
              if (localObject3 == baf.fhI) {
                return "1";
              }
              return "";
            }

            localObject3 = (gA)localbyz1.ayJ().dB((short)((dSR)((apX)localObject2).bsL()).bIa());
            baf localbaf = ((arl)localObject1).a(localbyz1, (gA)localObject3, (bfE)localObject2, null);
            if (localbaf == baf.fhx) {
              return "";
            }
            if (localbaf == baf.fhJ)
              return String.valueOf(localbyz1.cQH().b((bfE)localObject2, ((arl)localObject1).aDp().AU()));
            if (localbaf == baf.fhI) {
              return "1";
            }
            return "";
          }

          break;
        }

        return "";
      }

      if (paramString.equals("backgroundTypeIcon"))
      {
        try {
          return String.format(ay.bd().getString("shortcutBackgroundPath"), new Object[] { Short.valueOf(lZh[this.dpP]) });
        } catch (Exception localException) {
          K.error(localException);
        }
      } else { if (paramString.equals("quantity")) {
          bKq localbKq = asL();
          if ((localbKq == bKq.gNg) || (localbKq == bKq.gNf)) {
            short s = nP();
            if (s > 999)
              return "999+";
            if (s == 0) {
              return null;
            }
            return Short.valueOf(s);
          }
          return null;
        }
        if (paramString.equals("particleFile"))
          return djA(); }
    }
    return null;
  }

  private String djA() {
    byz localbyz = byv.bFN().bFO();

    switch (aaz.cOV[asL().ordinal()]) {
    case 2:
      dSR localdSR = Be.Kj().ea(ok());
      if (localdSR != null)
      {
        if (localbyz.uO() == SB.ctM.uO()) {
          bTI localbTI = bTI.dx(localdSR.bHU());
          if ((localbTI == bTI.heZ) && (localbyz.bFW().Cx(63708)))
          {
            return CP(800261);
          }
        }
      }
      break;
    }

    return null;
  }

  private static String CP(int paramInt) {
    return paramInt + ".xps";
  }

  public void a(bKq parambKq, long paramLong, int paramInt1, int paramInt2)
  {
    super.a(parambKq, paramLong, paramInt1, paramInt2);

    dLE.doY().a(this, new String[] { "rid", "uid", "type", "backgroundTypeIcon", "smallIconUrl" });
  }

  protected void a(int paramInt1, long paramLong, int paramInt2)
  {
    super.a(paramInt1, paramLong, paramInt2);
    dLE.doY().a(this, new String[] { "rid", "uid", "smallIconUrl" });
  }

  public void ic(int paramInt)
  {
    super.ic(paramInt);
    dLE.doY().a(this, new String[] { "smallIconUrl" });
  }

  public void l(short paramShort)
  {
    super.l(paramShort);

    dLE.doY().a(this, new String[] { "quantity" });
    dLE.doY().a(this, new String[] { "usable" });
  }

  public void a(short paramShort)
  {
    super.a(paramShort);

    dLE.doY().a(this, new String[] { "quantity", "usable" });
  }

  public String[] getFields() {
    return bF;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(String paramString, Object paramObject) {
  }

  public void a(String paramString, Object paramObject) {
  }

  private dsj kF(long paramLong) {
    dKD localdKD = b(asL(), paramLong, ok(), asM());
    localdKD.bg(this.dpP);
    localdKD.setUsable(this.dgA);
    localdKD.l(nP());
    return localdKD;
  }

  public dsj r(boolean paramBoolean)
  {
    return kF(dsE.cYX());
  }

  public dsj ow()
  {
    return kF(oj());
  }

  public short nP() {
    byz localbyz = byv.bFN().bFO();

    if ((asL() == bKq.gNf) || (asL() == bKq.gNg)) {
      int i = 0;
      ArrayList localArrayList = localbyz.bGP().yh(this.dbx);
      int j;
      if (localArrayList != null) {
        for (j = localArrayList.size() - 1; j >= 0; j--) {
          i += ((gA)localArrayList.get(j)).nP();
        }
      }

      if (asL() == bKq.gNg) {
        localArrayList = localbyz.ayJ().hi(this.dbx);
        if (localArrayList != null) {
          for (j = localArrayList.size() - 1; j >= 0; j--) {
            i += ((gA)localArrayList.get(j)).nP();
          }
        }
      }

      return bCO.go(i);
    }
    return 1;
  }

  public byte azu()
  {
    return this.dpP;
  }

  public void bg(byte paramByte)
  {
    this.dpP = paramByte;
    dLE.doY().a(this, new String[] { "backgroundTypeIcon" });
  }

  public boolean om() {
    if (asL() == bKq.gNe) {
      return true;
    }
    if (asL() == bKq.gNh) {
      return true;
    }
    if (asL() == bKq.gNg) {
      switch (azu()) {
      case 0:
      case 1:
      case 3:
        return false;
      case 2:
      case 4:
      case 5:
        return true;
      }
      return false;
    }

    return false;
  }

  public boolean isUsable() {
    return this.dgA;
  }

  public void setUsable(boolean paramBoolean) {
    this.dgA = paramBoolean;
  }

  public void bc() {
    super.bc();

    this.dgA = true;
    this.dpP = 0;

    this.lZi.clear();
  }
}