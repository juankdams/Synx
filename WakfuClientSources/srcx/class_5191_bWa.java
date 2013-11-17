import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class bWa extends dRq
  implements Qe, aWM, dbR, vn
{
  public static final String hhY = "selection";
  public static final String TAG = "calendar";
  private static int hhZ = 7;
  private static int hia = 31;
  private ArrayList hib;
  private ArrayList hic;
  private azz bZ;
  private Calendar bqB;
  private int heN;
  private int heM;
  private int hid;
  private int hie;
  private Or cQn;
  private String cn;
  private cpa co;
  private boolean hif;
  private boolean hig;
  private int hih;
  private int hii;
  private Insets hij;
  private aFG hik;
  private P hil;
  private bNa him;
  private cKm fcX;
  public static final int cQr = "cellSize".hashCode();
  public static final int cs = "content".hashCode();
  public static final int egL = "hgap".hashCode();
  public static final int egM = "vgap".hashCode();
  public static final int hin = "dateMargin".hashCode();
  public static final int hio = "calendar".hashCode();

  public bWa()
  {
    this.hic = new ArrayList();

    this.bZ = new azz();

    this.bqB = new GregorianCalendar();

    this.heN = 0;

    this.heM = 0;

    this.cn = null;
    this.co = null;

    this.hih = -1;
    this.hii = -1;

    this.hij = null;
    this.hik = aFG.eco;
    this.hil = null;
    this.him = null;
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof eR))
      this.bZ.a((eR)paramaNL);
  }

  protected void rd()
  {
    super.rd();

    if ((this.fcX != null) && (this.hii != -1))
      this.bqm.d(this.fcX.UM());
  }

  public String getTag()
  {
    return "calendar";
  }

  public Calendar getCalendar() {
    return this.bqB;
  }

  public void setCalendar(Calendar paramCalendar) {
    this.bqB = paramCalendar;
    this.hif = true;
    setNeedsToPreProcess();
  }

  public void setCellSize(Or paramOr) {
    this.cQn = paramOr;
    this.hif = true;
    setNeedsToPreProcess();
  }

  public Or getCellSize() {
    return this.cQn;
  }

  public int getVgap()
  {
    return this.heN;
  }

  public void setVgap(int paramInt)
  {
    this.heN = paramInt;
    this.hif = true;
    setNeedsToPreProcess();
  }

  public int getHgap()
  {
    return this.heM;
  }

  public void setHgap(int paramInt)
  {
    this.heM = paramInt;
    this.hif = true;
    setNeedsToPreProcess();
  }

  public void setContentProperty(String paramString, cpa paramcpa) {
    this.cn = paramString;
    this.co = paramcpa;
  }

  public void setContent(cSS[] paramArrayOfcSS)
  {
    if (paramArrayOfcSS != null) {
      this.hib = new ArrayList(paramArrayOfcSS.length);

      for (cSS localcSS : paramArrayOfcSS)
        this.hib.add(localcSS);
    }
    else {
      this.hib = new ArrayList(0);
    }

    this.hig = true;
    setNeedsToPreProcess();
  }

  public void setContent(Iterable paramIterable)
  {
    if (paramIterable != null) {
      this.hib = new ArrayList();
      Iterator localIterator = paramIterable.iterator();
      while (localIterator.hasNext())
        this.hib.add(localIterator.next());
    }
    else {
      this.hib = new ArrayList(0);
    }

    this.hig = true;
    setNeedsToPreProcess();
  }

  public void setFont(P paramP) {
    if (paramP == this.hil) {
      return;
    }
    this.hil = paramP;
    int i = 0; for (int j = this.hic.size(); i < j; i++)
      ((aOa)this.hic.get(i)).beV().setFont(paramP);
  }

  public void setColor(bNa parambNa, String paramString)
  {
    if ((paramString == null) || (paramString.equals("text"))) {
      if (parambNa == this.him) {
        return;
      }
      this.him = parambNa;

      int i = 0; for (int j = this.hic.size(); i < j; i++)
        ((aOa)this.hic.get(i)).beV().setColor(parambNa, "text");
    }
    else if (paramString.equals("selection")) {
      if (parambNa != null) {
        if (this.fcX == null) {
          this.fcX = new cKm();
          this.fcX.aJ();
          setNeedsToResetMeshes();
        }

        this.fcX.setColor(parambNa);
      } else {
        if (this.fcX != null) {
          this.fcX.bc();
        }
        this.fcX = null;
        setNeedsToResetMeshes();
      }
    }
  }

  public void setAlign(aFG paramaFG) {
    if (this.hik == paramaFG) {
      return;
    }

    this.hik = paramaFG;
    int i = 0; for (int j = this.hic.size(); i < j; i++)
      ((aOa)this.hic.get(i)).beV().setAlign(paramaFG);
  }

  public Insets getDateMargin()
  {
    return this.hij;
  }

  public void setDateMargin(Insets paramInsets) {
    this.hij = paramInsets;
  }

  public int getYearOver() {
    return this.bqB.get(1);
  }

  public int getMonthOver() {
    return this.bqB.get(2) + 1;
  }

  public int getDayOver() {
    if (this.hii != -1) {
      return this.hii + 1;
    }
    return -1;
  }

  private void setSelectedDate(int paramInt) {
    this.hii = (paramInt - 1);
    this.bqB.set(5, paramInt);
    if (this.fcX != null) {
      dRq localdRq = ((aOa)this.hic.get(this.hii)).getContainer();
      this.fcX.a(localdRq.getPosition(), localdRq.getSize(), getAppearance().getTotalInsets());
      setNeedsToResetMeshes();
    }
  }

  private void cbp()
  {
    int i = this.bqB.getActualMaximum(5);
    int j = this.hic.size();
    int k;
    aOa localaOa;
    if (i > j) {
      for (k = j; k < i; k++) {
        localaOa = new aOa(null);

        axU localaxU = new axU();
        localaxU.aJ();
        localaxU.setNonBlocking(this.meQ);
        localaxU.setRendererManager(this.bZ);

        dRq localdRq = dRq.checkOut();
        czO localczO = new czO();
        localczO.aJ();
        localdRq.a(localczO);

        localdRq.a(CH.bGs, new BP(this, localaOa), false);

        localdRq.a(CH.bGt, new BS(this), false);

        localdRq.a(CH.bGw, new BQ(this, localaOa), false);

        cwP localcwP = new cwP();
        localcwP.aJ();
        localcwP.setSize(new Or(100.0F, 100.0F));
        localaxU.a(localcwP);

        caF localcaF = new caF();
        localcaF.aJ();
        localcaF.setNonBlocking(true);
        localcaF.setFont(this.hil);
        localcaF.setColor(this.him, "text");
        localcaF.setAlign(this.hik);
        localcaF.setText(String.valueOf(k + 1));

        localcwP = new cwP();
        localcwP.aJ();
        localcwP.setSize(new Or(100.0F, 100.0F));
        localcaF.a(localcwP);

        if (this.hij != null) {
          Jg localJg = localcaF.getAppearance();
          bmv localbmv = bmv.checkOut();
          localbmv.setInsets(this.hij);
          localJg.a(localbmv);
        }

        localdRq.a(localaxU);
        localdRq.a(localcaF);

        localaOa.e(localaxU);
        localaOa.d(localdRq);
        localaOa.setLabel(localcaF);
        this.hic.add(localaOa);

        a(localdRq);
      }
    } else if (i < j)
    {
      for (k = i; k < j; k++) {
        localaOa = (aOa)this.hic.remove(this.hic.size() - 1);
        localaOa.getContainer().beH();
      }
      if (this.hih >= this.hic.size()) {
        this.hih = -1;
      }
    }

    setSelectedDate(this.bqB.get(5));
  }

  public void ba()
  {
    int[] arrayOfInt = new int[this.hib.size()];

    int i = 0;
    Object localObject;
    for (int j = this.hib.size(); i < j; i++) {
      cSS localcSS = (cSS)this.hib.get(i);
      arrayOfInt[i] = localcSS.mw();
      m = localcSS.mw() - 1;
      axU localaxU1 = ((aOa)this.hic.get(m)).getRenderable();
      localObject = localcSS.getContent();
      localaxU1.setContentProperty(this.cn + "#" + m, this.co);
      localaxU1.setContent(localObject);
    }

    i = 0;
    j = this.hic.size();
    int k = 0;
    int m = 0; for (int n = this.hib.size(); m < n; m++) {
      k = ((cSS)this.hib.get(m)).mw() - 1;
      for (; (i < k) && (i < j); i++) {
        localObject = ((aOa)this.hic.get(i)).getRenderable();
        ((axU)localObject).setContentProperty(this.cn + "#" + i, this.co);
        ((axU)localObject).setContent(null);
      }
      i = k + 1;
    }

    m = this.hib.size() == 0 ? 0 : 1;
    n = k + m; for (int i1 = this.hic.size(); n < i1; n++) {
      axU localaxU2 = ((aOa)this.hic.get(n)).getRenderable();
      localaxU2.setContentProperty(this.cn + "#" + n, this.co);
      localaxU2.setContent(null);
    }
  }

  private void cbq() {
    this.hid = hhZ;
    int i = hia / hhZ;
    int j = hia - i * hhZ;
    if (j > 1) {
      j = 2;
    }
    this.hie = (i + j);
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    int i = 0;

    if (this.hif) {
      cbp();
    }

    if (this.hig) {
      ba();
    }

    if (this.hif) {
      cfM();
    }

    this.hif = false;
    this.hig = false;
    return bool;
  }

  public void c(bdj parambdj)
  {
    bWa localbWa = (bWa)parambdj;
    super.c(localbWa);

    localbWa.setAlign(this.hik);
    localbWa.setCellSize((Or)this.cQn.clone());
    localbWa.setCalendar(this.bqB);
    localbWa.setHgap(this.heM);
    localbWa.setVgap(this.heN);
    localbWa.setDateMargin(this.hij);

    for (int i = localbWa.mmr.size() - 1; i >= 0; i--) {
      dOc localdOc = (dOc)localbWa.mmr.get(i);
      localdOc.beH();
    }
  }

  public void aJ()
  {
    super.aJ();

    cLH localcLH = new cLH(this);
    localcLH.aJ();
    a(localcLH);

    cwJ localcwJ = new cwJ();
    localcwJ.aJ();
    a(localcwJ);

    this.bqB.setTime(new Date());
    this.bqB.set(5, 1);

    cbq();
  }

  public void bc()
  {
    super.bc();

    if (this.hib != null) {
      this.hib.clear();
      this.hib = null;
    }
    this.hic.clear();
    this.hic = null;

    this.cQn = null;

    this.bZ = null;

    this.him = null;

    this.hik = null;
    this.hil = null;

    this.hij = null;

    if (this.fcX != null) {
      this.fcX.bc();
      this.fcX = null;
    }
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cQr)
      setCellSize(paramaKN.gK(paramString));
    else if (paramInt == egL)
      setHgap(bUD.aR(paramString));
    else if (paramInt == egM)
      setVgap(bUD.aR(paramString));
    else if (paramInt == hin)
      setDateMargin(paramaKN.gM(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cs) {
      if ((paramObject == null) || (paramObject.getClass().isArray()))
        setContent((cSS[])paramObject);
      else if ((paramObject instanceof Iterable))
      {
        setContent((Iterable)paramObject);
      }
      else return false;
    }
    else if (paramInt == hio)
      setCalendar((Calendar)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}