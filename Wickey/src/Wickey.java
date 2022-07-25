/*class Wickey {
    double distance;
    double count;
    double time;

    Wiki() {
    }

    public double timeCal(double var1) {
        this.distance = var1;
        if (var1 <= 5.0) {
            ++this.time;
            System.out.print("Wiki takes :" + this.time + "s");
        } else if (var1 > 5.0) {
            while(var1 > 0.0) {
                this.count = var1 - 5.0;
                if (this.count < 0.0) {
                    ++this.time;
                    break;
                }

                ++this.time;
                this.count -= 3.0;
                if (this.count < 0.0) {
                    this.time += 2.0;
                    break;
                }

                this.time += 2.0;
                --this.count;
                if (this.count < 0.0) {
                    this.time += 3.0;
                    break;
                }

                this.time += 3.0;
                var1 = this.count;
            }
        } else {
            System.out.println("You have to enter valid distance");
        }

        return this.time;
    }
}
*/