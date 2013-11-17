import java.io.File;
import java.util.Enumeration;
import java.util.Vector;

public class cl extends aGK
  implements cjq
{
  private String Ru;
  private String value;
  private File Rv;
  private File Rw;
  private Vector Rx = new Vector();
  private oK Ry = new oK();

  protected cYd Rz = null;

  public void w(String paramString)
  {
    this.Ru = paramString;
  }

  public void setValue(String paramString)
  {
    this.value = paramString;
  }

  private String getValue()
  {
    return this.value != null ? this.value : "true";
  }

  public void b(File paramFile)
  {
    this.Rw = paramFile;
  }

  public void c(File paramFile)
  {
    this.Rv = paramFile;
  }

  public void a(bQM parambQM)
  {
    this.Rx.addElement(parambQM);
  }

  public oK gf()
  {
    return this.Ry;
  }

  public cYd gg()
  {
    if (this.Rz != null) {
      throw new cJ("Cannot define more than one mapper", gu());
    }

    this.Rz = new cYd(Ga());
    return this.Rz;
  }

  public void a(Jf paramJf)
  {
    gg().a(paramJf);
  }

  public boolean gh()
  {
    if ((this.Rx.size() == 0) && (this.Ry.size() == 0) && (this.Rv == null))
    {
      throw new cJ("At least one srcfile or a nested <srcfiles> or <srcresources> element must be set.");
    }

    if (((this.Rx.size() > 0) || (this.Ry.size() > 0)) && (this.Rv != null))
    {
      throw new cJ("Cannot specify both the srcfile attribute and a nested <srcfiles> or <srcresources> element.");
    }

    if ((this.Rw == null) && (this.Rz == null)) {
      throw new cJ("The targetfile attribute or a nested mapper element must be set.");
    }

    if ((this.Rw != null) && (!this.Rw.exists())) {
      d("The targetfile \"" + this.Rw.getAbsolutePath() + "\" does not exist.", 3);

      return false;
    }

    if ((this.Rv != null) && (!this.Rv.exists())) {
      throw new cJ(this.Rv.getAbsolutePath() + " not found.");
    }

    boolean bool = true;
    if (this.Rv != null) {
      if (this.Rz == null) {
        bool = this.Rw.lastModified() >= this.Rv.lastModified();
      } else {
        localObject1 = new JP(this);
        bool = ((JP)localObject1).a(new String[] { this.Rv.getAbsolutePath() }, null, null, this.Rz.cLA()).length == 0;
      }

      if (!bool) {
        d(this.Rv.getAbsolutePath() + " is newer than (one of) its target(s).", 3);
      }

    }

    Object localObject1 = this.Rx.elements();
    Object localObject2;
    while ((bool) && (((Enumeration)localObject1).hasMoreElements())) {
      localObject2 = (bQM)((Enumeration)localObject1).nextElement();
      bqf localbqf = ((bQM)localObject2).y(Ga());
      bool = a(((bQM)localObject2).c(Ga()), localbqf.kU());
    }

    if (bool) {
      localObject2 = this.Ry.wl();
      if (localObject2.length > 0) {
        bool = btC.a(this, (bFe[])localObject2, gi(), Ga()).length == 0;
      }

    }

    return bool;
  }

  public void execute()
  {
    if (this.Ru == null) {
      throw new cJ("property attribute is required.", gu());
    }

    boolean bool = gh();
    if (bool) {
      Ga().p(this.Ru, getValue());
      if (this.Rz == null) {
        d("File \"" + this.Rw.getAbsolutePath() + "\" is up-to-date.", 3);
      }
      else
        d("All target files are up-to-date.", 3);
    }
  }

  protected boolean a(File paramFile, String[] paramArrayOfString)
  {
    JP localJP = new JP(this);
    Jf localJf = gi();
    File localFile = paramFile;
    if (this.Rz == null) {
      localFile = null;
    }
    return localJP.a(paramArrayOfString, paramFile, localFile, localJf).length == 0;
  }

  private Jf gi() {
    Object localObject = null;
    if (this.Rz == null) {
      aHt localaHt = new aHt();
      localaHt.setTo(this.Rw.getAbsolutePath());
      localObject = localaHt;
    } else {
      localObject = this.Rz.cLA();
    }
    return localObject;
  }
}