import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.io.File;

public abstract class bkk
{
  protected final Xg fAH = new Xg();
  protected aXA fAI;
  private int fAJ;
  private boolean dSm;
  private String m_name;
  private String SL;
  private long fAK;

  public bkk()
  {
    this.dSm = false;
    this.fAI = null;
    this.fAJ = 0;
  }

  public void setName(String paramString)
  {
    this.m_name = paramString;
  }

  public void load(String paramString1, String paramString2) {
    this.dSm = true;
    this.m_name = paramString1;
    this.SL = paramString2;

    this.fAK = getLastModifiedTime();
    this.fAI = null;
    this.fAJ = 0;
  }

  public void reload() {
    load(this.m_name, this.SL);
  }

  public void g(String paramString1, String paramString2) {
    this.dSm = true;
    this.m_name = paramString1;
    this.fAI = null;
    this.fAJ = 0;
  }

  public final String getName() {
    return this.m_name;
  }

  public void a(bSr parambSr, Entity paramEntity, cgR paramcgR) {
    if (!this.dSm)
      Pb.aaU().aaY();
  }

  public final void pY(int paramInt) {
    if (this.fAJ == paramInt) {
      return;
    }
    this.fAI = ((aXA)this.fAH.get(paramInt));
    this.fAJ = paramInt;
    reset();
  }

  public final boolean pZ(int paramInt) {
    return this.fAH.contains(paramInt);
  }

  public void reset() {
    if (this.fAI == null)
      return;
    this.fAI.reset();
  }

  public final boolean bvl()
  {
    return this.fAI == null;
  }

  public void parse()
  {
  }

  private long getLastModifiedTime() {
    if (this.SL == null)
      return 0L;
    int i = this.SL.indexOf("file:");
    if (i == -1)
      return 0L;
    String str = this.SL.substring(i + 5);
    return new File(str).lastModified();
  }

  public final void bvm() {
    if (getLastModifiedTime() > this.fAK)
      reload();
  }

  protected abstract void a(cgR paramcgR);
}