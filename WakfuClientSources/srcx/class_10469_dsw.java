import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class dsw
{
  private static final cSR luL = new cSR(20000, 1.0F);

  public static void a(cid paramcid)
  {
    if ((!bB) && (luL.containsKey(paramcid.getId()))) throw new AssertionError("Un élément avec l'id " + paramcid.getId() + " existe déjà");
    luL.put(paramcid.getId(), paramcid);
  }

  public static void load(String paramString) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(dtb.readFile(paramString));
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    int i = localByteBuffer.getInt();
    for (int j = 0; j < i; j++) {
      a(new cid(localByteBuffer));
    }
    luL.trimToSize();
  }

  public static void lT(String paramString) {
    FileOutputStream localFileOutputStream = dtb.qd(paramString);
    dSw localdSw = new dSw(localFileOutputStream);
    localdSw.writeInt(luL.size());
    dmn localdmn = luL.yF();
    for (int i = luL.size(); i > 0; i--) {
      localdmn.fl();
      ((cid)localdmn.value()).b(localdSw);
    }
    localdSw.close();
  }

  public static cid BE(int paramInt) {
    return (cid)luL.get(paramInt);
  }

  public static void clear() {
    luL.clear();
  }

  public static int size() {
    return luL.size();
  }
}