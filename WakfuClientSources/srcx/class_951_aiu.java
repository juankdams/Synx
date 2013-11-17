import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

class aiu
{
  public static final Logger K = Logger.getLogger(aiu.class);
  private static final String dey = "language";
  private static final String dez = "pub_date";
  private static final String deA = "items";
  private static final String deB = "guid";
  private static final String deC = "pub_date";
  private static final String deD = "title";
  private static final String deE = "description";
  private static final String deF = "link";
  private static final String deG = "context";
  private static final String deH = "priority";
  private static final String deI = "type";
  private static final String deJ = "annotations";
  private static final String deK = "timing";
  private static final String deL = "area";
  private static final String deM = "text";
  private static final String deN = "mouse_area";
  private static final String deO = "background";
  private static final String deP = "background_over";
  private static final String deQ = "link";
  private static final String deR = "color";
  private static final String deS = "image";
  private static final String deT = "source";
  private static final String deU = "guid";
  private static final String deV = "last_modif";
  private static final String deW = "image";
  private static final String deX = "area";
  private static final String deY = "source";
  private static final String deZ = "background";
  private static final String dfa = "image";
  private static final String dfb = "allow_fullscreen";
  private static final String dfc = "url";
  private static final String dfd = "quality";
  private static final SimpleDateFormat[] dfe = { new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US), new SimpleDateFormat("yyyy-MM-dd", Locale.US) };

  public static aCd a(String paramString, byP parambyP)
  {
    aoF localaoF1 = new aoF(paramString);
    String str1 = localaoF1.getString("language");
    cFI localcFI = cFI.no(str1);

    String str2 = localaoF1.getString("pub_date");
    Date localDate = ez(str2);

    aCd localaCd = new aCd(localcFI, localDate);

    dQs localdQs = localaoF1.eT("items");
    for (int i = 0; i < localdQs.length(); i++)
    {
      try
      {
        aoF localaoF2 = localdQs.Ds(i);
        aGj localaGj = b(localaoF2, parambyP);
        if (localaGj != null)
          localaCd.a(localaGj);
      }
      catch (dbt localdbt)
      {
        K.error("Error while parsing item", localdbt);
      }
    }
    return localaCd;
  }

  private static bkm a(aoF paramaoF, byP parambyP)
  {
    if (paramaoF == null)
      return null;
    String str = paramaoF.getString("guid");
    URL localURL = ey(paramaoF.getString("source"));
    long l = paramaoF.getLong("last_modif");
    return parambyP.a(localURL, str, l);
  }

  private static aGj b(aoF paramaoF, byP parambyP)
  {
    String str1 = paramaoF.getString("guid");
    bKV localbKV = (bKV)f(paramaoF.getString("type"), bKV.class);

    Date localDate = ez(paramaoF.fe("pub_date"));
    String str2 = paramaoF.fe("title");
    String str3 = paramaoF.H("description", null);
    URL localURL = ey(paramaoF.H("link", null));
    int i = paramaoF.n("priority", 0);

    dQs localdQs1 = paramaoF.eT("context");

    aGj localaGj = new aGj(str1);
    localaGj.a(localDate);
    localaGj.setTitle(str2);
    localaGj.setDescription(str3);
    localaGj.c(localURL);
    localaGj.setPriority(i);
    Object localObject;
    for (int j = 0; j < localdQs1.length(); j++)
    {
      localObject = (bhM)f(localdQs1.DA(j), bhM.class);
      if (localObject != null) {
        localaGj.a((bhM)localObject);
      }
    }

    dQs localdQs2 = paramaoF.fb("annotations");
    a(localaGj, localdQs2, parambyP);

    if (localbKV == bKV.gOF)
    {
      localObject = c(paramaoF.fc("background"), parambyP);

      localaGj.a((dsd)localObject);

      dQx localdQx = b(paramaoF.eT("area"));
      if (localdQx == null)
      {
        K.error("Unable to find a valid position for the video (key 'area' : " + paramaoF);

        return null;
      }
      bFr localbFr = a(paramaoF.fb("timing"));
      bkm localbkm = a(paramaoF.fc("image"), parambyP);
      boolean bool = paramaoF.s("allow_fullscreen", true);

      dMX localdMX = new dMX(localdQx);
      localdMX.a(localbFr);
      localdMX.kZ(bool);
      localdMX.a(localbkm);

      dQs localdQs3 = paramaoF.eT("source");
      a(localdMX, localdQs3);
      if (localdMX.dpK() == 0)
      {
        K.error("No valid stream found for video. Bypassing element " + paramaoF);
        return null;
      }
      localaGj.a(localdMX);
    }
    else if (localbKV == bKV.gOG)
    {
      localObject = a(paramaoF.eU("image"), parambyP);

      localaGj.a(new dsd(null, (bkm)localObject));
    }

    return localaGj;
  }

  private static void a(dMX paramdMX, dQs paramdQs) {
    if (paramdQs == null)
      return;
    for (int i = 0; i < paramdQs.length(); i++)
    {
      try
      {
        aoF localaoF = paramdQs.Ds(i);
        URL localURL = ey(localaoF.getString("url"));
        if (localURL == null)
        {
          K.error("Unknown url for stream " + localaoF);
        }
        else
        {
          int j = localaoF.getInt("quality");
          paramdMX.a(localURL, j);
        }
      }
      catch (dbt localdbt)
      {
        K.error("Malformed video streams : " + paramdQs, localdbt);
      }
    }
  }

  private static void a(aGj paramaGj, dQs paramdQs, byP parambyP)
  {
    if (paramdQs == null)
      return;
    for (int i = 0; i < paramdQs.length(); i++)
    {
      try
      {
        aoF localaoF = paramdQs.Ds(i);
        dQx localdQx1 = b(localaoF.eT("area"));
        if (localdQx1 == null)
        {
          K.error("Unknown area for textfield " + localaoF);
        }
        else
        {
          String str = localaoF.fe("text");
          dQx localdQx2 = b(localaoF.fb("mouse_area"));
          dsd localdsd1 = c(localaoF.fc("background"), parambyP);

          dsd localdsd2 = c(localaoF.fc("background_over"), parambyP);

          URL localURL = ey(localaoF.fe("link"));
          bFr localbFr = a(localaoF.fb("timing"));

          drA localdrA = new drA(localdQx1, str);
          localdrA.a(localdsd1);
          localdrA.b(localdsd2);
          localdrA.c(localURL);
          localdrA.a(localbFr);
          localdrA.c(localdQx2);

          paramaGj.a(localdrA);
        }
      }
      catch (dbt localdbt)
      {
        K.error("Malformed annotations at index " + i + " in " + paramdQs, localdbt);
      }
    }
  }

  private static bFr a(dQs paramdQs)
  {
    if (paramdQs == null) {
      return bFr.gAs;
    }
    int i = paramdQs.length();
    if (i < 2)
    {
      K.error("Malformed timing : " + paramdQs.toString());
      return bFr.gAs;
    }

    try
    {
      return bFr.cR(paramdQs.getInt(0), paramdQs.getInt(1));
    }
    catch (dbt localdbt)
    {
      K.error("Malformed timing : " + paramdQs.toString(), localdbt);
    }return bFr.gAs;
  }

  private static bNa ex(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    if (!paramString.startsWith("#"))
    {
      K.error("Malformated color '" + paramString + "'");
      return null;
    }

    int i = paramString.length();
    if ((i != 7) && (i != 9))
    {
      K.error("Malformated color '" + paramString + "'");
      return null;
    }
    return bNa.kd(paramString);
  }

  private static dsd c(aoF paramaoF, byP parambyP)
  {
    if (paramaoF == null) {
      return null;
    }
    bNa localbNa = ex(paramaoF.fe("color"));
    bkm localbkm = a(paramaoF.fc("image"), parambyP);
    return (localbNa == null) && (localbkm == null) ? null : new dsd(localbNa, localbkm);
  }

  private static Enum f(String paramString, Class paramClass)
  {
    if (paramString == null) {
      return null;
    }
    Enum localEnum = null;
    try
    {
      localEnum = Enum.valueOf(paramClass, paramString);
    }
    catch (Exception localException1)
    {
    }

    if (localEnum == null)
    {
      try
      {
        localEnum = Enum.valueOf(paramClass, paramString.toUpperCase(Locale.US));
      }
      catch (Exception localException2)
      {
      }
    }
    return localEnum;
  }

  private static dQx b(dQs paramdQs)
  {
    if (paramdQs == null)
      return null;
    if (paramdQs.length() < 4)
    {
      K.error("Malformed JSON Rect : 4 values expected, " + paramdQs.length() + " found : " + paramdQs);

      return null;
    }
    int i = paramdQs.getInt(0);
    int j = paramdQs.getInt(1);
    int k = paramdQs.getInt(2);
    int m = paramdQs.getInt(3);
    return new dQx(i, i + k, j, j + m);
  }

  private static URL ey(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return null;
    try
    {
      return new URL(paramString);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      K.error("Error while parsing news items : " + localMalformedURLException.getMessage() + " '" + paramString + '\'');
    }return null;
  }

  private static Date ez(String paramString)
  {
    if (paramString == null)
      return null;
    for (int i = 0; i < dfe.length; i++)
    {
      try
      {
        Date localDate = dfe[i].parse(paramString);
        if (localDate != null)
          return localDate;
      }
      catch (ParseException localParseException)
      {
      }
    }
    return null;
  }
}