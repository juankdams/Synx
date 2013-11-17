import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class cdz extends cGj
  implements caY
{
  private static final Logger K = Logger.getLogger(cdz.class);
  public static final String hwZ = "main";
  public static final String hxa = "mainCustom";
  public static final String hxb = "hasCustom";
  public static final String hxc = "isCustomFull";
  public static final String hxd = "elements";
  public static final String hxe = "fight";
  public static final String hxf = "secondary";
  public static final byte hxg = 8;
  private static final HashMap hxh = new HashMap();

  private final dPx hxi = new dPx();
  private final Su dUZ;
  private final ArrayList hxj = new ArrayList();
  private final ArrayList aDd = new ArrayList();
  private final ArrayList hxk = new ArrayList();
  private final ArrayList hxl = new ArrayList();

  private final ArrayList hxm = new ArrayList();
  private static final String hxn = "highlightedCharacteristics";
  private static final Pattern hxo = Pattern.compile("([0-9]+);?");

  private static void b(eu[] paramArrayOfeu)
  {
    for (eu localeu : paramArrayOfeu)
      hxh.put(localeu.name(), localeu);
  }

  public cdz(Su paramSu)
  {
    this.dUZ = paramSu;

    aQ(paramSu);

    cgn();
  }

  private void aQ(Su paramSu)
  {
    this.hxi.c(eu.aAl.bJ(), new coT(paramSu.d(eu.aAj), this, paramSu, new Rx[] { paramSu.d(eu.ayM), paramSu.d(eu.aAj) }));
    this.hxi.c(eu.ayM.bJ(), new dhb(paramSu.d(eu.ayM), this, paramSu));
    this.hxi.c(eu.aAj.bJ(), new dhb(paramSu.d(eu.aAj), this, paramSu, (byte)39));
    this.hxi.c(eu.azE.bJ(), new bQS(paramSu.d(eu.azE), this));
    this.hxi.c(eu.ayN.bJ(), new cUO(paramSu.d(eu.ayN), this, paramSu));
    this.hxi.c(eu.aAo.bJ(), new aBj(paramSu.d(eu.aAo), this, paramSu));

    a(paramSu.d(eu.ayO), (byte)2);
    a(paramSu.d(eu.ayP), (byte)5);
    h(paramSu.d(eu.ayU));
    h(paramSu.d(eu.azq));

    a(paramSu, eu.azd, eu.azk, true);
    a(paramSu, eu.azf, eu.azm, true);
    a(paramSu, eu.aze, eu.azl, true);
    a(paramSu, eu.azg, eu.azn, true);
    a(paramSu, eu.aAh, eu.aAi, true);

    a(paramSu, eu.azk, eu.azd, false);
    a(paramSu, eu.azm, eu.azf, false);
    a(paramSu, eu.azl, eu.aze, false);
    a(paramSu, eu.azn, eu.azg, false);
    a(paramSu, eu.aAi, eu.aAh, false);

    h(paramSu.d(eu.azv));
    h(paramSu.d(eu.azu));
    h(paramSu.d(eu.azs));
    h(paramSu.d(eu.azt));

    h(paramSu.d(eu.ayZ));
    h(paramSu.d(eu.azS));

    h(paramSu.d(eu.azA));
    h(paramSu.d(eu.azy));
    h(paramSu.d(eu.azB));
    h(paramSu.d(eu.azx));

    h(paramSu.d(eu.azS));
    h(paramSu.d(eu.aAc));
    h(paramSu.d(eu.aAb));
    h(paramSu.d(eu.aAa));
    h(paramSu.d(eu.azZ));
    h(paramSu.d(eu.aAe));
    h(paramSu.d(eu.aAd));
    h(paramSu.d(eu.azY));
    h(paramSu.d(eu.azz));
    h(paramSu.d(eu.azI));
    h(paramSu.d(eu.ayV));
    h(paramSu.d(eu.ayY));
    h(paramSu.d(eu.aza));
    h(paramSu.d(eu.ayU));
    h(paramSu.d(eu.ayT));
    h(paramSu.d(eu.ayS));
    h(paramSu.d(eu.azF));
    h(paramSu.d(eu.azr));
    h(paramSu.d(eu.azp));
    h(paramSu.d(eu.ayR));
    h(paramSu.d(eu.ayQ));
    h(paramSu.d(eu.azc));
    h(paramSu.d(eu.azj));
  }

  private void cgn() {
    cgr();
    cgq();
    cgp();
    cgo();
  }

  private void cgo() {
    this.hxl.add(this.hxi.bf(eu.ayV.bJ()));
    this.hxl.add(this.hxi.bf(eu.azI.bJ()));
    this.hxl.add(this.hxi.bf(eu.azr.bJ()));
    this.hxl.add(this.hxi.bf(eu.azp.bJ()));
    this.hxl.add(this.hxi.bf(eu.azY.bJ()));
    this.hxl.add(this.hxi.bf(eu.azz.bJ()));
  }

  private void cgp() {
    this.hxk.add(this.hxi.bf(eu.azq.bJ()));
    this.hxk.add(this.hxi.bf(eu.aza.bJ()));
    this.hxk.add(this.hxi.bf(eu.ayS.bJ()));
    this.hxk.add(this.hxi.bf(eu.azF.bJ()));
    this.hxk.add(this.hxi.bf(eu.ayT.bJ()));
    this.hxk.add(this.hxi.bf(eu.ayY.bJ()));
    this.hxk.add(this.hxi.bf(eu.ayZ.bJ()));
    this.hxk.add(this.hxi.bf(eu.ayR.bJ()));
    this.hxk.add(this.hxi.bf(eu.ayQ.bJ()));
    this.hxk.add(this.hxi.bf(eu.aAe.bJ()));
    this.hxk.add(this.hxi.bf(eu.aAd.bJ()));
    this.hxk.add(this.hxi.bf(eu.ayU.bJ()));
  }

  private void cgq() {
    this.aDd.add(this.hxi.bf(eu.azZ.bJ()));
    this.aDd.add(this.hxi.bf(eu.aAa.bJ()));
    this.aDd.add(this.hxi.bf(eu.aAb.bJ()));
    this.aDd.add(this.hxi.bf(eu.aAc.bJ()));
  }

  private void cgr() {
    this.hxj.add(this.hxi.bf(eu.ayM.bJ()));
    this.hxj.add(this.hxi.bf(eu.ayN.bJ()));
    this.hxj.add(this.hxi.bf(eu.ayO.bJ()));
    this.hxj.add(this.hxi.bf(eu.ayP.bJ()));
  }

  private void h(Rx paramRx) {
    a(paramRx, (byte)-1);
  }

  private void a(Rx paramRx, byte paramByte) {
    eu localeu = paramRx.Ce();
    this.hxi.c(localeu.bJ(), new Yi(paramRx, this, paramByte));
  }

  private void a(Su paramSu, eu parameu1, eu parameu2, boolean paramBoolean) {
    Rx localRx1 = paramSu.d(parameu1);
    Rx localRx2 = paramSu.d(parameu2);
    this.hxi.c(localRx1.Ce().bJ(), new bdC(localRx1, this, paramSu, localRx2, paramBoolean));
  }

  public void c(eu[] paramArrayOfeu) {
    for (eu localeu : paramArrayOfeu) {
      tM localtM = (tM)this.hxi.bf(localeu.bJ());
      if (localtM != null)
        localtM.As();
    }
  }

  public void a(cqm paramcqm)
  {
    eu localeu = (eu)paramcqm.adb();

    switch (cMJ.aCX[localeu.ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      dLE.doY().a(this.dUZ, new String[] { "timelineDescription" });
      break;
    case 7:
    case 8:
      dLE.doY().a(this.dUZ, new String[] { "debuffApVisible" });
      break;
    case 9:
    case 10:
      dLE.doY().a(this.dUZ, new String[] { "debuffMpVisible" });
      break;
    case 11:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.azg }); break;
    case 12:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.azf }); break;
    case 13:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.azd }); break;
    case 14:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.aze }); break;
    case 15:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.aAh }); break;
    case 16:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.azn }); break;
    case 17:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.azm }); break;
    case 18:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.azk }); break;
    case 19:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.azl }); break;
    case 20:
      if (this.dUZ.c(cfY.hBZ))
        c(new eu[] { eu.aAi }); break;
    case 21:
      if (this.dUZ.c(cfY.hBZ)) {
        c(new eu[] { eu.azg, eu.azf, eu.azd, eu.aze, eu.aAh });
      }
      else
      {
        c(new eu[] { eu.azn, eu.azm, eu.azk, eu.azl, eu.aAi });
      }

      break;
    case 22:
      if (this.dUZ.c(cfY.hBZ)) {
        c(new eu[] { eu.azn, eu.azm, eu.azk, eu.aAi, eu.azl });
      }
      else
      {
        c(new eu[] { eu.azg, eu.azf, eu.azd, eu.aAh, eu.aze });
      }
      break;
    }
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("main"))
      return this.hxj;
    if (paramString.equals("mainCustom"))
      return this.hxm;
    if (paramString.equals("hasCustom"))
      return Boolean.valueOf(this.hxm.size() != 0);
    if (paramString.equals("isCustomFull"))
      return Boolean.valueOf(this.hxm.size() >= 8);
    if (paramString.equals("elements"))
      return this.aDd;
    if (paramString.equals("fight"))
      return this.hxk;
    if (paramString.equals("secondary")) {
      return this.hxl;
    }
    eu localeu = (eu)hxh.get(paramString);
    if (localeu != null) {
      return this.hxi.bf(localeu.bJ());
    }

    return null;
  }

  public tM k(eu parameu) {
    return (tM)this.hxi.bf(parameu.bJ());
  }

  public void a(eu parameu, boolean paramBoolean) {
    a(parameu, paramBoolean, true);
  }

  public void a(eu parameu, boolean paramBoolean1, boolean paramBoolean2) {
    tM localtM = (tM)this.hxi.bf(parameu.bJ());
    if (localtM == null) {
      K.warn("On essaye de highlighter une caractéristique qui n'est pas dans le provider : " + parameu);
      return;
    }

    localtM.setHighlighted(paramBoolean1);

    if ((paramBoolean1) && (!this.hxm.contains(localtM))) {
      this.hxm.add(localtM);
      if (paramBoolean2) {
        dLE.doY().a(this, new String[] { "isCustomFull", "mainCustom", "hasCustom" });
      }

    }
    else if ((!paramBoolean1) && (this.hxm.contains(localtM))) {
      this.hxm.remove(localtM);
      if (paramBoolean2)
        dLE.doY().a(this, new String[] { "isCustomFull", "mainCustom", "hasCustom" });
    }
  }

  private void cgs()
  {
    this.hxm.clear();
    aJp localaJp = this.hxi.dqF();
    while (localaJp.hasNext()) {
      localaJp.fl();
      ((tM)localaJp.value()).setHighlighted(false);
    }
  }

  public void cgt() {
    cgs();

    String str = duB.dai().b((byte)3, "highlightedCharacteristics");
    if (str == null) {
      return;
    }

    Matcher localMatcher = hxo.matcher(str);
    while (localMatcher.find()) {
      byte b = bUD.getByte(localMatcher.group(1));
      eu localeu = eu.a(Byte.valueOf(b));
      if (localeu != null)
      {
        a(localeu, true, false);
      }
    }
    dLE.doY().a(this, new String[] { "isCustomFull", "mainCustom", "hasCustom" });
  }

  public void cgu()
  {
    StringBuilder localStringBuilder = new StringBuilder();

    int i = 0; for (int j = this.hxm.size(); i < j; i++) {
      localStringBuilder.append(((tM)this.hxm.get(i)).Ce().bJ()).append(";");
    }

    duB.dai().a((byte)3, "highlightedCharacteristics", localStringBuilder.toString());
  }

  static
  {
    b(new eu[] { eu.ayM, eu.aAj, eu.aAl, eu.ayN, eu.ayO, eu.ayP, eu.ayU, eu.azq, eu.azE, eu.azd, eu.azf, eu.aze, eu.azg, eu.aAh, eu.azk, eu.azm, eu.azl, eu.azn, eu.aAi, eu.azv, eu.azu, eu.azs, eu.azt, eu.ayZ, eu.azS, eu.azA, eu.azy, eu.azB, eu.azx, eu.aAc, eu.aAb, eu.aAa, eu.azZ, eu.aAe, eu.aAd, eu.azY, eu.azz, eu.azI, eu.ayV, eu.azb, eu.ayW, eu.ayY, eu.aza, eu.ayU, eu.ayT, eu.ayS, eu.azF, eu.azr, eu.azp, eu.ayR, eu.ayQ, eu.aAo });
  }
}