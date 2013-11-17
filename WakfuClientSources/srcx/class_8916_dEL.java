import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

public class dEL extends dhB
{
  public static final String lNE = "ant.targets";
  private static djs lNF = new bJj();
  private static djs lNG = new cKh();
  private static djs lNH = new bBp();
  private static djs lNI = new bbX();
  private static final String lNJ = "ant.parsing.context";
  private static final wh aIk = wh.Fo();

  public boolean j(bFe parambFe)
  {
    return true;
  }

  public aQS a(FF paramFF, bFe parambFe)
  {
    ep localep = (ep)parambFe.G(ep.class);
    if (localep == null) {
      throw new cJ("Unsupported resource type: " + parambFe);
    }
    return a(paramFF, localep.getURL());
  }

  public aQS a(FF paramFF, URL paramURL)
  {
    wZ localwZ = new wZ();
    localwZ.b(paramFF);

    dlW localdlW = new dlW(paramFF);
    localdlW.a(localwZ);
    localdlW.f(localwZ);

    a(localdlW.Ga(), paramURL, new gW(localdlW, lNF));
    aGK[] arrayOfaGK = localwZ.Gb();
    if (arrayOfaGK.length != 1) {
      throw new cJ("No tasks defined");
    }
    return (aQS)arrayOfaGK[0];
  }

  public void a(FF paramFF, Object paramObject)
  {
    cQe().addElement(paramObject);
    dlW localdlW = null;
    localdlW = (dlW)paramFF.bR("ant.parsing.context");
    if (localdlW == null) {
      localdlW = new dlW(paramFF);
      paramFF.g("ant.parsing.context", localdlW);
      paramFF.g("ant.targets", localdlW.cTR());
    }
    if (cQe().size() > 1)
    {
      localdlW.jA(true);
      wZ localwZ1 = localdlW.cTP();
      wZ localwZ2 = localdlW.cTQ();
      Map localMap = localdlW.cTT();
      try {
        wZ localwZ3 = new wZ();
        localwZ3.b(paramFF);
        localwZ3.setName("");
        localdlW.e(localwZ3);
        localdlW.s(new HashMap());
        localdlW.f(localwZ3);
        a(paramFF, paramObject, new gW(localdlW, lNH));
        localwZ3.execute();
      } finally {
        localdlW.e(localwZ1);
        localdlW.f(localwZ2);
        localdlW.s(localMap);
      }
    }
    else {
      localdlW.s(new HashMap());
      a(paramFF, paramObject, new gW(localdlW, lNH));

      localdlW.cTQ().execute();

      aa(paramFF);
    }
  }

  public void a(FF paramFF, Object paramObject, gW paramgW)
  {
    dlW localdlW = gW.a(paramgW);

    File localFile = null;
    URL localURL = null;
    String str = null;

    if ((paramObject instanceof File)) {
      localFile = (File)paramObject;
    } else if ((paramObject instanceof URL)) {
      localURL = (URL)paramObject;
    } else if ((paramObject instanceof bFe)) {
      dmo localdmo = (dmo)((bFe)paramObject).G(dmo.class);

      if (localdmo != null) {
        localFile = localdmo.getFile();
      } else {
        localObject2 = (ep)((bFe)paramObject).G(ep.class);

        if (localObject2 != null) {
          localURL = ((ep)localObject2).getURL();
        }
      }
    }
    if (localFile != null) {
      localFile = aIk.aS(localFile.getAbsolutePath());
      localdlW.Z(localFile);
      str = localFile.toString();
    } else if (localURL != null) {
      try {
        localdlW.Z((File)null);
        localdlW.j(localURL);
      } catch (MalformedURLException localMalformedURLException) {
        throw new cJ(localMalformedURLException);
      }
      str = localURL.toString();
    } else {
      throw new cJ("Source " + paramObject.getClass().getName() + " not supported by this plugin");
    }

    Object localObject1 = null;
    Object localObject2 = null;
    dKB localdKB = null;
    try
    {
      XMLReader localXMLReader = cAQ.cxu();

      localObject3 = null;
      if (localFile != null) {
        localObject3 = aIk.aU(localFile.getAbsolutePath());
        localObject1 = new FileInputStream(localFile);
      } else {
        localObject3 = localURL.toString();
        int i = -1;
        if ((((String)localObject3).startsWith("jar:file")) && ((i = ((String)localObject3).indexOf("!/")) > -1))
        {
          localdKB = new dKB(djy.pn((String)localObject3), "UTF-8");

          localObject1 = localdKB.g(localdKB.ro(((String)localObject3).substring(i + 1)));
        }
        else {
          localObject1 = localURL.openStream();
        }
      }

      localObject2 = new InputSource((InputStream)localObject1);
      if (localObject3 != null) {
        ((InputSource)localObject2).setSystemId((String)localObject3);
      }
      paramFF.d("parsing buildfile " + str + " with URI = " + (String)localObject3 + (localdKB != null ? " from a zip file" : ""), 3);

      localObject4 = paramgW;

      localXMLReader.setContentHandler((ContentHandler)localObject4);
      localXMLReader.setEntityResolver((EntityResolver)localObject4);
      localXMLReader.setErrorHandler((ErrorHandler)localObject4);
      localXMLReader.setDTDHandler((DTDHandler)localObject4);
      localXMLReader.parse((InputSource)localObject2);
    } catch (SAXParseException localSAXParseException) {
      localObject3 = new aaA(localSAXParseException.getSystemId(), localSAXParseException.getLineNumber(), localSAXParseException.getColumnNumber());

      Object localObject4 = localSAXParseException.getException();
      if ((localObject4 instanceof cJ)) {
        cJ localcJ = (cJ)localObject4;
        if (localcJ.gu() == aaA.cOW) {
          localcJ.a((aaA)localObject3);
        }
        throw localcJ;
      }
      throw new cJ(localSAXParseException.getMessage(), localObject4 == null ? localSAXParseException : (Throwable)localObject4, (aaA)localObject3);
    } catch (SAXException localSAXException) {
      Object localObject3 = localSAXException.getException();
      if ((localObject3 instanceof cJ)) {
        throw ((cJ)localObject3);
      }
      throw new cJ(localSAXException.getMessage(), localObject3 == null ? localSAXException : (Throwable)localObject3);
    } catch (FileNotFoundException localFileNotFoundException) {
      throw new cJ(localFileNotFoundException);
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new cJ("Encoding of project file " + str + " is invalid.", localUnsupportedEncodingException);
    }
    catch (IOException localIOException) {
      throw new cJ("Error reading project file " + str + ": " + localIOException.getMessage(), localIOException);
    }
    finally {
      wh.c((InputStream)localObject1);
      dKB.a(localdKB);
    }
  }

  protected static djs dgr()
  {
    return lNH;
  }

  protected static void a(djs paramdjs)
  {
    lNH = paramdjs;
  }

  protected static djs dgs()
  {
    return lNI;
  }

  protected static void b(djs paramdjs)
  {
    lNI = paramdjs;
  }

  protected static djs dgt()
  {
    return lNG;
  }

  protected static void c(djs paramdjs)
  {
    lNG = paramdjs;
  }

  protected static djs dgu()
  {
    return lNF;
  }

  protected static void d(djs paramdjs)
  {
    lNF = paramdjs;
  }
}