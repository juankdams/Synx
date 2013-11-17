class brJ
  implements bOl
{
  private final long time = System.currentTimeMillis();
  private boolean fNB = false;

  brJ(alA paramalA, cXf paramcXf, int paramInt, IH paramIH) {  } 
  public boolean isValid() { if (!this.dfo.bhE()) {
      if ((!this.fNB) && (System.currentTimeMillis() - this.time < this.ejy)) {
        this.fNB = true;
      }

      return false;
    }

    this.fNA.b(this);
    alA.a(this.fNx, null);
    return true;
  }
}