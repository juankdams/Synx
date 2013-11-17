import org.apache.log4j.Logger;

public class cTH extends cIK
{
  public static final cIK iIq = new cTH();

  public static final Logger K = Logger.getLogger(cTH.class);

  Object[] a(dpI paramdpI, short paramShort)
  {
    int i = paramdpI.bep();
    Object[] arrayOfObject = new Object[i];

    for (int j = 0; j < i; j++) {
      float f = paramdpI.o(j, paramShort);
      int k = paramdpI.a(j, paramShort, dNF.meh);
      arrayOfObject[j] = new bAX(k, f);
    }
    return arrayOfObject;
  }
}