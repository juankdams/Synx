import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dcK extends duq
  implements dBv
{
  protected static final Logger K = Logger.getLogger(dcK.class);
  private static final String kVL = "resourceFamilyRatios";
  private static final String[] bF = { "resourceFamilyRatios" };

  private static dcK kVM = new dcK();
  private ArrayList kVN;

  private dcK()
  {
    this.kVN = new ArrayList();
  }

  public void C(byte[] paramArrayOfByte)
  {
    this.kVN.clear();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    dFu localdFu = new dFu();

    int i = localByteBuffer.getInt();
    uA localuA = acn.aoA().aoD();
    if (localuA == null) {
      K.warn("Réception d'information de ressources dans une zone inconnue du client");
      return;
    }
    bdY localbdY = localuA.DC();
    ayn localayn = bWW.ccf().FB();
    Object localObject = localayn != null ? localayn.aKs() : null;
    for (int j = 0; j < i; j++) {
      int k = localByteBuffer.getInt();

      int m = localByteBuffer.getInt();
      aCc localaCc = null;
      if (localObject != null)
        localaCc = localObject.kc(k);
      int n = localbdY.fqF;
      localdFu.fg(k, m);

      if (localuA.da(k))
      {
        this.kVN.add(new acy(bIg.sZ(j), k, localaCc, m, n));
      }
    }
    if (localObject != null) {
      localObject.Cc(-1);
      localObject.c(localdFu);
    }

    dLE.doY().a(this, bF);
  }

  public acy zJ(int paramInt) {
    int i = 0; for (int j = this.kVN.size(); i < j; i++) {
      acy localacy = (acy)this.kVN.get(i);
      if (localacy.nn() == paramInt)
        return localacy;
    }
    return null;
  }

  public ArrayList cOe() {
    return this.kVN;
  }

  public float aoS()
  {
    float f = 0.0F;
    for (acy localacy : this.kVN)
      f += localacy.aoS();
    return f / this.kVN.size();
  }

  public static dcK cOf() {
    return kVM;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("resourceFamilyRatios")) {
      return this.kVN.size() > 0 ? this.kVN : null;
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
    this.kVN.clear();
  }

  public void debugPrint() {
    K.info("#################################################");
    int i = 0; for (int j = this.kVN.size(); i < j; i++) {
      acy localacy = (acy)this.kVN.get(i);
      K.info(localacy);
    }
    K.info("#################################################");
  }
}