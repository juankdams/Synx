import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cdI
  implements bXd, eo
{
  private static final Logger K = Logger.getLogger(cdI.class);

  public static final cdI hxG = new abb(null);
  private final bBn hxH;
  private int[] hxI;

  public cdI(bBn parambBn)
  {
    this.hxH = parambBn;
    this.hxI = new int[this.hxH == null ? 0 : this.hxH.bKC()];
  }

  public cdI(bBn parambBn, cdI paramcdI) {
    this.hxH = parambBn;

    int i = paramcdI.hxI.length;
    this.hxI = new int[i];
    for (int j = 0; j < i; j++)
      this.hxI[j] = paramcdI.hxI[j];
  }

  public boolean nM()
  {
    byte b1 = 0; for (byte b2 = (byte)this.hxI.length; b1 < b2; b1 = (byte)(b1 + 1)) {
      if (dE(b1)) {
        return true;
      }
    }

    return false;
  }

  public boolean dE(byte paramByte) {
    return this.hxI[paramByte] > 0;
  }

  public boolean isEditable() {
    return true;
  }

  private int cgw() {
    int i = 0; for (int j = this.hxI.length; i < j; i++) {
      if (this.hxI[i] == 0) {
        return i;
      }
    }

    return -1;
  }

  public boolean d(bBn parambBn) {
    if (parambBn.bKD() != aRQ.eOV) {
      return false;
    }

    if (parambBn.nU() < this.hxH.nU()) {
      return false;
    }

    int i = cgw();
    return i != -1;
  }

  public void e(bBn parambBn) {
    int i = cgw();
    if (i == -1) {
      throw new dEi("On essaye d'équiper une gemme alors qu'il n'y a plus d'emplacements disponibles");
    }
    this.hxI[i] = parambBn.getId();
  }

  public int aF(byte paramByte) {
    if (!dE(paramByte)) {
      throw new dEi("tentative de retrait d'une gemme d'un slot vide");
    }

    int i = this.hxI[paramByte];
    this.hxI[paramByte] = 0;
    return i;
  }

  public byte cgx() {
    return this.hxH == null ? 0 : this.hxH.bKC();
  }

  public int uS(int paramInt) {
    return this.hxI[paramInt];
  }

  public int cgy() {
    for (int i = this.hxI.length - 1; i >= 0; i--) {
      int j = this.hxI[i];
      if (j != 0) {
        aF((byte)i);
        return i;
      }
    }
    return -1;
  }

  public boolean a(bQo parambQo) {
    int i = 0; for (int j = this.hxI.length; i < j; i++) {
      TG localTG = new TG();
      localTG.aYU = ((byte)i);
      localTG.bPw = this.hxI[i];
      parambQo.gYv.add(localTG);
    }
    return true;
  }

  public boolean b(bQo parambQo) {
    this.hxI = new int[cgx()];
    for (TG localTG : parambQo.gYv) {
      int i = localTG.aYU;
      int j = localTG.bPw;
      if (j != 0) {
        bBn localbBn = Hh.QM().dh(j);
        if (localbBn == null) {
          K.warn("Problème à la désérialisation, on essaye de placer une gemme inconnue d'id : " + j, new Exception());
        }

      }
      else if ((i < 0) || (i >= this.hxI.length)) {
        K.warn("Problème à la désérialisation, on essaye de placer une gemme à un emplacement indisponible", new Exception());
      }
      else {
        this.hxI[i] = j;
      }
    }
    return true;
  }

  public String ov() {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("gems(");
    for (int i = 0; i < this.hxI.length; i++) {
      localStringBuffer.append(this.hxI[i]);
      if (i < this.hxI.length - 1) {
        localStringBuffer.append(", ");
      }
    }
    localStringBuffer.append(")");
    return localStringBuffer.toString();
  }
}