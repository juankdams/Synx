class cUg
  implements dsW
{
  private boolean first = true;

  cUg(dFu paramdFu, StringBuilder paramStringBuilder) {  } 
  public boolean aL(int paramInt1, int paramInt2) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramInt1);
    this.aBU.append("=");
    this.aBU.append(paramInt2);
    return true;
  }
}