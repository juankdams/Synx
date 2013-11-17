public class xf
{
  protected int aw;
  protected String aRT;
  protected float bpe;
  protected cta[] bpf;

  public int getId()
  {
    return this.aw;
  }
  public String uL() {
    return this.aRT;
  }
  public float getWeight() {
    return this.bpe;
  }
  public cta[] Gj() {
    return this.bpf;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.bpe = parambUT.getFloat();

    int i = parambUT.getInt();
    this.bpf = new cta[i];
    for (int j = 0; j < i; j++) {
      this.bpf[j] = new cta();
      this.bpf[j].a(parambUT);
    }
  }
}