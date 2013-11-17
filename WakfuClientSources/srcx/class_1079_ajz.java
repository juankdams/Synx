import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ajz extends cGj
{
  private static final Logger K = Logger.getLogger(ajz.class);
  public static final String aGo = "title";
  public static final String diN = "hasVideo";
  public static final String diO = "video";
  public static final String[] bF = { "title", "hasVideo", "video" };
  private final int m_index;
  private ArrayList diP = new ArrayList();
  private ArrayList diQ = new ArrayList();
  private aGj diR;
  private dRq aBV;

  public ajz(aGj paramaGj, int paramInt)
  {
    this.diR = paramaGj;
    this.m_index = paramInt;
    for (ig localig : paramaGj.aP())
      switch (Nv.ccZ[localig.pS().ordinal()]) {
      case 1:
        this.diP.add(new cEM(localig));
        break;
      case 2:
        this.diQ.add(new bji(localig));
        break;
      }
  }

  public ArrayList awk()
  {
    return this.diP;
  }

  public ArrayList awl() {
    return this.diQ;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("title")) {
      return this.diR.getTitle();
    }
    if (paramString.equals("hasVideo")) {
      return Boolean.valueOf(awn());
    }
    if (paramString.equals("video")) {
      if (!awn())
        return null;
      return awm();
    }
    return null;
  }

  public bji awm() {
    return (bji)this.diQ.get(0);
  }

  public boolean awn() {
    return !this.diQ.isEmpty();
  }

  public dRq c(dRq paramdRq) {
    this.aBV = dRq.checkOut();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(100.0F, 100.0F));
    this.aBV.setLayoutData(localcwP);

    dsd localdsd = this.diR.pT();
    if (localdsd != null)
    {
      if (localdsd.cYN()) {
        try {
          czv localczv = new czv();
          URL localURL = localdsd.cYO().getFile().toURL();
          dDq localdDq = new dDq(dQU.drS().n(localURL));
          localczv.aJ();
          localczv.setNonBlocking(true);
          localczv.setExpandable(false);
          localczv.setPixmap(localdDq);
          localczv.rf();
          localczv.setSizeToPrefSize();
          this.aBV.a(localczv);
          this.aBV.rV();
        } catch (MalformedURLException localMalformedURLException) {
          K.warn("URL malformée : \"" + localdsd.cYO().getFile() + "\"");
        }
      } else {
        jO localjO = new jO();
        localjO.aJ();
        localjO.setColor(localdsd.getColor());
        this.aBV.getAppearance().a(localjO);
        this.aBV.rV();
      }
    }

    return this.aBV;
  }

  public void awo() {
    if (this.aBV == null)
      return;
    this.aBV.beH();
    this.aBV.beJ();
  }
}