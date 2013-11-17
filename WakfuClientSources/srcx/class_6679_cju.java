import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class cju extends cMb
{
  private static final Logger K = Logger.getLogger(cju.class);

  private static final dGy hIO = new TF();
  private bZI hIP;
  private static final String hIQ = "\\{[^\\{\\}]*\\}";
  public static final String hIR = "(\\{[^\\{\\}]*\\})+";
  private static final String hIS = "(\\{[^\\{\\}]*\\})+(;[a-zA-Z0-9\\.]*)?";
  private static final Pattern hIT = Pattern.compile("\\{[^\\{\\}]*\\}");
  public static final Pattern hIU = Pattern.compile("(\\{[^\\{\\}]*\\})+");
  private String dtk;
  private final ArrayList hIV = new ArrayList();
  private ArrayList hIW;

  private void clc()
  {
    if ((!bB) && (this.dtk != null)) throw new AssertionError();
    this.dtk = "";
    if ((!bB) && (!this.hIV.isEmpty())) throw new AssertionError(); 
  }

  private void cld()
  {
    this.dtk = null;
    this.hIV.clear();
  }

  private String cle() {
    return bU.fH().getString(this.dtk);
  }

  private csx[] clf() {
    int i = this.hIV.size();

    csx[] arrayOfcsx = new csx[i];

    for (int j = 0; j < i; j++) {
      dzs localdzs = (dzs)this.hIV.get(j);
      aXi localaXi = (aXi)aiI.dfP.avt();
      localaXi.iT(dzs.a(localdzs));
      localaXi.setName(dzs.b(localdzs));
      localaXi.b(dJO.lWi[j]);
      arrayOfcsx[j] = localaXi;
    }

    return arrayOfcsx;
  }

  private void clg()
  {
    if (!this.fgH.matches("(\\{[^\\{\\}]*\\})+(;[a-zA-Z0-9\\.]*)?")) {
      K.error("[LD] Erreur de paramètres pour l'IE : " + this.aTz + " - Paramètres : " + this.fgH);
      this.dtk = "";
      D(false);
      return;
    }

    Matcher localMatcher1 = hIU.matcher(this.fgH);
    if ((!localMatcher1.find()) || (localMatcher1.groupCount() != 1)) {
      K.error("[LD] Erreur de paramètres pour l'IE : " + this.aTz + " - Paramètres : " + this.fgH);
      this.dtk = "";
      D(false);
      return;
    }
    String str1 = localMatcher1.group();

    if (localMatcher1.hitEnd()) {
      this.dtk = "";
      D(false);
    } else {
      this.dtk = this.fgH.substring(localMatcher1.end() + 1);
    }

    Matcher localMatcher2 = hIT.matcher(str1);
    while (localMatcher2.find()) {
      String str2 = localMatcher2.group();

      String str3 = localMatcher2.group().substring(1, str2.length() - 1);

      String[] arrayOfString = str3.split(";");
      this.hIV.add(new dzs(Integer.valueOf(arrayOfString[0]).intValue(), arrayOfString[1], null));
    }
  }

  private void clh() {
    String[] arrayOfString = this.fgH.split(";");
    if ((arrayOfString.length != 3) && (arrayOfString.length != 2)) {
      K.error("[LevelDesign] Un GenericActivableInteractiveElement doit avoir 2 paramètres - typeId=" + boN() + " / id=" + getId());
      this.dtk = "";
      D(false);
      return;
    }

    this.hIV.add(new dzs(Integer.valueOf(arrayOfString[0]).intValue(), arrayOfString[1], null));
    if (arrayOfString.length == 3) {
      this.dtk = arrayOfString[2];
    } else {
      this.dtk = "";
      D(false);
    }
  }

  public void a(abc paramabc)
  {
  }

  public void aJ()
  {
    super.aJ();
    this.aTn = 1;
    setVisible(true);
    if ((!bB) && (this.hIP != null)) throw new AssertionError();
    if ((!bB) && (this.hIW != null)) throw new AssertionError();
    clc();
    eu(true);
    ev(true);
    D(true);
  }

  public void bc()
  {
    super.bc();
    this.hIP = null;
    cli();
    cld();
  }

  public boolean isUsable()
  {
    if (!super.isUsable()) {
      return false;
    }

    csx[] arrayOfcsx = adN();
    if ((arrayOfcsx == null) || (arrayOfcsx.length <= 0)) {
      return false;
    }

    byz localbyz = byv.bFN().bFO();
    for (int i = 0; i < arrayOfcsx.length; i++) {
      csx localcsx = arrayOfcsx[i];
      if (localcsx != null)
      {
        localcsx.Q(localbyz);
        if ((localcsx.isUsable()) && (localcsx.pZ())) {
          return true;
        }
      }
    }

    return false;
  }

  public String getName()
  {
    if (this.hIP == null) {
      return cle();
    }
    return bU.fH().b(106, this.hIP.getId(), new Object[0]);
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (!isVisible()) {
      return false;
    }

    d(paramdJO);
    a(paramdJO);

    return true;
  }

  public dJO eR()
  {
    if (this.hIP != null) {
      return this.hIP.eR();
    }
    return dJO.lWi[0];
  }

  public dJO[] eS()
  {
    if (this.hIP != null) {
      return this.hIP.eS();
    }
    return dJO.lWi;
  }

  public csx[] am()
  {
    if (this.hIP == null) {
      return clf();
    }

    byz localbyz = byv.bFN().bFO();

    bpU[] arrayOfbpU = this.hIP.cem();
    ArrayList localArrayList1 = new ArrayList();

    for (int i = 0; i < arrayOfbpU.length; i++)
    {
      bpU localbpU = arrayOfbpU[i];
      if (!localbpU.byY())
      {
        aCH localaCH = clR.cni().vL(localbpU.gC());
        if (localbpU.byX() == 0) {
          K.error("Le visual " + i + " du generic param " + this.hIP.getId() + " n'a pas de group d'action");
        }
        else
        {
          lZ locallZ = new lZ();
          boolean bool1 = true;
          boolean bool2 = true;
          int j = localbpU.byV();
          ArrayList localArrayList2 = new ArrayList();

          Object localObject1 = null;
          cfc localcfc;
          for (localcfc : localbpU.byT()) {
            if (localcfc.bIu() == j) {
              localObject1 = localcfc;
              break;
            }
          }

          if (localObject1 != null)
          {
            for (localcfc : localObject1.bIv()) {
              buS localbuS = aYo.a(localcfc);
              boolean bool3 = localbuS.j(localbyz);
              boolean bool4 = localbuS.k(localbyz);
              bool1 &= bool3;
              bool2 &= bool4;

              String str = localbuS.getErrorMessage();
              if (str != null) {
                if (locallZ.length() != 0)
                  locallZ.tH();
                locallZ.a(str);
              }

              if ((bool3) && (bool4)) {
                localArrayList2.add(localbuS);
              }
            }
            if (bool1)
            {
              ??? = (awv)aiI.dgr.avt();
              ((awv)???).iT(localaCH.aOR());
              ((awv)???).ma("desc.mru." + localaCH.aOS());
              ((awv)???).fn(Od.n(localbpU.ayN(), localbpU.ajS(), localbpU.ahA()));
              ((awv)???).cM(Od.m(localbpU.ayN(), localbpU.ajS(), localbpU.ahA()));
              ((awv)???).setEnabled(bool2);
              ((awv)???).lZ(locallZ.tP());
              ((awv)???).aR(j);
              ((awv)???).w(localArrayList2);
              localArrayList1.add(???);
            }
          }
        }
      }
    }
    return (csx[])localArrayList1.toArray(new csx[localArrayList1.size()]);
  }

  public void al()
  {
    super.al();
    try {
      int i = Integer.parseInt(this.fgH);

      bZI localbZI = (bZI)aKY.epr.a(cdc.hwc, i);
      if (localbZI == null) {
        K.error("[LD] L'IE de généric " + this.aTz + " à un parametre [" + i + "] qui ne correspond a rien dans les Admins");
        return;
      }
      this.hIP = localbZI;
    }
    catch (NumberFormatException localNumberFormatException) {
      K.warn("ancien paramétrage pour l'IE généric " + getId());

      if (this.fgH.startsWith("{"))
        clg();
      else
        clh();
    }
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }

  public void MW()
  {
    super.MW();
    if (this.hIP == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("elementId", Long.valueOf(getId()));

    for (bpU localbpU : this.hIP.cem())
      if (localbpU.byY())
      {
        bzS localbzS = localbpU.byU();
        for (cfc localcfc : localbzS.bIv())
          if (localcfc.cia() == dGX.lRF) {
            bXf localbXf = cNU.a(Gj.bOy, localcfc.eo(), localHashMap);
            if (this.hIW == null) {
              this.hIW = new ArrayList();
            }
            this.hIW.add(localbXf);
            localbXf.cct();
          }
      }
  }

  public void tk()
  {
    super.tk();
    cli();
  }

  private void cli() {
    if (this.hIW == null) {
      return;
    }
    for (bXf localbXf : this.hIW) {
      localbXf.O(hIO);
      localbXf.ccy();
      localbXf.interrupt();
    }
    this.hIW = null;
  }

  public EA xN() {
    if (this.krh == null)
      this.krh = new dHA(this);
    return this.krh;
  }
}