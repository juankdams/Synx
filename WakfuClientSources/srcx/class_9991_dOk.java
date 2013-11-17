import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import org.apache.log4j.Logger;

public class dOk
{
  private static final Logger K = Logger.getLogger(dOk.class);
  protected final bJC gWu;

  public dOk(bJC parambJC)
  {
    this.gWu = parambJC;
  }

  public void eK(short paramShort) {
    this.gWu.gLa = paramShort;
  }

  public void eL(short paramShort) {
    this.gWu.gLb = paramShort;
  }

  public void eM(short paramShort) {
    this.gWu.gLc = paramShort;
  }

  public void dC(float paramFloat) {
    this.gWu.gLd = paramFloat;
  }

  public void la(boolean paramBoolean) {
    this.gWu.aOD = paramBoolean;
  }

  public void lb(boolean paramBoolean) {
    this.gWu.aOE = paramBoolean;
  }

  public void De(int paramInt) {
    this.gWu.gLe = paramInt;
  }

  public void Df(int paramInt) {
    this.gWu.gLf = paramInt;
  }

  public void lc(boolean paramBoolean) {
    this.gWu.bKH = paramBoolean;
  }

  public void ld(boolean paramBoolean) {
    this.gWu.bKF = paramBoolean;
  }

  public void le(boolean paramBoolean) {
    this.gWu.gLg = paramBoolean;
  }

  public void lf(boolean paramBoolean) {
    this.gWu.bKK = paramBoolean;
  }

  public void lg(boolean paramBoolean) {
    this.gWu.gLh = paramBoolean;
  }

  public void ac(int[] paramArrayOfInt) {
    if (paramArrayOfInt == null)
      this.gWu.gLi = new adz();
    else
      this.gWu.gLi = new adz(paramArrayOfInt);
  }

  public void rE(String paramString)
  {
    try {
      this.gWu.gLj = aVj.hn(paramString);
    } catch (Exception localException) {
      K.error("Erreur lors de la compilation des critères de l'état " + this.gWu.bQW(), localException);
    }
  }

  public void lh(boolean paramBoolean) {
    this.gWu.bKN = paramBoolean;
  }

  public void fT(byte paramByte) {
    this.gWu.bKO = paramByte;
  }

  public void li(boolean paramBoolean) {
    this.gWu.bKM = paramBoolean;
  }

  public void aQ(short paramShort) {
    this.gWu.cZu = paramShort;
  }

  public void tX(int paramInt) {
    this.gWu.gLo = paramInt;
  }

  public void fU(byte paramByte) {
    this.gWu.gLm = bGX.sU(paramByte);
  }

  public void lj(boolean paramBoolean) {
    this.gWu.gLq = paramBoolean;
  }

  public void ad(int[] paramArrayOfInt) {
    BitSet localBitSet = new BitSet();
    for (int k : paramArrayOfInt) {
      localBitSet.set(k);
    }
    this.gWu.e(localBitSet);
  }

  public void a(cjT paramcjT) {
    this.gWu.eqL = paramcjT;
  }

  public void rF(String paramString) {
    this.gWu.gLn = new ArrayList();
    if (paramString.trim().length() == 0) {
      return;
    }

    String[] arrayOfString1 = dzp.c(paramString, '~');
    for (String str : arrayOfString1)
      if (!c(str, this.gWu.gLn))
        K.error("Impossible d'ajouter à l'état " + this.gWu.bQW() + " l'HMIAction :" + str);
  }

  private static boolean c(String paramString, Collection paramCollection)
  {
    String[] arrayOfString = paramString.split("\\|", -1);

    if (arrayOfString.length % 2 != 0) {
      K.error("HMI error : Nombre de paramètres décodés: " + arrayOfString.length + " Attendu: pair ");
      return false;
    }

    Byte localByte = Byte.valueOf((byte)0);
    Object localObject = "";
    boolean bool = false;

    for (int i = 0; i < arrayOfString.length; i += 2) {
      String str1 = arrayOfString[i];
      String str2 = arrayOfString[(i + 1)];

      if (str1.equals("type"))
        localByte = Byte.valueOf(Byte.parseByte(str2));
      else if (str1.equals("data"))
        localObject = str2;
      else if (str1.equals("broadcast")) {
        bool = Boolean.parseBoolean(str2);
      }
    }

    cHP localcHP = jQ.rA().a(localByte.byteValue(), (String)localObject, bool);
    if (localcHP != null) {
      paramCollection.add(localcHP);
      return true;
    }
    return false;
  }
}