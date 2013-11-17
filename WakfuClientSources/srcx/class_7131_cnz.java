import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cnz extends bCA
{
  public static final int FILE_VERSION = 0;
  public static final int hUn = 255;
  private static final Logger K = Logger.getLogger(cnz.class);

  private final aoL gNu = new aoL();

  public byte cob() {
    return 0;
  }

  public aoL bSI() {
    return this.gNu;
  }

  public brS hD(long paramLong) {
    return (brS)this.gNu.get(paramLong);
  }

  public void b(aYQ paramaYQ, boolean paramBoolean)
  {
    super.b(paramaYQ, paramBoolean);
    e(paramaYQ, paramBoolean);
    coc();
  }

  private void e(aYQ paramaYQ, boolean paramBoolean) {
    if (paramBoolean) {
      this.gNu.clear();
    }

    int i = paramaYQ.readShort();
    if (i == 0) {
      return;
    }

    for (int j = 0; j < i; j++) {
      brS localbrS = new brS();
      localbrS.d(paramaYQ);
      this.gNu.put(localbrS.aTz, localbrS);
    }
  }

  private void coc() {
    cSR localcSR = bKY();
    for (dmn localdmn = localcSR.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      avH localavH = (avH)localdmn.value();
      if (localavH.dKu != null)
      {
        int i = 0; for (int j = localavH.dKu.size(); i < j; i++) {
          PH localPH = (PH)localavH.dKu.get(i);
          try {
            localPH.aB = aVj.hn(localPH.cij);
          } catch (Exception localException) {
            K.warn("Impossible de compiler le critère " + localPH.cij + " sur la description de landMark d'id " + localPH.aw);
          }
        }
      }
    }
  }

  public void U(ArrayList paramArrayList)
  {
    int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
      brS localbrS = (brS)paramArrayList.get(i);
      this.gNu.put(localbrS.aTz, localbrS);
    }
  }

  public void b(dSw paramdSw)
  {
    super.b(paramdSw);
    h(paramdSw);
  }

  private void h(dSw paramdSw) {
    int i = this.gNu.size();
    if (i > 32767) {
      throw new IllegalArgumentException("Nombre d'elements interactifs superieur à 32767");
    }
    paramdSw.writeShort((short)i);
    for (cHu localcHu = this.gNu.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((brS)localcHu.value()).b(paramdSw);
    }
  }

  public void clear()
  {
    super.clear();
    this.gNu.clear();
  }
}