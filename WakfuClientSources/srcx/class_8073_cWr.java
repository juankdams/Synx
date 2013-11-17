import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.imageio.ImageIO;

class cWr
  implements bwh
{
  private final AtomicBoolean edF = new AtomicBoolean();
  private final djj le;
  private final jJ kJl;
  private BufferedImage kJm;

  cWr(djj paramdjj, jJ paramjJ)
  {
    this.le = paramdjj;
    this.kJl = paramjJ;

    paramdjj.f(paramjJ);
  }

  public final void parse()
  {
    aHA.debug("parse()", new Object[0]);
    this.le.o(this.kJl);
  }

  public final String getTitle()
  {
    return a(dgK.lbE);
  }

  public final void setTitle(String paramString)
  {
    a(dgK.lbE, paramString);
  }

  public final String bDQ()
  {
    return a(dgK.lbF);
  }

  public final void iU(String paramString)
  {
    a(dgK.lbF, paramString);
  }

  public final String bDR()
  {
    return a(dgK.lbG);
  }

  public final void iV(String paramString)
  {
    a(dgK.lbG, paramString);
  }

  public final String bDS()
  {
    return a(dgK.lbH);
  }

  public final void iW(String paramString)
  {
    a(dgK.lbH, paramString);
  }

  public final String bDT()
  {
    return a(dgK.lbI);
  }

  public final void iX(String paramString)
  {
    a(dgK.lbI, paramString);
  }

  public final String bDU()
  {
    return a(dgK.lbJ);
  }

  public final void iY(String paramString)
  {
    a(dgK.lbJ, paramString);
  }

  public final String getDescription()
  {
    return a(dgK.lbK);
  }

  public final void setDescription(String paramString)
  {
    a(dgK.lbK, paramString);
  }

  public final String bDV()
  {
    return a(dgK.lbL);
  }

  public final void iZ(String paramString)
  {
    a(dgK.lbL, paramString);
  }

  public final String bgj()
  {
    return a(dgK.lbM);
  }

  public final void ja(String paramString)
  {
    a(dgK.lbM, paramString);
  }

  public final String bDW()
  {
    return a(dgK.lbN);
  }

  public final void jb(String paramString)
  {
    a(dgK.lbN, paramString);
  }

  public final String getUrl()
  {
    return a(dgK.lbO);
  }

  public final void setUrl(String paramString)
  {
    a(dgK.lbO, paramString);
  }

  public final String getLanguage()
  {
    return a(dgK.lbP);
  }

  public final void setLanguage(String paramString)
  {
    a(dgK.lbP, paramString);
  }

  public final String bDX()
  {
    return a(dgK.lbQ);
  }

  public final void jc(String paramString)
  {
    a(dgK.lbQ, paramString);
  }

  public final String bDY()
  {
    return a(dgK.lbR);
  }

  public final void jd(String paramString)
  {
    a(dgK.lbR, paramString);
  }

  public final String bDZ()
  {
    return a(dgK.lbS);
  }

  public final void je(String paramString)
  {
    a(dgK.lbS, paramString);
  }

  public final String bEa()
  {
    return a(dgK.lbT);
  }

  public final void jf(String paramString)
  {
    a(dgK.lbT, paramString);
  }

  public final String bEb()
  {
    return a(dgK.lbU);
  }

  public final void jg(String paramString)
  {
    a(dgK.lbU, paramString);
  }

  public final BufferedImage bEc()
  {
    aHA.debug("getArtwork()", new Object[0]);
    if (this.kJm == null) {
      String str = bEa();
      if ((str != null) && (str.length() > 0)) {
        try {
          URL localURL = new URL(str);
          aHA.debug("url={}", new Object[] { localURL });
          this.kJm = ImageIO.read(localURL);
        }
        catch (Exception localException) {
          throw new RuntimeException("Failed to load artwork", localException);
        }
      }
    }
    return this.kJm;
  }

  public final long getLength()
  {
    return this.le.n(this.kJl);
  }

  public final void save()
  {
    aHA.debug("save()", new Object[0]);
    this.le.j(this.kJl);
  }

  public final void release()
  {
    aHA.debug("release()", new Object[0]);
    if (this.edF.compareAndSet(false, true))
      this.le.g(this.kJl);
  }

  protected void finalize()
  {
    aHA.debug("finalize()", new Object[0]);
    aHA.debug("Meta data has been garbage collected", new Object[0]);
    super.finalize();
  }

  private String a(dgK paramdgK)
  {
    aHA.trace("getMeta(metaType={},media={})", new Object[] { paramdgK, this.kJl });
    return dBU.a(this.le, this.le.a(this.kJl, paramdgK.intValue()));
  }

  private void a(dgK paramdgK, String paramString)
  {
    aHA.trace("setMeta(metaType={},media={},value={})", new Object[] { paramdgK, this.kJl, paramString });
    this.le.a(this.kJl, paramdgK.intValue(), paramString);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("title=").append(getTitle()).append(',');
    localStringBuilder.append("artist=").append(bDQ()).append(',');
    localStringBuilder.append("genre=").append(bDR()).append(',');
    localStringBuilder.append("copyright=").append(bDS()).append(',');
    localStringBuilder.append("album=").append(bDT()).append(',');
    localStringBuilder.append("trackNumber=").append(bDU()).append(',');
    localStringBuilder.append("description=").append(getDescription()).append(',');
    localStringBuilder.append("rating=").append(bDV()).append(',');
    localStringBuilder.append("date=").append(bgj()).append(',');
    localStringBuilder.append("setting=").append(bDW()).append(',');
    localStringBuilder.append("url=").append(getUrl()).append(',');
    localStringBuilder.append("language=").append(getLanguage()).append(',');
    localStringBuilder.append("nowPlaying=").append(bDX()).append(',');
    localStringBuilder.append("publisher=").append(bDY()).append(',');
    localStringBuilder.append("encodedBy=").append(bDZ()).append(',');
    localStringBuilder.append("artworkUrl=").append(bEa()).append(',');
    localStringBuilder.append("trackId=").append(bEb()).append(',');
    localStringBuilder.append("length=").append(getLength()).append(']');
    return localStringBuilder.toString();
  }
}