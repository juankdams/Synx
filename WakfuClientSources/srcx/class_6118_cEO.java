class cEO
  implements aCq
{
  private boolean first = true;

  cEO(dJe paramdJe, StringBuilder paramStringBuilder) {  } 
  public boolean f(int paramInt, long paramLong) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramInt);
    this.aBU.append("=");
    this.aBU.append(paramLong);
    return true;
  }
}