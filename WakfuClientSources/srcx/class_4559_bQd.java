import com.ankamagames.wakfu.client.binaryStorage.AreaEffectBinaryData;
import java.util.BitSet;
import org.apache.log4j.Logger;

final class bQd
{
  private static final Logger K = Logger.getLogger(bQd.class);
  public static final bQd gYm = new bQd();

  private final akR gYn = new akR();

  private bQd() {
    bXr();
  }

  private void bXr() {
    try {
      this.gYn.put(xj.bpm.bL(), new Wi(aRS.class));
      this.gYn.put("OTHER", new Wi(aRS.class));
      this.gYn.put(xj.bpk.bL(), new Wi(aLj.class));
      this.gYn.put(xj.bpl.bL(), new Wi(beb.class));
      this.gYn.put(xj.bpn.bL(), new Wi(JJ.class));
      this.gYn.put(xj.bpj.bL(), new Wi(dpD.class));
      this.gYn.put(xj.bpq.bL(), new Wi(amJ.class));
      this.gYn.put(xj.bpo.bL(), new Wi(cmc.class));
      this.gYn.put(xj.bpr.bL(), new Wi(dJp.class));
      this.gYn.put(xj.bps.bL(), new Wi(cFH.class));
      this.gYn.put(xj.bpz.bL(), new Wi(ddn.class));
      this.gYn.put(xj.bpu.bL(), new Wi(cgU.class));
      this.gYn.put(xj.bpp.bL(), new Wi(ain.class));
      this.gYn.put(xj.bpt.bL(), new abE(this, ain.class));

      this.gYn.put(xj.bpv.bL(), new Wi(acK.class));
      this.gYn.put(xj.bpw.bL(), new Wi(Yh.class));
      this.gYn.put(xj.bpx.bL(), new Wi(cgy.class));
      this.gYn.put(xj.bpy.bL(), new Wi(dLR.class));
      this.gYn.put(xj.bpA.bL(), new Wi(Yv.class));
      this.gYn.put(xj.bpB.bL(), new Wi(bNn.class));
    } catch (NoSuchMethodException localNoSuchMethodException) {
      K.error("", localNoSuchMethodException);
    }
  }

  aAn b(AreaEffectBinaryData paramAreaEffectBinaryData) {
    Wi localWi = (Wi)this.gYn.get(paramAreaEffectBinaryData.getType());
    if (localWi == null) {
      K.error("Type d'effet inconnu : " + paramAreaEffectBinaryData.getType());
      return null;
    }
    try {
      aAn localaAn = localWi.a(paramAreaEffectBinaryData);
      localaAn.a(F(paramAreaEffectBinaryData.bvT()));
      localaAn.dc(paramAreaEffectBinaryData.bvN());
      localaAn.s(paramAreaEffectBinaryData.Bz());
      return localaAn;
    } catch (Exception localException) {
      K.error("", localException);
    }
    return null;
  }

  private static bbH c(AreaEffectBinaryData paramAreaEffectBinaryData) {
    bbH localbbH = null;
    try {
      localbbH = chY.a(paramAreaEffectBinaryData.bvI(), paramAreaEffectBinaryData.bvQ(), (short)0);
      if (localbbH == null)
        throw new NullPointerException("AOE incorrecte");
    }
    catch (IllegalArgumentException localIllegalArgumentException) {
      K.error("erreur au chargement des effets statiques : zone d'effet incorrecte");
    }
    return localbbH;
  }

  private static BitSet F(int[] paramArrayOfInt) {
    BitSet localBitSet = new BitSet();
    if (paramArrayOfInt != null) {
      for (int k : paramArrayOfInt) {
        localBitSet.set(k);
      }
    }
    return localBitSet;
  }

  private static String kl(String paramString) {
    if (paramString == null) {
      return "";
    }
    if (paramString.endsWith("\n")) {
      return paramString.substring(0, paramString.length() - 1);
    }
    return paramString;
  }
}