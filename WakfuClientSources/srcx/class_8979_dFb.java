import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class dFb
{
  public final Class lOx;
  public final URL aJK;
  public cEa lOy;

  private dFb(Class paramClass)
  {
    this.lOx = paramClass;
    try {
      this.lOy = ((cEa)this.lOx.newInstance());
    } catch (InstantiationException localInstantiationException) {
      cBQ.ch().error("", localInstantiationException);
    } catch (IllegalAccessException localIllegalAccessException) {
      cBQ.ch().error("", localIllegalAccessException);
    }
    this.aJK = null;
  }

  private dFb(URL paramURL) {
    this.lOx = null;
    this.aJK = paramURL;
  }

  public static dFb T(String paramString, boolean paramBoolean) {
    try {
      Class localClass = Class.forName(paramString);
      return new dFb(localClass);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      try {
        URL localURL = new URL(paramString);
        return new dFb(localURL);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        cBQ.ch().error("Le chemin '" + paramString + "' vers le fichier de définition des messageBox est invalide !"); } 
    }return null;
  }
}