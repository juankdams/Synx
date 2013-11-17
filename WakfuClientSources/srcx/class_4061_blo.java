import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class blo extends duq
  implements dBv
{
  protected static final Logger K = Logger.getLogger(blo.class);
  private static final String fCj = "monsterFamilyRatios";
  private static final String[] bF = { "monsterFamilyRatios" };

  private static blo fCk = new blo();
  private ArrayList fCl;

  private blo()
  {
    this.fCl = new ArrayList();
  }

  public void C(byte[] paramArrayOfByte)
  {
    this.fCl.clear();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    dFu localdFu = new dFu();

    int i = localByteBuffer.getInt();
    uA localuA = acn.aoA().aoD();
    if (localuA == null) {
      K.warn("Réception d'information de monstres dans une zone inconnue du client");
      return;
    }
    cFB localcFB = localuA.DD();
    ayn localayn = bWW.ccf().FB();
    Object localObject = localayn != null ? localayn.aKs() : null;
    for (int j = 0; j < i; j++) {
      int k = localByteBuffer.getInt();

      int m = localByteBuffer.getInt();

      aCc localaCc = null;
      if (localObject != null)
        localaCc = localObject.kb(k);
      int n = localcFB.fqF;
      localdFu.fg(k, m);
      this.fCl.add(new acy(bIg.sY(j), k, localaCc, m, n));
    }
    if (localObject != null)
    {
      localObject.Cb(-1);
      localObject.b(localdFu);
    }
    dLE.doY().a(this, bF);
  }

  public acy qc(int paramInt) {
    int i = 0; for (int j = this.fCl.size(); i < j; i++) {
      acy localacy = (acy)this.fCl.get(i);
      if (localacy.nn() == paramInt)
        return localacy;
    }
    return null;
  }

  public ArrayList bwr() {
    return this.fCl;
  }

  public float aoS() {
    float f = 0.0F;
    for (acy localacy : this.fCl)
      f += localacy.aoS();
    return f / this.fCl.size();
  }

  public static blo bws() {
    return fCk;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("monsterFamilyRatios")) {
      return this.fCl.size() > 0 ? this.fCl : null;
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void clear() {
    this.fCl.clear();
  }

  public void debugPrint() {
    K.info("#################################################");
    int i = 0; for (int j = this.fCl.size(); i < j; i++) {
      acy localacy = (acy)this.fCl.get(i);
      K.info(localacy);
    }
    K.info("#################################################");
  }
}