import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class Em extends cMb
{
  private static final Logger K = Logger.getLogger(Em.class);
  private static final Pattern bJe = Pattern.compile(";");
  private int bJf;
  private boolean bJg;

  private Em()
  {
    boO();
  }

  public void aJ()
  {
    super.aJ();
    setVisible(true);
    this.bJf = 0;
    this.bJg = false;
    x((short)0);
    eu(false);
    ev(false);
    ix(false);
  }

  public void a(abc paramabc)
  {
    K.debug("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    return true;
  }

  public dJO eR()
  {
    return dJO.lVD;
  }

  public dJO[] eS()
  {
    return dJO.lWj;
  }

  public byte bY()
  {
    return 0;
  }

  public int MU() {
    return this.bJf;
  }

  public void MV() {
    if ((!this.mwI) || (!this.bJg) || (!isVisible())) {
      return;
    }
    int i = fa();
    int j = fb();
    int k = fc();

    int m = WakfuClientInstance.awy().Dg().Y(i, j, k);
    aWc.blo().a(this.aTz, wK.dq(this.bJf), new aAv(i, j, k, false, m));
  }

  public void MW()
  {
    super.MW();
    MV();
  }

  public void tk()
  {
    MX();
    super.tk();
  }

  private void MX() {
    if (this.bJg)
      aWc.blo().eQ(this.aTz);
  }

  public void setVisible(boolean paramBoolean)
  {
    boolean bool = isVisible();
    super.setVisible(paramBoolean);

    if (bool == paramBoolean) {
      return;
    }

    if (paramBoolean)
      MV();
    else
      MX();
  }

  public void al()
  {
    super.al();

    String[] arrayOfString = bJe.split(this.fgH);
    if (arrayOfString.length != 1) {
      K.error("[LD] L'audioMarker " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    int i;
    try {
      i = Integer.valueOf(arrayOfString[0]).intValue();
    } catch (NumberFormatException localNumberFormatException) {
      K.error("[LD] L'audioMarker " + this.aTz + " a un parametre [" + arrayOfString[0] + "] qui n'est pas du bon type (id attendu)");
      return;
    }

    ME localME = (ME)aKY.epr.a(cdc.hvY, i);
    if (localME == null) {
      K.error("[LD] L'audioMarker " + this.aTz + " a un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }

    this.bJf = localME.WH();
    this.bJg = localME.ym();
  }

  public boolean b(dJO paramdJO, bhL parambhL)
  {
    return false;
  }
}