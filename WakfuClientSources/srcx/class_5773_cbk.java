import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cbk extends dRq
  implements el
{
  public static final String TAG = "timePointBar";
  private static final String hso = "labels";
  private static final String hsp = "points";
  private static final String hsq = "avatar";
  public static final String hsr = "turnLabel";
  public static final String hss = "turnArrow";
  public static final String hst = "pointItemRenderer";
  public static final String hsu = "avatarItemRenderer";
  public static final String hsv = "timePointDescriptionPopup";
  public static final String hsw = "timePointDescriptionPopupRenderable";
  private zu aNi;
  private bSo hsx;
  private anG hsy;
  private azz aNj;
  private azz hsz;
  private ArrayList aNl;
  private ArrayList aNm;
  private ArrayList hsA;
  private ArrayList hsB;
  private ArrayList hsC;
  private czv hsD;
  private caF hsE;
  private boolean aNq;
  private int[] hsF;
  private int[] hsG;
  private int[] hsH;
  private int[] ggy;
  private int[] ghM;
  private int[] hsI;
  private int[] hsJ;
  private int hsK;
  private boolean hsL;
  public static final int cs = "content".hashCode();

  public cbk()
  {
    this.aNq = false;

    this.hsL = false;
  }

  public static int getAdjustedX(axU paramaxU, int paramInt1, int paramInt2, int paramInt3, ArrayList paramArrayList, Su paramSu)
  {
    int j = 0;
    int i;
    label127: 
    do
    {
      for (int k = paramInt3 - 1; k >= 0; k--) {
        axU localaxU = (axU)paramArrayList.get(k);
        Su localSu = (Su)localaxU.getItemValue();

        if ((localaxU.getX() == paramInt1) && ((localaxU.getY() >= paramInt2) || (localaxU.getY() + localaxU.getHeight() >= paramInt2)) && ((paramInt2 >= localaxU.getY()) || (paramInt2 + paramaxU.getHeight() >= localaxU.getY())))
        {
          i = 1;
          paramInt1 -= paramaxU.getWidth();
          if (localSu != paramSu) break label127;
          paramInt1 -= paramaxU.getWidth(); break label127;
        }

      }

      i = 0;
    }while ((i != 0) && (j++ < 20));

    return paramInt1;
  }

  public void b(aNL paramaNL)
  {
    if (((paramaNL instanceof caF)) && ("turnLabel".equals(paramaNL.getId()))) {
      this.hsE = ((caF)paramaNL);
    } else if (((paramaNL instanceof czv)) && ("turnArrow".equals(paramaNL.getId()))) {
      this.hsD = ((czv)paramaNL);
      this.hsD.setVisible(false);
      super.b(paramaNL);
    } else if (((paramaNL instanceof anG)) && ("timePointDescriptionPopup".equals(paramaNL.getId()))) {
      this.hsy = ((anG)paramaNL);
    } else if (((paramaNL instanceof eR)) && ("avatarItemRenderer".equals(paramaNL.getId()))) {
      this.hsz.a((eR)paramaNL);
    } else if (((paramaNL instanceof eR)) && ("pointItemRenderer".equals(paramaNL.getId()))) {
      this.aNj.a((eR)paramaNL);
    } else {
      super.b(paramaNL);
    }
  }

  public void a(int paramInt, Su paramSu) {
    this.aNl.add(paramInt, paramSu.adI());
    this.aNm.add(paramSu.adI());

    this.aNq = true;
    setNeedsToPreProcess();

    if (this.hsA.size() < this.aNl.size()) {
      axU localaxU1 = new axU();
      localaxU1.aJ();
      localaxU1.setNonBlocking(this.meQ);
      localaxU1.setRendererManager(this.aNj);
      localaxU1.setEnableDND(false);
      localaxU1.setEnabled(this.bur);
      localaxU1.setNetEnabled(this.meS);

      this.hsA.add(paramInt, localaxU1);
      a(localaxU1);
      localaxU1.setContentProperty("timePointBar" + paramSu.getId(), null);
      localaxU1.setContent(paramSu);

      axU localaxU2 = new axU();
      localaxU2.aJ();
      localaxU2.setNonBlocking(this.meQ);
      localaxU2.setRendererManager(this.hsz);
      localaxU2.setEnableDND(false);
      localaxU2.setEnabled(this.bur);
      localaxU2.setNetEnabled(this.meS);

      this.hsB.add(paramInt, localaxU2);
      a(localaxU2);
      localaxU2.setContentProperty("timePointBar" + paramSu.getId(), null);
      localaxU2.setContent(paramSu);
    }
  }

  public void c(Su paramSu) {
    int i = getFighterIndex(paramSu);
    if (i == -1) {
      return;
    }

    this.aNm.remove(this.aNl.remove(i));
    ((axU)this.hsA.remove(i)).beH();
    ((axU)this.hsB.remove(i)).beH();

    this.aNq = true;
    setNeedsToPreProcess();
  }

  private int getFighterIndex(Su paramSu) {
    int i = 0; for (int j = this.aNl.size(); i < j; i++) {
      if (((dpa)this.aNl.get(i)).xg() == paramSu) {
        return i;
      }
    }
    return -1;
  }

  public String getTag()
  {
    return "timePointBar";
  }

  public boolean isAppearanceCompatible(Jg paramJg) {
    return true;
  }

  public dOc getWidget(String paramString, int paramInt) {
    if (paramString == null)
      return null;
    if (paramString.equals("labels")) {
      if ((paramInt >= 0) && (paramInt < this.hsC.size())) {
        return (dOc)this.hsC.get(paramInt);
      }
      return null;
    }if (paramString.equals("avatar")) {
      if ((paramInt >= 0) && (paramInt < this.hsB.size())) {
        return (dOc)this.hsB.get(paramInt);
      }
      return null;
    }if (paramString.equals("points")) {
      if ((paramInt >= 0) && (paramInt < this.hsA.size())) {
        return (dOc)this.hsA.get(paramInt);
      }
      return null;
    }

    return null;
  }

  private cpG getDecorator() {
    ArrayList localArrayList = getAppearance().getChildren();
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      aNL localaNL = (aNL)localArrayList.get(i);
      if ((localaNL instanceof cpG)) {
        return (cpG)localaNL;
      }
    }

    return null;
  }

  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    int i = 0; for (int j = this.hsA.size(); i < j; i++) {
      ((axU)this.hsA.get(i)).setEnabled(paramBoolean);
      ((axU)this.hsB.get(i)).setEnabled(paramBoolean);
    }
  }

  public void setNetEnabled(boolean paramBoolean) {
    super.setNetEnabled(paramBoolean);
    int i = 0; for (int j = this.hsA.size(); i < j; i++) {
      ((axU)this.hsA.get(i)).setNetEnabled(paramBoolean);
      ((axU)this.hsB.get(i)).setNetEnabled(paramBoolean);
    }
  }

  public void setContent(zu paramzu) {
    if (this.aNi == paramzu) {
      return;
    }

    this.aNi = paramzu;
    this.aNi.a(this);

    this.hsK = this.aNi.bPN().lQ();

    this.aNq = true;
    setNeedsToPreProcess();
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if ((this.fnH) || (!this.aYZ) || (!getAppearance().bQ(paramInt1, paramInt2))) {
      return null;
    }

    dOc localdOc = super.getWidget(paramInt1, paramInt2);

    if ((localdOc == this) || (localdOc == null)) {
      paramInt1 -= getAppearance().getLeftInset();
      paramInt2 -= getAppearance().getBottomInset();

      int i = getDecorator().getMesh().bDE().getHeight();
      int j = getDecorator().getMesh().bDE().getWidth();
      int k = getAppearance().getContentWidth() - j;
      int[] arrayOfInt = getDecorator().getPixelSeparations();
      if (arrayOfInt != null) {
        for (int m = 0; m < arrayOfInt.length; m++) {
          int n = arrayOfInt[m];
          if ((paramInt1 > k) && (paramInt1 < j + k) && (paramInt2 > n - i) && (paramInt2 < n))
          {
            localdOc = (dOc)this.hsC.get(m);
            break;
          }
        }
      }
    }

    return localdOc;
  }

  public void a(dpa paramdpa, int paramInt)
  {
    this.aNq = true;
    setNeedsToPreProcess();
  }

  private void ceX()
  {
    if (this.aNi == null) {
      return;
    }

    List localList = this.aNi.Id();
    int i = localList.size();
    for (int j = i - 1; j >= 0; j--) {
      Su localSu1 = (Su)localList.get(j);
      int m = getFighterIndex(localSu1);
      if (m == -1) {
        a(i - j - 1, localSu1);
      }
    }

    j = 0; for (int k = this.aNl.size(); j < k; j++) {
      Su localSu2 = ((dpa)this.aNl.get(j)).xg();
      if (!localList.contains(localSu2))
        c(localSu2);
    }
  }

  public void rS()
  {
  }

  public void d(Su paramSu) {
  }

  public void e(Su paramSu) {
    c(paramSu);
  }

  public void rT() {
    this.hsD.setVisible(true);
  }

  public void rU() {
    this.hsK = this.aNi.lQ();
    ceX();
    this.aNq = true;
    setNeedsToPreProcess();
    setNeedsToPostProcess();
  }

  public void f(Su paramSu) {
  }

  public void g(Su paramSu) {
    this.aNq = true;
    setNeedsToPreProcess();
  }

  private void ceY() {
    Collections.sort(this.aNm, cxL.cuY());

    adz localadz = new adz();
    for (int i = this.aNl.size() - 1; i >= 0; i--) {
      dpa localdpa1 = (dpa)this.aNl.get(i);
      localadz.hL(localdpa1.cWv());
    }
    int[] arrayOfInt = localadz.toArray();
    Arrays.sort(arrayOfInt);
    this.hsF = arrayOfInt;

    int j = -1;
    int k = -1;
    this.hsG = new int[this.hsF.length];
    this.hsH = new int[this.hsF.length];

    int m = 0; for (int n = this.aNm.size(); m < n; m++) {
      dpa localdpa2 = (dpa)this.aNm.get(m);
      if (localdpa2.cWv() != j) {
        k++;
        j = localdpa2.cWv();
        this.hsG[k] = m;
      }
      this.hsH[k] += 1;
    }

    this.ghM = this.ggy;

    if (this.hsF.length != 0) {
      m = 1;

      n = 0; for (int i1 = this.hsF.length - 1; n < i1; n++)
      {
        if (this.hsF[n] + 1 != this.hsF[(n + 1)]) {
          m++;
        }
      }

      this.ggy = new int[m + this.hsF.length];
      this.hsI = new int[m + this.hsF.length];
      this.hsJ = new int[m + this.hsF.length];
      n = 0;
      i1 = 0; for (int i3 = this.hsF.length; i1 < i3; i1++) {
        this.ggy[n] = this.hsF[i1];
        this.hsI[n] = this.hsG[i1];
        this.hsJ[n] = this.hsH[i1];

        if ((this.hsF.length == i1 + 1) || (this.hsF[i1] + 1 != this.hsF[(i1 + 1)])) {
          n++;
          this.ggy[n] = (this.hsF[i1] + 1);
          this.hsI[n] = -1;
          this.hsJ[n] = 0;
        }
        n++;
      }
    } else {
      this.ggy = new int[0];
      this.hsI = new int[0];
      this.hsJ = new int[0];
    }

    m = Math.max(this.ggy.length, this.ghM.length);
    while (this.hsC.size() > m) {
      ((caF)this.hsC.remove(this.hsC.size() - 1)).beH();
    }

    n = 0;
    while (this.hsC.size() < m) {
      caF localcaF = (caF)this.hsE.beO();
      localcaF.setNonBlocking(true);
      cwJ localcwJ = (cwJ)localcaF.getAppearance();
      localcwJ.setAlign(aFG.eck);
      a(localcaF);
      this.hsC.add(localcaF);
      n = 1;
    }

    if (n != 0)
    {
      for (int i2 = this.hsC.size() - 1; i2 >= 0; i2--) {
        this.mmr.remove(this.hsC.get(i2));
      }
      for (i2 = this.hsC.size() - 1; i2 >= 0; i2--) {
        this.mmr.add(0, this.hsC.get(i2));
      }
    }

    this.aNq = false;
  }

  private int getDisplayedTurnsNumber() {
    if ((this.hsF == null) || (this.hsF.length == 0)) {
      return 0;
    }

    int i = 1;

    int j = 0; for (int k = this.hsF.length - 1; j < k; j++)
    {
      if (this.hsF[j] + 1 != this.hsF[(j + 1)]) {
        i++;
      }
    }

    return this.hsF.length + i;
  }

  private Or ceZ()
  {
    cpG localcpG = getDecorator();
    bvR localbvR = localcpG.getMesh();

    int i = 0;
    int j = 0;

    j = Math.max(j, localbvR.bDB().getWidth());
    i += localbvR.bDB().getHeight();

    j = Math.max(j, localbvR.bDD().getWidth());

    int k = getDisplayedTurnsNumber();
    j = Math.max(j, localbvR.bDE().getWidth());
    i += localbvR.bDE().getHeight() * k;

    j = Math.max(j, localbvR.bDC().getWidth());
    i += localbvR.bDC().getHeight();

    return new Or(j, i);
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.aNq) {
      ceY();
      cfM();
    }

    return bool;
  }

  public void rV()
  {
    super.rV();

    setNeedsToResetMeshes();

    dLE.doY().t("fight.describedTimePointBonus", this.hsx);

    a(CH.bGs, new cPA(this), true);

    a(CH.bGt, new cPz(this), true);
  }

  public void bc()
  {
    super.bc();

    this.aNj = null;

    this.hsA.clear();
    this.hsA = null;

    this.hsx = null;

    this.aNm.clear();
    this.aNm = null;
    this.aNl.clear();
    this.aNl = null;

    this.hsC.clear();
    this.hsC = null;

    this.aNi = null;

    this.hsD = null;
  }

  public void aJ()
  {
    super.aJ();

    this.mmw = true;

    this.aNj = new azz();
    this.hsz = new azz();

    this.hsx = new bSo(null, false);

    this.aNl = new ArrayList();
    this.aNm = new ArrayList();
    this.hsB = new ArrayList();
    this.hsA = new ArrayList();
    this.hsC = new ArrayList();

    this.ggy = new int[0];
    this.ghM = new int[0];

    this.hsL = false;

    setNonBlocking(false);

    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    a(localczO);

    Os localOs = new Os(this);
    localOs.aJ();
    a(localOs);
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == cs)
      setContent((zu)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}