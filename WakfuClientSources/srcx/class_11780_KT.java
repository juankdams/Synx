import com.ankamagames.wakfu.client.binaryStorage.ResourceBinaryData;
import org.apache.log4j.Logger;

public class KT
  implements asq
{
  private static final Logger K = Logger.getLogger(KT.class);

  public void a(dnq paramdnq) {
    cze.cwb().a(new ResourceBinaryData(), new KC(this));

    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.resource");
  }

  public static dxy b(ResourceBinaryData paramResourceBinaryData) {
    int i = paramResourceBinaryData.getId();
    cSR localcSR = paramResourceBinaryData.BE();
    int j = paramResourceBinaryData.getType();
    int k = paramResourceBinaryData.BD();
    boolean bool1 = paramResourceBinaryData.isBlocking();
    short s1 = paramResourceBinaryData.BC();
    int[] arrayOfInt = paramResourceBinaryData.Bz();
    short s2 = paramResourceBinaryData.Bs();
    short s3 = paramResourceBinaryData.Bt();
    short s4 = paramResourceBinaryData.Bu();
    short s5 = paramResourceBinaryData.Bv();
    boolean bool2 = paramResourceBinaryData.Bw();
    Object localObject;
    if (paramResourceBinaryData.Bx()) {
      localObject = new ceV(i, (short)j, s4, s5, s2, s3, bool1, s1, localcSR, k, bool2);
      ((ceV)localObject).N(paramResourceBinaryData.BA());
      ((ceV)localObject).cZ(paramResourceBinaryData.By());
    } else {
      localObject = new dxy(i, (short)j, s4, s5, s2, s3, bool1, s1, localcSR, k, bool2);
    }

    for (int m = 0; m < arrayOfInt.length; m++) {
      int n = arrayOfInt[m];
      aDc localaDc = aDc.lY(n);
      if (localaDc == null) {
        K.error("Impossible de trouver la propriété " + n + " définie pour la ressource " + i);
      }
      else {
        ((dxy)localObject).a(localaDc);
      }
    }
    cRm localcRm = new cRm((byte)0, cSO.kFt, null, 0.0F);
    ((dxy)localObject).a(localcRm);
    ((dxy)localObject).oQ(paramResourceBinaryData.BB().length);
    for (bPB localbPB : paramResourceBinaryData.BB()) {
      a((dxy)localObject, localbPB);
    }

    return localObject;
  }

  private static void a(dxy paramdxy, bPB parambPB) {
    int i = parambPB.getIndex();
    byte b = (byte)parambPB.getIndex();
    int j = parambPB.bWe();
    cSO[] arrayOfcSO = cSO.values();

    float[] arrayOfFloat = null;
    float f = 0.0F;
    int k = parambPB.bWg();
    if (k != 0) {
      arrayOfFloat = new bNa(k).bUT();
      f = parambPB.bWf();
    }

    cRm localcRm = new cRm(b, arrayOfcSO[j], arrayOfFloat, f);
    paramdxy.a(localcRm);
    localcRm.vU(parambPB.bWd().length);

    for (JT localJT : parambPB.bWd()) {
      bKi localbKi = a(paramdxy.getId(), i, localJT);
      localcRm.a(localbKi); }  } 
  private static bKi a(int paramInt1, int paramInt2, JT paramJT) { int i = paramJT.getId();
    int j = paramJT.Ur();
    int k = paramJT.Uq();
    int m = paramJT.Us();
    int n = paramJT.Uu();
    int i1 = paramJT.Ut();
    int i2 = paramJT.Ux();
    int i3 = paramJT.getDuration();
    byte b = (byte)paramJT.Uz();
    String str = paramJT.uL();
    int i4 = paramJT.Uv();
    int i5 = paramJT.oc();
    int[] arrayOfInt = paramJT.Uy();
    boolean bool = paramJT.UA();

    ada localada = new ada(i4, i5);
    bZA localbZA;
    try { localbZA = aVj.hn(str);
    } catch (Exception localException) {
      K.error("Erreur de compilation du critèrre sur l'action de collecte de ressource " + paramJT.getId() + " de la ressource " + paramInt1);
      return null;
    }
    return new bKi(i, paramInt2, k, m, i1, i3, i2, n, localbZA, j, b, localada, bool, arrayOfInt);
  }
}