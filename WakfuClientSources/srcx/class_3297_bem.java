import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import org.apache.log4j.Logger;

public class bem extends cCD
{
  private static final Logger K = Logger.getLogger(bem.class);
  private static final int VERSION = 1;
  private final cSR fqT = new cSR();

  public void id(String paramString) {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
    int i = localaYQ.readInt();
    int j = localaYQ.readInt();
    for (int k = 0; k < j; k++) {
      int m = localaYQ.readInt();
      bvn localbvn = new bvn(localaYQ);
      this.fqT.put(m, localbvn);
    }
    localaYQ.close();
  }

  public void ie(String paramString) {
    dSw localdSw = new dSw(dtb.qd(paramString));
    localdSw.writeInt(1);
    localdSw.writeInt(this.fqT.size());
    dmn localdmn = this.fqT.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      localdSw.writeInt(localdmn.zY());
      ((bvn)localdmn.value()).b(localdSw);
    }
    localdSw.close();
  }

  public void a(int paramInt, bvn parambvn) {
    this.fqT.put(paramInt, parambvn);
  }

  public boolean e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    bvn localbvn = (bvn)this.fqT.get(paramInt1);
    if (localbvn == null) {
      return false;
    }
    boolean bool = (localbvn.bDb()) || (localbvn.akR());

    if (localbvn.getDelay() != 0) {
      dka.cSF().a(new Q(this, paramInt2, paramInt3, paramInt4, localbvn, bool), localbvn.getDelay(), 1);

      return bool;
    }

    return a(paramInt2, paramInt3, paramInt4, localbvn, bool);
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3, bvn parambvn, boolean paramBoolean) {
    if (!atb()) {
      return paramBoolean;
    }
    long[] arrayOfLong = parambvn.bCX();
    byte[] arrayOfByte = parambvn.bCY();

    int i = bCO.sf(arrayOfLong.length);

    long l1 = System.currentTimeMillis();

    long l2 = arrayOfLong[i];
    if (!i(l1, l2)) {
      return paramBoolean;
    }
    float f = arrayOfByte[i] / 100.0F;

    long l3 = paramInt3 != -1 ? l1 + paramInt3 : -1L;
    long l4 = parambvn.bDa() != 0 ? l3 - parambvn.bDa() : -1L;

    IsoParticleSystem localIsoParticleSystem = cWS.cKD().zj(paramInt1);
    try
    {
      if (l2 != 0L)
      {
        aVB localaVB;
        if (localIsoParticleSystem != null)
          localaVB = SoundFunctionsLibrary.ckJ().a(l2, f, parambvn.akR() ? 0 : 1, l3, l4, paramInt2, localIsoParticleSystem, parambvn.bCZ(), false);
        else {
          localaVB = SoundFunctionsLibrary.ckJ().a(l2, f, parambvn.akR() ? 0 : 1, l3, l4, paramInt2);
        }

        if (localaVB != null)
          a(paramInt1, localaVB.akM(), l1, l2);
      }
      else {
        K.error("Id du son nul");
      }
    } catch (Exception localException) {
      K.error("soundExtension or soundPath not initialized " + localException);
    }

    return paramBoolean;
  }
}