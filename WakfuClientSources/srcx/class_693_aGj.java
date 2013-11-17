import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import org.apache.log4j.Logger;

public class aGj
{
  public static final Logger K = Logger.getLogger(aGj.class);
  private final String cuv;
  private Date dWr;
  private String hh;
  private String description = null;
  private URL edk = null;
  private final EnumSet edl = EnumSet.noneOf(bhM.class);
  private int edm = 0;
  private dsd aHH;
  private List bH = new ArrayList();

  public aGj(String paramString) {
    this.cuv = paramString;
  }

  public String aSq() {
    return this.cuv;
  }

  public Date aOm() {
    return new Date(this.dWr.getTime());
  }

  public String getTitle() {
    return this.hh;
  }

  public String getDescription() {
    return this.description;
  }

  public URL aSr() {
    return this.edk;
  }

  public int getPriority() {
    return this.edm;
  }

  public dsd pT() {
    return this.aHH;
  }

  public List aP()
  {
    return this.bH;
  }

  public List F(Class paramClass)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.bH.size(); i++)
    {
      ig localig = (ig)this.bH.get(i);
      if (localig.getClass() == paramClass)
        localArrayList.add(localig);
    }
    return localArrayList;
  }

  void a(Date paramDate) {
    this.dWr = paramDate;
  }

  void setTitle(String paramString) {
    this.hh = paramString;
  }

  void setDescription(String paramString) {
    this.description = paramString;
  }

  void c(URL paramURL) {
    this.edk = paramURL;
  }

  void setPriority(int paramInt) {
    this.edm = paramInt;
  }

  void a(bhM parambhM)
  {
    this.edl.add(parambhM);
  }

  void a(ig paramig)
  {
    this.bH.add(paramig);
  }

  void a(dsd paramdsd) {
    this.aHH = paramdsd;
  }

  public String toString()
  {
    return "{NewsItem guid=" + this.cuv + " contexts:" + this.edl.size() + " pubDate=" + this.dWr + " priority=" + this.edm + " title=" + this.hh + " link=" + this.edk + '}';
  }
}