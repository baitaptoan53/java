public class MyComplex {
                   private double real;
                   private double imag;

                   public MyComplex(double real, double imag) {
                                      this.real = real;
                                      this.imag = imag;
                   }

                   public double getReal() {
                                      return real;
                   }

                   public void setReal(double real) {
                                      this.real = real;
                   }

                   public double getImag() {
                                      return imag;
                   }

                   public void setImag(double imag) {
                                      this.imag = imag;
                   }

                   public void setValue(double real, double imag) {
                                      this.real = real;
                                      this.imag = imag;
                   }

                   public String toString() {
                                      return "(" + real + "+" + imag + "i)";
                   }

                   public boolean isReal() {
                                      if (imag == 0)
                                                         return true;
                                      else
                                                         return false;
                   }

                   public boolean isImaginary() {
                                      if (real == 0)
                                                         return true;
                                      else
                                                         return false;

                   }

                   public boolean equals(double real, double imag) {
                                      if (this.real == real && this.imag == imag)
                                                         return true;
                                      else
                                                         return false;

                   }

                   public boolean equals(MyComplex another) {
                                      if (this.real == another.real && this.imag == another.imag)
                                                         return true;
                                      else
                                                         return false;
                   }

                   public double magnitude() {
                                      return Math.sqrt(real * real + imag * imag);
                   }

                   public double argumentInRaduans() {
                                      return Math.atan2(imag, real);

                   }

                   public double argumentInDegrees() {
                                      return Math.toDegrees(Math.atan2(imag, real));

                   }

                   public MyComplex conjugate() {
                                      return new MyComplex(real, -imag);
                   }

                   public MyComplex add(MyComplex right) {
                                      this.real = this.real + right.real;
                                      this.imag = this.imag + right.imag;
                                      return this;
                   }

                   public MyComplex subtract(MyComplex right) {
                                      this.real = this.real - right.real;
                                      this.imag = this.imag - right.imag;
                                      return this;
                   }

                   public MyComplex multiplyWith(MyComplex right) {
                                      this.real = this.real * right.real - this.imag * right.imag;
                                      this.imag = this.real * right.imag + this.imag * right.real;
                                      return this;
                   }

                   public MyComplex divideBy(MyComplex right) {
                                      this.real = (this.real * right.real + this.imag * right.imag) / (right.real
                                                                            * right.real + right.imag * right.imag);
                                      this.imag = (this.imag * right.real - this.real * right.imag) / (right.real
                                                                            * right.real + right.imag * right.imag);
                                      return this;
                   }

}