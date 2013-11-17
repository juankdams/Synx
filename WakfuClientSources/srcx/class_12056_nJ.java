public class nJ
{
  public static boolean a(bNi parambNi, Object paramObject)
  {
    if (parambNi == paramObject) {
      return true;
    }
    if ((paramObject == null) || (parambNi.getClass() != paramObject.getClass())) {
      return false;
    }

    bNi localbNi = (bNi)paramObject;
    return parambNi.EN() == localbNi.EN();
  }

  public static int a(bNi parambNi) {
    return (int)parambNi.EN();
  }
}