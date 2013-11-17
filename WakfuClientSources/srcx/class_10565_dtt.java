import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

final class dtt
  implements cCq
{
  private static final Logger K = Logger.getLogger(dtt.class);
  private String dyo;
  private String dyp;
  private String dyq;
  private String lwa = null;
  private String lwb = null;
  private int dyr = bDf.gyc;
  private String dys;
  private short dcA;
  private dCb lwc;
  private boolean lwd = true;
  private bSl lwe;
  private final aAn dyn;
  private List lwf;

  dtt(aAn paramaAn)
  {
    this.dyn = paramaAn;
  }

  public long getId() {
    return this.dyn.getId();
  }

  public String getName() {
    lZ locallZ = new lZ();
    dle localdle = this.dyn.axG();
    if ((localdle instanceof Su)) {
      cTK localcTK = (cTK)localdle;
      locallZ.a("[").a(localcTK.getName()).a("] ");
    }
    locallZ.a(bU.fH().b(6, (int)this.dyn.clt(), new Object[0]));
    return locallZ.tP();
  }

  public boolean cys() {
    return (this.dyq != null) && (this.dyq.length() != 0);
  }

  public String cyt() {
    return this.dyq;
  }

  public String cyu() {
    if (!cyv()) {
      return cyt();
    }
    return this.lwa;
  }

  public boolean cyv() {
    return this.lwa != null;
  }

  public String cyw() {
    if (!cyx()) {
      return cyt();
    }
    return this.lwb;
  }

  public boolean cyx() {
    return this.lwb != null;
  }

  public void nb(String paramString) {
    this.dyq = null;
    this.lwa = null;
    this.lwb = null;
    if (paramString == null) {
      return;
    }
    String[] arrayOfString = dzp.c(paramString, '|');
    if (arrayOfString.length >= 1)
      this.dyq = arrayOfString[0];
    if (arrayOfString.length >= 2)
      this.lwa = arrayOfString[1];
    if (arrayOfString.length >= 3)
      this.lwb = arrayOfString[2];
  }

  void jz(String paramString) {
    this.dyo = paramString;
  }

  void qe(String paramString) {
    this.dyp = paramString;
  }

  void qf(String paramString) {
    this.dys = paramString;
  }

  public void xp(int paramInt) {
    this.dyr = paramInt;
  }

  public void e(bSl parambSl) {
    this.lwe = parambSl;
  }

  public bSl cyy() {
    return this.lwe;
  }

  public boolean cyz() {
    return !dzp.qF(this.dys);
  }

  public String cyA() {
    return this.dys;
  }

  public int cyB() {
    return this.dyr;
  }

  public boolean cyC() {
    return !dzp.qF(this.dyp);
  }

  public String cyD() {
    return this.dyp;
  }

  public boolean cyE() {
    return !dzp.qF(this.dyo);
  }

  public String cyF() {
    return this.dyo;
  }

  public void ax(short paramShort) {
    this.dcA = paramShort;
  }

  public short ats() {
    return this.dcA;
  }

  public void hT(boolean paramBoolean) {
    this.lwd = paramBoolean;
  }

  public boolean cyI() {
    return this.lwd;
  }

  public void f(dCb paramdCb) {
    this.lwc = paramdCb;

    this.lwc.id(dLw.mbj.asR());
    try
    {
      this.lwc.c(this.dyn.E());
      na("AnimStatique");

      if ((this.lwf == null) || (this.lwf.isEmpty())) {
        return;
      }

      for (int i = 0; i < this.lwf.size(); i++)
        ((bUc)this.lwf.get(i)).a(this);
    }
    catch (Exception localException)
    {
      K.error(localException);
    }
  }

  public long na(String paramString) {
    if (this.lwc == null) {
      return 0L;
    }
    this.lwc.eq(paramString);
    return this.lwc.H(paramString);
  }

  public dCb cyG() {
    return this.lwc;
  }

  public aAn cyH()
  {
    return this.dyn;
  }

  public void a(bUc parambUc) {
    if (this.lwf == null) {
      this.lwf = new ArrayList();
    }
    this.lwf.add(parambUc);
  }

  public void b(bUc parambUc) {
    if (this.lwf != null)
      this.lwf.remove(parambUc);
  }

  public void b(cCq paramcCq)
  {
    if (paramcCq == null) {
      return;
    }
    this.dyq = paramcCq.cyt();
    if (paramcCq.cyv())
      this.lwa = paramcCq.cyu();
    else {
      this.lwa = null;
    }

    if (paramcCq.cyx())
      this.lwb = paramcCq.cyw();
    else {
      this.lwb = null;
    }
    this.dys = paramcCq.cyA();
    this.dyr = paramcCq.cyB();
    this.dyp = paramcCq.cyD();
    this.dyo = paramcCq.cyF();
    this.lwc = paramcCq.cyG();
    this.lwe = paramcCq.cyy();
    this.dcA = paramcCq.ats();
  }
}