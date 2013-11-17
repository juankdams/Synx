import java.nio.ByteBuffer;
import java.util.Set;
import org.apache.log4j.Logger;

public abstract class aEv
{
  protected static final Logger K = Logger.getLogger(aEv.class);
  private final aEh eaf;
  private final Xf eag;
  private final cpx eah;
  private final Kk eai;
  private final bil eaj;
  private final bOz eak;
  private final Fo eal;
  private final eb eam;
  private final ddL ean;
  private final ddL eao;
  private final dmR eap;
  private final bgx eaq;

  public aEv()
  {
    this.eaf = new aEh();
    this.eag = new Xf();
    this.eah = new cpx();
    this.eai = new Kk();
    this.eaj = new bil();
    this.eak = new bOz();
    this.eal = new Fo();
    this.eam = new eb();
    this.ean = new ddL();
    this.eao = new ddL();
    this.eap = new dmR();
    this.eaq = new bgx();
  }
  public void clear() {
    this.eaf.clear();
    this.eag.clear();
    this.eah.clear();
    this.eai.clear();
    this.eaj.clear();
    this.eak.clear();
    this.eal.clear();
    this.eam.clear();
    this.ean.clear();
    this.eao.clear();
    this.eap.clear();
    this.eaq.clear();
  }

  public final cpx aQH() {
    return this.eah;
  }

  public final Xf aQI() {
    return this.eag;
  }

  public final aEh aQJ() {
    return this.eaf;
  }

  public final Kk aQK() {
    return this.eai;
  }

  public bil aQL() {
    return this.eaj;
  }

  public final bOz aQM() {
    return this.eak;
  }

  public final Fo aQN() {
    return this.eal;
  }

  public final eb aQO() {
    return this.eam;
  }

  public final bgx aQP() {
    return this.eaq;
  }

  public final ddL aQQ() {
    return this.ean;
  }

  public final ddL aQR() {
    return this.eao;
  }

  public final dmR aQS() {
    return this.eap;
  }

  final akv a(bBL parambBL)
  {
    switch (cte.icM[parambBL.ordinal()]) {
    case 1:
      return dM();
    case 2:
      return dL();
    case 3:
      return em();
    case 4:
      return ec();
    case 5:
      return aQK();
    case 6:
      return aQL();
    case 7:
      return ef();
    case 8:
      return dJ();
    case 9:
      return ee();
    case 10:
      return ed();
    case 11:
      return aQS();
    case 12:
      return dT();
    case 13:
      return dI();
    case 14:
      return aQP();
    case 15:
      return dW();
    case 16:
      return dV();
    case 17:
      return dN();
    case 18:
      return el();
    case 19:
      return aQN();
    case 20:
      return aQR();
    case 21:
      return aQO();
    case 22:
      return dK();
    case 23:
      return aQV();
    case 24:
      return dH();
    case 25:
      return dC();
    case 26:
      return dB();
    case 27:
      return dA();
    case 28:
      return dz();
    case 29:
      return dy();
    case 30:
      return dx();
    case 31:
      return dw();
    case 32:
      return dv();
    case 33:
      return du();
    case 34:
      return aQT();
    case 35:
      return aQU();
    case 36:
      return dP();
    case 37:
      return aQJ();
    case 38:
      return aQI();
    case 39:
      return aQH();
    case 40:
      return dF();
    case 41:
      return aQM();
    case 42:
      return dE();
    case 43:
      return ej();
    case 44:
      return ek();
    case 45:
      return eb();
    case 46:
      return dU();
    case 47:
      return dS();
    case 48:
      return dR();
    case 49:
      return ei();
    case 50:
      return dX();
    case 51:
      return ea();
    case 52:
      return dZ();
    case 53:
      return dY();
    case 54:
      return eh();
    case 55:
      return eg();
    case 56:
      return dQ();
    case 57:
      return dG();
    case 58:
      return aQQ();
    case 59:
      return dO();
    case 60:
      return dt();
    case 61:
      return ds();
    case 62:
      return jdMethod_do();
    case 63:
      return dn();
    case 64:
      return dm();
    case 65:
      return dr();
    case 66:
      return dq();
    case 67:
      return dp();
    case 68:
      return dl();
    }
    return null;
  }

  public final byte[] a(jC paramjC)
  {
    int i = 1;
    Object localObject2;
    for (bBL localbBL : paramjC.rp()) {
      localObject2 = a(localbBL);
      if (localObject2 != null) {
        try {
          ((akv)localObject2).ao().cyP();
        } catch (Exception localException) {
          K.error("Exception lors du callback de sérialisation de la part " + localbBL + " : ", localException);
        }
        i += ((akv)localObject2).O();
      } else {
        K.error("Erreur lors de la récupération de la CharacterSerializedPart correspondant à " + localbBL + " de la forme " + paramjC);
      }
    }
    ??? = ByteBuffer.allocate(i);
    ((ByteBuffer)???).put((byte)paramjC.ordinal());
    for (localObject2 : paramjC.rp()) {
      akv localakv = a((bBL)localObject2);
      if ((localakv != null) && 
        (!localakv.g((ByteBuffer)???))) {
        K.error("Erreur lors de la sérialisation de la part " + localObject2 + " de la forme " + paramjC);
      }
    }

    return ((ByteBuffer)???).array();
  }

  public final void q(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get() & 0xFF;
    if ((i < 0) || (i >= jC.values().length)) {
      K.error("Numéro de part invalide : " + i);
      return;
    }
    jC localjC = jC.values()[i];
    for (bBL localbBL : localjC.rp()) {
      akv localakv = a(localbBL);
      if (localakv != null) {
        localakv.h(localByteBuffer);
        try {
          localakv.ao().Ho();
        } catch (Exception localException) {
          K.error("Exception lors du callback de désérialisation de la part " + localbBL + ": ", localException);
        }
      } else {
        K.error("Impossible de trouver la CharacterPart correspondant à " + localbBL);
      }
    }
  }

  public final void a(akv paramakv, byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get() & 0xFF;
    if ((i < 0) || (i >= jC.values().length)) {
      K.error("Numéro de part invalide : " + i);
      return;
    }
    jC localjC = jC.values()[i];
    try {
      for (bBL localbBL : localjC.rp()) {
        akv localakv = a(localbBL);
        if (localakv != null) {
          if (localakv == paramakv) {
            localakv.h(localByteBuffer);
            try {
              localakv.ao().Ho();
              return;
            } catch (Exception localException) {
              K.error("Exception lors du callback de désérialisation de la part " + localbBL, localException);
            }
          }
          else {
            localakv = (akv)localakv.getClass().newInstance();
            localakv.h(localByteBuffer);
          }
        }
        else K.error("Impossible de trouver la CharacterPart correspondant à " + localbBL); 
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      K.error(localInstantiationException);
    } catch (IllegalAccessException localIllegalAccessException) {
      K.error(localIllegalAccessException);
    }
  }

  public final void a(Set paramSet, byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get() & 0xFF;
    if ((i < 0) || (i >= jC.values().length)) {
      K.error("Numéro de part invalide : " + i);
      return;
    }
    jC localjC = jC.values()[i];
    try {
      for (bBL localbBL : localjC.rp()) {
        akv localakv = a(localbBL);
        if (localakv != null) {
          if (paramSet.remove(localakv)) {
            localakv.h(localByteBuffer);
            try {
              localakv.ao().Ho();
              if (paramSet.isEmpty())
                return;
            }
            catch (Exception localException) {
              K.error("Exception lors du callback de désérialisation de la part " + localbBL, localException);
            }
          }
          else {
            localakv = (akv)localakv.getClass().newInstance();
            localakv.h(localByteBuffer);
          }
        }
        else K.error("Impossible de trouver la CharacterPart correspondant à " + localbBL); 
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      K.error(localInstantiationException);
    } catch (IllegalAccessException localIllegalAccessException) {
      K.error(localIllegalAccessException);
    }
  }

  public akv em()
  {
    return akv.dlr;
  }

  public akv el() {
    return akv.dlr;
  }

  public akv ek() {
    return akv.dlr;
  }

  public akv ej() {
    return akv.dlr;
  }

  public akv ei() {
    return akv.dlr;
  }

  public akv eh() {
    return akv.dlr;
  }

  public akv eg() {
    return akv.dlr;
  }

  public akv ef() {
    return akv.dlr;
  }

  public akv ee() {
    return akv.dlr;
  }

  public akv ed() {
    return akv.dlr;
  }

  public akv ec() {
    return akv.dlr;
  }

  public akv eb() {
    return akv.dlr;
  }

  public akv ea() {
    return akv.dlr;
  }

  public akv dZ() {
    return akv.dlr;
  }

  public akv dY() {
    return akv.dlr;
  }

  public akv dX() {
    return akv.dlr;
  }

  public akv dW() {
    return akv.dlr;
  }

  public akv dV() {
    return akv.dlr;
  }

  public akv dU() {
    return akv.dlr;
  }

  public akv dT() {
    return akv.dlr;
  }

  public akv dS() {
    return akv.dlr;
  }

  public akv dR() {
    return akv.dlr;
  }

  public akv dQ() {
    return akv.dlr;
  }

  public akv dP() {
    return akv.dlr;
  }

  public akv dO() {
    return akv.dlr;
  }

  public akv dN() {
    return akv.dlr;
  }

  public akv dM() {
    return akv.dlr;
  }

  public akv dL() {
    return akv.dlr;
  }

  public akv dK() {
    return akv.dlr;
  }

  public akv dJ() {
    return akv.dlr;
  }

  public akv dI() {
    return akv.dlr;
  }

  public akv dH() {
    return akv.dlr;
  }

  public akv aQT() {
    return akv.dlr;
  }

  public akv aQU() {
    return akv.dlr;
  }

  public akv dG() {
    return akv.dlr;
  }

  public akv dF() {
    return akv.dlr;
  }

  public akv dE() {
    return akv.dlr;
  }

  public akv aQV() {
    return akv.dlr;
  }

  public akv dD() {
    return akv.dlr;
  }

  public akv dC() {
    return akv.dlr;
  }

  public akv dB() {
    return akv.dlr;
  }

  public akv dA() {
    return akv.dlr;
  }

  public akv dz() {
    return akv.dlr;
  }

  public akv dy() {
    return akv.dlr;
  }

  public akv dx() {
    return akv.dlr;
  }

  public akv dw() {
    return akv.dlr;
  }

  public akv dv() {
    return akv.dlr;
  }

  public akv du() {
    return akv.dlr;
  }

  public akv dt() {
    return akv.dlr;
  }

  public akv ds() {
    return akv.dlr;
  }

  public akv dr() {
    return akv.dlr;
  }

  public akv dq() {
    return akv.dlr;
  }

  public akv dp() {
    return akv.dlr;
  }

  public akv jdMethod_do() {
    return akv.dlr;
  }

  public akv dn() {
    return akv.dlr;
  }

  public akv dm() {
    return akv.dlr;
  }

  public akv dl() {
    return akv.dlr;
  }

  public byte[] dl(boolean paramBoolean)
  {
    return paramBoolean ? a(jC.aMa) : a(jC.aMb);
  }

  public byte[] aQW() {
    return a(jC.aMc);
  }

  public byte[] aQX()
  {
    return a(jC.aLN);
  }

  public byte[] aQY()
  {
    return a(jC.aLO);
  }

  public byte[] aQZ()
  {
    return a(jC.aLH);
  }

  public byte[] j()
  {
    return a(jC.aLG);
  }

  public byte[] aRa()
  {
    return a(jC.aLI);
  }

  public final byte[] aRb()
  {
    return a(jC.aLJ);
  }

  public final byte[] aRc() {
    return a(jC.aLY);
  }

  public final byte[] aRd() {
    return a(jC.aMh);
  }

  public final byte[] aRe() {
    return a(jC.aLZ);
  }

  public final byte[] aRf() {
    return a(jC.aMd);
  }

  public final byte[] aRg() {
    return a(jC.aMe);
  }

  public byte[] aRh()
  {
    return a(jC.aLK);
  }

  public byte[] aRi()
  {
    return a(jC.aLM);
  }

  public byte[] aRj()
  {
    return a(jC.aLL);
  }

  public byte[] aRk()
  {
    return a(jC.aLS);
  }

  public byte[] aRl()
  {
    return a(jC.aLT);
  }

  public byte[] aRm()
  {
    return a(jC.aLU);
  }

  public byte[] aRn()
  {
    return a(jC.aLV);
  }

  public byte[] aRo()
  {
    return a(jC.aLW);
  }

  public byte[] aRp()
  {
    return a(jC.aLX);
  }

  public byte[] aRq() {
    return a(jC.aMg);
  }

  public String G(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("[ ");
    localStringBuilder.append(getClass().getSimpleName()).append(" serialization=").append(paramArrayOfByte.length).append(" byte(s) in ");
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get() & 0xFF;
    if ((i < 0) || (i >= jC.values().length)) {
      return "[ERROR: invalid serialization type: " + i + "]";
    }
    jC localjC = jC.values()[i];
    localStringBuilder.append(localjC).append(", parts=");
    for (bBL localbBL : localjC.rp()) {
      akv localakv = a(localbBL);
      if (localakv != null) {
        localStringBuilder.append("{").append(localbBL).append(" ");
        int m = localByteBuffer.position();
        localakv.h(localByteBuffer);
        for (int n = m; n < localByteBuffer.position(); n++) {
          localStringBuilder.append(String.format("%02x", new Object[] { Byte.valueOf(paramArrayOfByte[n]) }));
          if (((n - m) % 4 == 3) && (n < localByteBuffer.position() - 1)) {
            localStringBuilder.append(".");
          }
        }
        localStringBuilder.append("} ");
      } else {
        return "[ERROR: no character part for " + localbBL + "]";
      }
    }
    localStringBuilder.append("] ").append(localByteBuffer.remaining()).append(" byte(s) left.");
    return localStringBuilder.toString();
  }
}