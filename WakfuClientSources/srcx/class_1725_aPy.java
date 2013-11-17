import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class aPy
  implements dBv
{
  public static final Logger K = Logger.getLogger(aPy.class);
  public static final String eLV = "availableResolutions";
  public static final String eLW = "availableModes";
  public static final String eLX = "availableFrequencies";
  public static final String eLY = "selectedResolution";
  public static final String eLZ = "selectedMode";
  public static final String eMa = "selectedFrequency";
  public static final String eMb = "isFullScreenModeSelected";
  public static final String[] bF = { "availableResolutions", "availableModes", "availableFrequencies", "selectedResolution", "selectedMode", "selectedFrequency", "isFullScreenModeSelected" };
  private final cRd eMc;
  private aAS eMd;
  private aGa eMe;
  private dgj eMf;
  private static final aAS eMg = new aAS(0, null);

  private static final DisplayMode[] eMh = cRd.kDt.getDefaultScreenDevice().getDisplayModes();
  private final cSR eMi = new cSR();

  public aPy(cRd paramcRd) {
    this.eMc = paramcRd;
    dIu localdIu = this.eMc.cHF();
    Dimension localDimension = Toolkit.getDefaultToolkit().getScreenSize();
    this.eMe = bgq();
    this.eMd = new aAS(localdIu.getFrequency(), null);
    for (tb localtb : tb.values())
      this.eMi.put(localtb.ordinal(), new dgj(this, localtb, null));
    this.eMf = ((dgj)this.eMi.get(localdIu.dii().ordinal()));
    localdIu.dii();
  }

  public String[] getFields() {
    return bF;
  }

  public void c(Object paramObject1, Object paramObject2, Object paramObject3) {
    GraphicsDevice localGraphicsDevice = cRd.kDt.getDefaultScreenDevice();
    DisplayMode localDisplayMode = localGraphicsDevice.getDisplayMode();

    tb localtb = (tb)paramObject1;
    Object localObject;
    dIu localdIu;
    switch (Up.cxH[localtb.ordinal()])
    {
    case 1:
      localObject = (aGa)paramObject2;
      aAS localaAS = (aAS)paramObject3;
      localdIu = new dIu(((aGa)localObject).getWidth(), ((aGa)localObject).getHeight(), localDisplayMode.getBitDepth(), aAS.b(localaAS), localtb);

      break;
    case 2:
      localObject = this.eMc.cHI();
      localdIu = new dIu(((dIu)localObject).getWidth(), ((dIu)localObject).getHeight(), -1, 0, localtb);

      break;
    case 3:
      localdIu = new dIu(0, 0, -1, 0, localtb);

      break;
    default:
      localdIu = this.eMc.cHI();
    }

    this.eMc.a(localdIu);
  }

  public void a(dgj paramdgj) {
    this.eMf = paramdgj;
    dLE.doY().a(this, new String[] { "isFullScreenModeSelected", "availableFrequencies" });
  }

  public void aq(Object paramObject) {
    this.eMe = ((aGa)paramObject);
    dLE.doY().a(this, new String[] { "availableFrequencies" });
  }

  public tb bgn() {
    return dgj.b(this.eMf);
  }

  public aGa bgo() {
    return this.eMe;
  }

  public aAS bgp() {
    return this.eMd;
  }

  private aGa bgq()
  {
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    float f1 = localDimension1.width / localDimension1.height;
    dIu localdIu = this.eMc.cHF();

    Dimension localDimension2 = this.eMc.getMinimumSize();
    int i = localdIu.getWidth() * localdIu.getHeight();

    aGa localaGa = new aGa(localDimension1.width, localDimension1.height);
    float f2 = f1;
    float f3 = Math.abs((i - localDimension1.width * localDimension1.height) / i);

    for (DisplayMode localDisplayMode : eMh) {
      int m = localDisplayMode.getBitDepth();
      if ((m == -1) || (m >= this.eMc.cHJ()))
      {
        if ((localDisplayMode.getWidth() >= localDimension2.width) && (localDisplayMode.getHeight() >= localDimension2.height))
        {
          float f4 = localDisplayMode.getWidth() / localDisplayMode.getHeight();
          if (Math.abs(f4 - f1) <= Math.abs(f2 - f1))
          {
            float f5 = Math.abs((i - localDisplayMode.getWidth() * localDisplayMode.getHeight()) / i);
            if (f5 < f3)
            {
              localaGa = new aGa(localDisplayMode.getWidth(), localDisplayMode.getHeight());
              f2 = f4;
              f3 = f5;
            }
          }
        }
      }
    }
    return localaGa;
  }

  private ArrayList bgr() {
    ArrayList localArrayList = new ArrayList();
    for (DisplayMode localDisplayMode : eMh) {
      int k = localDisplayMode.getBitDepth();
      if ((k == -1) || (k >= this.eMc.cHJ()))
      {
        if (localDisplayMode.getWidth() == this.eMe.getWidth())
        {
          if (localDisplayMode.getHeight() == this.eMe.getHeight())
          {
            aAS localaAS = new aAS(localDisplayMode.getRefreshRate(), null);
            if (!localArrayList.contains(localaAS))
              localArrayList.add(localaAS); 
          }
        }
      }
    }
    if (!localArrayList.contains(eMg)) {
      localArrayList.add(eMg);
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }

  public ArrayList bgs() {
    ArrayList localArrayList = new ArrayList();
    Dimension localDimension = this.eMc.getMinimumSize();
    for (DisplayMode localDisplayMode : eMh) {
      int k = localDisplayMode.getBitDepth();
      if ((k == -1) || (k >= this.eMc.cHJ()))
      {
        if ((localDisplayMode.getWidth() >= localDimension.width) && (localDisplayMode.getHeight() >= localDimension.height))
        {
          aGa localaGa = new aGa(localDisplayMode.getWidth(), localDisplayMode.getHeight());
          if (!localArrayList.contains(localaGa))
            localArrayList.add(localaGa); 
        }
      }
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }

  private Object[] bgt()
  {
    return this.eMi.getValues();
  }

  public Object getFieldValue(String paramString) {
    if ("availableResolutions".equals(paramString))
      return bgs();
    if ("availableModes".equals(paramString))
      return bgt();
    if ("availableFrequencies".equals(paramString))
      return bgr();
    if ("selectedResolution".equals(paramString))
      return this.eMe;
    if ("selectedMode".equals(paramString))
      return this.eMf;
    if ("selectedFrequency".equals(paramString))
      return this.eMd;
    if ("isFullScreenModeSelected".equals(paramString)) {
      return Boolean.valueOf(dgj.b(this.eMf) == tb.bcQ);
    }
    System.err.println("Not found : " + paramString);

    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    return false;
  }
}