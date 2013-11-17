import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;

public class dpQ
  implements dBv
{
  public static final String bqr = "calendar";
  public static final String lqH = "eventsForMonth";
  private aca lqI;
  private bWa lqJ;
  private xJ lqK = new xJ();
  private ArrayList lqL;
  private static dpQ lqM = new dpQ();

  public static dpQ cXg()
  {
    return lqM;
  }

  public void a(aca paramaca) {
    this.lqI = paramaca;
  }

  public bWa cXh() {
    return this.lqJ;
  }

  private Calendar cXi() {
    return this.lqK.getCalendar();
  }

  public void i(bWa parambWa) {
    this.lqJ = parambWa;

    this.lqK.GJ();

    this.lqJ.setCalendar(cXi());

    cXj();
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("calendar"))
      return this.lqK;
    if (paramString.equals("eventsForMonth")) {
      return this.lqL;
    }
    return null;
  }

  public void dC(int paramInt) {
    this.lqK.dC(paramInt);

    this.lqJ.setCalendar(cXi());
    cXj();
  }

  public void dD(int paramInt) {
    this.lqK.dD(paramInt);

    this.lqJ.setCalendar(cXi());
    cXj();
  }

  public int GK() {
    if (this.lqJ != null) {
      return this.lqJ.getDayOver();
    }
    return 1;
  }

  public int GL() {
    if (this.lqJ != null) {
      return this.lqK.GL();
    }
    return 1;
  }

  public int GM() {
    if (this.lqJ != null) {
      return this.lqK.GM();
    }
    return 1;
  }

  public void cXj() {
    if (this.lqJ != null) {
      this.lqL = cXk();
      this.lqJ.setContent(this.lqL);
    }
  }

  private ArrayList cXk() {
    ArrayList localArrayList = new ArrayList();
    cYq localcYq = new cYq(0, 0, 0, 1, this.lqK.GL() + 1, this.lqK.GM());

    int i = cXi().getActualMaximum(5);
    for (int j = 1; j <= i; j++) {
      Set localSet = this.lqI.m(localcYq);
      if ((localSet != null) && (!localSet.isEmpty())) {
        fv localfv = new fv(j, localSet);
        localArrayList.add(localfv);
      }
      localcYq.n(cds.hwM);
    }

    return localArrayList;
  }

  public String[] getFields() {
    return new String[0];
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
}