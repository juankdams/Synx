import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.apache.log4j.Logger;

public class bqR
  implements Vj
{
  private static Logger K = Logger.getLogger(bqR.class);
  private Class caa = uz.class;

  private boolean fMc = false;

  public uz iM(String paramString) {
    return f(this.caa, paramString);
  }

  public uz f(Class paramClass, String paramString)
  {
    if ((paramString == null) || (!paramClass.equals(this.caa))) {
      return null;
    }

    uz localuz = cBQ.cxL().bSM().aH(paramString);
    if (localuz != null) {
      return localuz;
    }

    localuz = dQU.drS().rP(paramString);
    if (localuz != null) {
      return localuz;
    }
    try
    {
      URL localURL1 = new URL(paramString);
      QX.log("gui", localURL1.getFile());
      if (!bAy.d(localURL1)) {
        K.warn("Impossible de lire l'image " + paramString);
        return null;
      }
      return dQU.drS().n(localURL1);
    }
    catch (MalformedURLException localMalformedURLException1)
    {
      URL localURL2 = getClass().getClassLoader().getResource(paramString);
      if (localURL2 != null) {
        return dQU.drS().n(localURL2);
      }

      File localFile = new File(paramString);
      if (localFile.exists()) {
        try {
          return dQU.drS().n(localFile.toURI().toURL());
        } catch (MalformedURLException localMalformedURLException2) {
          K.error("Exception", localMalformedURLException2);
        }
      }
      K.error("pas de texture " + paramString);
    }return null;
  }

  public Class WY()
  {
    return this.caa;
  }

  public boolean WZ()
  {
    return this.fMc;
  }

  public void fd(boolean paramBoolean) {
    this.fMc = paramBoolean;
  }

  public boolean Xa()
  {
    return false;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    if ((paramString == null) || (!paramClass.equals(this.caa))) {
      return "null";
    }

    StringBuilder localStringBuilder = new StringBuilder();
    paramdeg.al(this.caa);

    uz localuz = cBQ.cxL().bSM().aH(paramString);
    if (localuz != null) {
      return "doc.getTexture(\"" + paramString + "\")";
    }

    localuz = dQU.drS().rP(paramString);
    if (localuz != null) {
      paramdeg.al(dQU.class);
      return "TextureLoader.getInstance().loadTextureDirect(\"" + paramString + "\")";
    }

    if (bAy.jy(paramString)) {
      localObject1 = paramdeg.can();
      paramdeg.al(MalformedURLException.class);
      paramdeg.al(dQU.class);
      paramdeg.a(new cHH(this.caa, (String)localObject1, "null"));
      paramdeg.a(new dLF("try {"));
      paramdeg.a(new dLF("\tURL url = new URL(\"" + paramString + "\""));
      paramdeg.a(new cHH(null, (String)localObject1, "TextureLoader.getInstance().loadTexture(url)", true));
      paramdeg.a(new dLF("} catch (MalformedURLException e) {}"));
      return localObject1;
    }

    Object localObject1 = getClass().getClassLoader().getResource(paramString);
    if (localObject1 != null) {
      paramdeg.al(dQU.class);
      localObject2 = paramdeg.can();
      paramdeg.a(new cHH(this.caa, (String)localObject2, "null"));
      paramdeg.a(new dLF("{"));
      paramdeg.a(new dLF("\tURL url = getClass().getClassLoader().getResource(\"" + paramString + "\""));
      paramdeg.a(new cHH(null, (String)localObject2, "TextureLoader.getInstance().loadTexture(url)", true));
      paramdeg.a(new dLF("}"));
      return localObject2;
    }

    Object localObject2 = new File(paramString);
    if (((File)localObject2).exists()) {
      try {
        paramdeg.al(dQU.class);
        paramdeg.al(File.class);
        paramdeg.al(MalformedURLException.class);

        dQU.drS().n(((File)localObject2).toURI().toURL());
        String str = paramdeg.can();
        paramdeg.a(new cHH(this.caa, str, "null"));
        paramdeg.a(new dLF("try {"));
        paramdeg.a(new dLF("\tFile f = new File(\"" + paramString + "\""));
        paramdeg.a(new cHH(null, str, "TextureLoader.getInstance().loadTexture(f.toURI().toURL())", true));
        paramdeg.a(new dLF("} catch (MalformedURLException e) {}"));
        return str;
      } catch (MalformedURLException localMalformedURLException) {
        K.error("Exception", localMalformedURLException);
      }
    }
    K.error("pas de texture " + paramString);
    return "null";
  }
}