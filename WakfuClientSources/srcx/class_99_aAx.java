import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class aAx
  implements dBv
{
  private static final Logger K = Logger.getLogger(aAx.class);

  private static aAx dSX = new aAx();

  private int dSY = 0;

  private final cSR dSZ = new cSR();
  public static final String dTa = "chatTextStyle";
  public static final String dTb = "allFiltersList";
  public static final String[] bF = { "chatTextStyle", "allFiltersList" };

  private int dTc = -1;

  public static aAx aMd()
  {
    return dSX;
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("chatTextStyle"))
      return aMe();
    if (paramString.equals("allFiltersList")) {
      return aMr();
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public String aMe() {
    aIH localaIH = WakfuClientInstance.awy().awB();
    bha localbha = bha.values()[localaIH.d(bmz.fEL)];
    return "white" + (localbha != null ? localbha.btu() : bha.fuU.btu()) + "Bordered";
  }

  public ahB c(dju paramdju) {
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ahB localahB = (ahB)localdmn.value();
      if (localahB.a(paramdju))
        return localahB;
    }
    return null;
  }

  public int d(dju paramdju) {
    ahB localahB = c(paramdju);
    return localahB == null ? -1 : localahB.auq();
  }

  public boolean e(dju paramdju) {
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ahB localahB = (ahB)localdmn.value();
      if (localahB.auy() == paramdju)
        return true;
    }
    return false;
  }

  public boolean lr(int paramInt) {
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ahB localahB = (ahB)localdmn.value();
      if (localahB.auy().AR(paramInt))
        return true;
    }
    return false;
  }

  public ahB aMf() {
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ahB localahB = (ahB)localdmn.value();
      if (localahB.auF())
        return localahB;
    }
    return null;
  }

  public ahB aMg()
  {
    ahB localahB = new ahB(aMh());
    this.dSZ.put(localahB.auq(), localahB);
    return localahB;
  }

  private int aMh() {
    for (int i = 0; i < this.dSZ.size(); i++) {
      if (this.dSZ.get(i) == null)
        return i;
    }
    return this.dSZ.size();
  }

  public ahB ls(int paramInt) {
    if (this.dSZ.get(paramInt) != null) {
      K.error("Window déjà présente à l'index : " + paramInt);
      return null;
    }
    ahB localahB = new ahB(paramInt);
    this.dSZ.put(localahB.auq(), localahB);
    return localahB;
  }

  public void by(int paramInt1, int paramInt2)
  {
    if (!this.dSZ.containsKey(paramInt1)) {
      K.error("on cherche à supprimer une fenêtre de chat inconnue d'id=" + paramInt1);
      return;
    }
    if (this.dSY == paramInt1)
    {
      if (paramInt2 == -1) {
        paramInt2 = lt(paramInt1);
      }
      if (paramInt2 == -1) {
        K.error("impossible d'atteindre une fenêtre de chat ! On annule la suppression dans le manager");
        return;
      }
      this.dSY = paramInt2;
    }
    ahB localahB = (ahB)this.dSZ.remove(paramInt1);

    localahB.auD();
    localahB.auC();
  }

  private int lt(int paramInt)
  {
    for (int k : this.dSZ.qe()) {
      if (paramInt != k)
        return k;
    }
    return -1;
  }

  public ahB aMi() {
    return (ahB)this.dSZ.get(this.dSY);
  }

  public int aMj() {
    return this.dSZ.size();
  }

  public ahB lu(int paramInt)
  {
    return (ahB)this.dSZ.get(paramInt);
  }

  public void lv(int paramInt)
  {
    this.dSY = paramInt;
  }

  public void a(ahB paramahB) {
    if (paramahB != null)
      this.dSY = paramahB.auq();
    else
      K.warn("On essaye de définir une vue pas enregistrée dans le ChatWindowManager comme vue courante. (Ignoré)");
  }

  public dmn aMk()
  {
    return this.dSZ.yF();
  }

  public ahB aMl() {
    return (ahB)this.dSZ.get(0);
  }

  public boolean fZ(String paramString) {
    for (dmn localdmn1 = this.dSZ.yF(); localdmn1.hasNext(); ) {
      localdmn1.fl();
      for (localdmn2 = ((ahB)localdmn1.value()).aut(); localdmn2.hasNext(); ) {
        localdmn2.fl();
        if (((dju)localdmn2.value()).getName().equals(paramString))
          return true;
      }
    }
    dmn localdmn2;
    return false;
  }

  public boolean lw(int paramInt)
  {
    return this.dTc == paramInt;
  }

  public void aMm()
  {
  }

  public void aMn()
  {
    ahB localahB = aMi();
    if (localahB == null)
      return;
    dju localdju = localahB.auy();
    if (localdju == null)
      return;
    localdju.clean();
  }

  public void aMo() {
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((ahB)localdmn.value()).auB();
    }
  }

  public ahB a(dju paramdju, int paramInt1, int paramInt2) {
    ahB localahB1 = lu(paramInt1);
    ahB localahB2;
    if (paramInt2 == -1)
      localahB2 = aMd().aMg();
    else {
      localahB2 = lu(paramInt2);
    }

    a(localahB1, paramdju, paramInt2);
    localahB2.b(paramdju);
    localahB2.a(paramdju);
    ceb.cgG().c(localahB1);
    ceb.cgG().c(localahB2);
    aQL.b(localahB2);
    return localahB2;
  }

  public void a(ahB paramahB, dju paramdju, int paramInt) {
    paramahB.a(paramdju, paramInt == -1);
    if (paramahB.auA() == 0) {
      int i = paramahB.auq();
      by(i, paramInt);
      ceb.cgG().uW(i);
    } else {
      paramahB.auv();
    }
  }

  public int aMp() {
    int i = 0;
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ahB localahB = (ahB)localdmn.value();
      i += localahB.aux();
    }
    return i;
  }

  public ArrayList aMq() {
    ArrayList localArrayList = new ArrayList();
    for (dmn localdmn1 = this.dSZ.yF(); localdmn1.hasNext(); ) {
      localdmn1.fl();
      ahB localahB = (ahB)localdmn1.value();
      for (localdmn2 = localahB.aut(); localdmn2.hasNext(); ) {
        localdmn2.fl();
        localArrayList.add(localdmn2.value());
      }
    }
    dmn localdmn2;
    Collections.sort(localArrayList, new arF(this));

    return localArrayList;
  }

  private ArrayList aMr() {
    ArrayList localArrayList = new ArrayList();
    for (dmn localdmn = CM.LV().LX(); localdmn.hasNext(); ) {
      localdmn.fl();
      dab localdab = (dab)localdmn.value();
      if (localdab.cMB()) {
        float[] arrayOfFloat = localdab.ckE();
        localArrayList.add(new cPG(localdab.getName(), false, new bNa(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], 1.0F), localdab.getId()));
      }
    }
    Collections.sort(localArrayList, new arJ(this));

    return localArrayList;
  }

  private ArrayList aMs() {
    ArrayList localArrayList = new ArrayList();
    for (dmn localdmn = CM.LV().LX(); localdmn.hasNext(); ) {
      localdmn.fl();
      dab localdab = (dab)localdmn.value();
      if (localdab.ciC()) {
        float[] arrayOfFloat = localdab.ckE();
        localArrayList.add(new cPG(localdab.getName(), false, new bNa(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], 1.0F), localdab.getId()));
      }
    }
    Collections.sort(localArrayList, new arH(this));

    return localArrayList;
  }

  public void aMt() {
    try {
      arV.save();
    } catch (Exception localException) {
      K.error("Erreur à la sauvegarde du chat :");

      K.error("Exception", localException);
    }
  }

  public void clean() {
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((ahB)localdmn.value()).clean();
    }
    this.dSZ.clear();
  }

  public void aMu() {
    clean();
    try {
      arV.aEA();
    } catch (Exception localException) {
      K.error("Erreur à la suppression du fichier utilisateur du chat");
      K.error("Exception", localException);
    }
  }

  public void aMv() {
    for (dmn localdmn = this.dSZ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ahB localahB = (ahB)localdmn.value();
      dLE.doY().a(localahB, localahB.getFields());
      localahB.auE();
    }
    dLE.doY().a(this, new String[] { "allFiltersList" });
  }

  public int aMw() {
    return this.dTc;
  }

  public void lx(int paramInt) {
    this.dTc = paramInt;
  }
}