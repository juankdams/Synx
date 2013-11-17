import org.apache.log4j.Logger;

public class cJV extends cTH
{
  public static final cIK iIq = new cJV();

  public static final Logger K = Logger.getLogger(cJV.class);

  Object[] a(dpI paramdpI, short paramShort)
  {
    Object[] arrayOfObject = super.a(paramdpI, paramShort);
    if (paramdpI.bep() < 3)
    {
      K.error("Unable to compute exponential parameters : need 3 values, only " + paramdpI.bep() + " available");
      return arrayOfObject;
    }

    float f1 = paramdpI.o(0, paramShort);
    float f2 = paramdpI.o(1, paramShort);
    float f3 = paramdpI.o(2, paramShort);
    double d1 = f1 + f2 * Math.pow(paramShort, f3);

    double d2 = f2 >= 0.0F ? Math.floor(d1) : Math.ceil(d1);
    arrayOfObject[0] = new bAX(()d2, d1);
    return arrayOfObject;
  }
}