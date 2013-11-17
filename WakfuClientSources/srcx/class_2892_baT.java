import java.util.Hashtable;

public class baT
{
  private static final Hashtable fiU = new Hashtable();

  public static void b(String paramString, byte paramByte)
  {
    for (bKh localbKh : fiU.values())
      localbKh.a(new Cs(Byte.valueOf(paramByte), paramString));
  }

  public static void L(Class paramClass) {
    fiU.remove(paramClass.getName());
  }

  public static bKh a(Class paramClass, bKh parambKh) {
    String str = paramClass.getName();
    if (fiU.containsKey(str)) {
      return (bKh)fiU.get(str);
    }
    return (bKh)fiU.put(str, parambKh);
  }
}