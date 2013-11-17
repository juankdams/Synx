import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class axi extends afn
{
  private static final Logger K = Logger.getLogger(axi.class);

  public axi() {
    super(0, null, null, null);
    loadChildren();
  }

  private void loadChildren() {
    URL localURL = null;
    try {
      localURL = new URL(ay.bd().getString("completeMapCoordsPath"));
    } catch (bdh localbdh) {
      return;
    } catch (MalformedURLException localMalformedURLException) {
      return;
    }

    bwZ localbwZ = b(localURL);
    if (localbwZ == null) {
      return;
    }
    CC localCC = localbwZ.bEx();
    ArrayList localArrayList = localCC.c("coord");
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      Ww localWw = t((K)localArrayList.get(i));
      a(localWw);
    }
  }

  private static bwZ b(URL paramURL)
  {
    bpA localbpA = new bpA();
    bwZ localbwZ = new bwZ();
    try {
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramURL.openStream());
      localbpA.i(localBufferedInputStream);
      localbpA.a(localbwZ, new cdJ[0]);
      localbpA.close();
      localBufferedInputStream.close();
    } catch (Exception localException) {
      K.error("Problème lors de la lecture du fichier de map d'url : " + paramURL);
      return null;
    }
    return localbwZ;
  }

  private static Ww t(K paramK) {
    int i = paramK.e("id").getIntValue();
    int j = paramK.e("startX").getIntValue();
    int k = paramK.e("startY").getIntValue();
    int m = paramK.e("endX").getIntValue();
    int n = paramK.e("endY").getIntValue();
    K localK1 = paramK.e("scrollDecorator");
    byte b = localK1 != null ? localK1.af() : 0;

    boolean bool = false;
    K localK2 = paramK.e("parentMap");
    if (localK2 != null) {
      bool = localK2.getBooleanValue();
    }
    String str = i == 0 ? "???" : bU.fH().b(77, i, new Object[0]);
    return new Ww(n(j, m, k, n), i, bool, str, b);
  }

  private static Dg n(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dg localDg = new Dg();
    for (int i = paramInt1; i <= paramInt2; i++) {
      for (int j = paramInt3; j <= paramInt4; j++) {
        localDg.add(i, j);
      }
    }
    return localDg;
  }

  public bNa aqU()
  {
    return bNa.gRu;
  }
}