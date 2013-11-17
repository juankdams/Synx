import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import org.apache.log4j.Logger;

public class dEs
{
  private static final Logger K = Logger.getLogger(dEs.class);
  private static final int VERSION = 1;
  public static final int lMZ = 1;
  public static final int bNO = 100;

  public static short dgc()
  {
    return 20481;
  }

  public static void a(String paramString, ParticleSystem paramParticleSystem, int paramInt) {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
    int i = localaYQ.readShort();
    if (i != dgc())
      throw new Exception("fichier incorrect " + paramString);
    a(localaYQ, paramParticleSystem, paramInt);
  }

  public static void a(byte[] paramArrayOfByte, ParticleSystem paramParticleSystem, int paramInt) {
    aYQ localaYQ = aYQ.V(paramArrayOfByte);
    int i = localaYQ.readShort();
    a(localaYQ, paramParticleSystem, paramInt);
  }

  public static void a(aYQ paramaYQ, ParticleSystem paramParticleSystem, int paramInt) {
    if (paramInt < 1)
      paramInt = 1;
    else if (paramInt > 100) {
      paramInt = 100;
    }
    a(paramParticleSystem, paramInt, paramaYQ);

    int i = paramaYQ.readByte() & 0xFF;
    for (int j = 0; j < i; j++) {
      dmN localdmN = v(paramaYQ, paramInt);
      if (localdmN != null)
        paramParticleSystem.b(localdmN);
    }
    paramaYQ.close();
  }

  private static void a(ParticleSystem paramParticleSystem, int paramInt, aYQ paramaYQ) {
    boolean bool1 = paramaYQ.bnT();
    boolean bool2 = paramaYQ.bnT();
    boolean bool3 = paramaYQ.bnT();
    boolean bool4 = paramaYQ.bnT();
    int i = paramaYQ.readInt();
    int j = paramaYQ.readInt();
    long l = paramaYQ.readLong();
    int k = dsv.a(paramaYQ, bool1, paramInt);
    byte b = paramaYQ.readByte();
    paramParticleSystem.gX(bool2);
    paramParticleSystem.setDuration(k);
    paramParticleSystem.du(b);
    paramParticleSystem.hEZ = bool3;
    paramParticleSystem.de(bool4);
    paramParticleSystem.hEX = l;
    paramParticleSystem.b(cnQ.vT(i), cnQ.vT(j));
  }

  private static dmN v(aYQ paramaYQ, float paramFloat) {
    float f1 = paramaYQ.readByte();
    float f2 = paramaYQ.readByte();
    int i = paramaYQ.readInt();
    if ((paramFloat < f1) || (paramFloat > f2)) {
      paramaYQ.os(i);
      return null;
    }

    float f3 = (paramFloat - f1) / (f2 - f1);

    dmN localdmN1 = (dmN)cBW.f(paramaYQ, f3);

    int j = paramaYQ.readByte();
    for (int k = 0; k < j; k++) {
      qU localqU = dft.b(paramaYQ, f3);
      localdmN1.a(localqU);
    }

    a(paramaYQ, f3, localdmN1);

    k = paramaYQ.readByte();
    for (int m = 0; m < k; m++) {
      dGG localdGG = (dGG)bbd.f(paramaYQ, f3);
      a(paramaYQ, f3, localdGG);
      localdmN1.a(localdGG);
    }
    m = paramaYQ.readByte();
    for (int n = 0; n < m; n++) {
      dmN localdmN2 = v(paramaYQ, paramFloat);
      localdmN1.b(localdmN2);
    }

    return localdmN1;
  }

  private static void a(aYQ paramaYQ, float paramFloat, dAU paramdAU) {
    int i = paramaYQ.readByte();
    for (int j = 0; j < i; j++) {
      FA localFA = dY.a(paramaYQ, paramFloat);

      int k = paramaYQ.readByte();
      if (k == 0) {
        localFA.a(null);
      } else {
        brc[] arrayOfbrc = new brc[k];
        for (int m = 0; m < k; m++) {
          arrayOfbrc[m] = dJm.w(paramaYQ, paramFloat);
        }
        localFA.a(arrayOfbrc);
      }
      if (localFA.Po())
        paramdAU.c(localFA);
      else
        paramdAU.a(localFA);
    }
  }

  public static long qV(String paramString) {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
    int i = localaYQ.readShort();
    ParticleSystem localParticleSystem = new ParticleSystem(false);
    a(localParticleSystem, 0, localaYQ);
    return localParticleSystem.hEX;
  }
}