import java.io.File;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class aIK extends dtz
  implements dQA
{
  private bnX ehw;
  private bS ehx;
  private dSt ehy;
  private cPQ ehz;

  aIK()
  {
    this.ehw = null;
  }

  public dwr getBufferFormat(int paramInt1, int paramInt2)
  {
    return new aPV(paramInt1, paramInt2);
  }

  protected drI getVideoTextureProducer() {
    return this.ehy;
  }

  public boolean aUJ() {
    String str = getVideoPath();
    if (str == null) {
      return false;
    }
    if (this.ehw == null) {
      this.ehw = this.ehx.a(this, this.ehy);
      aUK();
      if (!this.ehw.j(getVideoPath(), new String[0])) {
        K.error("Unable to play media " + getVideoPath());
        return false;
      }
    }

    this.ehw.play();
    return true;
  }

  public boolean du(boolean paramBoolean) {
    if (this.ehw == null)
      return false;
    this.ehw.hB(paramBoolean);
    return true;
  }

  public long getVideoDuration() {
    return this.ehw != null ? this.ehw.getLength() : 0L;
  }

  public void aN(float paramFloat) {
    if (this.ehw == null)
      return;
    if (!this.ehw.aPG())
      return;
    this.ehw.cf(paramFloat);
  }

  protected void aO(float paramFloat) {
    if (this.ehw == null)
      return;
    this.ehw.wv(Math.round(paramFloat * 100.0F));
  }

  protected long getVideoPosition() {
    if (this.ehw == null)
      return 0L;
    return this.ehw.getTime();
  }

  public void a(bpE parambpE)
  {
    if (this.ehz == null) {
      this.ehz = new cPQ(this, null);
    }
    this.ehz.aBf.add(parambpE);
    aUK();
  }

  private void aUK() {
    if ((this.ehw == null) || (this.ehz == null))
      return;
    this.ehw.b(this.ehz);
    this.ehw.uF(a.a(new a[] { a.k }));
  }

  public void aJ()
  {
    super.aJ();
    this.ehx = new bS(new String[] { "--no-video-title-show" });
    this.ehy = new dSt();
  }

  public void bc()
  {
    super.bc();
    if (this.ehw != null) {
      this.ehw.release();
      this.ehw = null;
    }
    this.ehx.release();
    this.ehx = null;

    if (this.ehz != null)
      this.ehz.aBf.clear();
    this.ehz = null;
  }

  public void c(bdj parambdj)
  {
    aIK localaIK = (aIK)parambdj;
    super.c(parambdj);
    localaIK.setVideoPath(getVideoPath());
  }

  static
  {
    File localFile = new File(System.getProperty("java.library.path") + "/vlc-" + cwl.ctO().getName());
    bMB.an(cha.ciS(), localFile.getAbsolutePath());
    System.load(localFile.getAbsolutePath() + '/' + cha.ciU());
  }
}