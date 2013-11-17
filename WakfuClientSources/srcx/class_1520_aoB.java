import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aoB extends cGj
{
  public static final String NAME = "name";
  public static final String dtG = "territoryName";
  public static final String dtH = "cash";
  public static final String dtI = "taxes";
  public static final String dtJ = "satisfaction";
  public static final String dtK = "animation";
  public static final String dtL = "animName";
  public static final String dtM = "buffs";
  public static final String dtN = "shukruteBuffs";
  public static final String dtO = "inChaos";
  private bkQ dtP;
  private ayn dtQ;
  private bVf dtR;
  private ArrayList dtS;
  public static final String[] bF = { "name", "cash", "taxes", "satisfaction", "buffs", "shukruteBuffs", "inChaos" };

  public aoB(bkQ parambkQ)
  {
    this.dtP = parambkQ;
    this.dtQ = cSE.kEZ.yY(parambkQ.getId());
    if (this.dtQ.ava() != this.dtP.UI())
      this.dtQ.g(this.dtP.UI());
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      String str = bU.fH().b(48, CB(), new Object[0]);
      return str + (this.dtP.CC() ? " " + bU.fH().getString("chaos.label") : "");
    }if (paramString.equals("territoryName"))
      return this.dtQ.aAU();
    if (paramString.equals("cash"))
      return DecimalFormat.getIntegerInstance().format(aAM()) + " §";
    if (paramString.equals("satisfaction")) {
      if (this.dtS == null) {
        int i = this.dtP.aAO();
        int j = this.dtP.aAQ();
        this.dtS = new ArrayList(i);
        for (int k = 0; k < i; k++) {
          this.dtS.add(Boolean.valueOf(k < j));
        }
      }
      return this.dtS;
    }if (paramString.equals("animation"))
      return aAT();
    if (paramString.equals("animName"))
      return getAnimName();
    if (paramString.equals("taxes"))
      return (int)(aAR() * 100.0F) + " %";
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramString.equals("buffs")) {
      localObject1 = this.dtQ.aKq();
      localObject2 = new ArrayList();

      localObject3 = cIZ.el(this.dtP.aAQ(), this.dtP.aAO());
      this.dtQ.aKs().a((cIZ)localObject3);
      cHN localcHN2;
      if (localObject3 == cIZ.iHa) {
        if (this.dtQ.aKd() == null)
          return null;
        for (localcHN2 : this.dtQ.aKd())
          if (localcHN2.cBZ() == bMn.gPH)
            ((ArrayList)localObject2).add(new asP(localcHN2, this.dtQ, false));
      }
      else
      {
        ??? = new ArrayList();
        ??? = 0; for (??? = ((cSi)localObject1).size(); ??? < ???; ???++) {
          localcHN2 = dPR.mji.Do(((cSi)localObject1).get(???));
          if ((localcHN2 != null) && (localcHN2.cBZ() == bMn.gPH)) {
            ((ArrayList)???).add(localcHN2);
          }
        }
        ((ArrayList)localObject2).add(new asP(null, this.dtQ, ((cSi)localObject1).size() != 0));
        ??? = 0; for (??? = ((ArrayList)???).size(); ??? < ???; ???++) {
          localcHN2 = (cHN)((ArrayList)???).get(???);
          ((ArrayList)localObject2).add(new asP(localcHN2, this.dtQ));
        }
        Collections.sort((List)localObject2, dLX.mch);
      }

      return localObject2;
    }if (paramString.equals("shukruteBuffs")) {
      localObject1 = new ArrayList();

      localObject2 = cIZ.el(this.dtP.aAQ(), this.dtP.aAO());
      this.dtQ.aKs().a((cIZ)localObject2);

      if (this.dtQ.aKd() == null)
        return null;
      for (cHN localcHN1 : this.dtQ.aKd()) {
        if (localcHN1.cBZ() == bMn.gPI) {
          ((ArrayList)localObject1).add(new asP(localcHN1, this.dtQ, false));
        }
      }
      return localObject1;
    }if (paramString.equals("inChaos")) {
      return Boolean.valueOf(this.dtP.CC());
    }
    return null;
  }

  public int aAM() {
    return this.dtP.aAM();
  }

  public float aAN() {
    return this.dtP.aAO() == 0 ? -1.0F : this.dtP.aAQ() / this.dtP.aAO();
  }

  public int aAO()
  {
    return this.dtP.aAO();
  }

  public boolean aAP() {
    return (aAO() == 0) || (aAO() == this.dtP.aAQ());
  }

  public int aAQ() {
    return this.dtP.aAQ();
  }

  public float aAR() {
    return this.dtP.bvx();
  }

  public int CB() {
    return this.dtP.getId();
  }

  public aDD aAS() {
    return aDD.b(cIZ.el(this.dtP.aAQ(), this.dtP.aAO()));
  }

  public String getAnimName() {
    return aAS().ata();
  }

  public bVf aAT() {
    if (this.dtR == null) {
      bVf localbVf = new bVf(dsE.cYX(), 0.0F, 0.0F, 0.0F);

      String str = this.dtP.getId() + ".anm";
      try {
        localbVf.b(ay.bd().getString("ANMGUIPath") + str, true);
      } catch (IOException localIOException) {
        return null;
      } catch (bdh localbdh) {
        return null;
      }
      localbVf.em(str);

      this.dtR = localbVf;
    }
    this.dtR.es(getAnimName());
    this.dtR.eq(getAnimName());
    return this.dtR;
  }

  public String aAU() {
    return this.dtQ.aAU();
  }
}