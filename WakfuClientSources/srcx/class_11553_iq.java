import java.lang.reflect.Method;

class iq
  implements bfL
{
  private final dTO aHW;
  private int aHX;
  Object aHY;
  Method aHZ;

  public iq(dTO paramdTO, String paramString)
  {
    this.aHW = 
      paramdTO;
    if (("UTF-8".equalsIgnoreCase(paramString)) || 
      ("UTF-16".equalsIgnoreCase(paramString))) {
      this.aHX = 16;
    }
    else if (("ISO-8859-1".equalsIgnoreCase(paramString)) || 
      ("Latin1".equalsIgnoreCase(paramString))) {
      this.aHX = 8;
    }
    else if (("US-ASCII".equalsIgnoreCase(paramString)) || 
      ("ASCII".equalsIgnoreCase(paramString))) {
      this.aHX = 7;
    }
    else {
      this.aHX = 0;
      try
      {
        Class localClass1 = Class.forName("java.nio.charset.Charset");
        Class localClass2 = Class.forName("java.nio.charset.CharsetEncoder");
        Class[] tmp115_112 = new Class[1];
        Class tmp134_131 = dTO.cd("java.lang.String"); dTO.bRr = dTO.bRr != null ? dTO.bRr : tmp134_131; tmp115_112[0] = tmp134_131; Method localMethod1 = localClass1.getMethod("forName", tmp115_112);
        Object localObject = localMethod1.invoke(null, new Object[] { paramString });
        Method localMethod2 = localClass1.getMethod("newEncoder", null);
        this.aHY = localMethod2.invoke(localObject, null);
        this.aHZ = localClass2.getMethod("canEncode", new Class[] { Character.TYPE });
      }
      catch (Exception localException) {
      }
    }
  }

  public boolean d(char paramChar) {
    if (this.aHX == 16) {
      return false;
    }
    if (this.aHX == 8) {
      if (paramChar > 'ÿ') {
        return true;
      }
      return false;
    }
    if (this.aHX == 7) {
      if (paramChar > '') {
        return true;
      }
      return false;
    }

    if ((this.aHZ != null) && (this.aHY != null)) {
      try {
        Boolean localBoolean = (Boolean)this.aHZ.invoke(this.aHY, new Object[] { new Character(paramChar) });
        return localBoolean.booleanValue() ^ true;
      }
      catch (Exception localException)
      {
      }

    }

    return false;
  }
}