import com.ankamagames.wakfu.client.binaryStorage.ClientEventBinaryData;
import org.apache.log4j.Logger;

class uq
  implements gd
{
  uq(aGt paramaGt)
  {
  }

  public void a(ClientEventBinaryData paramClientEventBinaryData)
  {
    int i = paramClientEventBinaryData.getId();

    int j = paramClientEventBinaryData.getType();
    String[] arrayOfString1 = paramClientEventBinaryData.sk();
    String str = paramClientEventBinaryData.gB();
    int k = paramClientEventBinaryData.si();
    int m = paramClientEventBinaryData.sj();
    boolean bool = paramClientEventBinaryData.sl();

    String[] arrayOfString2 = arrayOfString1 != null ? new String[arrayOfString1.length] : new String[0];
    for (int n = 0; n < arrayOfString2.length; n++) {
      if ((arrayOfString1[n] != null) && (arrayOfString1[n].equals("DEFAULT")))
        arrayOfString2[n] = null;
      else
        arrayOfString2[n] = arrayOfString1[n];
    }
    bZA localbZA;
    try
    {
      localbZA = aVj.hn(str);
    } catch (Exception localException) {
      localbZA = null;
      aGt.K.error("Critère " + str, localException);
    }

    ayJ localayJ = new ayJ(i, j, arrayOfString2, localbZA, k, m, bool);

    bOU.gUc.b(localayJ);

    for (Qq localQq : paramClientEventBinaryData.sm())
      aGt.a(this.bhX, localayJ, localQq);
  }
}