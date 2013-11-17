class pa
  implements dGy
{
  private int aUF;
  private int aUG;
  private int aUH;

  public boolean c(cuF paramcuF)
  {
    this.aUF += paramcuF.nx();
    this.aUG += paramcuF.ny();
    this.aUH += 1;
    return true;
  }

  MD wr()
  {
    return this.aUH > 0 ? new MD(this.aUF / this.aUH, this.aUG / this.aUH) : null;
  }
}