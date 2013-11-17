import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class NQ
{
  protected static final Logger K = Logger.getLogger(NQ.class);
  public static final int ceC = 5;
  private static final int ceD = 1974;
  private boolean Vm = false;

  protected final csi[] ceE = new csi[5];
  protected final boolean[] ceF = new boolean[5];

  private final cQq ceG = new cQq();

  protected byte ceH = 0;
  protected byte ceI;
  protected ajF ceJ;

  public int aaa()
  {
    int i = this.ceJ.aws();
    return Math.min(i, 5);
  }

  public boolean aab()
  {
    return true;
  }

  public void a(ajF paramajF) {
    this.ceJ = paramajF;
  }

  public csi aac() {
    return aj(this.ceH);
  }

  public csi aj(byte paramByte) {
    if ((paramByte < 0) || (paramByte >= this.ceE.length)) {
      K.error("[SYMBIOT] index invalide " + paramByte);
      return null;
    }
    return this.ceE[paramByte];
  }

  public byte aad() {
    return this.ceI;
  }

  public byte a(csi paramcsi) {
    if (paramcsi == null)
      return -1;
    for (byte b = 0; b < 5; b = (byte)(b + 1)) {
      if (this.ceE[b] == paramcsi) {
        return b;
      }
    }
    return -1;
  }

  public byte bL(long paramLong) {
    for (byte b = 0; b < 5; b = (byte)(b + 1)) {
      if ((this.ceE[b] != null) && (this.ceE[b].cqG() == paramLong)) {
        return b;
      }
    }
    return -1;
  }

  public byte aae() {
    return this.ceH;
  }

  public void ak(byte paramByte) {
    this.ceH = paramByte;
  }

  public byte b(csi paramcsi) {
    if (!aab()) {
      return -1;
    }

    byte b1 = -1;
    for (byte b2 = 4; b2 >= 0; b2 = (byte)(b2 - 1))
    {
      if (this.ceE[b2] == null)
        b1 = b2;
      else if (this.ceE[b2] == paramcsi) {
        return -1;
      }
    }

    if (b1 != -1) {
      a(paramcsi, b1);
    }

    return b1;
  }

  public void a(csi paramcsi, byte paramByte) {
    if (paramcsi == null) {
      K.warn("[SYMBIOT] ajout des paramètres d'invoc null");
      return;
    }
    K.info("[SYMBIOT] ajout des paramètres d'invoc " + paramcsi.cqG() + " à l'emplacement " + paramByte);
    try {
      if (this.ceE[paramByte] == null) {
        this.ceE[paramByte] = paramcsi;
        c(paramcsi);
        this.ceF[paramByte] = true;
      }

      this.Vm = true;
      if (this.ceI == 0) {
        ak(paramByte);
      }
      this.ceI = ((byte)(this.ceI + 1));
      if (this.ceJ != null)
        this.ceJ.aX(paramByte);
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      K.error("[SYMBIOT] index en dehors du tableau de cible lors de l'ajout");
    }
  }

  public void al(byte paramByte) {
    K.info("[Symbiot] on retire l'invoc d'emplacement " + paramByte);
    try {
      this.Vm = true;
      csi localcsi = this.ceE[paramByte];
      this.ceE[paramByte] = null;
      this.ceF[paramByte] = false;

      if (localcsi != null) {
        this.ceI = ((byte)(this.ceI - 1));
      }
      if (this.ceI == 0) {
        ak((byte)-1);
      }
      else if (paramByte == this.ceH) {
        for (byte b = 0; b < 5; b = (byte)(b + 1)) {
          if (this.ceE[b] != null) {
            ak(b);
            break;
          }
        }
      }
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      K.error("[SYMBIOT] on demande de supprimer une ligne en dehors du tableau de cible");
    }
  }

  public void am(byte paramByte) {
    K.info("[Symbiot] on vide les invocs sur l'emplacement " + paramByte);
    try {
      al(paramByte);
      if (this.ceJ != null)
        this.ceJ.aY(paramByte);
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      K.error("[SYMBIOT] on demande de destroy une ligne en dehors du tableau de cible");
    }
  }

  public void bM(long paramLong) {
    d(bL(paramLong), true);
  }

  public void aaf() {
    d(this.ceH, false);
  }

  public void d(byte paramByte, boolean paramBoolean) {
    try {
      if (this.ceE[paramByte] != null)
        this.ceF[paramByte] = paramBoolean;
      else
        K.error("[SYMBIOT] on demande de rendre une creature accessible mais son index est invalide " + paramByte);
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      K.error("[SYMBIOT] on demande rendre une creature accessible mais son index est invalide " + paramByte);
    }
  }

  public boolean an(byte paramByte) {
    try {
      if (this.ceE[paramByte] != null)
        return this.ceF[paramByte];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      K.error("[SYMBIOT] on demande de supprimer une ligne en dehors du tableau de cible");
    }
    return false;
  }

  public void clearAll() {
    this.ceI = 0;
    for (int i = 0; i < 5; i++) {
      this.ceE[i] = null;
      this.ceF[i] = false;
    }
    this.ceH = 0;
    this.Vm = false;
  }

  public void aag() {
    this.Vm = true;
  }

  public boolean ib() {
    return this.Vm;
  }

  public void aah() {
    this.Vm = false;
  }

  public boolean a(bxb parambxb)
  {
    for (byte b = 0; b < 5; b = (byte)(b + 1)) {
      csi localcsi = this.ceE[b];
      if (localcsi != null) {
        bql localbql = new bql();
        localbql.fLp.cUJ = b;
        localbql.fLp.cUK = localcsi.Rw();
        localbql.fLp.aDf = 1;
        localbql.fLp.name = localcsi.getName();
        parambxb.ghz.add(localbql);
      }
    }
    parambxb.ghA = this.ceH;
    return true;
  }

  public boolean b(bxb parambxb)
  {
    clearAll();
    for (bql localbql : parambxb.ghz)
      if (localbql.fLp.cUK != 1974)
      {
        csi localcsi = Q(localbql.fLp.cUK);
        localcsi.setName(localbql.fLp.name);
        this.ceE[localbql.fLp.cUJ] = localcsi;
        this.ceF[localbql.fLp.cUJ] = true;
        this.ceI = ((byte)(this.ceI + 1));
      }
    this.ceH = parambxb.ghA;
    this.ceJ.awr();
    aai();
    return true;
  }

  protected void aai() {
    for (csi localcsi : this.ceE)
      if (localcsi != null)
        c(localcsi);
  }

  protected abstract void c(csi paramcsi);

  public abstract csi Q(short paramShort);

  public int[] aaj()
  {
    int[] arrayOfInt = new int[this.ceE.length];
    for (int i = 0; i < this.ceE.length; i++)
      if (this.ceE[i] != null)
        arrayOfInt[i] = this.ceE[i].cqE();
      else
        arrayOfInt[i] = 0;
    return arrayOfInt;
  }

  public void l(dhJ paramdhJ) {
  }

  public void aak() {
    this.ceG.aak();
  }

  public void aal() {
    for (int i = 0; i < this.ceF.length; i++) {
      this.ceF[i] = true;
    }
    this.ceG.reset();
  }

  public void aam() {
  }

  public int R(short paramShort) {
    int i = 0;
    for (int j = 0; j < 5; j = (byte)(j + 1)) {
      if (this.ceE[j] != null)
      {
        csi localcsi = this.ceE[j];
        if (localcsi.Rw() == paramShort) {
          i++;
        }
      }
    }
    for (j = (byte)(aaa() - 1); j >= 0; j = (byte)(j - 1))
    {
      if (this.ceE[j] == null) {
        i++;
      }
    }

    return i;
  }
}