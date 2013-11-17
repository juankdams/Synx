import com.ankamagames.wakfu.client.binaryStorage.StaticEffectBinaryData;
import org.apache.log4j.Logger;

public class ciQ extends dva
{
  private static final Logger K = Logger.getLogger(ciQ.class);
  private static final ciQ hIj = new ciQ();

  private aVS gwm = new apk(this);

  public void a(aVS paramaVS)
  {
    this.gwm = paramaVS;
  }

  public static ciQ ckL() {
    return hIj;
  }

  protected final dpI vs(int paramInt)
  {
    if (paramInt <= 0) {
      return null;
    }
    StaticEffectBinaryData localStaticEffectBinaryData = (StaticEffectBinaryData)this.gwm.jt(paramInt);
    if (localStaticEffectBinaryData == null) {
      return null;
    }
    return a(localStaticEffectBinaryData);
  }

  public final dpI vt(int paramInt) {
    dpI localdpI = vs(paramInt);
    if (localdpI != null) {
      a(localdpI);
    }
    return localdpI;
  }

  protected final dpI a(StaticEffectBinaryData paramStaticEffectBinaryData)
  {
    boolean bool = paramStaticEffectBinaryData.yQ();
    cFp localcFp;
    if (bool) {
      if (paramStaticEffectBinaryData.yO())
        localcFp = d(paramStaticEffectBinaryData);
      else
        localcFp = c(paramStaticEffectBinaryData);
    }
    else {
      localcFp = b(paramStaticEffectBinaryData);
    }

    localcFp.a(aVe.cu(paramStaticEffectBinaryData.zt()));
    localcFp.a(cSp.eE(paramStaticEffectBinaryData.zu()));
    localcFp.a(aGX.bJ(paramStaticEffectBinaryData.zs()));
    localcFp.ko(paramStaticEffectBinaryData.zM());
    localcFp.dH(paramStaticEffectBinaryData.zN());
    localcFp.dI(paramStaticEffectBinaryData.zP());
    localcFp.dJ(paramStaticEffectBinaryData.zQ());
    localcFp.ia(paramStaticEffectBinaryData.zR());
    localcFp.s(paramStaticEffectBinaryData.zO());

    a(paramStaticEffectBinaryData, paramStaticEffectBinaryData.yR(), localcFp);

    return localcFp;
  }

  private void a(StaticEffectBinaryData paramStaticEffectBinaryData, int paramInt, cFp paramcFp) {
    if (paramStaticEffectBinaryData.zA().trim().length() == 0) {
      return;
    }
    String[] arrayOfString1 = dzp.c(paramStaticEffectBinaryData.zA(), '~');
    for (String str1 : arrayOfString1) {
      String[] arrayOfString3 = str1.split("\\|", -1);

      if (arrayOfString3.length % 2 != 0) {
        K.error("HMI error : Nombre de paramètres décodés: " + arrayOfString3.length + " Attendu: 8 [" + paramStaticEffectBinaryData.zA() + "]");
      }
      else
      {
        Byte localByte1 = Byte.valueOf((byte)0);
        Byte localByte2 = Byte.valueOf((byte)0);
        Byte localByte3 = Byte.valueOf((byte)0);
        Object localObject = "";
        boolean bool = false;

        for (int k = 0; k < arrayOfString3.length; k += 2) {
          String str2 = arrayOfString3[k];
          String str3 = arrayOfString3[(k + 1)];

          if (str2.equals("start"))
            localByte1 = Byte.valueOf(Byte.parseByte(str3));
          else if (str2.equals("end"))
            localByte2 = Byte.valueOf(Byte.parseByte(str3));
          else if (str2.equals("type"))
            localByte3 = Byte.valueOf(Byte.parseByte(str3));
          else if (str2.equals("data"))
            localObject = str3;
          else if (str2.equals("broadcast")) {
            bool = Boolean.parseBoolean(str3);
          }
        }

        cHP localcHP = jQ.rA().a(localByte3.byteValue(), (String)localObject, bool);
        if (localcHP != null) {
          switch (localByte1.byteValue()) {
          case 0:
            paramcFp.a(localcHP);
            break;
          case 1:
            paramcFp.c(localcHP);
            break;
          case 2:
            paramcFp.b(localcHP);
            break;
          default:
            K.error("Impossible d'enregistrer le début d'une HMIAction pour l'effet " + paramInt + " : type de début non connu : " + localByte1);
          }
          switch (localByte2.byteValue()) {
          case 11:
            paramcFp.e(localcHP);
            break;
          case 12:
            paramcFp.d(localcHP);
            break;
          case 10:
            localcHP.ig(true);
            break;
          default:
            K.error("Impossible d'enregistrer la fin d'une HMIAction pour l'effet " + paramInt + " : type de fin non connu : " + localByte2); break;
          }
        } else {
          K.error("Erreur lors du chargement de l'HMIAction de type " + localByte3 + " sur l'effet " + paramInt);
        }
      }
    }
  }

  private cFp b(StaticEffectBinaryData paramStaticEffectBinaryData) { return new cFp(paramStaticEffectBinaryData.yR(), paramStaticEffectBinaryData.eo(), g(paramStaticEffectBinaryData), paramStaticEffectBinaryData.yZ(), paramStaticEffectBinaryData.za(), paramStaticEffectBinaryData.zb(), paramStaticEffectBinaryData.zc(), paramStaticEffectBinaryData.zd(), paramStaticEffectBinaryData.ze(), paramStaticEffectBinaryData.zf(), f(paramStaticEffectBinaryData), e(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zi(), paramStaticEffectBinaryData.zp(), paramStaticEffectBinaryData.zq(), paramStaticEffectBinaryData.zr(), paramStaticEffectBinaryData.yL(), paramStaticEffectBinaryData.yM(), paramStaticEffectBinaryData.yN(), paramStaticEffectBinaryData.zv(), paramStaticEffectBinaryData.zB(), paramStaticEffectBinaryData.zC(), j(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zw(), paramStaticEffectBinaryData.zx(), paramStaticEffectBinaryData.zy(), paramStaticEffectBinaryData.zT(), paramStaticEffectBinaryData.zG(), false, false, paramStaticEffectBinaryData.zH(), k(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zJ(), paramStaticEffectBinaryData.zK(), paramStaticEffectBinaryData.zL()); }


  private cFp c(StaticEffectBinaryData paramStaticEffectBinaryData)
  {
    return new aXT(paramStaticEffectBinaryData.yR(), paramStaticEffectBinaryData.eo(), g(paramStaticEffectBinaryData), paramStaticEffectBinaryData.yZ(), paramStaticEffectBinaryData.za(), paramStaticEffectBinaryData.zb(), paramStaticEffectBinaryData.zc(), paramStaticEffectBinaryData.zd(), paramStaticEffectBinaryData.ze(), paramStaticEffectBinaryData.zf(), f(paramStaticEffectBinaryData), e(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zi(), h(paramStaticEffectBinaryData), i(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zp(), paramStaticEffectBinaryData.zq(), paramStaticEffectBinaryData.zr(), paramStaticEffectBinaryData.yL(), paramStaticEffectBinaryData.yM(), paramStaticEffectBinaryData.yN(), paramStaticEffectBinaryData.zv(), paramStaticEffectBinaryData.zB(), paramStaticEffectBinaryData.zC(), j(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zw(), paramStaticEffectBinaryData.zx(), paramStaticEffectBinaryData.zy(), paramStaticEffectBinaryData.zT(), paramStaticEffectBinaryData.zG(), true, paramStaticEffectBinaryData.zH(), k(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zJ(), paramStaticEffectBinaryData.zK(), paramStaticEffectBinaryData.zL());
  }

  private cFp d(StaticEffectBinaryData paramStaticEffectBinaryData)
  {
    return new aUE(paramStaticEffectBinaryData.yR(), paramStaticEffectBinaryData.eo(), g(paramStaticEffectBinaryData), paramStaticEffectBinaryData.yZ(), paramStaticEffectBinaryData.za(), paramStaticEffectBinaryData.zb(), paramStaticEffectBinaryData.zc(), paramStaticEffectBinaryData.zd(), paramStaticEffectBinaryData.ze(), paramStaticEffectBinaryData.zf(), f(paramStaticEffectBinaryData), e(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zi(), h(paramStaticEffectBinaryData), i(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zl(), paramStaticEffectBinaryData.zm(), paramStaticEffectBinaryData.zn(), paramStaticEffectBinaryData.zo(), paramStaticEffectBinaryData.zp(), paramStaticEffectBinaryData.zq(), paramStaticEffectBinaryData.zr(), paramStaticEffectBinaryData.yL(), paramStaticEffectBinaryData.yM(), paramStaticEffectBinaryData.yN(), paramStaticEffectBinaryData.zv(), paramStaticEffectBinaryData.zB(), paramStaticEffectBinaryData.zC(), j(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zw(), paramStaticEffectBinaryData.zx(), paramStaticEffectBinaryData.zy(), paramStaticEffectBinaryData.zT(), paramStaticEffectBinaryData.zG(), true, paramStaticEffectBinaryData.zH(), k(paramStaticEffectBinaryData), paramStaticEffectBinaryData.zI(), paramStaticEffectBinaryData.zJ(), paramStaticEffectBinaryData.zK(), paramStaticEffectBinaryData.zL());
  }

  private ES e(StaticEffectBinaryData paramStaticEffectBinaryData)
  {
    return new ES(paramStaticEffectBinaryData.zh());
  }

  private long f(StaticEffectBinaryData paramStaticEffectBinaryData) {
    long l = 0L;
    if (paramStaticEffectBinaryData.zg().startsWith("CRITICAL")) {
      l |= 1L;
    }
    return l;
  }

  private bbH g(StaticEffectBinaryData paramStaticEffectBinaryData) {
    bbH localbbH = null;
    try {
      localbbH = chY.a((short)paramStaticEffectBinaryData.yV(), paramStaticEffectBinaryData.yU(), paramStaticEffectBinaryData.yT());
    } catch (IllegalArgumentException localIllegalArgumentException) {
      K.error("Illegal Argument exception pour l'AOE de l'effect d'id : " + paramStaticEffectBinaryData.yR());
    }
    return localbbH;
  }

  private int h(StaticEffectBinaryData paramStaticEffectBinaryData) {
    boolean bool = paramStaticEffectBinaryData.yQ();
    return bool ? paramStaticEffectBinaryData.zj() : -1;
  }

  private float i(StaticEffectBinaryData paramStaticEffectBinaryData) {
    boolean bool = paramStaticEffectBinaryData.yQ();
    return bool ? paramStaticEffectBinaryData.zk() : -1.0F;
  }

  private static bZA j(StaticEffectBinaryData paramStaticEffectBinaryData) {
    if (paramStaticEffectBinaryData.yR() == 92724)
      return null;
    bZA localbZA = null;
    try {
      localbZA = aVj.hn(paramStaticEffectBinaryData.zD());
    } catch (Exception localException) {
      K.error("Erreur lors de la compilation du critère de l'effet " + paramStaticEffectBinaryData.yR() + " de l'item " + paramStaticEffectBinaryData.yS() + " de type " + paramStaticEffectBinaryData.zE(), localException);
    }

    return localbZA;
  }

  private static bbH k(StaticEffectBinaryData paramStaticEffectBinaryData) {
    int i = paramStaticEffectBinaryData.yY();
    int[] arrayOfInt = paramStaticEffectBinaryData.yX();
    short s = paramStaticEffectBinaryData.yW();

    bbH localbbH = null;
    try {
      if (i > 0)
        localbbH = chY.a(i, arrayOfInt, s);
    } catch (IllegalArgumentException localIllegalArgumentException) {
      K.error("zone d'effet vide incorrecte pour l'effet d'id : " + paramStaticEffectBinaryData.yR());
    }
    return localbbH;
  }
}