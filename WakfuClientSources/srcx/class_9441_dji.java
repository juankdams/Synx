import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class dji extends ZS
{
  public static final int lfT = -1;
  protected static final Logger K = Logger.getLogger(dji.class);

  private static final aee aOr = new bOO(new dyx());
  private boolean lfU;
  private boolean lfV;
  private boolean lfW;
  private doA lfX;
  private int lfY = -1;
  private boolean lfZ = true;
  private int lga = 0;
  private boolean izP = false;
  private boolean lgb = false;
  private aoC lgc = aoC.dtT;
  private List aEZ;

  private dji()
  {
    this.lfV = false;
    this.lfW = false;
  }

  public static dji a(boolean paramBoolean1, boolean paramBoolean2, doA paramdoA) {
    dji localdji;
    try {
      localdji = (dji)aOr.Mm();
      localdji.lfU = true;
    } catch (Exception localException) {
      localdji = new dji();
      K.error("Erreur lors d'un newInstance sur un ActionCost : " + localException.getMessage());
    }
    localdji.lfV = paramBoolean1;
    localdji.lfW = paramBoolean2;
    localdji.lfX = paramdoA;
    return localdji;
  }

  public boolean cRT() {
    return this.lfV;
  }

  public boolean cRU() {
    return this.lfW;
  }

  public doA cRV() {
    return this.lfX;
  }

  public int cRW() {
    return this.lfY;
  }

  public void Ao(int paramInt) {
    this.lfY = paramInt;
  }

  public void jt(boolean paramBoolean) {
    this.lfZ = paramBoolean;
  }

  public boolean alB() {
    return this.lfZ;
  }

  public boolean cRX() {
    return this.lgb;
  }

  public void cRY() {
    this.lgb = true;
  }

  public void Ap(int paramInt) {
    this.lgc = aoC.dtU;
    this.lga = paramInt;
  }

  public void a(int paramInt, aoC paramaoC) {
    if (paramaoC == aoC.dtT) {
      K.error("On ne peut pas forcer une valeur avec le type NONE");
      return;
    }
    this.lgc = paramaoC;
    this.lga = paramInt;
  }

  public int cRZ() {
    return this.lga;
  }

  public boolean cSa() {
    return this.lgc != aoC.dtT;
  }

  public aoC cSb() {
    return this.lgc;
  }

  public boolean cSc() {
    return this.izP;
  }

  public void ic(boolean paramBoolean) {
    this.izP = paramBoolean;
  }

  public void a(bxS parambxS) {
    if (this.aEZ == null)
      this.aEZ = new ArrayList();
    if (!this.aEZ.contains(parambxS))
      this.aEZ.add(parambxS);
  }

  public void b(bxS parambxS) {
    if (this.aEZ == null)
      return;
    this.aEZ.remove(parambxS);
  }

  public List cpz() {
    return this.aEZ;
  }

  public void aJ() {
  }

  public void bc() {
    this.lfV = false;
    this.lfW = false;
    this.lfY = -1;
    this.lfZ = true;
    this.lgc = aoC.dtT;
    this.aEZ = null;
    this.lga = 0;
    this.izP = false;
    this.lfX = null;
    this.lfU = false;
    this.lgb = false;
  }

  public void release() {
    if (!this.lfU) {
      K.error("Tentative de remettre un WakfuEffectExecutionParameters qui n'est pas checkouté dans le pool " + bBd.bJO());
      return;
    }
    try {
      aOr.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + " normalement impossible");
    }
  }

  public dji cSd() {
    dji localdji = a(this.lfV, this.lfW, this.lfX);
    localdji.lfY = this.lfY;
    localdji.lga = this.lga;
    localdji.lgc = this.lgc;
    localdji.lfZ = this.lfZ;
    localdji.izP = this.izP;
    localdji.lgb = this.lgb;
    if (this.aEZ != null) {
      localdji.aEZ = new ArrayList(this.aEZ);
    }
    return localdji;
  }
}