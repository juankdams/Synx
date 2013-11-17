import java.util.ArrayList;
import java.util.GregorianCalendar;

public class dBW extends cGj
{
  public static final String lJt = "currentDate";
  public static final String lJu = "currentDateText";
  public static final String lJv = "currentMonthDays";
  public static final String lJw = "currentEntry";
  public static final String lJx = "currentEphemeris";
  public static final String lJy = "currentMonth";
  public static final String lJz = "currentZodiak";
  public static final String dRq = "canGoBefore";
  public static final String dRr = "canGoAfter";
  public static final String lJA = "calendar";
  public static final dBW lJB = new dBW();

  private final cYq lJC = new cYq(cYq.kLU);
  private final GregorianCalendar lJD = new GregorianCalendar();

  private final ArrayList lJE = new ArrayList();

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (this.lJC.avJ()) {
      return null;
    }
    if (paramString.equals("currentMonthDays"))
      return this.lJE;
    if (paramString.equals("currentEntry"))
      return deN();
    if (paramString.equals("currentDate"))
      return this.lJC;
    if (paramString.equals("currentDateText")) {
      lZ locallZ = new lZ();
      locallZ.bw(this.lJC.getDay()).a(" ");
      locallZ.a(bU.fH().getString("calendar.month." + this.lJC.getMonth()));
      return locallZ.tP();
    }if (paramString.equals("canGoAfter"))
      return Boolean.valueOf(aLB());
    if (paramString.equals("canGoBefore"))
      return Boolean.valueOf(aLC());
    if (paramString.equals("currentMonth"))
      return xS.bqG.a(this.lJC, (byte)this.lJC.getMonth());
    if (paramString.equals("currentZodiak"))
      return xS.bqG.k(this.lJC);
    if (paramString.equals("currentEphemeris"))
      return xS.bqG.j(this.lJC);
    if (paramString.equals("calendar")) {
      return this.lJD;
    }
    return null;
  }

  private boolean aLB()
  {
    dxL localdxL = dDE.dft().VN();
    return (localdxL.getYear() > this.lJC.getYear()) || (localdxL.getMonth() > this.lJC.getMonth());
  }

  private boolean aLC()
  {
    if ((cGN.iBV.getMonth() == this.lJC.getMonth()) && (cGN.iBV.getYear() == this.lJC.getYear()))
    {
      return false;
    }
    dxL localdxL = dDE.dft().VN();
    if (localdxL.getYear() == this.lJC.getYear()) {
      return localdxL.getMonth() - this.lJC.getMonth() - 1 <= 12;
    }
    return this.lJC.getMonth() - localdxL.getMonth() - 2 >= 0;
  }

  private bRB deN()
  {
    aiX localaiX = Oj.cfd.l(this.lJC);
    return xS.bqG.dG(localaiX.getId());
  }

  public void Y(dxL paramdxL) {
    dxL localdxL = dDE.dft().VN();
    if (paramdxL.S(localdxL)) {
      return;
    }
    cYq localcYq = new cYq(this.lJC);
    this.lJC.set(0, 0, 0, paramdxL.getDay(), paramdxL.getMonth(), paramdxL.getYear());
    this.lJD.set(this.lJC.getYear(), this.lJC.getMonth() - 1, this.lJC.getDay());

    if ((localcYq.getMonth() != this.lJC.getMonth()) || (localcYq.getYear() != this.lJC.getYear()))
    {
      deS();
    }

    dLE.doY().a(this, new String[] { "currentEntry", "currentDate", "currentDateText", "currentEphemeris", "currentZodiak", "calendar" });

    deR();

    aiX localaiX = Oj.cfd.l(this.lJC);
    ckJ localckJ = localaiX.avJ() ? null : cHT.iDr.xQ(localaiX.sY());
    dLE.doY().a("displayedAchievement", localckJ, "almanachDialog");
  }

  public cYq deO() {
    return this.lJC;
  }

  public void deP()
  {
    int i;
    int j;
    if (this.lJC.getMonth() == 1) {
      i = 12;
      j = this.lJC.getYear() - 1;
    } else {
      i = this.lJC.getMonth() - 1;
      j = this.lJC.getYear();
    }

    Y(new cYq(0, 0, 0, 1, i, j));
  }

  public void deQ()
  {
    int i;
    int j;
    if (this.lJC.getMonth() == 12) {
      i = 1;
      j = this.lJC.getYear() + 1;
    } else {
      i = this.lJC.getMonth() + 1;
      j = this.lJC.getYear();
    }

    Y(new cYq(0, 0, 0, 1, i, j));
  }

  private void deR() {
    int i = 0; for (int j = this.lJE.size(); i < j; i++)
      ((aAz)this.lJE.get(i)).aMz();
  }

  private void deS()
  {
    this.lJE.clear();

    cYq localcYq = new cYq(this.lJC);
    int i = 1; for (int j = this.lJD.getActualMaximum(5); i <= j; i++) {
      localcYq.setDay(i);
      this.lJE.add(xS.bqG.i(localcYq));
    }

    dLE.doY().a(this, new String[] { "currentMonthDays", "currentMonth", "canGoBefore", "canGoAfter" });
  }

  public void clear()
  {
    this.lJC.set(0L);
    this.lJE.clear();
  }
}