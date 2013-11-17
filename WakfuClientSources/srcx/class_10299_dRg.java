import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class dRg
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int mlW;
  private int mlX;
  private int mlY;
  private int mlZ;
  private List mma;
  private List mmb;
  private List mmc;
  private List mmd;
  private List mme = new ArrayList();

  public int crJ() {
    return this.mlW;
  }

  public void DI(int paramInt) {
    this.mlW = paramInt;
  }

  public int crL() {
    return this.mlX;
  }

  public void DJ(int paramInt) {
    this.mlX = paramInt;
  }

  public int crN() {
    return this.mlY;
  }

  public void DK(int paramInt) {
    this.mlY = paramInt;
  }

  public int csd() {
    return this.mlZ;
  }

  public void DL(int paramInt) {
    this.mlZ = paramInt;
  }

  public List csj() {
    return this.mma;
  }

  public void N(List paramList) {
    this.mma = paramList;
  }

  public List csk() {
    return this.mmb;
  }

  public void O(List paramList) {
    this.mmb = paramList;
  }

  public List csl() {
    return this.mmc;
  }

  public void P(List paramList) {
    this.mmc = paramList;
  }

  public List csm() {
    return this.mmd;
  }

  public void Q(List paramList) {
    this.mmd = paramList;
  }

  public List csn() {
    return this.mme;
  }

  public void R(List paramList) {
    this.mme = paramList;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("titleCount=").append(this.mlW).append(',');
    localStringBuilder.append("videoTrackCount=").append(this.mlX).append(',');
    localStringBuilder.append("audioTrackCount=").append(this.mlY).append(',');
    localStringBuilder.append("spuCount=").append(this.mlZ).append(',');
    localStringBuilder.append("titleDescriptions=").append(this.mma).append(',');
    localStringBuilder.append("videoDescriptions=").append(this.mmb).append(',');
    localStringBuilder.append("audioDescriptions=").append(this.mmc).append(',');
    localStringBuilder.append("spuDescriptions=").append(this.mmd).append(',');
    localStringBuilder.append("chapterDescriptions=").append(this.mme).append(']');
    return localStringBuilder.toString();
  }
}