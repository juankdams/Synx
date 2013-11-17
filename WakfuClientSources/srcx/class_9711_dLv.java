import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dLv extends dzz
{
  private static final Logger K = Logger.getLogger(dLv.class);
  private String aMJ;
  int mbb;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.mbb = localByteBuffer.getInt();
    byte[] arrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte);
    this.aMJ = dzp.aJ(arrayOfByte);
    return true;
  }

  public aLg doR() {
    aLg[] arrayOfaLg = aLg.values();
    for (int i = 0; i < arrayOfaLg.length; i++) {
      if (arrayOfaLg[i].ordinal() == this.mbb)
        return arrayOfaLg[i];
    }
    K.error("Erreur à ladésérialisation dun résultat de vote (alors qu'on était déconnecté) : résultat de type " + this.mbb + " inconnu");
    return aLg.epy;
  }

  public String rF() {
    return this.aMJ;
  }

  public int getId() {
    return 20010;
  }
}