import java.util.ArrayList;

public class Ha
  implements dBv
{
  public static final String RI = "description";
  public static final String aNY = "value";
  private byte bkM;
  private static Ha[] bPn = (Ha[])localArrayList.toArray(bPn);

  public static Ha[] QK()
  {
    return bPn;
  }

  public static Ha W(byte paramByte) {
    for (Ha localHa : bPn) {
      if (localHa.bkM == paramByte) {
        return localHa;
      }
    }

    return null;
  }

  public Ha(byte paramByte) {
    this.bkM = paramByte;
  }

  public byte getType() {
    return this.bkM;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("description"))
      return bU.fH().getString("calendar.event.type." + this.bkM);
    if (paramString.equals("value")) {
      return String.valueOf(this.bkM);
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

  static
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new Ha((byte)1));
    localArrayList.add(new Ha((byte)2));
    localArrayList.add(new Ha((byte)3));
    bPn = new Ha[localArrayList.size()];
  }
}